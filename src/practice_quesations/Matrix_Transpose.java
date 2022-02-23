package practice_quesations;

import java.util.Scanner;

public class Matrix_Transpose {
	 public void display(int[][] matrix) {
	        System.out.println("The matrix is: ");
	        for(int[] row : matrix) {
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	    }
	 
	 public int[][] Tranpose(int[][] matrix,int row,int column) {
		 // Transpose the matrix
	        int[][] transpose = new int[column][row];
	        for(int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }
	        return matrix;
	 }
	 public static void main(String[] args) {
		 Matrix_Transpose mt=new Matrix_Transpose();
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number of rows:-");
		 int row=sc.nextInt();
		 System.out.print("Enter the number of columns:-");
		 int column=sc.nextInt();
	        
	        int[][] matrix = new int[row][column];
	        for(int i=0;i<row;i++) {
	        	for(int j-0;j<column;j++) {
	        		matrix[i][j]=sc.nextInt();
	        	}
	        }

	        // Display current matrix
	        mt.display(matrix);

	        // Transpose the matrix
	      int[][] transpose=mt.Tranpose(matrix, row, column);

	        // Display transposed matrix
	        mt.display(transpose);
	    }

	   
}
