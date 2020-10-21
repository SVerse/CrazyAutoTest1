package com.testfan.ui.auto.yml.douban.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//首页_对象库类
public class HomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(HomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   HomePage(DriverBase driver) {
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
* 书影音
* @return
* @throws IOException
*/
public  ElementBeans book_menu() throws IOException
 {
   if(locatorMap.containsKey("book_menu")||locatorMap.containsKey("ios_book_menu")){
   ElementBeans elementBeans=locatorMap.get("book_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_book_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【book_menu】元素信息"); return null;}
 }

/***
* 小组
* @return
* @throws IOException
*/
public  ElementBeans group_menu() throws IOException
 {
   if(locatorMap.containsKey("group_menu")||locatorMap.containsKey("ios_group_menu")){
   ElementBeans elementBeans=locatorMap.get("group_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_group_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【group_menu】元素信息"); return null;}
 }

/***
* 市集
* @return
* @throws IOException
*/
public  ElementBeans market_menu() throws IOException
 {
   if(locatorMap.containsKey("market_menu")||locatorMap.containsKey("ios_market_menu")){
   ElementBeans elementBeans=locatorMap.get("market_menu");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_market_menu");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【market_menu】元素信息"); return null;}
 }
}