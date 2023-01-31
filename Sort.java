package com.example.demo;


public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		System.out.println("Array elements àfter sorting");
			
		for(int i=0; i<arr.length; i++)
		{
				for(int j=i+1; j<arr.length; j++)
			{
				int tmp=0;
				if(arr[i]>arr[j])
				{
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
					
				}
			}	
			System.out.println(arr[i]);
		}
		

	}

}
