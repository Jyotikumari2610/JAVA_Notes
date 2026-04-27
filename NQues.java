import java.util.*;
public class NQues {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
      /*   System.out.println("Even digit in "+n+" is:");
        int even=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit%2==0){
                even++;
            }
        }
        System.out.print(even);
        */
        /* System.out.println("Odd digit in "+n+" is:");
        int odd=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit%2!=0){
                odd++;
            }
        }
        System.out.print(odd);
        */
      /* System.out.println("Zero in "+n+" is:");
        int zero=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit==0){
                zero++;
            }
        }
        System.out.println(zero);
        */
       /* int d=sc.nextInt();
        System.out.println(+d+" in "+n+ " is:");
        int count=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit==d){
                count++;
            }
        }
        System.out.println(count);
        */
      /* System.out.println("Largest digit in "+n+" is:");
        int LDig=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit>LDig){
              LDig=digit;
            // if(digit<=9 && digit>=0){
               // LDig++;
             }
            }
            System.out.println(LDig);
            */
    /*System.out.println("Smallest digit in "+n+" is:");
        int SDig=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
           // if(digit<SDig){
            //  SDig=digit;
            if(digit>=9 && digit<=0){
               SDig++;
             }
            }
            System.out.println(SDig);
            */
         /* int rev=0;
            while(n>0){
                int digit=n%10;
                rev=rev*10+digit;
                n=n/10;
            }
            System.out.println("Reversed digit:"+rev);
            */
            int rev=0;
            int temp=n;
            while(n>0){
                int digit=n%10;
                rev=rev*10+digit;
                n=n/10;
            }
            if(temp==rev){
                System.out.println(+temp+" is palindrome");
            }
            else{
                System.out.println(+temp+" is not palindrome");

        }
    }
    }

    

