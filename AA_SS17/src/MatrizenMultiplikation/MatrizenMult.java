package MatrizenMultiplikation;

public class MatrizenMult {

	void multipliziere(int[][] matrix1, int[][] matrix2) {

		
		int ergMatrix[][] = null;

		if (matrix1.length == matrix2[0].length) {
			ergMatrix = new int[matrix1.length][matrix2.length];
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					for (int k = 0; k < matrix1.length; k++) {

						ergMatrix[i][j] += matrix1[k][i] * matrix2[j][k];
					}
					System.out.print(ergMatrix[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.err.println("Dimension der Matrizen nicht gültig!\n" + matrix1.length + " X " + matrix1[0].length
					+ " und " + matrix2.length + " X " + matrix2[0].length);
		}
	}

	public static void main(String[] args) {
		int[][] matrix1 = new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int[][] matrix2 = new int[][] { { 1, 3, 5 }, { 2, 4, 6 }, { 1, 2, 3 } };
		MatrizenMult mm = new MatrizenMult();
		mm.multipliziere(matrix1, matrix2);
	}
}
