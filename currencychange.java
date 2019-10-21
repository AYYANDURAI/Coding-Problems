import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int notes[]={2000,500,200,100,50,20,10,5,1};
	    int notesCounter[]=new int[9];
	    int n=sc.nextInt();
	    for(int i=0;i<notes.length;i++){
	        if(n>=notes[i]){
	            notesCounter[i]=n/notes[i];
	            n=n-notesCounter[i]*notes[i];
	        }
	    }
	    for(int i=0;i<9;i++){
	        System.out.println(notes[i]+" : "+notesCounter[i]);
	    }
	}
}
