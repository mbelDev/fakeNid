package com.example.demo.application.inAppReview.outputDto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class InAppReviewBeforeInfoOutputDto {

	List<ConditionListItemQueryModel> conditionItemQeuryModelList;

	List<ConditionListItemListQueryModel> conditionListItemListQueryModelList;

	List<TransitionQueryModel>transitionList;
}
