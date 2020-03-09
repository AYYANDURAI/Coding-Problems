import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    //int nmat[][] = new int[3][3];
	    /*for(int i=0;i<3;i++){
	        int ie=2;
	        for(int j=0;j<3;j++){
	            nmat[i][j] = matrix[ie--][i];
	        }
	    }*/
	    int n=4;
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n;j++){
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i]=temp;
	        }
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n/2;j++){
	            	int temp = matrix[i][j];
	            	matrix[i][j] = matrix[i][n-1-j];
	            	matrix[i][n-1-j] = temp;
	        }
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
