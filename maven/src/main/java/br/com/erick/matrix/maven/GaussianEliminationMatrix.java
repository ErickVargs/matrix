package br.com.erick.matrix.maven;

public class GaussianEliminationMatrix {


	public void solve(Matrix A, Matrix B) {
		final long startTime = System.currentTimeMillis();
		int dimOfMatrix = A.lengthOfRows();
		for (int k = 0; k < dimOfMatrix; k++) {
			int maximum = k;
			for (int i = k + 1; i < dimOfMatrix; i++) {
				if (Math.abs(A.getElement(i, k)) > Math.abs(A.getElement(maximum, k)))
					maximum = i;
			}
			A.changeRow(k, maximum);
			B.changeRow(k, maximum);

			for (int i = k + 1; i < dimOfMatrix; i++) {

				double factor = A.getElement(i, k) / A.getElement(k, k);
				B.setElement(i, 0, B.getElement(i, 0) - (factor * B.getElement(k, 0)));

				for (int j = k; j < dimOfMatrix; j++) {
					A.setElement(i, j, A.getElement(i, j) - (factor * A.getElement(k, j)));
				}
			}
		}
		printEchForm(A, B, dimOfMatrix);
		getSolution(A, B, dimOfMatrix);
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime-startTime));
	}

	private void getSolution(Matrix A, Matrix B, int dimOfMatrix) {

		double[] solution = new double[dimOfMatrix];
		for (int i = dimOfMatrix - 1; i >= 0; i--) {
			double sum = 0.0;
			for (int j = i + 1; j < dimOfMatrix; j++) {
				sum += A.getElement(i, j) * solution[j];
			}
			solution[i] = (B.getElement(i, 0) - sum) / A.getElement(i, i);
		}
		printVectorX(solution);
	}

	private void printEchForm(Matrix A, Matrix B, int dimOfMatrix) {

		System.out.println("\nThe echelon form is: ");
		for (int i = 0; i < dimOfMatrix; i++) {
			for (int j = 0; j < dimOfMatrix; j++) {
				System.out.printf("%.2f ", A.getElement(i, j));
			}
			System.out.printf("| %.2f\n", B.getElement(i, 0));
		}
		System.out.println();
	}

	public void printVectorX(double[] vectorSolution) {
		int dimOfVector = vectorSolution.length;
		System.out.println("\n The vector solution is: ");
		for (int i = 0; i < dimOfVector; i++) {
			System.out.printf("%.6f ", vectorSolution[i]);
		}
		System.out.println();
	}
	

	
	
	
}