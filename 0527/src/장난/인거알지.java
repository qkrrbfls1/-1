package 장난;
import java.util.*;
public class 인거알지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] B = {{2,4,6},{8,10,12},{14,16,18}};
		int [][] C = new int[3][3];
		
		for(int i = 0; i<3 ; i++)
		{
			for(int j = 0; j<3; j++) 
			{
				C[i][j] =A[i][j] + B[i][j];
			}
		}
		
		
		for ( int i =0; i<3; i++)
		{
			for(int j =0; j<3; j++)
			{
				System.out.print(C[i][j] + " ");
			}
		System.out.println();
		}
		
		
		
		
	}

}
