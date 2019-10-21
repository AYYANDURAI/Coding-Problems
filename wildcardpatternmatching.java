import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String sp=sc.next();
	    char sa[]=s.toCharArray();
	    char spa[]=sp.toCharArray();
	    
	    int wi=0;
	    boolean flag=true;
	    for(int i=0;i<sa.length;i++){
	        if(sa[i]=='*'){
	            if(flag){
	                sa[wi++]=sa[i];
	                System.out.print(sa[i]);
	                flag=false;
	            }
	        }else{
	            sa[wi++]=sa[i];
	            System.out.print(sa[i]);
	            flag=true;
	        }
	    }
	        
	    boolean T[][]=new boolean[sa.length+1][wi+1];
	    T[0][0]=true;
	}
}
