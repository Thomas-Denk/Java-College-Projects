/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if (n >= 0) {
            return original + appendNTimes(original,n - 1);       
        }
        
        //System.out.print(original);
        return "";
	// WRITE YOUR CODE HERE
    }

    public static void main (String[] args) {

	// WRITE TEST CASES HERE to test your method
    System.out.print(appendNTimes("cat", 3));
    
    }
}
