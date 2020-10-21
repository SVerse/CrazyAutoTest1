package com.crazy.auto.actions.douban;

import java.io.IOException;

import org.openqa.selenium.By;

import com.crazy.auto.driver.DriverBase;

/** 

* @author 作者 沙陌 

* @version 创建时间：2020年4月11日 下午1:08:16 

*/
public class LoginActions extends PagesManager {

	public LoginActions(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void login(String username) throws Exception {
//		webdriver.get("https://www.douban.com/");
//		webdriver.getDriver().switchTo().frame(0);
//		webdriver.getDriver().findElement(By.xpath("密码登录")).click();
//		webdriver.getDriver().findElement(By.id("username")).sendKeys("18729399607");
//		webdriver.getDriver().findElement(By.id("password")).sendKeys("abc123456");
//		webdriver.getDriver().findElement(By.xpath("")).click();
//		webdriver.sleep(3);
//		webdriver.get("https://www.douban.com/people/205235168/");
//		webdriver.getDriver().findElement(By.linkText("编辑")).click();
//		webdriver.getDriver().findElement(By.xpath("//*[@name='intro']")).sendKeys("这是混合简介");
		action.click(loginPage.pwdlogin());
		if (mobiledriver.platform.equalsIgnoreCase("ios")) {
			action.click(loginPage.username());
			action.click(loginPage.delete());
		}
		action.sendKeys(loginPage.username(),username);
		action.sendKeys(loginPage.password(),"abc123456");
		action.click(loginPage.loginBtn());
		action.click(homePage.mine_menu());
	}

}
