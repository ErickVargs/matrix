package br.com.erick.matrix.maven;

import java.util.Scanner;

public class Matrix {

	protected double[][] matrix;
	private int numberOfRows;
	private int numberOfColumns;

	public double getElement(int row, int column) {

		return matrix[row][column];
	}

	public void setElement(int row, int column, double value) {

		matrix[row][column] = value;
		
	}
	
	public int getNumberOfRows() {
		return numberOfRows;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	public Matrix() {
		try (Scanner keybord = new Scanner(System.in)) {
			System.out.println("number of rows");
			this.numberOfRows = keybord.nextInt();
			System.out.println("number of columns");
			this.numberOfColumns = keybord.nextInt();

			matrix = new double[numberOfRows][numberOfColumns];

			System.out.println("put the value");

			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfColumns; j++) {
					System.out.println(" Insert the value [" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
					matrix[i][j] = keybord.nextDouble();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("\n \n The matrix is: ");
		printMatrix(matrix);
	}

	private void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}
		}
	}
	
	protected void printMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}
		}
	}

	public Matrix(int numberOfRows, int numberOfColumns) {
		//create a null Matrix
		matrix = new double[numberOfRows][numberOfColumns];

		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	

}
