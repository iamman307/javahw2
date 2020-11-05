package ch2test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要跳過第幾次的處理呢?(1~10)");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int num=Integer.parseInt(st);
		for (int i=1;i<=10;i++)
		{
			if (i==num)
				continue; //if i=輸入數字 跳過且繼續做下個迴圈
			System.out.println("第"+i+"次處理");
		}
	}
}
