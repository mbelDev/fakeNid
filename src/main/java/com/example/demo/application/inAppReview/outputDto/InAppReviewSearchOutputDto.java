package com.example.demo.application.inAppReview.outputDto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InAppReviewSearchOutputDto {

	List<InAppReviewQueryModel>inAppReviewQueryModelList;

}
