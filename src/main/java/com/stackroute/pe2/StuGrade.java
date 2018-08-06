package com.stackroute.pe2;

public class StuGrade {
	public int max(int arr[])
	{ 
		 int maxValue = arr[0];
		  for(int i=1;i < arr.length;i++){
		    if(arr[i] > maxValue){
			  maxValue = arr[i];
			}
		  }
		  return maxValue;
		}
	
	public int min(int arr[])
	{ 
		int minValue = arr[0];
		  for(int i=1;i<arr.length;i++){
		    if(arr[i] < minValue){
			  minValue = arr[i];
			}
		  }
		  return minValue;
		}
	
	public int avg(int arr[])
	{ 
           int average,total=0;
	        for(int i=0; i<arr.length; i++){
	        	total = total + arr[i];
	        }
	         average = total / arr.length;
	         return average;
		
			}
		}

