package mq.java.core.Arrays;


public class Static_Array_Declaration {

	public static void main(String[] args) 
	{
		
		//Single dimensional static array
		
		String arrayname[]=new String[5];
		arrayname[0]="Samsung";
		arrayname[1]="oneplus";
		arrayname[2]="Apple";
		arrayname[3]="LG";
		arrayname[4]="Oppo";

		//print oneplug value 
		String var1=arrayname[1];
		System.out.println("index 1 value is --> "+var1);
		
		//Get length of an array
		int Count=arrayname.length;
		System.out.println("Object count is ---> "+Count);
		
		
		//Double dimensional static array
		String data[][]=new String[2][2];
		
		//Data storing into first row
		data[0][0]="Arun";
		data[0][1]="9030";
		
		//Data storing into second row
		data[1][0]="Arun";
		data[1][1]="9030";
		
		//Get length of an array [Count Only return number of rows data available]
		int obj_count=data.length;
		System.out.println("Object Count is --> "+obj_count);
		
		
		//Diff set of data to store
		Object Product[][]=new Object[3][2];
		Product[0][0]="Samsung";
		Product[0][1]=1500.00;
		
		Product[1][0]="Apple";
		Product[1][1]=1400.00;
		
		Product[2][0]="OnePlus";
		Product[2][1]=1300.00;
		
		System.out.println(Product[1][0]);
		System.out.println(Product[1][1]);
		
		
		
		//Print array values using for loop
		int num[]=new int[4];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		
		//Get count of numeric objects
		int Num_count=num.length;
		
		//Apply for loop to read all values
		for (int i = 0; i < Num_count; i++) 
		{
			System.out.println(num[i]);
		}
		
		
		
	}

}
