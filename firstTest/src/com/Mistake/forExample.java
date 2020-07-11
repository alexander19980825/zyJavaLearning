package com.Mistake;

public class forExample {

	public static void main(String[] args) {
	int a = 11;
	String b = "mistake";
	String c = "11";
	String d = null;
	System.out.println(b.equals(c));
	System.out.println(Integer.valueOf(c) == a);
	String eStr = String.valueOf(a);
	System.out.println(b.equals(eStr));
	System.out.println(System.identityHashCode(d));
	

  }
	

}
