/*
Given an image represented by an NxN matrix, 
where each pixel in the image is 4 bytes, write a method to rotate the image 
by 90 degrees. Canyou do this in place?
*/

public class Chapter1_6 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4,25},{5,6,7,8,24},{9, 10, 11, 12,23},{13,14,15,16,22}, {17,18,19,20,21}};
		new Chapter1_6().rotateImage(matrix, 5);
	}

	public void rotateImage(int[][] matrix, int n) {
		for(int i = 0; i < n; i++) { //row
			for(int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}

		int layer = (n-1) / 2;
		for(int i = 0; i <= layer; i++) { //row
			for(int j = i+1; j < n-i; j++) { //col
				int top = matrix[i][j];
				matrix[i][j] = matrix[n-j-1][i];
				 matrix[n-j-1][i] = matrix[n-1-i][n-1-j];
				 matrix[n-1-i][n-1-j] = matrix[j][n-1-i]; 
				 matrix[j][n-1-i] = top;
			}
		}

		for(int i = 0; i < n; i++) { //row
			for(int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
}