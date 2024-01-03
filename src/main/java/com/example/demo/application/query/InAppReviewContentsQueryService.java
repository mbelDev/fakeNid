package com.example.demo.application.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.application.inAppReview.outputDto.ConditionListItemListQueryModel;
import com.example.demo.application.inAppReview.outputDto.ConditionListItemQueryModel;
import com.example.demo.application.inAppReview.outputDto.InAppReviewBeforeInfoOutputDto;
import com.example.demo.application.inAppReview.outputDto.InAppReviewQueryModel;
import com.example.demo.application.inAppReview.outputDto.TransitionQueryModel;

@Service
public class InAppReviewContentsQueryService {

	public List<InAppReviewQueryModel> getAll(){
		List<InAppReviewQueryModel> inAppReviewQueryModelLsit = new ArrayList<>();

		inAppReviewQueryModelLsit.add(new InAppReviewQueryModel(1,"시험","2023-01-01","2024-01-01","O","",false));
		inAppReviewQueryModelLsit.add(new InAppReviewQueryModel(2,"자료","2023-03-01","2024-03-31","","O",true));
		inAppReviewQueryModelLsit.add(new InAppReviewQueryModel(3,"작성","2023-07-01","2024-12-31","O","",false));
		inAppReviewQueryModelLsit.add(new InAppReviewQueryModel(4,"예시","2023-07-31","2023-09-30","O","O",false));

		return inAppReviewQueryModelLsit;
	}

	public List<ConditionListItemQueryModel> getConditionListItem(){
		List<ConditionListItemQueryModel> conditionListItemQueryModel = new ArrayList<>();
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("TEXT_BOX","연습용 1번 문자 상자",""));
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("TEXT_BOX","연습용 2번 문자 상자",""));
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("TEXT_BOX","연습용 3번 문자 상자",""));
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("CHECK_BOX","연습용 1번 체크 상자",""));
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("CHECK_BOX","연습용 2번 체크 상자",""));
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("DROPDOWN_LIST","연습용 1번 목록 상자","COUNTRY"));
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("DROPDOWN_LIST","연습용 2번 목록 상자","TYPE"));
		conditionListItemQueryModel.add(new ConditionListItemQueryModel("DROPDOWN_LIST","연습용 2번 목록 상자","MECHANIC"));

		return conditionListItemQueryModel;
	}

	public List<ConditionListItemListQueryModel> getConditionListItemList(){
		List<ConditionListItemListQueryModel> conditionListItemListQueryModel = new ArrayList<>();
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("COUNTRY","",""));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("COUNTRY","한국","KOREA"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("COUNTRY","덕국","GERMANY"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("COUNTRY","법국","FRANCE"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("COUNTRY","노서아","RUSSIA"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("COUNTRY","서반아","SPANISH"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("TYPE","",""));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("TYPE","단발머리","SHORT_CUT"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("TYPE","거유","BIG_BREAST"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("TYPE","어른스러운","ADULTY"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("TYPE","가정적인","HOUSE"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("MECHANIC","",""));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("MECHANIC","건담","GUNDAM"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("MECHANIC","겟타","GETTER_ROBO"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("MECHANIC","마징가","MAJINGA"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("MECHANIC","에우레카","EUREKA"));
		conditionListItemListQueryModel.add(new ConditionListItemListQueryModel("MECHANIC","나데시코","NADESHIKO"));
		return conditionListItemListQueryModel;
	}

	public List<TransitionQueryModel> getTransitionList() {
		List<TransitionQueryModel>transitionList = new ArrayList<>();
		transitionList.add(new TransitionQueryModel("CONTENT","콘텐츠선택"));
		transitionList.add(new TransitionQueryModel("URL","유알엘선택"));
		transitionList.add(new TransitionQueryModel("LIVE","생방송특집페이지아이디선택"));

		return transitionList;
	}

	public InAppReviewBeforeInfoOutputDto getBeforeInfo(){

		InAppReviewBeforeInfoOutputDto beforeInfoOutputDto = null;
//				new InAppReviewBeforeInfoOutputDto(				);
		return beforeInfoOutputDto;
	}
}
