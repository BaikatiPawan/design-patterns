package com.baikati.eager;

public class DateUtil {
	private static final DateUtil instance = new DateUtil();

	private DateUtil() {

	}

	public static DateUtil getInstance() {
		return instance;
	}
}
