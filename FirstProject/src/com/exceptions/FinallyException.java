package com.exceptions;
import java.util.*;
public class FinallyException{

	public static void main(String[] args) {
	Scanner sc=null;
		try
		{
		sc=new Scanner(System.in);
			int a=sc.nextInt();
			int d=42/a;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		sc.close();
		System.out.println("i am in finally");
		}
	}

}

