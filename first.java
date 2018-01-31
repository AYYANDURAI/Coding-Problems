public class Main
{
	public static void main(String[] args)
	{
	    int n=5,k=0;
	    char a='A';
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=n;j++)
	        {
	            if(j==i|| j==n-k)
	            {
		          System.out.print(a);
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	                
	        }
	        		System.out.println();
          k++;
          a++;
	            
	    }
	}
}
