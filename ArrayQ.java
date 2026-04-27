//Given an array of integers nums, return the maximum element present in the array. The array will contain at least one element.
/*import java.util.*;
public class ArrayQ {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
        */
    //Given a string s, return the reversed version of the string.
       /* String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        */
       // Given an integer n, determine whether the number is Even or Odd.
     /*int n=sc.nextInt();
       if(n%2!=0){
        System.out.println(n+" is Odd");
       }
       else {
         System.out.println(+n+ " is Even");
       }

    }
}
    */
   //Sum of Array Elements: Given an array of integers, calculate and return the sum of all the elements in the array.
    /*import java.util.*;
    public class ArrayQ{
        public  static int arraySum(int arr[],int n){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
            }
            return sum;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(arraySum(arr,n));
        }
    }
        */
       //Given an array of integers nums, return the minimum element present in the array.
      /* import java.util.*;
         public class ArrayQ{
            public static int minElement(int arr[],int n){
                int minE=arr[0];
                for(int i=0;i<n;i++){
                    if(arr[i]<minE ){
                        minE=arr[i];
                    }
                }
                return minE;
            }
            public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(minElement(arr,n));
         }
        }
         */
        //Given a string s, count the number of vowels (a, e, i, o, u) present in the string. 
       /*import java.util.*;
        public class ArrayQ{
            public static int counVowels(String s){
                int c=0;
                for(int i=0;i<s.length();i++){
                    char ch=s.charAt(i);
                    if(ch=='a'||ch=='e' || ch=='i' || ch=='o'|| ch=='u' || ch=='A' || ch=='E'|| ch=='I'|| ch=='O' || ch=='U') {
                        c++;
                    }
                }
                return c;
            }
            public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                System.out.println(counVowels(s));
            }
        }
            */
           //Given a string s, determine whether it is a palindrome. A palindrome reads the same forwards and backwards.
         /* import java.util.*;
             public class ArrayQ{
                public static boolean isPalindrome(String s){
                    boolean m=false;
                    String rev="";
                    for(int i=s.length()-1;i>=0;i--){
                        rev+=s.charAt(i);
                    }
                    if(rev.equals(s)){
                        m=true;
                    }
                    else {
                        m= false;
                    }
                    return m;
                }
                public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                System.out.println(isPalindrome(s));
             }
            }
             */
            //Given an array of integers nums and a target value, return the index of the target if found, otherwise return -1.
         /* import java.util.*;
            public class ArrayQ{
                public static int Lsearch(int arr[],int n,int target){
                    int index=-1;
                    for(int i=0;i<n;i++){
                        if(arr[i]==target){
                            index=i;
                        }
                    }
                    return index;
                }
                public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                   arr[i]=sc.nextInt();
                  }
                  int target=sc.nextInt();
                  System.out.println(Lsearch(arr,n,target));
            } 
        }
            */
        //   Given an integer n, return the number of digits present in the number. The number can be positive or negative.
       /* import java.util.*;
        public class ArrayQ{
            public static int countDigits(int n){
                int count=0;
                while(n>0){
                    int digit=n%10;
                    n=n/10;
                    count++;
                }
                return count;
            }
            public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                System.out.println(countDigits(n));
            }
        }
            */
       // Given an array of integers nums, return a new array where each element is the square of the original element.
       import java.util.*;
       public class ArrayQ{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sqr[]=new int[n];
            for(int j=0;j<n;j++){
                sqr[j]=arr[j]*arr[j];
            }
            for(int i=0;i<n;i++){
                System.out.println(sqr[i]);
            }
        }
       }

