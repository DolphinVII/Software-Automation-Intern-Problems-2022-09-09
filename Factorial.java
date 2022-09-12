
// imports 

public class mainFactorial {


    // main method 
    public static void main(String []args){
                       
        System.out.println(factorial(7));
    
    } // end of main function 


    
    public static int factorial(int n){ 
        // the factorial of a number n is defined as the product of all positive integer number from 1 to the n. Made by Alexander Zabolotnii 
        // extended definition includes all complex numbers, but would require numerically solving the Gamma function 
        // Which I think is outside the scope of this test 
        
        
        if(n<0){ // a catch for negative integers, as they aren't defined even in the gamma function
            System.out.println("the factorial of a negative integer does not exist");
            return n; 
        }// end of if negative 
        
        // define temporary variable that stores the intermediate values of the factorial 
        int fact = 1; // set to 1 so that the factorial of 0 is 1 (correctly defined). 
        
        while(n >= 1){ // loop that multiplies 'fact' by every number from n to 1 (where n is an integer to prevent overshoot)  
            fact = fact*n; 
            
            n = n-1; // decreases the number n in order to multiply 'fact' with every integer from n to 1  
        } // end while(n >= 1) 
    
        return fact; // returns the factorial of n 
    } // end of factorial(int n) 







    
} // end of mainFactorial    