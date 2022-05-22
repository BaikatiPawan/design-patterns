package com.baikati.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil dateUtil1 = DateUtil.getInstance();
		ObjectOutputStream outputStream = new ObjectOutputStream(
				new FileOutputStream(new File("D:\\design-patterns\\singleton-pattern\\dateUtil.ser")));

		outputStream.writeObject(dateUtil1);

		DateUtil dateUtil2 = null;

		ObjectInputStream inputStream = new ObjectInputStream(
				new FileInputStream(new File("D:\\design-patterns\\singleton-pattern\\dateUtil.ser")));
		dateUtil2 = (DateUtil) inputStream.readObject();

		System.out.println(dateUtil1 == dateUtil2);
		System.out.println(dateUtil1);
		System.out.println(dateUtil2);
	}
}
