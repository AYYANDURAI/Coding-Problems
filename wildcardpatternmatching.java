import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String sp=sc.next();
	    char sa[]=s.toCharArray();
	    char pattern[]=sp.toCharArray();
	    
	    int wi=0;
	    boolean flag=true;
	    for(int i=0;i<pattern.length;i++){
	        if(pattern[i]=='*'){
	            if(flag){
	                pattern[wi++]=pattern[i];
	                flag=false;
	            }
	        }else{
	            pattern[wi++]=pattern[i];
	            flag=true;
	        }
	    }
	    for(int i=0;i<wi;i++)
	        System.out.print(pattern[i]);
	    System.out.println();
	        
	    boolean T[][]=new boolean[sa.length+1][wi+1];
	    
	    
	    if(wi>0 && pattern[0]=='*'){
	        T[0][1]=true;
	    }
	     
	    T[0][0]=true;   
	    for(int i=1;i<T.length;i++){
	        for(int j=1;j<T[0].length;j++){
	        if(pattern[j-1]=='?' || sa[i-1]==pattern[j-1]){
	            T[i][j]=T[i-1][j-1];
	        }else if(pattern[j-1]=='*'){
	            T[i][j]=T[i-1][j] || T[i][j-1];
	        }
	        }
	    }
	    System.out.println(T[sa.length][wi]+" "+T[0].length);
	}
}
