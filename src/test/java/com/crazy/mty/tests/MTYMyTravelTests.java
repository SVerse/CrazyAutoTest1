package com.crazy.mty.tests;
/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月19日 下午4:06:27 

*/

import org.testng.annotations.Test;

import com.crazy.auto.test.MTYTestBase;

public class MTYMyTravelTests extends MTYTestBase{
	@Test
	public void test001_createTrip() throws Exception {
		loginActions.login("18729399607", "Abc654123");
		boolean flag = mtyMyTravelActions.createTrip();
		assertion.assertTrue(flag);
	}

}
