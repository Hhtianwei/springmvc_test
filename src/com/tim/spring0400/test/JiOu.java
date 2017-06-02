package com.tim.spring0400.test;

//键盘输入一个整数，判断这个整数为奇数还是偶数
import java.util.Scanner;


public class JiOu
{
	public static void main(String[] args)
	{
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkNum(num);
	}

	private static void checkNum(int num)
	{
		int result = num % 2;

		if (result == 0)
		{
			System.out.println("这个整数为偶数！！1！");
		}
		else
		{
			System.out.println("这个整数为奇数！！！");
		}
		System.out.println("退出请输入q，否则请输入需要判断的数字：");
		Scanner canner = new Scanner(System.in);
		String line = canner.nextLine();
		if ("q".equalsIgnoreCase(line))
		{
			System.out.println("System close...");
			System.exit(0);
		}
		//
		checkNum(Integer.parseInt(line));
	}
}
