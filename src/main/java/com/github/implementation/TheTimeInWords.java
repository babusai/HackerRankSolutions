package com.github.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheTimeInWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(21, "twenty one");
        map.put(22, "twenty two");
        map.put(23, "twenty three");
        map.put(24, "twenty four");
        map.put(25, "twenty five");
        map.put(26, "twenty six");
        map.put(27, "twenty seven");
        map.put(28, "twenty eight");
        map.put(29, "twenty nine");
        String timeinwords=null;
        if(m<=30){
	        if(m==0){
	        	timeinwords = map.get(h)+" o' clock";
	        }else if(m==15){
	        	timeinwords = "quarter past "+map.get(h);
	        }else if(m==30){
	        	timeinwords = "half past "+map.get(h);
	        }else if(m==1){
	        	timeinwords = map.get(m)+" minute past "+map.get(h);
	        }else{
	        	timeinwords = map.get(m)+" minutes past "+map.get(h);
	        }
	     }else{
	    	 if(m==45){
	    		 timeinwords = "quarter to "+map.get(h+1);	 
	    	 }else if(m==59){
	    		 timeinwords = "one minute to "+map.get(h+1);
	    	 }else{
	    		 timeinwords = map.get(60-m)+" minutes to "+map.get(h+1);
	    	 }
	     }
        System.out.println(timeinwords);
     }
}
