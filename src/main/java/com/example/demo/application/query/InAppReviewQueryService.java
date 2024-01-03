package com.example.demo.application.query;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.application.inAppReview.inputDto.InAppReviewSearchInputDto;
import com.example.demo.application.inAppReview.outputDto.InAppReviewQueryModel;
import com.example.demo.application.inAppReview.outputDto.InAppReviewSearchOutputDto;

@Service
public class InAppReviewQueryService {

	public InAppReviewQueryModel getInAppReviewOne() {
		InAppReviewQueryModel queryModel = null;
		return queryModel;
	};

	public InAppReviewSearchOutputDto search(InAppReviewContentsQueryService contentsQueryService, InAppReviewSearchInputDto searchInputDto) {

		//목록을 받아옴
		List<InAppReviewQueryModel>inAppReviewList = contentsQueryService.getAll();

		InAppReviewSearchOutputDto searchOutputDto = new InAppReviewSearchOutputDto(
					inAppReviewList
				);

		return searchOutputDto;
	}
}
