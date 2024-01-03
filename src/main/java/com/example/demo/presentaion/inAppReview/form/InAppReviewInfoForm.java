package com.example.demo.presentaion.inAppReview.form;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InAppReviewInfoForm {

	@NotNull
	private String keyword;

	private int startRow;

	private int pageNum;
}
