package com.testfan.ui.auto.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//javamall用户信息页_对象库类
public class UserInfoPage1223 extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(UserInfoPage1223.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   UserInfoPage1223(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 真实姓名
* @return
* @throws IOException
*/
public  ElementBeans nickname() throws IOException
 {
   if(locatorMap.containsKey("nickname")||locatorMap.containsKey("ios_nickname")){
   ElementBeans elementBeans=locatorMap.get("nickname");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_nickname");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【nickname】元素信息"); return null;}
 }

/***
* 性别
* @return
* @throws IOException
*/
public  ElementBeans sex() throws IOException
 {
   if(locatorMap.containsKey("sex")||locatorMap.containsKey("ios_sex")){
   ElementBeans elementBeans=locatorMap.get("sex");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_sex");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【sex】元素信息"); return null;}
 }

/***
* 生日
* @return
* @throws IOException
*/
public  ElementBeans mybirthday() throws IOException
 {
   if(locatorMap.containsKey("mybirthday")||locatorMap.containsKey("ios_mybirthday")){
   ElementBeans elementBeans=locatorMap.get("mybirthday");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_mybirthday");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【mybirthday】元素信息"); return null;}
 }

/***
* 省
* @return
* @throws IOException
*/
public  ElementBeans province_id() throws IOException
 {
   if(locatorMap.containsKey("province_id")||locatorMap.containsKey("ios_province_id")){
   ElementBeans elementBeans=locatorMap.get("province_id");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_province_id");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【province_id】元素信息"); return null;}
 }

/***
* 市
* @return
* @throws IOException
*/
public  ElementBeans city_id() throws IOException
 {
   if(locatorMap.containsKey("city_id")||locatorMap.containsKey("ios_city_id")){
   ElementBeans elementBeans=locatorMap.get("city_id");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_city_id");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【city_id】元素信息"); return null;}
 }

/***
* 区
* @return
* @throws IOException
*/
public  ElementBeans region_id() throws IOException
 {
   if(locatorMap.containsKey("region_id")||locatorMap.containsKey("ios_region_id")){
   ElementBeans elementBeans=locatorMap.get("region_id");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_region_id");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【region_id】元素信息"); return null;}
 }

/***
* 联系地址
* @return
* @throws IOException
*/
public  ElementBeans address() throws IOException
 {
   if(locatorMap.containsKey("address")||locatorMap.containsKey("ios_address")){
   ElementBeans elementBeans=locatorMap.get("address");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_address");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【address】元素信息"); return null;}
 }

/***
* 邮编
* @return
* @throws IOException
*/
public  ElementBeans zip() throws IOException
 {
   if(locatorMap.containsKey("zip")||locatorMap.containsKey("ios_zip")){
   ElementBeans elementBeans=locatorMap.get("zip");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_zip");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【zip】元素信息"); return null;}
 }

/***
* 手机号
* @return
* @throws IOException
*/
public  ElementBeans mobile() throws IOException
 {
   if(locatorMap.containsKey("mobile")||locatorMap.containsKey("ios_mobile")){
   ElementBeans elementBeans=locatorMap.get("mobile");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_mobile");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【mobile】元素信息"); return null;}
 }

/***
* 固定电话
* @return
* @throws IOException
*/
public  ElementBeans tel() throws IOException
 {
   if(locatorMap.containsKey("tel")||locatorMap.containsKey("ios_tel")){
   ElementBeans elementBeans=locatorMap.get("tel");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_tel");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【tel】元素信息"); return null;}
 }

/***
* 保存资料
* @return
* @throws IOException
*/
public  ElementBeans btnSubmit() throws IOException
 {
   if(locatorMap.containsKey("btnSubmit")||locatorMap.containsKey("ios_btnSubmit")){
   ElementBeans elementBeans=locatorMap.get("btnSubmit");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_btnSubmit");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【btnSubmit】元素信息"); return null;}
 }

/***
* 选择文件
* @return
* @throws IOException
*/
public  ElementBeans selectFile() throws IOException
 {
   if(locatorMap.containsKey("selectFile")||locatorMap.containsKey("ios_selectFile")){
   ElementBeans elementBeans=locatorMap.get("selectFile");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_selectFile");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【selectFile】元素信息"); return null;}
 }
}