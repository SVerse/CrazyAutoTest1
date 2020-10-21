package com.crazy.auto.mtx.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
import com.testfan.ui.auto.mtx.pageObject.EvaluatePage;
import com.testfan.ui.auto.mtx.pageObject.GoodDetailPage;
import com.testfan.ui.auto.mtx.pageObject.HomePage;
import com.testfan.ui.auto.mtx.pageObject.LoginPage;
import com.testfan.ui.auto.mtx.pageObject.ManagerHomePage;
import com.testfan.ui.auto.mtx.pageObject.ManagerLoginPage;
import com.testfan.ui.auto.mtx.pageObject.ManagerOrderListPage;
import com.testfan.ui.auto.mtx.pageObject.OrderManagerPage;
import com.testfan.ui.auto.mtx.pageObject.PersonCenterPage;
import com.testfan.ui.auto.mtx.pageObject.RefundPage;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年3月17日 下午4:31:21 

*/
public class PagesManager {
	public ElementOperate action;
	public DriverBase driver;
	public LoginPage loginPage;//前台登录页
	public HomePage homePage;//前台首页
	public EvaluatePage evaluatePage;//评价页面
	public GoodDetailPage goodDetailPage;//产品详情页
	public ManagerHomePage managerHomePage;//后台首页
	public ManagerLoginPage managerLoginPage;//后台登录页
	public ManagerOrderListPage managerOrderListPage;//后台订单列表页
	public OrderManagerPage orderManagerPage;//订单管理页
	public PersonCenterPage personCenterPage;//个人中心页
	public RefundPage refundPage;//退款页
	//构造方法
	public PagesManager(DriverBase driver) {
		this.driver=driver;
		this.action=new ElementOperate(driver);
		this.loginPage=new LoginPage(driver);
		this.homePage=new HomePage(driver);
		this.evaluatePage=new EvaluatePage(driver);
		this.goodDetailPage=new GoodDetailPage(driver);
		this.managerHomePage=new ManagerHomePage(driver);
		this.managerLoginPage=new ManagerLoginPage(driver);
		this.managerOrderListPage=new ManagerOrderListPage(driver);
		this.orderManagerPage=new OrderManagerPage(driver);
		this.personCenterPage=new PersonCenterPage(driver);
		this.refundPage=new RefundPage(driver);
	}
}
