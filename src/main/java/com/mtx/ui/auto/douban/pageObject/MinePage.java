package com.mtx.ui.auto.douban.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//我的页面元素_对象库类
public class MinePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MinePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MinePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
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

/***
* 我的日记
* @return
* @throws IOException
*/
public  ElementBeans mydiary() throws IOException
 {
   if(locatorMap.containsKey("mydiary")||locatorMap.containsKey("ios_mydiary")){
   ElementBeans elementBeans=locatorMap.get("mydiary");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_mydiary");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【mydiary】元素信息"); return null;}
 }
}