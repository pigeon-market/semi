package com.pigeonMarket.common;

public class Test {
	
	public static void main(String[] args ) {
		
		String eamil = "ajeial@naver.com";
		
		int eamilDiv = eamil.indexOf("@");
		
		String eamil1 = eamil.substring(0, eamilDiv-1);
		
		String eamil2 = eamil.substring(eamilDiv+1);
		
		System.out.println(eamil1);
		System.out.println(eamil2);
		System.out.println(eamil1 + "@" +eamil2);
		
		
		
		
	}

}
