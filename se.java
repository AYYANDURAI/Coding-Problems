public class Main
{
	public static void main(String[] args)
	{
	    
	  String s="kongu engineering college";
	  StringBuilder st1=new StringBuilder();
	  st1.append(s);
	  st1=st1.reverse();
	  for(int i=0;i<st1.length();i++)
	  {
	  System.out.print(st1.charAt(i));
	  }
	}
}
