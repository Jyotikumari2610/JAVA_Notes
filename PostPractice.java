public class PostPractice{
    public static void main(String args[]){
      /*byte by=125;
        int i=14;
        short sh=455;
        float f=8.9f;
        double d=88.23;
        long l=12l;
        char c='J';
        boolean b= true;
        System.out.println("Byte: "+by);
        System.out.println("Integer: "+i);
        System.out.println("Short: "+sh);
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);
        System.out.println("Long: "+l);
        System.out.println("Character: "+c);
        System.out.println("Boolean: "+b);
        */
        //Literals
     /* int num1=0x7E;
        int num2=0x101;
        int num3=0b101;
        char c='A';
        c++;
        System.out.println(c);
        System.out.println(num1+" "+num2+" "+ num3);
        */
        //Type conversion
    /* int i=568;
        double val=i;
        System.out.println(val);
        */
     /* short s=67;
        long l=s;
        float f=l;
        System.out.println(l);
        System.out.println(f);
        */
        //Type Casting
     /* int i=346;
        byte b=(byte)i;
        System.out.println(b);
        double d=98.55;
        short sh=(short)d;
        System.out.println(sh);
    */
        //type promotion
        //basic promotion
    /*  byte b1=10;
        byte b2=20;
        int result=b1*b2;
        System.out.println(result);
*/
//mixed promotion
     /* int a=12;
        double d=89.9;
        double result =a+d;
        System.out.println(result);
        */
        //chain promotion
      /* int a=45;
        float f=67.9f;;
        short sh=23;
        byte b=98;
        double result=a+f-sh+b;
        System.out.println(result);
        */
        //String concatination
    /*  String str1="Hello";
        String str2="World";
        int a=89;
        int b=67;
        System.out.println(str1+" "+str2);
        System.out.println(a+b+str1);
        System.out.println(str1+(a+b)+str2);
        System.out.println(str1+a+b+str2);
        */
                //opetators
              /* int a=23;
                int b=45;
                System.out.println(a+b);
                System.out.println(a-b);
                System.out.println(a*b);
                System.out.println(b/a);
                System.out.println(b%a);
                int c=++a;
                int d=b++;
                System.out.println(c);
                System.out.println(d);
                int result=0;
                result=(a==b)?100:200;     //ternary operator
                System.out.println(result);
                */
                //Switch statement
   /*   int day=3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }*/
          //new version of Switch statement 
        /* String day="Friday";
          switch (day){
            case "Monday"-> System.out.println("Today is Monday");
            case "Tuesday"-> System.out.println("Today is Tuesday");
            case "Wednesday"-> System.out.println("Today is Wednesday");
            case "Thursday"-> System.out.println("Today is Thursday");
            case "Friday"-> System.out.println("Today is Friday");
            case "Saturday"-> System.out.println("Today is Saturday");
            case "Sunday"-> System.out.println("Today is Sunday");
            default -> System.out.println("Invalid day");
          }*/
          //infinte loop
          //int i=1;
/*
while(true){
    System.out.println("Jyoti!!"+i);
    i++;

}*/
/*do{
    System.out.println("Jyoti!!");
    i++;                                
}while(i<10);         
*/
int a=4;
int b=5;
PostPractice obj=new PostPractice();
int sum=obj.add(a,b);
System.out.println("Sum is: "+sum);
}
public int add(int n1,int n2){
    int r=n1+n2;
    return r;
}
    }
