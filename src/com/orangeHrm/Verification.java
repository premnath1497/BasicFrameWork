package com.orangeHrm;

public class Verification extends Helper {
	
	public static void verification() {
		   String actualTitle=driver.getTitle();
		   
		   String expectedTitle="OrangeHRM";
		   
		
//		   Object obj=new Object();
//		   boolean b=obj.equals(false);
//		   System.out.println(b);
		   
		   if(actualTitle.equals(expectedTitle)) {
			   System.out.println("Test Case Passed");
		   }
		   else {
			   System.out.println("Test Case Failed");
		   }
	}

}
