package com.mtx.ui.auto.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
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
	public MtxHomePage mtxHomePage;
	public MtxLoginPage mtxLoginPage;
	public GoodsDetailPage goodsDetailPage;
	public GoodsOrderPage goodsOrderPage;
	public MtxPersonCenterPage mtxPersonCenterPage;
	public MtxHouHomePage mtxHouHomePage;
	public MtxHouLoginPage mtxHouLoginPage;
	public MtxHouOrderPage mtxHouOrderPage;
	public MtxOrderPage mtxOrderPage;
	public MtxCommentPage mtxCommentPage;
	public MtxAftersalesPage mtxAftersalesPage;
	
	public PageBaseActions(DriverBase driver) {
		this.driver=driver;
		this.operate=new ElementOperate(driver);
		this.mtxHomePage=new MtxHomePage(driver);
		this.mtxLoginPage=new MtxLoginPage(driver);
		this.goodsDetailPage=new GoodsDetailPage(driver);
		this.goodsOrderPage=new GoodsOrderPage(driver);
		this.mtxPersonCenterPage=new MtxPersonCenterPage(driver);
		this.mtxHouHomePage=new MtxHouHomePage(driver);
		this.mtxHouLoginPage=new MtxHouLoginPage(driver);
		this.mtxHouOrderPage=new MtxHouOrderPage(driver);
		this.mtxOrderPage=new MtxOrderPage(driver);
		this.mtxCommentPage=new MtxCommentPage(driver);
		this.mtxAftersalesPage=new MtxAftersalesPage(driver);
	}

}
