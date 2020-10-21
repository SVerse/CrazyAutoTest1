package com.testfan.ui.auto.yml.TripAdvisor.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//我的页面_对象库类
public class MTYMinePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MTYMinePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MTYMinePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 登录
* @return
* @throws IOException
*/
public  ElementBeans loginlink() throws IOException
 {
   if(locatorMap.containsKey("loginlink")||locatorMap.containsKey("ios_loginlink")){
   ElementBeans elementBeans=locatorMap.get("loginlink");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_loginlink");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【loginlink】元素信息"); return null;}
 }

/***
* 头像
* @return
* @throws IOException
*/
public  ElementBeans avatar() throws IOException
 {
   if(locatorMap.containsKey("avatar")||locatorMap.containsKey("ios_avatar")){
   ElementBeans elementBeans=locatorMap.get("avatar");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_avatar");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【avatar】元素信息"); return null;}
 }
}