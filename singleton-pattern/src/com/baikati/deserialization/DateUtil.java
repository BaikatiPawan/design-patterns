package com.baikati.deserialization;

import java.io.Serializable;

/**
 * 
 * @author Pavan
 *
 */
public class DateUtil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	public Object readResolve() {
		return instance;
	}

}
