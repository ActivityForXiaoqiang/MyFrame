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



