package com.testfan.ui.auto.pageObject;

import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;

//javamall首页_对象库类
public class HomePage1223 extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
	private static Logger log = Logger.getLogger(HomePage1223.class);
	private String path = "src/main/resources/pageObjectFiles/yml/";

	public HomePage1223(DriverBase driver) {
//工程内读取对象库文件
		super(driver);
	}

	/***
	 * 这是首页上注册
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans register() throws IOException {
		if (locatorMap.containsKey("register") || locatorMap.containsKey("ios_register")) {
			ElementBeans elementBeans = locatorMap.get("register");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_register");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【register】元素信息");
			return null;
		}
	}

	/***
	 * 这是首页上登录
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans loginlink() throws IOException {
		if (locatorMap.containsKey("loginlink") || locatorMap.containsKey("ios_loginlink")) {
			ElementBeans elementBeans = locatorMap.get("loginlink");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_loginlink");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【loginlink】元素信息");
			return null;
		}
	}

	/***
	 * 这是首页上会员中心
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans 会员中心() throws IOException {
		if (locatorMap.containsKey("会员中心") || locatorMap.containsKey("ios_会员中心")) {
			ElementBeans elementBeans = locatorMap.get("会员中心");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_会员中心");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【会员中心】元素信息");
			return null;
		}
	}
}