package com.mtx.ui.auto.douban.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
import com.mtx.ui.auto.douban.pageObject.HomePage;
import com.mtx.ui.auto.douban.pageObject.LoginPage;
import com.mtx.ui.auto.douban.pageObject.MinePage;
import com.mtx.ui.auto.douban.pageObject.MydiaryPage;
import com.mtx.ui.auto.douban.pageObject.PersonInoPage;
import com.mtx.ui.auto.pageObject.GoodsDetailPage;
import com.mtx.ui.auto.pageObject.GoodsOrderPage;
import com.mtx.ui.auto.pageObject.MtxAftersalesPage;
import com.mtx.ui.auto.pageObject.MtxCommentPage;
import com.mtx.ui.auto.pageObject.MtxHomePage;
import com.mtx.ui.auto.pageObject.MtxHouHomePage;
import com.mtx.ui.auto.pageObject.MtxHouLoginPage;
import com.mtx.ui.auto.pageObject.MtxHouOrderPage;
import com.mtx.ui.auto.pageObject.MtxLoginPage;
import com.mtx.ui.auto.pageObject.MtxOrderPage;
import com.mtx.ui.auto.pageObject.MtxPersonCenterPage;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年5月14日 下午8:33:42 

*/
public class PageBaseActions {
	
	public ElementOperate operate;//元素操作对象
	public DriverBase driver;//driver对象
	public HomePage homePage;
	public LoginPage loginPage;
	public MinePage minePage;
	public PersonInoPage personInoPage;
	public MydiaryPage mydiaryPage;
	
	public PageBaseActions(DriverBase driver) {
		this.driver=driver;
		this.operate=new ElementOperate(driver);
		this.homePage=new HomePage(driver);
		this.loginPage=new LoginPage(driver);
		this.minePage=new MinePage(driver);
		this.personInoPage=new PersonInoPage(driver);
		this.mydiaryPage=new MydiaryPage(driver);
		
	}

}
