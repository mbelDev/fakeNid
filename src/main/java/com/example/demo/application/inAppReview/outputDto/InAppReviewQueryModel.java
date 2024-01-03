package com.example.demo.application.inAppReview.outputDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InAppReviewQueryModel {
	public Integer inAppReviewId;

	public String inAppReviewName;

	public String dispStart;

	public String dispEnd;

	public String androidFlag;

	public String iosFlag;

	public boolean approved;
}
