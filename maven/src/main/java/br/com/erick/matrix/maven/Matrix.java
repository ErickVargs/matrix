package br.com.erick.matrix.maven;

import java.util.Scanner;

public class Matrix {

	private double[][] matrix;
	private int numberOfRows;
	private int numberOfColumns;
	
	public double getValue(int row, int column) {
		
		return matrix[row][column];
	}
	
	public int getNumberOfRows() {
		return numberOfRows;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}	
	
	public Matrix() {
		Scanner kb = new Scanner(System.in);
		System.out.println("number of rows");
		this.numberOfRows = kb.nextInt();
		System.out.println("number of columns");
		this.numberOfColumns = kb.nextInt();
		
		matrix = new double[numberOfRows][numberOfColumns];
		
		System.out.println("put the value");
		
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				System.out.println(" Insert the value [" + (i+1) + "]" + "["+ (j+1) +"]: ");
				matrix[i][j] = kb.nextDouble();
			}
		}
		System.out.println("\n \n The matrix is: ");
		printMatrix();
	}

	private void printMatrix() {
		for(int i = 0; i < numberOfRows; i++) {
			System.out.println("\n");
			for(int j = 0; j < numberOfColumns; j++) {
				System.out.print(" "+matrix[i][j]+" ");
			}
		}
	}
	
	public Matrix(int numberOfRows, int numberOfColumns) {
		//null Matrix
		matrix = new double[numberOfRows][numberOfColumns];

		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				matrix[i][j] = 1;
			}
		}
	}
	
	
	public double[][] identityMatrix(int numberOfRows, int numberOfColumns) {
		
		matrix = new double[numberOfRows][numberOfColumns];

		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				if(i==j) {
					matrix[i][j] = 1;	
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		
		return matrix;
	}
	


}
