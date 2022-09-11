package br.com.erick.matrix.maven;

public class GaussianEliminationMatrix {

	public void solve(Matrix A, Matrix B) {

		for (int k = 0; k < B.lengthOfRows(); k++) {
//
			int maximum = k;
			for (int i = k + 1; i < B.lengthOfRows(); i++) {
				if (Math.abs(A.getElement(i, k)) > Math.abs(A.getElement(maximum, k)))
					maximum = i;
			}
//
			A.changeRow(k, maximum);
			
//
			B.changeRow(k, maximum);
			
//
			for (int i = k + 1; i < B.lengthOfRows(); i++) {

				double factor = A.getElement(i, k) / A.getElement(k, k);
				B.setElement(i, 0, B.getElement(i, 0) - (factor * B.getElement(k, 0)));

				for (int j = k; j < B.lengthOfRows(); j++) {
					A.setElement(i, j, A.getElement(i, j) - (factor * A.getElement(k, j)));
				}

			}
		}

		printEchForm(A, B);
	}

//
	private void printEchForm(Matrix A, Matrix B) {

		System.out.println("\nThe echelon form is: ");

		for (int i = 0; i < B.lengthOfRows(); i++) {
			for (int j = 0; j < B.lengthOfRows(); j++) {
				System.out.printf("%.2f ", A.getElement(i, j));
			}
			System.out.printf("| %.2f\n", B.getElement(i, 0));
		}

		System.out.println();

	}
	
	
}