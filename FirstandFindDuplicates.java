import java.util.stream.IntStream;

class FindDuplicate
{
	public static int findDuplicate(int[] A)
	{
		int actual_sum = IntStream.of(A).sum();
		int expected_sum = A.length * (A.length - 1) / 2;

		return actual_sum - expected_sum;
	}

	public static void main(String[] args)
	{
		int[] A = { 1, 2, 3, 4, 4 };
		System.out.println("The duplicate element is " + findDuplicate(A));
	}
}

class FindDuplicate
{
	// Function to find a duplicate element in a limited range array
	public static int findDuplicate(int[] A)
	{
		int xor = 0;

		// take xor of all array elements
		for (int i = 0; i < A.length; i++) {
			xor ^= A[i];
		}

		// take xor of numbers from 1 to n-1
		for (int i = 1; i <= A.length - 1; i++) {
			xor ^= i;
		}

		// same elements will cancel out each other as a ^ a = 0,
		// 0 ^ 0 = 0 and a ^ 0 = a

		// xor will contain the missing number
		return xor;
	}

	// main function
	public static void main(String[] args)
	{
		// input array contains n numbers between [1 to n - 1]
		// with one duplicate, where n = A.length
		int[] A = { 1, 2, 3, 4, 4 };

		System.out.println("Duplicate element is " + findDuplicate(A));
	}
}
import java.util.HashSet;

public class FirstDuplicate {
	public static void main(String[] args){
		int a[]={1,2,3,4,4,2};
		/*HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			if(set.contains(a[i])){
				System.out.println(i);
				break;
			}
			set.add(a[i]);
		}*/
		/*for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j])
					min = Math.min(min,j);
			}
		}
		System.out.println(min==a.length?"-1":min);*/
		
		for(int i=0;i<a.length;i++){
			if(a[Math.abs(a[i]-1)]<0){
				System.out.println(Math.abs(a[i])+" ");
			}else{
				a[Math.abs(a[i]-1)]=-a[Math.abs(a[i]-1)];
			}
		}
	}
}
