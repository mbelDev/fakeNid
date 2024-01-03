package com.example.demo.presentaion.inAppReview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.application.inAppReview.inputDto.InAppReviewSearchInputDto;
import com.example.demo.application.inAppReview.outputDto.InAppReviewBeforeInfoOutputDto;
import com.example.demo.application.inAppReview.outputDto.InAppReviewSearchOutputDto;
import com.example.demo.application.inAppReview.useCase.GetBeforeInfoUseCase;
import com.example.demo.application.query.InAppReviewContentsQueryService;
import com.example.demo.application.query.InAppReviewQueryService;
import com.example.demo.presentaion.inAppReview.form.InAppReviewForm;
import com.example.demo.presentaion.inAppReview.form.InAppReviewInfoForm;

@Controller
public class InAppReviewController {

	private final InAppReviewControllerHelper inAppReviewControllerHelper;
	private final GetBeforeInfoUseCase getBeforeInfoUseCase;
	private final InAppReviewQueryService inAppReviewQueryService;
	private final InAppReviewContentsQueryService inAppReviewContentsQueryService;

	InAppReviewController(
			InAppReviewControllerHelper inAppReviewControllerHelper,
			GetBeforeInfoUseCase getBeforeInfoUseCase,
			InAppReviewQueryService inAppReviewQueryService,
			InAppReviewContentsQueryService inAppReviewContentsQueryService){
		this.inAppReviewQueryService = inAppReviewQueryService;
		this.getBeforeInfoUseCase = getBeforeInfoUseCase;
		this.inAppReviewControllerHelper = inAppReviewControllerHelper;
		this.inAppReviewContentsQueryService = inAppReviewContentsQueryService;
	}

	@GetMapping("/in-app-review")
	public ModelAndView index(ModelAndView mav){
		InAppReviewInfoForm inAppReviewInfoForm = new InAppReviewInfoForm();
		inAppReviewInfoForm.setStartRow(1);
		inAppReviewInfoForm.setPageNum(10);

		mav.setViewName("/inAppReview/index");
		mav.addObject("baseUri","/in-app-review/search");
		mav.addObject("inAppReviewForm",inAppReviewInfoForm);

		InAppReviewSearchInputDto searchInputDto = inAppReviewControllerHelper.createSearchInputDto(inAppReviewInfoForm);
		InAppReviewSearchOutputDto searchOutputDto = inAppReviewQueryService.search(inAppReviewContentsQueryService, searchInputDto);
		mav = inAppReviewControllerHelper.createSearchMav(mav, searchOutputDto, inAppReviewInfoForm);
		return mav;
	}

	@RequestMapping("/in-app-review/search")
	public ModelAndView search(ModelAndView mav, InAppReviewInfoForm inAppReviewInfoForm) {
		mav.setViewName("/inAppReview/index");
		mav.addObject("baseUri","/in-app-review/search");
		mav.addObject("inAppReviewForm",inAppReviewInfoForm);

		InAppReviewSearchInputDto searchInputDto = inAppReviewControllerHelper.createSearchInputDto(inAppReviewInfoForm);
		InAppReviewSearchOutputDto searchOutputDto = inAppReviewQueryService.search(inAppReviewContentsQueryService, searchInputDto);
		mav = inAppReviewControllerHelper.createSearchMav(mav, searchOutputDto, inAppReviewInfoForm);
		return mav;
	}

	@GetMapping("/in-app-review/regist")
	public ModelAndView regist(ModelAndView mav, InAppReviewForm inAppReviewForm) {
		mav.setViewName("/inAppReview/regist");
		mav.addObject("baseUri","/in-app-review/insert");
		mav.addObject("test","test");

		//사전정보 취득
		InAppReviewBeforeInfoOutputDto beforeInfoOutputDto = getBeforeInfoUseCase.getBeforeInfo(inAppReviewContentsQueryService);
		mav = inAppReviewControllerHelper.createBeforeInfoMav(mav,beforeInfoOutputDto);
		return mav;
	}

	@RequestMapping("/in-app-review/insert")
	public ModelAndView insert(ModelAndView mav, InAppReviewForm inAppReviewForm) {
		mav.setViewName("/inAppReview/regist");
		mav.addObject("test","test");

		//inAppReviewControllerHelper.createInputDto(inAppReviewForm);
		//inAppReviewInsertUseCase.insertInAppReview(inAppReviewInputDto);
		//mav = inAppReviewControllerHelper.createMav(mav,inAppReviewForm);
		return mav;
	}
}

