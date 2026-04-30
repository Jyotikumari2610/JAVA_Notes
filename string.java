import java.util.*;
public class string {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      /*String s="Jyoti";
        String s1="Jyoti";
        //it gives true because both s and s1 are pointing to the same string literal in the string pool
        System.out.println(s==s1);
*/
//for false we have to create string using new keyword and then both s and s1 will point to different objects in heap memory outside the string pool
     /*String s=new String("Jyoti");
        String s1=new String("Jyoti");
        //it will give false because s and s1 are different objects in heap memory and they are not pointing to the same string literal in the string pool
        //System.out.println(s==s1);
        //to compare the content of the string we have to use equals method for true output
        System.out.println(s.equals(s1));
        */
       /*String s="Jyoti";
        System.out.println(s.charAt(0));//for printing last character of string s
        */
       System.out.println(56);
       System.out.println("Jyoti!!");
       System.out.println(new int[]{13,53,06});//it will print the reference of the array object in heap memory instead of the actual content of the array because arrays in java do not override the toString method from the Object class, so it uses the default implementation which returns a string representation of the object's memory address.
    //so coorect wayto print the content of array is:
        System.out.println(Arrays.toString(new int[]{13,53,06}));
        String name=null;
        System.out.println(name);
        Integer num=new Integer(56);
        System.out.println(num.toString());
        

    }
}
