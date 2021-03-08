package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.sql.SQLException;

public class ExceptionHandling {

	private static int dest = 1;

	public static void main(String[] args) {

		System.out.println("** 1.  start of main()");
		try {
			m1();

		} catch (IOException e) {
			e.printStackTrace();
		} /*
			 * catch (Exception e) { e.printStackTrace(); } catch (Throwable e) {
			 * e.printStackTrace(); }
			 */

		finally {
			System.out.println("Hey I will execute every time");
		}

		System.out.println("Hey I will not be executed at any cost because I am after finally block");

		System.out.println("** 2. end of main()");

	}

	public static void m1() throws IOException {

		System.out.println("** 1. start of m1()");
		m2();
		System.out.println("** 2. end of m1()");

	}

	public static void m2() throws IOException {

		System.out.println("** 1. start of m2()");

		if (dest == 1)
			throw new FileNotFoundException();
//		else if (dest == 2)
//			throw new IOException();
//		else if (dest == 3)
//			throw new SQLException();

		/*
		 * finally {
		 * 
		 * }
		 */

		System.out.println("** 2. end of m2()");

	}

}
