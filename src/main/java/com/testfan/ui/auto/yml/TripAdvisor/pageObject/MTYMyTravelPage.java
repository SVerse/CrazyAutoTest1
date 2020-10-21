package com.testfan.ui.auto.yml.TripAdvisor.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//我的旅行页面_对象库类
public class MTYMyTravelPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MTYMyTravelPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MTYMyTravelPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 添加按钮
* @return
* @throws IOException
*/
public  ElementBeans add() throws IOException
 {
   if(locatorMap.containsKey("add")||locatorMap.containsKey("ios_add")){
   ElementBeans elementBeans=locatorMap.get("add");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_add");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【add】元素信息"); return null;}
 }

/***
* 行程名称
* @return
* @throws IOException
*/
public  ElementBeans tripname() throws IOException
 {
   if(locatorMap.containsKey("tripname")||locatorMap.containsKey("ios_tripname")){
   ElementBeans elementBeans=locatorMap.get("tripname");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_tripname");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【tripname】元素信息"); return null;}
 }

/***
* 创建旅程
* @return
* @throws IOException
*/
public  ElementBeans create_trip() throws IOException
 {
   if(locatorMap.containsKey("create_trip")||locatorMap.containsKey("ios_create_trip")){
   ElementBeans elementBeans=locatorMap.get("create_trip");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_create_trip");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【create_trip】元素信息"); return null;}
 }

/***
* 创建
* @return
* @throws IOException
*/
public  ElementBeans create() throws IOException
 {
   if(locatorMap.containsKey("create")||locatorMap.containsKey("ios_create")){
   ElementBeans elementBeans=locatorMap.get("create");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_create");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【create】元素信息"); return null;}
 }

/***
* 表单上的行程名称
* @return
* @throws IOException
*/
public  ElementBeans listtrapname() throws IOException
 {
   if(locatorMap.containsKey("listtrapname")||locatorMap.containsKey("ios_listtrapname")){
   ElementBeans elementBeans=locatorMap.get("listtrapname");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_listtrapname");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【listtrapname】元素信息"); return null;}
 }
}