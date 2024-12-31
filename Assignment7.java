/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		boolean status = false;
		int[] a = new int[args.length];				//This copies the values in args to out new array "a".
		for (int n = 0; n < args.length; n++)
		{
		a[n] = Integer.parseInt(args[n]);
		}

		/*for (int n = 0; n < args.length; n++) {
			if (a[n] >= 1 && a[n] <= args.length)
			{

			}
		
		}
*/

for (int n = args.length - 1; n >= 0; n--)
		{
			for (int m = n - 1; m >= 0; m--) {
				if (a[n] == a [m]) {
					status = true;
				}
			}
			
		}
		
		
		System.out.println(status);


	}
	}

