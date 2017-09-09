package com.example.test;

import com.company.com.company.library.Series;

public class Main {
    /*
    (reminder for myself)
    A simple implementation of a Series library created and updated and used as an "inner class\package"
    the code in the package goes like :
    public class Series {

    public static long nSum(int n){
        return (n * (n+1)) / 2;
    }

            public static long factorial(int n){

                if(n == 0) {
                    return 0;
                }
                long fact=1;
                for(int i=1 ; i<=n ; i++){

                    fact*=i;

                }

                return fact;
            }

            public static long fibonacci(int n){

                if(n == 0){
                    return 0;
                } else if (n == 1){
                    return 1;
                }

                long nMinus1 = 1;
                long nMinus2 = 0;
                long fib = 0;
                for(int i=1 ; i<n ; i++){
                    fib = (nMinus1 + nMinus2);
                    nMinus2 = nMinus1;
                    nMinus1 = fib;
                }
                return fib;

            }

        }

        After writing the code, delete the main method, go to - File -> Project Structure -> Artifacts -> add, complete the steps and
        remember the path.
        Next build a simple main class and add the library.jar (similar to .zip file) and You can use it as an external library
     */

    public static void main(String[] args) {

        System.out.println("nSum - ");
        for(int i=0 ; i<=10 ; i++){
            System.out.println(Series.nSum(i));
        }
        System.out.println("--------------------------");
        System.out.println("Factorial - ");
        for(int i=0 ; i<=10 ; i++){
            System.out.println(Series.factorial(i));
        }
        System.out.println("--------------------------");
        System.out.println("Fibonacci - ");
        for(int i = 0 ; i<=10 ; i++){
            System.out.println(Series.fibonacci(i));
        }

    }
}
