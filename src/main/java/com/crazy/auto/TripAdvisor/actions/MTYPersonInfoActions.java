package com.crazy.auto.TripAdvisor.actions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.utils.ImageUtil;
import com.crazy.auto.utils.RandomUtil;

import io.appium.java_client.android.AndroidElement;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月19日 下午2:41:46 

*/
public class MTYPersonInfoActions extends PagesManager {

	public MTYPersonInfoActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean uploadHeader() throws Exception {
		action.click(mtyHomePage.mine_menu());
		action.click(mtyMinePage.avatar());
		driver.sleep(2);
		action.getScreenshotAs(mtyPersonInfoPage.userimage(), "images/mty/current.png");
		action.click(mtyPersonInfoPage.editinfo());
		driver.sleep(5);
		driver.getPageSource();
		//action.getScreenshotAs(mtyPersonInfoPage.userimage(), "images/mty/current.png");
		int j=1;
		for (; j < 4; j++) {
			if(ImageUtil.compareImg("images/mty/current.png", "images/mty/"+j+".png", 100f)) {
				break;
			}
		}
		System.out.println("当前图片是"+j);
		int newImgae=RandomUtil.randomInt(1, 3);
		while (newImgae==j) {
			newImgae=RandomUtil.randomInt(1, 3);
		}
		action.click(mtyPersonInfoPage.userimage());
		action.click(mtyPersonInfoPage.fab());
		driver.sleep(2);
		List<WebElement> icos = driver.findElements(mtyPersonInfoPage.icons());
		icos.get(newImgae-1).click();
		action.click(mtyPersonInfoPage.confirm());
		action.click(mtyPersonInfoPage.save());
		driver.sleep(2);
		driver.getPageSource();
		action.getScreenshotAs(mtyPersonInfoPage.userimage(), "images/mty/new.png");
		boolean compareImg = ImageUtil.compareImg("images/mty/new.png", "images/mty/"+newImgae+".png", 100f);
		return compareImg;
		
		//采集期望图片的核心代码
//		for (int i = 1; i < 4; i++) {
//			action.click(mtyPersonInfoPage.editinfo());
//			driver.sleep(3);
//			driver.getPageSource();
//			action.click(mtyPersonInfoPage.userimage());
//			action.click(mtyPersonInfoPage.fab());
//			driver.sleep(2);
//			List<WebElement> icos = driver.findElements(mtyPersonInfoPage.icons());
//			icos.get(i-1).click();
//			action.click(mtyPersonInfoPage.confirm());
//			action.click(mtyPersonInfoPage.save());
//			driver.sleep(2);
//			driver.getPageSource();
//			action.getScreenshotAs(mtyPersonInfoPage.userimage(), "images/mty/"+i+".png");
//		}

		
	}

}
