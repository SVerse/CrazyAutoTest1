package com.crazy.auto.TripAdvisor.actions;

import java.io.IOException;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.utils.RandomUtil;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月19日 下午3:55:43 

*/
public class MTYMyTravelActions extends PagesManager{

	public MTYMyTravelActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean createTrip() throws Exception {
		action.click(mtyHomePage.mytravel_menu());
		action.click(mtyMyTravelPage.add());
		action.click(mtyMyTravelPage.create_trip());
		String tripname=RandomUtil.getRndStrZhByLen(4);
		action.sendKeys(mtyMyTravelPage.tripname(),tripname);
		action.click(mtyMyTravelPage.create());
		//action.swipeUntilBoundary("down");//向下滑动直到界面不再发生变化
		action.swipeUntilBoundary("down", mtyMyTravelPage.listtrapname());
		String text = action.getText(mtyMyTravelPage.listtrapname());
		if (text.equals(tripname)) {
			return true;
		}else {
			return false;
		}
	}

}
