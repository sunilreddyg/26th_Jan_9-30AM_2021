package mq.java.core.Arrays;

public class Dynamic_Array_Declaration {

	public static void main(String[] args) {
		
		 		//Single dimensional runtime array.
				String tools[]={"IDE","RC","WD","GRID","APPIUM"};
			    // Print WD tool name
				System.out.println(tools[2]);
				
				
				//Runtime Double dimensional array
				String userdata[][]= 
				{
						{"Aakash","EMP001"},
						{"Harish","EMP002"},
						{"Dany","EMP003"},
				};
				
				//Print harish records
				System.out.println(userdata[1][0]+"   "+userdata[1][1]);
				
				
				//Read all double dimension array details
				for (int i = 0; i < userdata.length; i++) 
				{
					System.out.println(userdata[i][0]+"     "+userdata[i][1]);
				}

	}

}
