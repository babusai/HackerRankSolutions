package com.github.implementation;

import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] grid = new String[n];
		String[] gridCopy = new String[n];
		for(int grid_i=0;grid_i<n;grid_i++){
			grid[grid_i] = in.next();
			gridCopy[grid_i] = grid[grid_i];
		}
		for(int i=1;i<n-1;i++){
			for(int j=1;j<n-1;j++){
				boolean flag = true;
				int value = Integer.parseInt(grid[i].substring(j, j+1));
				int value1 = Integer.parseInt(grid[i-1].substring(j, j+1));
				int value2 = Integer.parseInt(grid[i+1].substring(j,j+1));
				int value3 = Integer.parseInt(grid[i].substring(j-1, j));
				int value4 = Integer.parseInt(grid[i].substring(j+1, j+2));
				if(value1>=value || value2>=value || value3>=value || value4>=value){
					flag = false;
					continue;
				}
				if(flag){
					gridCopy[i] = gridCopy[i].substring(0,j)+"X"+gridCopy[i].substring(j+1, n);
				}
			}
		}
		for(int grid_i=0;grid_i<n;grid_i++){
			System.out.println(gridCopy[grid_i]);
		}
	}
}
