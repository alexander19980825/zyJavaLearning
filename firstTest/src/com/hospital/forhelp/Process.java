package com.hospital.forhelp;

import java.util.Scanner;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class Process 
{
	public static void main(String[] args) {
		loading();
		String loadname = "张三";
		String password = "123456asd";
		Scanner a = new Scanner(System.in);
		System.out.println("姓名：");
		String name = a.nextLine();
		// System.out.println(name);
		System.out.println("密码：");
		String datapaw = a.nextLine();
		a.close();
		if (loadname.equals(name)) {
			System.out.println("登陆成功，请继续完善个人信息...");
			// String num = a.nextLine();
			System.out.println("电话号码:");
			Scanner b = new Scanner(System.in);
			long num = b.nextLong();
			// 或出现下面身份证和家庭住址同时出现或者java.util.InputMismatchException
			// nextLong后面不读取\n
			b.nextLine();// 换行 留取一个\n不读取，但是会读取下面的nextLine();
			System.out.println("身份证：");
			String papers = b.nextLine();
			System.out.println("家庭住址：");
			String address = b.nextLine();
			System.out.println("选择科室：");
			String department = b.nextLine();
			System.out.println("预约挂号：");
			String register = b.nextLine();
			System.out.println("预约时间：");
			String time = b.nextLine();
			b.close();
			success();

		} else {
			System.out.println("输入账号不正确，请重新输入！！！");
			relogin();
		}

	}



	public static void loading() {
		System.out.println("正在载入界面.....");
	}

	public static void success() {
		System.out.println("预约成功！");

	}

	public  static void relogin() {
		Scanner a = new Scanner(System.in);
		System.out.println("姓名：");
		String name = a.next();
		System.out.println("密码：");
		String datapaw = a.next();
		a.close();
			
		}
}

