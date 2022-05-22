package com.baikati.clone;

public class DateUtil implements Cloneable{
	private static DateUtil instance;

	private DateUtil() {

	}

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
	
	
}
