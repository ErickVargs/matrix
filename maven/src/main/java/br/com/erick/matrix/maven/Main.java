package br.com.erick.matrix.maven;

public class Main {

	public static void main(String[] args) {
		
		
		double[][] matriz1 = {{2,1,-1},{-3,-1,2},{-2,1,2}};
		Matrix A  = new Matrix(matriz1);
		
		double[][] matriz2 = {{8},{-11},{-3}};
		Matrix B =  new Matrix(matriz2);
		
		GaussianEliminationMatrix G = new GaussianEliminationMatrix();
		
		G.solve(A, B);
		
	

	}

}
