# Project3
## 计G201 2020322064 李青青
## 接口异常处理实验
## 一、实验目的
1、掌握Java中抽象类和抽象方法的定义。   
2、掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法。  
3、了解异常的使用方法，并在程序中根据输入情况做异常处理。
## 二、实验要求
1、在博士研究生类中实现各个接口定义的抽象方法。  
2、对年学费和年收入进行统计，用收入减去学费，求得纳税额。  
3、国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
4、实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5、根据输入情况，要在程序中做异常处理。  
## 三、实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1、设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2、设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3、编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
## 四、实验过程
1、首先，设置了四个类，分别为：博士研究生类、测试类以及两个接口类：学生管理接口类和教师管理接口类。  
2、在学生管理接口StudentManage类用void方法设置缴纳学费和查学费的功能，在教师接口TeacherManage类里用void方法设置发放薪水和查询薪水的功能。  
3、在博士研究生Person类里设置姓名、性别、年龄、每学期学费、每月薪水这五个属性并设置为私有，在博士研究生Person类里用关键字implements声明博士研究生类实现学生管理接口和
教师管理接口。将这五个属性设置它们的get、set方法，用void方法在博士研究生Person类中实现学生管理接口和教师管理接口定义的抽象方法。  
4、在博士研究生Person类里设置一个用来计算纳税额的方法，在该方法里设置计算年应纳税金额的判断语句，设置年收入和学费之差这一功能，用static final关键字修饰定义属于某一时期的特定固定值的纳税标准，
，在该方法里用scanner类实现运行时交互式输入，从键盘接收数据，调用next()方法依次返回被解析的字符序列中的单词。  
5、在博士研究生Person类里进行异常捕获，调用try-catch方法进行异常捕获，用if-else if-else判断语句对年学费和年收入进行异常判断。  
6、在Test测试类里，实例化博士研究生，统计他们的年收入和年学费，根据两者之差，计算每名博士研究生的年应纳税额。  
## 五、核心代码  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5r4xXSsogjv53mEZb909Q4KNMMKtY80Vfh2Q8rGUucosjxfDWcPIxHG6IwEAG40SKqByM3vF*62D69*kFX*unyc!/b&bo=UgLAAAAAAAADB7I!&rf=viewer_4)          
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcVrl99aEzSL08BW5m6KR5Vw3V8Phba548lMnlguf34ROmy8qbOFTdLYotLO8oCX9oXXbI1YIMJolTUz0KAld95s!/b&bo=XgPiAQAAAAADF4w!&rf=viewer_4)                 
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcVrl99aEzSL08BW5m6KR5Vy2PwQFjZv.c*GYy8p6nrtKwNZEcCnc*sict4ZbiYg97xlJnUwHXbcVja286xuiKOk!/b&bo=9wBPAAAAAAADF4o!&rf=viewer_4)     
## 六、运行结果  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5gOXcSEpuI7WsUhtVMjF0ahH7U5Z8VzhkGY0moQkkKIc6MHip7qXhno47C2MzPIAxXDM3IcXhptLHGQmGkwKyXM!/b&bo=gwGIAQAAAAADByk!&rf=viewer_4)     
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcWS1zCIOX7MB3ii3YOqUOFR3MThGvr8LFsdbB*uFCsO4JDrZ4cVa4QNvWnIb.2QiQNOCFWwrw9dili2A*qr4*n8!/b&bo=NAHUAAAAAAADF9M!&rf=viewer_4)      
## 七、感想  
在这次接口异常处理的实验中，让我对抽象类和抽象方法的定义有了更深入的了解，掌握了在类中实现各接口定义的抽象方法，知道了如何使用static final对某一时期国家纳税标准的特定固定值的修饰定义，
了解了用scanner类实现运行时交互式输入，调用next()方法依次返回被解析的字符序列中的单词，但在这次编写程序时，会遇到不知道如何编写计算纳税额这一功能的实现，但通过最后翻阅课本以及各种尝试编写代码，最后用if-else if-else语句进行编写，克服了这一困难。掌握了异常捕获try-catch这一用法，根据输入情况做异常处理。

