package ch2test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݭn���L�ĴX�����B�z�O?(1~10)");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int num=Integer.parseInt(st);
		for (int i=1;i<=10;i++)
		{
			if (i==num)
				continue; //if i=��J�Ʀr ���L�B�~�򰵤U�Ӱj��
			System.out.println("��"+i+"���B�z");
		}
	}
}
