package com.mtx.ui.auto.douban.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//我的日记页面元素_对象库类
public class MydiaryPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MydiaryPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MydiaryPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 写日记图标
* @return
* @throws IOException
*/
public  ElementBeans btn_post() throws IOException
 {
   if(locatorMap.containsKey("btn_post")||locatorMap.containsKey("ios_btn_post")){
   ElementBeans elementBeans=locatorMap.get("btn_post");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_btn_post");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【btn_post】元素信息"); return null;}
 }

/***
* 日记标题输入框
* @return
* @throws IOException
*/
public  ElementBeans rd__title() throws IOException
 {
   if(locatorMap.containsKey("rd__title")||locatorMap.containsKey("ios_rd__title")){
   ElementBeans elementBeans=locatorMap.get("rd__title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_rd__title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【rd__title】元素信息"); return null;}
 }

/***
* 日记内容
* @return
* @throws IOException
*/
public  ElementBeans rd__text() throws IOException
 {
   if(locatorMap.containsKey("rd__text")||locatorMap.containsKey("ios_rd__text")){
   ElementBeans elementBeans=locatorMap.get("rd__text");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_rd__text");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【rd__text】元素信息"); return null;}
 }

/***
* 继续
* @return
* @throws IOException
*/
public  ElementBeans goon() throws IOException
 {
   if(locatorMap.containsKey("goon")||locatorMap.containsKey("ios_goon")){
   ElementBeans elementBeans=locatorMap.get("goon");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_goon");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【goon】元素信息"); return null;}
 }

/***
* 发布
* @return
* @throws IOException
*/
public  ElementBeans release() throws IOException
 {
   if(locatorMap.containsKey("release")||locatorMap.containsKey("ios_release")){
   ElementBeans elementBeans=locatorMap.get("release");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_release");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【release】元素信息"); return null;}
 }

/***
* 日记列表的标题和内容
* @return
* @throws IOException
*/
public  ElementBeans content_text() throws IOException
 {
   if(locatorMap.containsKey("content_text")||locatorMap.containsKey("ios_content_text")){
   ElementBeans elementBeans=locatorMap.get("content_text");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_content_text");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【content_text】元素信息"); return null;}
 }
}