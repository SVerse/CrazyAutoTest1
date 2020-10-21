package com.testfan.ui.auto.mtx.pageObject;

import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;

//评价页_对象库类
public class EvaluatePage extends BasePage {
	private static Logger log = Logger.getLogger(EvaluatePage.class);// 用于eclipse工程内运行查找对象库文件路径

	public EvaluatePage(DriverBase driver) {
//工程内读取对象库文件
		super(driver);

	}

	/***
	 * 五星好评
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans star5() throws IOException {
		if (locatorMap.containsKey("star5") || locatorMap.containsKey("ios_star5")) {
			ElementBeans elementBeans = locatorMap.get("star5");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_star5");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【star5】元素信息");
			return null;
		}
	}

	/***
	 * 评论输入框
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans inputcomment() throws IOException {
		if (locatorMap.containsKey("inputcomment") || locatorMap.containsKey("ios_inputcomment")) {
			ElementBeans elementBeans = locatorMap.get("inputcomment");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_inputcomment");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【inputcomment】元素信息");
			return null;
		}
	}

	/***
	 * 匿名切换
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans anonymousSwitch() throws IOException {
		if (locatorMap.containsKey("anonymousSwitch") || locatorMap.containsKey("ios_anonymousSwitch")) {
			ElementBeans elementBeans = locatorMap.get("anonymousSwitch");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_anonymousSwitch");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【anonymousSwitch】元素信息");
			return null;
		}
	}

	/***
	 * 匿名状态
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans anonymousStatus() throws IOException {
		if (locatorMap.containsKey("anonymousStatus") || locatorMap.containsKey("ios_anonymousStatus")) {
			ElementBeans elementBeans = locatorMap.get("anonymousStatus");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_anonymousStatus");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【anonymousStatus】元素信息");
			return null;
		}
	}

	/***
	 * 提交
	 * 
	 * @return
	 * @throws IOException
	 */
	public ElementBeans submit() throws IOException {
		if (locatorMap.containsKey("submit") || locatorMap.containsKey("ios_submit")) {
			ElementBeans elementBeans = locatorMap.get("submit");
			if (driver.platform.equalsIgnoreCase("ios")) {
				elementBeans = locatorMap.get("ios_submit");
			}
			return elementBeans;
		} else {
			log.error("在" + pagePath + "中不存在【submit】元素信息");
			return null;
		}
	}
}