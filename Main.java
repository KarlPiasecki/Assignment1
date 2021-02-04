// Assignment 1
// Karl Piasecki 0575787
//

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        // prompt the user to input a number for the fibonacci sequence
        System.out.println("Enter a number for recursion Fibonacci sequence: ");
        // make a new Scanner object to get user input
        int n = new Scanner(System.in).nextInt();

        // make the startTime variable to get the system time before execution of the recursion method
        long startTime=  System.nanoTime();
        System.out.print("Fibonacci series in recursion: ");
        for (int i = 0; i < n; i++) {

            System.out.print(recursion(i) + ", ");
        }

        // make a variable to store the time after execution of the recursion method
        long endTime = System.nanoTime();
        // get the execution time by subtracting the start time from the end time
        long timeElapsed= endTime-startTime;
        // print the time elapsed
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsed);
        //convert the time elapsed to milliseconds and print it
        System.out.println("Elapsed time in milliseconds is: " + timeElapsed/1000000);

        // make another variable to store the start time of the iteration method
        long startIterationTime=  System.nanoTime();
        //running the iteration method
        System.out.println("Iteration Fibonacci sequence: ");
        long iteration = iteration(n);

        // store the end time of the execution of the iteration method
        long endIterationTime = System.nanoTime();
        // get the execution time by subtracting the start time from the end time
        long iterationTimeElapsed= endIterationTime-startIterationTime;
        // print the execution time in nanoseconds
        System.out.println("Elapsed time in nanoseconds is: " + iterationTimeElapsed);
        // print the execution time in milliseconds
        System.out.println("Elapsed time in milliseconds is: " + iterationTimeElapsed/1000000);

    }

    //recursive method
    public static long recursion(int n) {
        //the fibonacci sequence starts with 0,1
        // state the base cases with if and else if statements
        if (n==0) {
            return 0;
        }
        else if(n==1||n==2) {
            return 1;
        }
        else{
            //recursive formula for the fibonacci sequence:
            return recursion(n-2) + recursion(n-1);
        }

    }

    // iterative method
    public static long iteration(int n){

        // make variables to store the numbers in the fibonacci sequence
        int f = 0;
        int n2 = 1;
        int nth = 0;

        // if the user inputs 0 return 0
        if(n==0){
            return 0;
        }
        // if the user inputs 1 or 2 return 1
        if (n == 1 || n==2) {
            return 1;
        }


        for(int i = 0; i <n; i++){

            System.out.println(f + ", ");
            //the iterative formula for the fibonacci sequence:
            nth = f + n2;
            f = n2;
            n2 = nth;
        }
        return 0;
    }
}

