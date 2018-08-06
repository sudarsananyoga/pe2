package com.stackroute.pe2;
	public class Factorial {
		private static Factorial fact;
			  public long calfact(long num)
			   {
			       long output;
			       if(num==1){
			         return 1;
			       }
			       //Recursion: Function calling itself!!
			       output = calfact(num-1)* num;
			       return output;
			   }
	 }

