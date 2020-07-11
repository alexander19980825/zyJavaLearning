package com.downloadserct;

public class ChargeEquals {
	
	public static void main(String[] args){
		String s1 = new String ("张源");
		System.out.println(System.identityHashCode(s1));
		String s2 = new String ("张源");
		System.out.println(System.identityHashCode(s2));
		String s3 = new String ("张源");
		System.out.println(System.identityHashCode(s3));
		String s4 = new String ("张源");
		System.out.println(System.identityHashCode(s4));
		System.out.println("==:"+s1 == s2);
		System.out.println("eqquals:"+ s1.equals(s2));
		System.out.println("eqquals:"+s3.equals(s4));
		
	}

}
