function changeTransition(){
    
    //전이처 선택박스의 현재 선택된 값을 받아옴
    transition = document.getElementById("transition").value;
    //컨텐츠 선정의 모든 항목리스트를 받아옴(나중에 값 초기화를 하기 위해)
    condition_item_list = document.querySelectorAll("#condition_item");
    
    //컨텐츠 선택일 때
    if (transition == "CONTENT"){
        //섬네일 섹션 표시
        $("#thumbnailSection").css("display","");
        //컨텐츠 선정 표시
        $("#contentsSection").css("display","");
        //유알엘 섹션 비표시 및 입력값 초기화
        $("#urlSection").css("display","none");
        document.getElementById("url").value = null;
        //라이브특집페이지 섹션 비표시 및 입력값 초기화
        $("#liveSummaryPageSection").css("display","none");
        document.getElementById("liveSummaryPageId").value = null;
    }else if (transition == "URL"){
        $("#thumbnailSection").css("display","");
        $("#contentsSection").css("display","none");
        //컨텐츠 선정 내 모든 항목리스트 초기화(반복문 사용)
        condition_item_list.forEach( (element, index) =>{
            //해당 항목리스트가 텍스트 박스일 때, 값을 null로
            if(element.querySelector("#TEXT_BOX")){
                document.getElementById("content_item_["+index+"]").value = null;
            }
            //해당 항목리스트가 체크 박스일 때, 값을 false로
            if(element.querySelector("#CHECK_BOX")){
                document.getElementById("content_item_["+index+"]").checked = false;
            }
            //해당 항목리스트가 드롭다운 리스트 박스일 때, 값을 null로
            if(element.querySelector("#DROPDOWN_LIST")){
                document.getElementById("content_item_["+index+"]").value = null;
            }
         })
        $("#urlSection").css("display","");
        $("#liveSummaryPageSection").css("display","none");
        document.getElementById("liveSummaryPageId").value = null;
    }else if (transition == "LIVE"){
        $("#thumbnailSection").css("display","");
        $("#contentsSection").css("display","none");
        condition_item_list.forEach( (element, index) =>{
            if(element.querySelector("#TEXT_BOX")){
                document.getElementById("content_item_["+index+"]").value = null;
            }
            if(element.querySelector("#CHECK_BOX")){
                document.getElementById("content_item_["+index+"]").checked = false;
            }
            if(element.querySelector("#DROPDOWN_LIST")){
                document.getElementById("content_item_["+index+"]").value = null;
            }
         })
        $("#urlSection").css("display","none");
        document.getElementById("url").value = null;
        $("#liveSummaryPageSection").css("display","");
    }else{
        $("#thumbnailSection").css("display","none");
        $("#contentsSection").css("display","none");
        condition_item_list.forEach( (element, index) =>{
            if(element.querySelector("#TEXT_BOX")){
                document.getElementById("content_item_["+index+"]").value = null;
            }
            if(element.querySelector("#CHECK_BOX")){
                document.getElementById("content_item_["+index+"]").checked = false;
            }
            if(element.querySelector("#DROPDOWN_LIST")){
                document.getElementById("content_item_["+index+"]").value = null;
            }
         })
        $("#urlSection").css("display","none");
        document.getElementById("url").value = null;
        $("#liveSummaryPageSection").css("display","none");
        document.getElementById("liveSummaryPageId").value = null;
    }
    
}