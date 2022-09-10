package br.com.erick.matrix.maven;

public class IdentityMatrix {

	public Matrix matrix;

	public IdentityMatrix(int numberOfRows, int numberOfColumns) {

		if (numberOfRows != numberOfColumns) {
			System.out.println("Sorry, the nunber of rows must to be the same number of columns");
		} else {
			matrix = new Matrix(numberOfRows, numberOfColumns);
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfColumns; j++) {
					if (i == j) {
						matrix.setElement(i, j, 1);
					} else {
						matrix.setElement(i, j, 0);
					}
				}
			}
			matrix.printMatrix();
		}

	}

}
