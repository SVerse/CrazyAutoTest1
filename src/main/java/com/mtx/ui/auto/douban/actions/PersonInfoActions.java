package com.mtx.ui.auto.douban.actions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.utils.ImageUtil;
import com.crazy.auto.utils.RandomUtil;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年6月13日 下午4:50:43 

*/
public class PersonInfoActions extends PageBaseActions{

	public PersonInfoActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean uploadHeaderImg() throws Exception {
		//采集期望图片的脚本
//		operate.click(homePage.mine_menu());
//		for (int i = 1; i < 4; i++) {
//			operate.click(minePage.avatar());
//			driver.sleep(2);
//			operate.click(personInoPage.avatar());
//			driver.sleep(2);
//			operate.click(personInoPage.album());
//			driver.sleep(2);
//			List<WebElement> icons = driver.findElements(personInoPage.icon());
//			icons.get(i).click();
//			driver.sleep(2);
//			operate.click(personInoPage.finishbtn());
//			driver.sleep(2);
//			operate.click(personInoPage.sure());
//			driver.sleep(2);
//			operate.click(personInoPage.back());
//			driver.sleep(2);
//			operate.getScreenshotAs(minePage.avatar(), "images/douban/expect"+i+".png");
//		}
		
		operate.click(homePage.mine_menu());
		driver.sleep(2);
		operate.getScreenshotAs(minePage.avatar(), "images/douban/current.png");
		//循环对比找到当前是第几张图
		int i = 1;
		for (; i < 4; i++) {
			boolean compareImg = ImageUtil.compareImg("images/douban/current.png", "images/douban/expect"+i+".png", 100f);
			if (compareImg) {
				break;
			}
		}
		//随机生成一个数字和当前图对应的数字不一样的，这个就是我们要选择的目标图片对应的数字
		int randomInt = RandomUtil.randomInt(1, 3);
		while (randomInt==i) {
			randomInt = RandomUtil.randomInt(1, 3);
		}
		operate.click(minePage.avatar());
		driver.sleep(2);
		operate.click(personInoPage.avatar());
		driver.sleep(2);
		operate.click(personInoPage.album());
		driver.sleep(2);
		List<WebElement> icons = driver.findElements(personInoPage.icon());
		icons.get(randomInt).click();
		driver.sleep(2);
		operate.click(personInoPage.finishbtn());
		driver.sleep(2);
		operate.click(personInoPage.sure());
		driver.sleep(2);
		operate.click(personInoPage.back());
		driver.sleep(2);
		operate.getScreenshotAs(minePage.avatar(), "images/douban/actual.png");
		return ImageUtil.compareImg("images/douban/actual.png", "images/douban/expect"+randomInt+".png", 100f);

	}

}
