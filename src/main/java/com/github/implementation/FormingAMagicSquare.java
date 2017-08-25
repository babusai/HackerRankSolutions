package com.github.implementation;

import java.util.Scanner;

public class FormingAMagicSquare {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
        int[][] solution1 = new int[3][3];
        solution1[0][0] = 4;
        solution1[0][1] = 9;
        solution1[0][2] = 2;
        
        solution1[1][0] = 3;
        solution1[1][1] = 5;
        solution1[1][2] = 7;
        
        solution1[2][0] = 8;
        solution1[2][1] = 1;
        solution1[2][2] = 6;
        
        int[][] solution2 = new int[3][3];
        solution2[0][0] = 8;
        solution2[0][1] = 1;
        solution2[0][2] = 6;
        
        solution2[1][0] = 3;
        solution2[1][1] = 5;
        solution2[1][2] = 7;
        
        solution2[2][0] = 4;
        solution2[2][1] = 9;
        solution2[2][2] = 2;
        
        int[][] solution3 = new int[3][3];
        solution3[0][0] = 2;
        solution3[0][1] = 9;
        solution3[0][2] = 4;
        
        solution3[1][0] = 7;
        solution3[1][1] = 5;
        solution3[1][2] = 3;
        
        solution3[2][0] = 6;
        solution3[2][1] = 1;
        solution3[2][2] = 8;
        
        int[][] solution4 = new int[3][3];
        solution4[0][0] = 6;
        solution4[0][1] = 1;
        solution4[0][2] = 8;
        
        solution4[1][0] = 7;
        solution4[1][1] = 5;
        solution4[1][2] = 3;
        
        solution4[2][0] = 2;
        solution4[2][1] = 9;
        solution4[2][2] = 4;
        
        int[][] solution5 = new int[3][3];
        solution5[0][0] = 2;
        solution5[0][1] = 7;
        solution5[0][2] = 6;
        
        solution5[1][0] = 9;
        solution5[1][1] = 5;
        solution5[1][2] = 1;
        
        solution5[2][0] = 4;
        solution5[2][1] = 3;
        solution5[2][2] = 8;
        
        int[][] solution6 = new int[3][3];
        solution6[0][0] = 6;
        solution6[0][1] = 7;
        solution6[0][2] = 2;
        
        solution6[1][0] = 1;
        solution6[1][1] = 5;
        solution6[1][2] = 9;
        
        solution6[2][0] = 8;
        solution6[2][1] = 3;
        solution6[2][2] = 4;
        
        int[][] solution7 = new int[3][3];
        solution7[0][0] = 8;
        solution7[0][1] = 3;
        solution7[0][2] = 4;
        
        solution7[1][0] = 1;
        solution7[1][1] = 5;
        solution7[1][2] = 9;
        
        solution7[2][0] = 6;
        solution7[2][1] = 7;
        solution7[2][2] = 2;
        
        int[][] solution8 = new int[3][3];
        solution8[0][0] = 4;
        solution8[0][1] = 3;
        solution8[0][2] = 8;
        
        solution8[1][0] = 9;
        solution8[1][1] = 5;
        solution8[1][2] = 1;
        
        solution8[2][0] = 2;
        solution8[2][1] = 7;
        solution8[2][2] = 6;
        
        
        
        Integer finalCOunt = null;
        int count = 0;
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		count+=Math.abs(s[i][j]-solution1[i][j]);
        	}
        }
        finalCOunt = count;
        count = 0;
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		count+=Math.abs(s[i][j]-solution2[i][j]);
        	}
        }
		if(count<finalCOunt)
			finalCOunt = count;
		
		count = 0;
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		count+=Math.abs(s[i][j]-solution3[i][j]);
        	}
        }
		if(count<finalCOunt)
			finalCOunt = count;
		
		count = 0;
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		count+=Math.abs(s[i][j]-solution4[i][j]);
        	}
        }
		if(count<finalCOunt)
			finalCOunt = count;
		
		count = 0;
		   for(int i=0;i<3;i++){
	        	for(int j=0;j<3;j++){
	        		count+=Math.abs(s[i][j]-solution5[i][j]);
	        	}
	        }
		   if(count<finalCOunt)
				finalCOunt = count;
	        count = 0;
	        for(int i=0;i<3;i++){
	        	for(int j=0;j<3;j++){
	        		count+=Math.abs(s[i][j]-solution6[i][j]);
	        	}
	        }
			if(count<finalCOunt)
				finalCOunt = count;
			
			count = 0;
	        for(int i=0;i<3;i++){
	        	for(int j=0;j<3;j++){
	        		count+=Math.abs(s[i][j]-solution7[i][j]);
	        	}
	        }
			if(count<finalCOunt)
				finalCOunt = count;
			
			count = 0;
	        for(int i=0;i<3;i++){
	        	for(int j=0;j<3;j++){
	        		count+=Math.abs(s[i][j]-solution8[i][j]);
	        	}
	        }
			if(count<finalCOunt)
				finalCOunt = count;

        System.out.println(finalCOunt);
	}
}
