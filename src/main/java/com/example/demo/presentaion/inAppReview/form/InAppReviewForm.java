package com.example.demo.presentaion.inAppReview.form;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InAppReviewForm {
	public Integer inAppReviewId;

	public String InAppReviewName;

	public String dispStart;

	public String dispEnd;

	public String transition;

	public String crid;

	public String url;

	public String liveSummaryPageId;

	public List<String> dispDeviceList;
}
