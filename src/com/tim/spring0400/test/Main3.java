package com.tim.spring0400.test;

public class Main3
{
	public static void main(String[] args)
	{
		// 判断一个整数一奇数还是偶数   
		int x = 124;
		// 奇数是，1,3,5...偶数是2,4,6...显然奇数%的结果为1.  
		int result = x % 2;
		System.out.println(result);
		// 使用判断语句进行判断。   
		if (result == 0)
		{
			System.out.println(x + "是偶数");
		}
		else
		{
			System.out.println(x + "是奇数");

		}
	}

}
