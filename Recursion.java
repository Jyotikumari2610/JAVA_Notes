public class Recursion {
    public static void main(String args[]){
          // print1(1);
         //  printnum(1);
        //  System.out.println(fibonacci(5));
       // int[] arr = {1, 2, 3, 4, 5, 6, 7};
      //  System.out.println(binarySearch(arr,5,0,arr.length-1));
     // nTo1(10);
    // System.out.println(sumN(15));
    }
    static void print1(int n){
        System.out.println(1);
        print2(2);
    }
    static void print2(int n){
        System.out.println(2);
        print3(3);
    }
    static void print3(int n){
        System.out.println(3);
        print4(4);
    }
    static void print4(int n){
        System.out.println(4);
        print5(5);
    }
    static void print5(int n){
        System.out.println(5);
    }
    //here we are calling the function inside itself but there are too many functions 
    // and it is not a good way to do it so we can use the same function to call itself and this is called recursion
    static void printnum(int n){
        //base condition:-condition where function (recursion)will stop calling itself
        if(n==6){
            return;
        }
        System.out.println(n);  //body of the function
        printnum(n+1);  //a tail recursion because the recursive call is the last statement in the function
        }
        static int fibonacci(int n){
            if(n<2){
                return n;
            }
            return fibonacci(n-1)+fibonacci(n-2);

        }
    
    //Binary search using recursion
    static int binarySearch(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr,target,start,mid-1);
        }
        else{
            return binarySearch(arr,target,mid+1,end);
        }
    }
    //Print numbers from N to 1 using recursion.
    static void nTo1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        nTo1(n-1);
    }
    //Find the sum of first N natural numbers using recursion.
    static int sumN(int n){
        if(n==1){
            return 1;
        }
        return n+sumN(n-1);
    }
    Print all even numbers from 1 to N using recursion.
Count the number of digits in a given number using recursion.
🟡 Level 2: Moderate
Find the factorial of a number using recursion.
Calculate xⁿ (power function) using recursion.
Find the sum of digits of a number using recursion.
Reverse a given number using recursion.
Check whether a number is a palindrome using recursion.
🔵 Level 3: Important / Exam Focused
Print the Fibonacci series up to N terms using recursion.
Find the Nth Fibonacci number using recursion.
Find the GCD (Greatest Common Divisor) of two numbers using recursion.
Print elements of an array using recursion.
Find the maximum element in an array using recursion.
🔥 Level 4: Slightly Tricky
Check if an array is sorted using recursion.
Find the first occurrence of an element in an array using recursion.
Find the last occurrence of an element in an array using recursion.
Generate all subsets of a string using recursion.
Solve the Tower of Hanoi problem using recursion.
}
   public class main{
    public static void main(String args[]){
       // int n=78;
       // nEveno(n);
      // int as=CountDigit(348);
      // System.out.println(as);
      int ans=factorial(5);
      System.out.println(ans);
      //int f=fibonaci(6);
      //System.out.println(f);
    }
    //Print all even numbers from 1 to N using recursion.
    static void nEveno(int n){
        if(n==0){
            return;
        }
        nEveno(n-1);
        if(n%2==0){
            System.out.println(n+" ");
        }
    }
    //Count the number of digits in a given number using recursion.
    static int CountDigit(int n){
        if(n==0){
            return 0;
        }
        return 1 + CountDigit(n/10);
    }
    //Find the factorial of a number using recursion.
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int fibonaci(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibonaci(n-1)+fibonaci(n-2);
    }
}
