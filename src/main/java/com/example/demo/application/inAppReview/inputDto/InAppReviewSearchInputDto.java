package com.example.demo.application.inAppReview.inputDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class InAppReviewSearchInputDto {

	String keyword;

	int startRow;

	int pageNum;
}
