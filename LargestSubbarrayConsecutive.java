/*find the largest subarray with consecutive and distinct integers
int arr[] = {2,0,2,1,4,3,1,0};
output:0 2 1 4 3*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {2,0,2,1,4,3,1,0};
	    int max = 0;
	    int start=0,end=0;
	    int n = arr.length;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n-1;j++){
	                TreeSet<Integer> s=new TreeSet<Integer>();
    	            for(int k=i;k<=j;k++){
    	                  s.add(arr[k]); 
    	            }
    	            if(s.size()==(j-i+1)){
    	                if(s.last()-s.first()+1 == s.size()){
    	                    if(max<s.size()){
    	                        max=s.size();
    	                        start=i;
    	                        end=j;
    	                    }
    	                }
    	            }
	        }
	    }
	    for(int i=start;i<=end;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
