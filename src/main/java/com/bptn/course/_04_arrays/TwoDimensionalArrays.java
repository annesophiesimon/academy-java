package com.bptn.course._04_arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {		
		int [][] grades = {
				{85, 90, 75},
				{88, 92, 60},
				{70, 65, 75},
		};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				grades[i][j]+=2;
				System.out.print(grades[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
		int max=0;
		// Given a 2D find the max of each row 
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				max = Math.max(max, grades[i][j]);
			//	System.out.print(grades[i][j]);
			//	System.out.print("\t");
			}
			System.out.print("\n");
			System.out.print("max row: " + max);
			max=0;
		}
		

	}

}
