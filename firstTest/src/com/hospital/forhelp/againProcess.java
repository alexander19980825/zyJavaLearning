package com.hospital.forhelp;

import java.util.Scanner;

public class againProcess {
	static String name="张三";
	static String password="123456sd";

	public static void main(String[] args) {		
		againProcess hospital=new againProcess();//调用整个包,要形如“hospital.”才能调用
		hospital.Username();
		hospital.password();
		hospital.completeInformation();
		hospital.success();
		}
	public void Username(){ //不要使用静态变量 static
		String Loginname;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入用户名");
		Loginname=scanner.next();
		scanner.close();
		if(name.equals(Loginname)){
			System.out.print("用户名正确");			
			}
		else {
			System.out.print("请重新输入");
		Username();
		}
	}
	public void password() {
		String Loginpassword;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入密码");
		Loginpassword=scanner.next();
		scanner.close();
		if(password.equals(Loginpassword)){
			System.out.print("密码正确");
			
			}
		else {
			System.out.print("请重新输入");
		password();
		}
	}
	public void completeInformation() {
		System.out.println("请继续完善信息...");
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入号码:");
		long num = scanner.nextLong();
		scanner.nextLine();
		System.out.println("输入身份证号码：");
		String papers = scanner.nextLine();
		scanner.close();
	}
	public  void success() {
		System.out.print("信息填写完成！！！");
	}
	

}
