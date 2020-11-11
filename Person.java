package package1;

import java.util.Scanner;

public class Person implements StudentManage,TeacherManage{
	private String name;
	private String sex;
	private int age;
	private int fee;
	private int Salary;
	public final static int li=5000; 
	
	public void NaShuiE(Person stu){
		Scanner scan = new Scanner(System.in);// 从键盘接收数据
	    System.out.println("请输入你的姓名、年学费、年收入:");	    
	    try{
	    String name = scan.next();
	 	int fee1 = scan.nextInt(); 
	 	int Salary1 = scan.nextInt();
	 	  if(fee1<=0){
	 		  System.out.println("您没有缴纳年学费，无法进行纳税！");
	 	  }else if(Salary1<=0){
	 		 System.out.println("您没有年收入，无法进行纳税！");
	 	  }
	 	  else{
	 		  System.out.println(name+"博士"+"年学费是："+fee1 * 2 +";"+"年收入是："+Salary1 *12);
	 	   double sefValue=Salary1-fee1-li;
		    if(sefValue>=0 && sefValue<1500){
		    	sefValue = (sefValue)*0.03 - 0;
		    }else if(sefValue>=1500 && sefValue<4500){
		    	sefValue = (sefValue)*0.1 - 105;
	 
		    }else if(sefValue>=4500 && sefValue<9000){
		    	sefValue = (sefValue)*0.2 - 555;
	 
		    }else if(sefValue>=9000 && sefValue<35000){
		    	sefValue = (sefValue)*0.25 - 1005;
	 
		    }else if(sefValue>=35000 &&sefValue<55000){
		    	sefValue = (sefValue)*0.30 - 2755;
	 
		    }else if(sefValue>=55000 && sefValue<80000){
		    	sefValue = (sefValue)*0.35 - 5505;
	 
		    }else{
		    	sefValue = (sefValue)*0.45 - 13505;
		    }
		    
		    System.out.println(sefValue);
		    }
	    }
	    catch(Exception e){
	    	System.out.println("发生异常:"+e.getMessage());
	  
	    }
	    
	   
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}


	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public void setSalary() {
		// TODO Auto-generated method stub
		
	}
	public void searchSalary() {
		// TODO Auto-generated method stub
		
	}
	public void handfee() {
		// TODO Auto-generated method stub
		
	}
	public void searchfee() {
		// TODO Auto-generated method stub
		
	}
	

}
