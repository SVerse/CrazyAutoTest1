package com.crazy.auto.mtx.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年3月17日 下午4:53:29 

*/
public class OrderActions extends PagesManager{

	public OrderActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	  * 下单
	 * @throws Exception
	 */
	public void order() throws Exception {
		action.click(homePage.goods());
		//driver.sleep(2);
		driver.switchToWindow(1);
		action.click(goodDetailPage.buyNow());
		action.click(goodDetailPage.货到付款());
		action.click(goodDetailPage.提交订单());
	}
	/**
	  * 发货
	 * @param expressNum 快递单号
	 * @throws Exception
	 */
	public void sendGoods(String expressNum) throws Exception {
		action.click(managerHomePage.order());
		action.click(managerHomePage.orderlist());
		driver.switchToFrame(managerHomePage.orderframe());
		action.click(managerOrderListPage.noShip());
		driver.sleep(2);
		action.click(managerOrderListPage.express());
		action.sendKeys(managerOrderListPage.expressNum(), expressNum);
		driver.sleep(2);
		action.click(managerOrderListPage.确认());
	}
	/**
	  * 收货
	 * @throws Exception
	 */
	public void acceptGoods() throws Exception {
		action.click(homePage.personcenter());
		action.click(personCenterPage.收货());
		action.click(personCenterPage.sureBtn());
	}
	/**
	  * 评价
	 * @throws Exception
	 */
	public void comment() throws Exception {
		action.click(homePage.personcenter());
		action.click(personCenterPage.evaluate());
		driver.switchToWindow(2);
		action.click(evaluatePage.star5());
		action.sendKeys(evaluatePage.inputcomment(), "好东西值得五星好评");
		action.click(evaluatePage.anonymousSwitch());
		action.click(evaluatePage.submit());
	}
	/**
	  * 退款
	 * @throws Exception 
	 */
	public void refund() throws Exception {
		action.click(homePage.personcenter());
		action.click(personCenterPage.ordermanager());
		action.click(orderManagerPage.application());
		driver.switchToWindow(3);
		action.click(refundPage.onlyRefund());
		String reason=refundPage.reason().getValue();
		driver.executeJS("document.getElementsByName('"+reason+"')[0].setAttribute('style','');");
		action.selectRandomOption(refundPage.reason());
		action.sendKeys(refundPage.refundMsg(),"不好看我不想要了");
		action.click(refundPage.提交());	
	}

}
