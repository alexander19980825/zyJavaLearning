
package com.Mistake;

import java.util.Scanner;

public class calalution {
	public static void mian(String[] args){
		String loadname = "zy";
		Scanner a = new Scanner(System.in);
		System.out.println("登录名：");
		String dataname = a.nextLine();
		
		String password = "123456asdf";
		Scanner b = new Scanner(System.in);
		System.out.println("输入密码：");
		String datapass = a.nextLine();
		if(loadname.equals(dataname)&&password.equals(datapass)){
			System.out.println("登陆成功！");
		}else{
			System.out.println("登陆失败");
		}		
	}
}
