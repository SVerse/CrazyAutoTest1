package com.testfan.ui.auto.pageObject;

import java.util.HashMap;
import java.util.List;

import com.crazy.auto.driver.CrazyWebDriver;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
import com.crazy.auto.utils.XmlReadUtil;
import com.crazy.auto.utils.YamlReadUtil;

import io.appium.java_client.MobileElement;

/**
 * @author 沙陌 qq2879897713
 *
 */
public class BasePage {

	public DriverBase driver;
	public String platform;
	public String pagePath="src/main/resources/pageObjectFiles/xml/UILibrary-MTX.xml";
	HashMap<String, ElementBeans> locatorMap;//{"username":elementbeans,"password":elementbeans,"loginBtn":elementbeans}

	public BasePage(DriverBase driver) {
		this.driver = driver;
		this.getLocatorMap();
	}

	public void getLocatorMap() {
		XmlReadUtil xmlReadUtil = new XmlReadUtil();
		YamlReadUtil yamlReadUtil = new YamlReadUtil();
		try {

			if (pagePath.contains(".xml")) {
				locatorMap = xmlReadUtil.readXMLDocument(pagePath, this.getClass().getCanonicalName());
			} else if (pagePath.contains(".yml")) {
				locatorMap = yamlReadUtil.getLocatorMap(pagePath, this.getClass().getCanonicalName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
