/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski {

     // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

	double height = (length*Math.sqrt(3))/2;

        return height;

    }





// filledTriangle(0.5,0.5,0.25); check this example...something's not displaying right...

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

	// WRITE YOUR CODE HERE

    double[] xvalues = new double[3];
    double[] yvalues = new double[3];
    xvalues[0] = x;
    xvalues[1] = ((length/2.0)*(-1.0))+x;
    xvalues[2] = (length/2.0)+x;
    
    yvalues[0] = y;
    yvalues[1] = y+height(length);
    yvalues[2] = y+height(length);
    // StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.filledPolygon(xvalues,yvalues);

    }






    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	// WRITE YOUR CODE HERE
       //if (n>=0) {
       // sierpinski();

        // StdDraw.setPenColor(StdDraw.BLACK);
        
       
    if (n > 0) {
        // use filled triangle with parameters of x y and length
        filledTriangle(x,y,length);
    n = n - 1;
    sierpinski(n,x+(length/2.0), y, length/2.0);
    sierpinski(n,x-(length/2.0), y, length/2.0);
    sierpinski(n,x,y+height(length),length/2.0);
    // filledTriangle((x*2)/2,y,length/2.0);
   // filledTriangle(x,height(length), length/2.0);
    
}
   
// sierpinski(n, 0.5, 0.0, 1);


 /*  
     filledTriangle(x/2,y/2,length/2);                 // when n = 2
    filledTriangle((x/2.0)+x,(y/2.0),(length/2.0));
    filledTriangle(x,height(length), length/2.0);
 
    

        x = x/2;                                           // first case...same
        y = y/2;                                            // second case....2*x
        length = length/2;                                  //third case...x and y


    filledTriangle(x/2,y/2,length/2);                       // when n = 3
    filledTriangle((x/2.0)+x,(y/2.0),(length/2.0));
    filledTriangle(x,height(length), length/2.0);

    filledTriangle((x/2)+(2*x),y/2,length/2);     // transformation is only on x
    filledTriangle((x/2.0)+(3*x),(y/2.0),(length/2.0));  // transformation is only on x
    filledTriangle(x*3,height(length), length/2.0);      //   transformation is only on x

    filledTriangle(x*(1.5),height(length)*2, length/2.0);    // transformation is on x and y
    filledTriangle(x*(2.5),height(length)*2, length/2.0);     // x and y
    filledTriangle(x*(2.0),(height(length)*2)*1.5, length/2.0);   // xand y
     

    x = x/2;                                           // first case...same
        y = y/2;                                            // second case....2*x
        length = length/2;                                  //third case...x and y


    filledTriangle(x/2,y/2,length/2);                       // when n = 3
    filledTriangle((x/2.0)+x,(y/2.0),(length/2.0));
    filledTriangle(x,height(length), length/2.0);

    filledTriangle((x/2)+(2*x),y/2,length/2);     // transformation is only on x
    filledTriangle((x/2.0)+(3*x),(y/2.0),(length/2.0));  // transformation is only on x
    filledTriangle(x*3,height(length), length/2.0);      //   transformation is only on x

    filledTriangle(x*(1.5),height(length)*2, length/2.0);    // transformation is on x and y
    filledTriangle(x*(2.5),height(length)*2, length/2.0);     // x and y
    filledTriangle(x*(2.0),(height(length)*2)*1.5, length/2.0);   // xand y


*/





    }





// Main method steps

    // Step 1: Takes an integer command-line argument n; 
    // Step 2: draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    //         whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // Step 3: draws a Sierpinski triangle of order n that fits snugly inside the outline. 

    
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE 
//Start of step 1 (args)    
//   int n = 3;
// End of step 1 (args)


// Start of step 2 (draw an outline)
   int n = Integer.parseInt(args[0]);
    StdDraw.polygon(new double[]{0, 1, 0.5}, new double[]{0,0, (Math.sqrt(3) * 1)/2});
double x = 0.5;
double y = 0;
double length = 1;
sierpinski(n, x, y, length/2);
     




    }
}
