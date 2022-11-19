package com.coreExamples;

public class Array2 {
public static void main(String[] args) {
	//2d array
	
	//int x[][]=new int[3][3];
	int x[][]= {{12,23,34},{23,34,45},{56,78,89}};
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(x[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
