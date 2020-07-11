package Data;

import java.util.Scanner;

public class newWord {
	public static void main(String[] args){
		String loadname = "zy";
		Scanner a = new Scanner(System.in);
		System.out.println("登录名：");
		String dataname = a.nextLine();
		
		String password = "123456asd";
		//Scanner a = new Scanner(System.in);
		System.out.println("输入密码：");
		String datapass = a.nextLine();
		if(loadname.equals(dataname)&&password.equals(datapass)){
			System.out.println("登陆成功！");
		}else{
			System.out.println("登陆失败");
		}
	}
}

