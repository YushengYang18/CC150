/*
Write an algorithm such that if an element in
an MxN matrix is 0, its entire row and column are set to 0.
 */

public class Chapter1_7 {
	public static void main(String[] args) {
		int[][] matrix = {{0,2,3,4,25},
							{5,6,0,8,24},
							{9,10,11,12,23},
							{13,2,15,16,22}, 
							{17,18,19,0,21}};
		new Chapter1_7().setZeroInMatrix(matrix);
	}

	public void setZeroInMatrix(int[][] matrix) {
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		boolean[] rowZero = new boolean[rowLen];
		boolean[] colZero = new boolean[colLen];

		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				if (matrix[i][j] == 0) {
					rowZero[i] = true;
					colZero[j] = true;
				}
			}
		}
		
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				if(rowZero[i] || colZero[j]) {
					matrix[i][j] = 0;
				}
			}
		}

		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
	}
}