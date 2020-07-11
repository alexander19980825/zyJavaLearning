package com.scanner.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入你的姓名：");
		String nikename = scanner.nextLine();
		System.out.println("你输入的昵称：" + nikename);
		System.out.println("输入你的QQ号：");
		String  qqnum = scanner.nextLine();
		//scanner.nextLine();
		System.out.println("你的qq号："+qqnum);
		String replacename = nikename.replaceAll("国服巅峰","the one");
		System.out.println("下改之后："+replacename);
		if (replacename != null &&  !"" .equals(replacename)){
			System.out.println("成功！");
		}else{
			System.out.println("失败！");
		}
	}

}
