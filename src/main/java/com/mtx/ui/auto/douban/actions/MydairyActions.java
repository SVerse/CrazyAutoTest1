package com.mtx.ui.auto.douban.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年6月16日 下午8:18:22 

*/
public class MydairyActions extends PageBaseActions{

	public MydairyActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String writeDairy(String title, String text) throws Exception {
		operate.click(homePage.mine_menu());
		operate.click(minePage.mydiary());
		operate.click(mydiaryPage.btn_post());
		operate.sendKeys(mydiaryPage.rd__title(), title);
		operate.click(mydiaryPage.rd__text());
		operate.sendKeysOneByOne(text);
		//operate.sendKeys(mydiaryPage.rd__text(), text);
		operate.click(mydiaryPage.goon());
		operate.click(mydiaryPage.release());
		driver.sleep(2);
		return operate.getText(mydiaryPage.content_text());
	}

}
