/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/
//NOTES TO SELF! PROGRAM WORKS BUT NEEDS LOOP TO BE INTEGRATED FOR FULL CREDIT!!! ALSO SWITCH NUMBER TO LONG INPUT
public class CheckDigit {

    public static void main (String[] args) {
        
        // WRITE YOUR CODE HERE
        //long number = Long.parseLong(args[0]);
        Long digit1 = 0L;
       /* Long digit2 = 1L;
        Long digit3 = 0L;
        Long digit4 = 0L;
        Long digit5 = 0L;
        Long digit6 = 0L;
        Long digit7 = 0L; */
        
       // Long number = 948590382343L;
        Long number = Long.parseLong(args[0]);
        Long number2 = number;
        Long sum1 = 0L;
        Long sum2 = 0L;
        number2 = number2 / 10;
        

        while (number > 0) {
            
          

        digit1 = number % 10;
        sum1 = sum1 + digit1;
       // System.out.println(digit1);
        number = number / 10;
        number = number / 10;
        }
       
      /*   digit2 = number % 10;
        System.out.println(digit2);
        number = number / 10;
        number = number / 10;
        
        digit3 = number % 10;
        System.out.println(digit3);
        number = number / 10;
        number = number / 10;

        digit4 = number % 10;
        System.out.println(digit4);
        number = number / 10;
        number = number / 10;
        
        digit5 = number % 10;
        System.out.println(digit5);
        number = number / 10;
        number = number / 10;

        digit6 = number % 10;
        System.out.println(digit6);
        number = number / 10;
        number = number / 10;

        digit7 = number % 10;
        System.out.println(digit7);
        number = number / 10;
        number = number / 10;     */
    
       /*  number = digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7;
        System.out.println("After adding the digits " + number);
        number = number % 10;
        System.out.println("After removing the 10s digit: " + number);         */
        
       // System.out.println("After adding the digits " + sum1);
        sum1 = sum1 % 10;
        //System.out.println("After removing the 10s digit: " + sum1);     

        //Here we will explore calculating the second number using our second Long variable number2

        while (number2 > 0) {
            
          

            digit1 = number2 % 10;
            sum2 = sum2 + digit1;
           // System.out.println(digit1);
            number2 = number2 / 10;
            number2 = number2 / 10;
            }


           // System.out.println("After adding the digits: " + sum2);
            sum2 = sum2 % 10;
        //System.out.println("After getting rid of 10s digit: " + sum2);

        /*
        Long digit8 = 0L;
        Long digit9 = 0L;
        Long digit10 = 0L;
        Long digit11 = 0L;
        Long digit12 = 0L;
        Long digit13 = 0L;
        Long digit14 = 0L;

        System.out.println(number2);

        number2 = number2 / 10;
        System.out.println("After removing the last digit: " + number2);

        digit8 = number2 % 10;
        System.out.println(digit8);
        number2 = number2 / 10;
        number2 = number2 / 10;

        digit9 = number2 % 10;
        System.out.println(digit9);
        number2 = number2 / 10;
        number2 = number2 / 10;

        digit10 = number2 % 10;
        System.out.println(digit10);
        number2 = number2 / 10;
        number2 = number2 / 10;

        digit11 = number2 % 10;
        System.out.println(digit11);
        number2 = number2 / 10;
        number2 = number2 / 10;

        digit12 = number2 % 10;
        System.out.println(digit12);
        number2 = number2 / 10;
        number2 = number2 / 10;

        digit13 = number2 % 10;
        System.out.println(digit13);
        number2 = number2 / 10;
        number2 = number2 / 10;

        digit14 = number2 % 10;
        System.out.println(digit14);
        number2 = number2 / 10;
        number2 = number2 / 10;

        number2 = digit8 + digit9 + digit10 + digit11 + digit12 + digit13 + digit14;
        System.out.println("After adding the digits: " + number2);

        number2 = number2 % 10;
        System.out.println("After getting rid of 10s digit: " + number2);   */

        sum2 = sum2 * 3;
        sum2 = sum2 % 10;

       // System.out.println("After two more operations: " + sum2);


        Long sum3 = 0L;
        sum3 = sum1 + sum2;
        sum3 = sum3 % 10;
        System.out.println(sum3);

        




        

    }
}