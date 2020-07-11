package com.downloadserct;

import java.util.Scanner;

public class ThreeCala {

	public static void main(String[] args) {
		ThreeCala selec = new ThreeCala();
		selec.SwtichWay();		
	}

	public void SwtichWay() {
		Scanner num = new Scanner(System.in);
		int day = num.nextInt();
		num.close();
		/*switch (day) {
		case 1:
			System.out.println("今天是工作日");
			break;
		case 2:
			System.out.println("今天是工作日");
			break;
		case 3:
			System.out.println("今天是工作日");
			break;
		case 4:
			System.out.println("今天是工作日");
			break;
		case 5:
			System.out.println("今天是工作日");
			break;
		case 6:
			System.out.println("休息日");
			break;
		case 7:
			System.out.println("休息日");
			break;
		default:
			System.out.println("不是合法数字");
			break;
		}*/
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("今天是工作日");
			break;
		case 6:
		case 7:
			System.out.println("休息日");
			break;
		default:
			System.out.println("不是合法数字,只能输入1~7");
			break;
		} 
		}

	}

    	 
     

