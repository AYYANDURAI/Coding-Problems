import java.util.*;
import java.io.*;

public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String hex1="0123456789ABCDEF";
	    char hex[]=hex1.toCharArray();
	    String ans="";
	    int temp=n;
	    int rem=0;
	    while(temp!=0){
	        rem=temp%16;
	        ans=hex[rem]+ans;
	        temp=temp/16;
	    }
	    System.out.println(ans);
	}
}
