package com.github.implementation;

import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FlatLandSpaceStations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[m];
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0;i < m;i++){
			arr[i] = in.nextInt();
			set.add(arr[i]);
		}
		Date d1 = new Date();
		Object[] arre = set.toArray();
		int greatdistance = 0;
		for(int j = 0; j<m; j++){
			int dist = 0;
			if(j==0 && (Integer)arre[j]!=0){
				dist = ((Integer)arre[j]);
			}else if(j==m-1 && (Integer)arre[j]!=n-1){
				dist = ((n-1) - (Integer)arre[j]);
			}else if(j-1>=0){
				dist = ((Integer)arre[j] - (Integer)arre[j-1])/2;
			}
			if(dist>greatdistance){
				greatdistance = dist;
			}
		}
		System.out.println(greatdistance);
	}
}
