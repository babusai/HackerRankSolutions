package com.github.strings;

import java.util.Scanner;

public class FunnyString {
    static String funnyString(String s){
    	String result = "Funny";
        StringBuilder stringer = new StringBuilder(s);
        String reverse = stringer.reverse().toString();
        for(int i=1;i<s.length();i++){
        	if(Math.abs(s.charAt(i)-s.charAt(i-1)) != Math.abs(reverse.charAt(i)-reverse.charAt(i-1))){
        		result="Not Funny";
        		break;
        	}
        }
    	return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}