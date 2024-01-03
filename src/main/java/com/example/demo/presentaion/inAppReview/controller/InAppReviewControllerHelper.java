package com.example.demo.presentaion.inAppReview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.application.inAppReview.inputDto.InAppReviewSearchInputDto;
import com.example.demo.application.inAppReview.outputDto.InAppReviewBeforeInfoOutputDto;
import com.example.demo.application.inAppReview.outputDto.InAppReviewSearchOutputDto;
import com.example.demo.presentaion.inAppReview.form.InAppReviewInfoForm;

@Controller
public class InAppReviewControllerHelper {

	public InAppReviewSearchInputDto createSearchInputDto(InAppReviewInfoForm inAppReviewInfoForm) {

		InAppReviewSearchInputDto searchInputDto = new InAppReviewSearchInputDto(
					inAppReviewInfoForm.getKeyword(),
					inAppReviewInfoForm.getStartRow(),
					inAppReviewInfoForm.getPageNum()
				);
		return searchInputDto;
	}


	public ModelAndView createMav(ModelAndView mav, InAppReviewInfoForm inAppReviewInfoForm) {

		mav.addObject("test","test");
		mav.addObject("startRow",inAppReviewInfoForm.getStartRow());
		mav.addObject("pageNum",inAppReviewInfoForm.getPageNum());
		return mav;
	}

	public ModelAndView createSearchMav(ModelAndView mav, InAppReviewSearchOutputDto searchOutputDto, InAppReviewInfoForm inAppReviewInfoForm) {

		mav.addObject("test","test");
		mav.addObject("startRow",inAppReviewInfoForm.getStartRow());
		mav.addObject("pageNum",inAppReviewInfoForm.getPageNum());

		mav.addObject("inAppReviewList",searchOutputDto.getInAppReviewQueryModelList());
		return mav;
	}

	public ModelAndView createBeforeInfoMav(ModelAndView mav, InAppReviewBeforeInfoOutputDto inAppReviewBeforeInfoOutputDto) {

		mav.addObject("inputItemList",inAppReviewBeforeInfoOutputDto.getConditionItemQeuryModelList());
		mav.addObject("conditionList",inAppReviewBeforeInfoOutputDto.getConditionListItemListQueryModelList());
		mav.addObject("transitionList",inAppReviewBeforeInfoOutputDto.getTransitionList());

		return mav;
	}
}
