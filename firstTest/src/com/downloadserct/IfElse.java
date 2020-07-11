package com.downloadserct;

import java.util.Scanner;

import Data.newWord;

public class IfElse {

	public static void main(String[] args) {
/*		double starttime = 16.00;
		double persontime = 14.39;
		String NoTicket = "G124";
		if (persontime < starttime){
			System.out.println("乘客能够赶上"+NoTicket +"此次列车！");
			}else{
				System.out.println("乘客赶不上"+NoTicket + "此次");
			}*/
	
		
		Scanner num  = new Scanner(System.in);
		int i = num.nextInt() ;
		if(i>=90 && i<=100){
			System.out.println("成绩优秀");			
		}else if(i>=80 && i<90){
			System.out.println("成绩良好");
		}else if(i>=70 && i<80){
			System.out.println("成绩中等");
		}else if(i>=60 && i<70){
			System.out.println("成绩及格");
		}else if(i>=0 && i<60){
			System.out.println("成绩不及格");
		}else{
			System.out.println("无效数字");
		}

}
}
