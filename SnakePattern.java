import java.io.*;
import java.util.*;

public class SnakePattern
{
	public static void main(String[] args) {
	    int n=5;
	    int k=1;
	    for(int i=0;i<n;i++){
	        if(i%2==0){
	            if(i!=0) k=k+n+1;
	            for(int j=0;j<n;j++){
	                System.out.print(k++ +" ");
	            }
	        }else{
	            k=k+n-1;
	            for(int j=0;j<n;j++){
	                System.out.print(k--+" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
