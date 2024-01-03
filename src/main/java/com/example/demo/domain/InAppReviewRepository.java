package com.example.demo.domain;

import org.springframework.stereotype.Repository;

import com.example.demo.application.inAppReview.outputDto.InAppReviewQueryModel;

@Repository
public class InAppReviewRepository {

	/**
	 *
	 * @param inAppReviewId
	 * @return InAppReviewQueryModel
	 */
	public InAppReviewQueryModel getInAppReviewOne(int inAppReviewId) {
		InAppReviewQueryModel inAppReviewQueryModel = null;

		return inAppReviewQueryModel;
	}
}
