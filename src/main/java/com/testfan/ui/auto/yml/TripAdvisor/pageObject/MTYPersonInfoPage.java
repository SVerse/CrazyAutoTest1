package com.testfan.ui.auto.yml.TripAdvisor.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//个人信息页面_对象库类
public class MTYPersonInfoPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MTYPersonInfoPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MTYPersonInfoPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 编辑简介
* @return
* @throws IOException
*/
public  ElementBeans editinfo() throws IOException
 {
   if(locatorMap.containsKey("editinfo")||locatorMap.containsKey("ios_editinfo")){
   ElementBeans elementBeans=locatorMap.get("editinfo");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_editinfo");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【editinfo】元素信息"); return null;}
 }

/***
* 用户头像
* @return
* @throws IOException
*/
public  ElementBeans userimage() throws IOException
 {
   if(locatorMap.containsKey("userimage")||locatorMap.containsKey("ios_userimage")){
   ElementBeans elementBeans=locatorMap.get("userimage");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_userimage");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【userimage】元素信息"); return null;}
 }

/***
* fab
* @return
* @throws IOException
*/
public  ElementBeans fab() throws IOException
 {
   if(locatorMap.containsKey("fab")||locatorMap.containsKey("ios_fab")){
   ElementBeans elementBeans=locatorMap.get("fab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_fab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【fab】元素信息"); return null;}
 }

/***
* 相册图片
* @return
* @throws IOException
*/
public  ElementBeans icons() throws IOException
 {
   if(locatorMap.containsKey("icons")||locatorMap.containsKey("ios_icons")){
   ElementBeans elementBeans=locatorMap.get("icons");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_icons");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【icons】元素信息"); return null;}
 }

/***
* 确认
* @return
* @throws IOException
*/
public  ElementBeans confirm() throws IOException
 {
   if(locatorMap.containsKey("confirm")||locatorMap.containsKey("ios_confirm")){
   ElementBeans elementBeans=locatorMap.get("confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【confirm】元素信息"); return null;}
 }

/***
* 保存
* @return
* @throws IOException
*/
public  ElementBeans save() throws IOException
 {
   if(locatorMap.containsKey("save")||locatorMap.containsKey("ios_save")){
   ElementBeans elementBeans=locatorMap.get("save");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_save");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【save】元素信息"); return null;}
 }
}