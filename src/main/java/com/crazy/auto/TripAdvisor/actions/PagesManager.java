package com.crazy.auto.TripAdvisor.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
import com.testfan.ui.auto.yml.TripAdvisor.pageObject.MTYHomePage;
import com.testfan.ui.auto.yml.TripAdvisor.pageObject.MTYLoginPage;
import com.testfan.ui.auto.yml.TripAdvisor.pageObject.MTYMinePage;
import com.testfan.ui.auto.yml.TripAdvisor.pageObject.MTYMyTravelPage;
import com.testfan.ui.auto.yml.TripAdvisor.pageObject.MTYPersonInfoPage;


/** 

* @author 作者 沙陌 

* @version 创建时间：2020年3月17日 下午4:31:21 

*/
public class PagesManager {
	public ElementOperate action;
	public DriverBase driver;
	public MTYHomePage mtyHomePage;
	public MTYLoginPage mtyLoginPage;
	public MTYMinePage mtyMinePage;
	public MTYPersonInfoPage mtyPersonInfoPage;
	public MTYMyTravelPage mtyMyTravelPage;
	//构造方法
	public PagesManager(DriverBase driver) {
		this.driver=driver;
		this.action=new ElementOperate(driver);
		this.mtyHomePage=new MTYHomePage(driver);
		this.mtyLoginPage=new MTYLoginPage(driver);
		this.mtyMinePage=new MTYMinePage(driver);
		this.mtyPersonInfoPage=new MTYPersonInfoPage(driver);
		this.mtyMyTravelPage=new MTYMyTravelPage(driver);
	}
}
