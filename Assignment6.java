/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    
    int xvalue = 0;
    int yvalue = 0;
    System.out.println("("+xvalue+","+yvalue+")");
    int numberoftimes = Integer.parseInt(args[0]);
    

    while (numberoftimes > 0) {
    
    int direction_int = (int)Math.floor(Math.random()*(4) + 1);
    //System.out.println(direction_int);
    if (direction_int == 1) {
        xvalue = xvalue + 1;
    }
    else if (direction_int == 2) {
        xvalue = xvalue - 1;
    }

    else if (direction_int == 3) {
        yvalue = yvalue + 1;
    }

    else if (direction_int == 4) {
        yvalue = yvalue - 1;
    }
    numberoftimes = numberoftimes - 1;
    System.out.println("("+xvalue+","+yvalue+")");
    }
    
    double squared = (xvalue*xvalue)+(yvalue*yvalue);
    System.out.println("Squared distance = " + squared);
    


    }
}
