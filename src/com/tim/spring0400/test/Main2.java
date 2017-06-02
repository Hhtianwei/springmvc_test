package com.tim.spring0400.test;

import java.util.Random;


public class Main2
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Integer.toBinaryString((char) 1));
		change2Binary("1");
	}

	private static void change2Binary(String source)
	{
		char[] cArray = source.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cArray.length; i++)
		{
			sb.append(Integer.toBinaryString(cArray[i]));
		}
		System.out.println(sb.toString());
	}

	private static String toBinaryStringByIntString(String source)
	{
		int sourceInt = Integer.parseInt(source);
		String binaryString = Integer.toBinaryString(sourceInt);
		Random r = new Random();
		while (binaryString.length() < 32)
		{
			binaryString += r.nextInt(2);
		}
		return binaryString;
	}

	private static String createRandumNumber(int count)
	{
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		while (sb.length() < count)
		{
			sb.append(r.nextInt(10));
		}
		return sb.toString();
	}


}
