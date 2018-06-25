package com.stackroute.pe3;

public class MatrixSummation {

	/*
	 * calculateSum() method will take the rows, columns, and the data of both 2 matrix
	 * create an 2 dimensional array of size rows and columns
	 * the 2 loops of size rows and columns are used to perform the summation of 2 matrix
	 */
	
	public int[][] calculateSum(int rows, int cols, int[][] mat1, int[][] mat2) {
		int[][] sum = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		return sum;
	}
	
}
