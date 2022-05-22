package com.baikati.clone;

public class DateUtilTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = (DateUtil) dateUtil1.clone();
		
		System.out.println(dateUtil1 == dateUtil2);
	}
}
