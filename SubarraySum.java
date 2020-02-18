/*find maximum length subarray having given sum*/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {5,6,-5,5,3,5,3,-2,0};
	    int s=8;
	    int sum=0;
	    int len=0;
	    HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
	    map.put(0,-1);
	    
	    int endingIndex=-1;
	    for(int i=0;i<arr.length;i++){
	        sum += arr[i];
	        
	        if(!map.containsKey(sum)) 
	            map.put(sum,i);
	        
	        if(map.containsKey(sum-s) && len < i-map.get(sum-s)){
	            len=i-map.get(sum-s);
	            endingIndex=i;
	        }
	    }
	    for(int i=endingIndex-len+1;i<=endingIndex;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
