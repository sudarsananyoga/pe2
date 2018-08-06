package com.stackroute.pe2;

public class Palindrome {

 public String palin(int num) {
     int palindrome = num; 
     int reverse = 0,remainder;

     while (palindrome != 0) {
         remainder = palindrome % 10;
         reverse = reverse * 10 + remainder;
         palindrome = palindrome / 10;
     }
     if (num == reverse) {
         return "true";
     }
     return "false";
 }

}

	


