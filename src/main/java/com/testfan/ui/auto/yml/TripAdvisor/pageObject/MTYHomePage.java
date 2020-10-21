package com.testfan.ui.auto.yml.TripAdvisor.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//首页_对象库类
public class MTYHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MTYHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MTYHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 我的
* @return
* @throws IOException
*/
public  ElementBeans mine_menu() throws IOException
 {
   if(locatorMap.containsKey("mine_menu")||locatorMap.containsKey("ios_mine_menu")){
   ElementBeans elementBeans=locatorMap.get("mine_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_mine_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【mine_menu】元素信息"); return null;}
 }

/***
* 首页
* @return
* @throws IOException
*/
public  ElementBeans home_menu() throws IOException
 {
   if(locatorMap.containsKey("home_menu")||locatorMap.containsKey("ios_home_menu")){
   ElementBeans elementBeans=locatorMap.get("home_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_home_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【home_menu】元素信息"); return null;}
 }

/***
* 发现
* @return
* @throws IOException
*/
public  ElementBeans find_menu() throws IOException
 {
   if(locatorMap.containsKey("find_menu")||locatorMap.containsKey("ios_find_menu")){
   ElementBeans elementBeans=locatorMap.get("find_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_find_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【find_menu】元素信息"); return null;}
 }

/***
* 我的旅行
* @return
* @throws IOException
*/
public  ElementBeans mytravel_menu() throws IOException
 {
   if(locatorMap.containsKey("mytravel_menu")||locatorMap.containsKey("ios_mytravel_menu")){
   ElementBeans elementBeans=locatorMap.get("mytravel_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_mytravel_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【mytravel_menu】元素信息"); return null;}
 }

/***
* 创建
* @return
* @throws IOException
*/
public  ElementBeans create_menu() throws IOException
 {
   if(locatorMap.containsKey("create_menu")||locatorMap.containsKey("ios_create_menu")){
   ElementBeans elementBeans=locatorMap.get("create_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_create_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【create_menu】元素信息"); return null;}
 }
}