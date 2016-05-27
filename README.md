# MyFrame
通用框架

＊ActivityCollector     
／／单列
／／activity 关闭管理 

调用
ActivityCollector  ac=ActivityCollector.getActivityCollector();//初始化

ac.addActivity(Activiy);//  添加activity

ac.getCurrentActivity();//得到当前activity

ac.finishCurrentActivity();//关闭当前activity

ac.AppExit(); //关闭所有activity，退出app
－－－－－－－－－－－－－－－－－－－－－－－
＊DataUtil 
／／数据简单存储
 
 调用
DataUtil.save(context,"文件key","数据key","数据");  ／／数据保存

String str=DataUtil.read(context,"文件key","数据key"); //数据读取  返回string

DataUtil.delete(context,"文件key");//  data delete
－－－－－－－－－－－－－－－－－－－－－－－－－

＊NetWorkUtil
／／网络连接 判断

调用
NetWorkUtil.iswork(context); // 返回 int

NetWorkUtil.WIFE_CONNECT   // 常量 有wife连接
 
NetWorkUtil.GPRS_CONNECT  //常量  有移动数据连接

NetWorkUtil.NO_NETWORK    //常量  无网络连接
－－－－－－－－－－－－－－－－－－－－－－－－－－
＊TimeUntil 
//时间工具类

调用
TimeUntil.getLocalDate(String format);  //获取当前本地日期，返回string, 
                                        //format 日期格式 例如 yyyy年MM月dd日

TimeUntil.getLocalTime(String format); //获取当前本地时间，返回string
                                       //format 时间格式 例如 HH:mm

TimeUntil.StrToDate(String format,String dateStr); //字符串转换成日期类  返回date
                                                     //format  例如 "yyyy年MM月dd日 HH:mm" or "yyyy年MM月dd日"
                                                     //dateStr  字符串格式时间或 日期


TimeUntil.StrToDate(Date date, String format); //日期时间转换成字符串  返回stirng
                                               
TimeUntil.getTomorrowDate(String format); //获取明天日期  返回string

TimeUntil.getDayOfWeek(Date date);  //获取时间在一周当中的哪一天 返回string


TimeUntil.getDayOfMouth(Date date); //获取时间在一月之中的哪一天 返回string

--------------------------------------------------------------------------
＊MeasureUtils
//屏幕操作工具类
调用
MeasureUtils.getWidth(context) //获取屏幕宽

MeasureUtils.getHeight(context) //获取屏幕高

------------------------------------------------------------

＊CircleImageView
//圆形头像
com.xiaoqiang.MyFrame.myview.CircleImageView


* NoScrollGridView
//无滚动条 GridView
com.xiaoqiang.MyFrame.myview.NoScrollGridView


＊NoScrollListView
// 无滚动条ListView
com.xiaoqiang.MyFrame.myview.NoScrollListView
－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－

本地相册 或 拍照 获取照片

PublishCircleActivity  跳转至这个界面即可
清单文件  
<uses-feature android:name="android.hardware.camera" />
<uses-feature android:name="android.hardware.camera.autofocus" />

<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.READ_LOGS" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.DOWNLOAD_WITHOUT_NOTIFICATION" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.GET_TASKS" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />


<activity android:name="com.xiaoqiang.MyFrame.photo.selector.TestPicActivity" >
</activity>
<activity android:name="com.xiaoqiang.MyFrame.photo.selector.ImageGridActivity" >
</activity>
<activity android:name="com.xiaoqiang.MyFrame.photo.selector.PhotoActivity" >
</activity>
<activity
android:name="com.xiaoqiang.MyFrame.PublishCircleActivity"
android:launchMode="singleTask" >

</activity>





