import java.util.Arrays;

public class SB {
    public static void main(String args[]){
      /*StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch).append(" ");
        }
        System.out.println(builder.toString());
        */
       String name="Jyoti Kumari";
       System.out.println(Arrays.toString(name.toCharArray()));//it will convert the string into a character array 
       //it will return the hash code of the string object
       System.out.println(name.hashCode());       //it will return the hash code of the string object
        System.out.println(name.format(name, args));
        System.out.println(name.split(" ")); //it will split the string into an array of substrings based on the specified delimiter, which is a space in this case
        System.out.println(Arrays.toString(name.split(" "))); //it will print the array of substrings obtained from splitting the string based on the space delimiter
        System.out.println(name.substring(0,5)); //it will return the substring of the string starting from index 0 and ending at index 5 (exclusive), which is "Jyoti"
        System.out.println(name.substring(6)); //it will return the substring of the string starting
    }
}