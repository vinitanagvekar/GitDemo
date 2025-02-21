package selenium;

import java.util.ArrayList;
import java.util.Scanner;

public class Javapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array
//		int[] array = new int[5];
//		array[0] = 1;
//		array[1] = 2;
		
//		int[] arr = {1,2,3,4};
//		//for loop
//		
//		for(int i=0; i<arr.length ; i++) {
//			//System.out.println(arr[3]);
//			System.out.println(arr[i]);
//			//System.out.println(arr.length);
//		}
//		
//		for (int j:arr)
//			System.out.println(j);
		
//		int[] arr2 = {1,2,3,4,5,6,7,8,9};
//		//2,4,6,8
//		int i;
//		for(i=0; i< arr2.length ; i++)
//			if(arr2[i]%3==0)
//				System.out.println(arr2[i]);
		
		
		
		
		
		
//		int numbers[]={1,2,3,4,5};
//		int i;
//        System.out.println("The first element of the array is "+numbers[0]);
//        
//        for(i=0; i <= ((numbers.length) -1) ; i++)
//        {
//            if(i == (numbers.length)-1)
//                System.out.println("The last element of the array is "+numbers[i]);
//            else
//            	{}
//            	
//        }
//        
//        int  j = numbers.length;
//        System.out.println("Array in reverse order ");            
//
//        for( j = j-1; j >= 0 ; j--)
//            System.out.println(numbers[j]);            
		
	
	
//	ArrayList<String> a = new ArrayList<String>();
//	a.add("a");
//	a.add("b");
//	Scanner s = new Scanner(System.in);
//	System.out.println("Add elements in the array:");
//	
//	while(true)
//	{
//		String input = s.nextLine();
//		if (input.equalsIgnoreCase("done")) {
//            break;
//        }
//        // Add the input to the ArrayList
//        a.add(input);
//	}
//	s.close();
//	
//	for(String i:a)
//	{
//		System.out.println(i);
//	}
	
	
	
	
	
	
	String str = "vinita  dsfdf nagvekar";
	
	String[] str1 = str.split("dsfdf");
	System.out.println(str1[0]);
	System.out.println(str1[1]);
	System.out.println(str1[1].trim());
	for(int i=(str.length())-1 ; i>= 0 ;i--)
	{
		System.out.println(str.charAt(i));
	}
}
	
}








