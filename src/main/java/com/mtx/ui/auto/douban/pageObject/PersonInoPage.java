package com.mtx.ui.auto.douban.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//个人信息页面元素_对象库类
public class PersonInoPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(PersonInoPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   PersonInoPage(DriverBase driver) {
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
* 相册
* @return
* @throws IOException
*/
public  ElementBeans album() throws IOException
 {
   if(locatorMap.containsKey("album")||locatorMap.containsKey("ios_album")){
   ElementBeans elementBeans=locatorMap.get("album");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_album");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【album】元素信息"); return null;}
 }

/***
* 相册里的图片
* @return
* @throws IOException
*/
public  ElementBeans icon() throws IOException
 {
   if(locatorMap.containsKey("icon")||locatorMap.containsKey("ios_icon")){
   ElementBeans elementBeans=locatorMap.get("icon");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_icon");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【icon】元素信息"); return null;}
 }

/***
* 确定
* @return
* @throws IOException
*/
public  ElementBeans finishbtn() throws IOException
 {
   if(locatorMap.containsKey("finishbtn")||locatorMap.containsKey("ios_finishbtn")){
   ElementBeans elementBeans=locatorMap.get("finishbtn");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_finishbtn");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【finishbtn】元素信息"); return null;}
 }

/***
* 完成
* @return
* @throws IOException
*/
public  ElementBeans sure() throws IOException
 {
   if(locatorMap.containsKey("sure")||locatorMap.containsKey("ios_sure")){
   ElementBeans elementBeans=locatorMap.get("sure");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_sure");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【sure】元素信息"); return null;}
 }

/***
* 返回
* @return
* @throws IOException
*/
public  ElementBeans back() throws IOException
 {
   if(locatorMap.containsKey("back")||locatorMap.containsKey("ios_back")){
   ElementBeans elementBeans=locatorMap.get("back");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_back");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【back】元素信息"); return null;}
 }
}