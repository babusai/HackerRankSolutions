package com.github.strings;

import java.util.Scanner;

public class GemStones {

    static int gemstones(String[] arr){
    	int gemstones=0;
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	for(int i=0;i<alphabet.length();i++){
    		String character = alphabet.substring(i, i+1);
    		boolean found = true; 
    		for(int j=0;j<arr.length;j++){
    			if(arr[j].indexOf(character)==-1){
    				found=false;
    				break;
    			}
    		}
    		if(found){
    			gemstones++;
    		}
    	}
    	return gemstones;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
