package com.tim.spring0400.test;

public class ArrayTest
{

	public static void main(String[] args)
	{
		//我有一个int 数组
		int intArray[] =
		{ 1, 23, 12, 34, 5 };
		//数据先要给他分配空间，也就是说  array这个数组现在已经有10个空间了  已经在内存中占了10个位置
		//如果我们想加入数据，也只能放10个。如果什么都不放，他会默认都是  0  因为他是基本数据类型
		//我们先给数据放数据
		//如果对数据里的数据进行删除，其实就是把这个数据所在的位置重置为0

		System.out.println("=====原始数据======");


		//删除某个数据  删除34这个数据
		//removeIndex(intArray, 34);

		//删除某个位置的数据
		//removeIndex2(intArray, 4);


		int[] arr =
		{ 1, 13, 45, 5, 0, 0, 16, 6, 0, 25, 4, 17, 6, 7, 0, 15 };
		//打印数组
		print(arr);

		int[] result = removeZero(arr);

		System.out.println("");

		System.out.println("=====结果数据======");
		//打印数组
		print(result);
	}

	private static int[] removeZero(int[] arr)
	{
		//定义一个接收的数组
		int[] result = new int[arr.length];//因为我还不知道这个要返回的数组要多长，所以，定成跟原来一样长，肯定没问题

		int index = 0;//这个是在放结果的时候，给他做一个计数。从0开始加，就是数组的下标  把非0的数据都放进来

		int count = 0;
		//我也不会写，但是咱们先写一步，想一步
		//先把数组循环一下，找到是0的那个数据，然后把不是0的数据放到另一个地方就可以了。
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == 0)
			{//如果是0.我就不让他走下去，直接再进行下一个数据的循环
				count++;
				continue;
			}

			//不是0，所以把这个当前的数据arr[i]放在我的结果集里
			result[index++] = arr[i];
		}
		//result = {11, 13, 45, 5,  16, 6, ,000000000,0,0,};

		int[] result2 = new int[arr.length - count];
		int index2 = 0;
		for (int i = 0; i < result.length; i++)
		{
			if (result[i] == 0)
			{//如果是0.我就不让他走下去，直接再进行下一个数据的循环
				continue;
			}

			//不是0，所以把这个当前的数据arr[i]放在我的结果集里
			result2[index2++] = result[i];
		}

		//到现在为止，我把所有非0的数据都放在了前面，后面的几个数字，应该就都是0    
		//{ 1, 13, 45, 5,  16, 6, 25, 4, 17, 6, 7, 15 ,  0, 0,0, 0,  };

		//return Arrays.copyOf(result, arr.length - count);

		return result2;
	}

	private static void removeIndex2(int[] intArray, int x)
	{
		for (int i = 0; i < intArray.length; i++)
		{
			if (i == x)
			{
				intArray[i] = 0;
				break;
			}
		}
	}

	private static void removeIndex(int[] intArray, int x)
	{
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] == x)
			{
				intArray[i] = 0;
				break;
			}
		}
	}

	private static void print(int[] intArray)
	{
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.print(intArray[i] + ",");
		}

	}

}
