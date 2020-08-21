package page;

import common.MobileButton;
import common.MobileTextBox;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class PosSelectionPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"选择门店\")")
    private MobileElement titleBar;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/edt_search_pos")
    private MobileTextBox tbSearchPos;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/search_button")
    private MobileButton btSearch;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/pos_code")
    private List<MobileElement> posCodeList;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/pos_code")
    private MobileElement posCodeName;



    public PosSelectionPage(AndroidDriver<MobileElement> driver){
        super(driver);
    }

    public String getTitleBarName(){
       return titleBar.getText();
    }

    public void inputPosCode(String posCode){
        tbSearchPos.input(posCode);
    }

    public void clickSearchButton(){
        btSearch.click();
    }


    //先判断界面有没有需要的POS，没有再搜索


    public void selectPOSCode(String code){
        //Stream（流）是一个来自数据源的元素队列并支持聚合操作
        Optional<MobileElement> posCode = posCodeList.stream().filter(b -> b.getText().equals(code)).findFirst();
        System.out.println(posCode);
        if(posCode.isPresent()){
            posCode.get().click();
        }
        else{
            inputPosCode(code);
            clickSearchButton();
            posCodeName.click();

        }


    }



}
