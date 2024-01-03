package com.example.demo.application.inAppReview.useCase;

import org.springframework.stereotype.Service;

import com.example.demo.application.inAppReview.outputDto.InAppReviewBeforeInfoOutputDto;
import com.example.demo.application.query.InAppReviewContentsQueryService;

@Service
public class GetBeforeInfoUseCase {

	public InAppReviewBeforeInfoOutputDto getBeforeInfo(InAppReviewContentsQueryService contentsQueryService) {
		InAppReviewBeforeInfoOutputDto beforeInfoOutputDto = new InAppReviewBeforeInfoOutputDto(
				contentsQueryService.getConditionListItem(),
				contentsQueryService.getConditionListItemList(),
				contentsQueryService.getTransitionList()
				);
		return beforeInfoOutputDto;
	}
}
