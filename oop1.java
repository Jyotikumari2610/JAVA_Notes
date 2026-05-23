import java.util.*;
public class oop1 {
    public static void main(String args[]){
        // set of data struturesstore 5 roll no
        int rollno[]=new int[5];
        // set of data strutures that store 5 names(array of strings)
        String name[]=new String[5];
        // set of data strutures store 5 students data{roll no, name ,marks} 
        // so here we can genuinelly use 3 array to store different data as roll no, name an marks
        int rn[]=new int[5];
        String nm[]=new String[5];
        float marks[]=new float[5];
        //but u had created diffetent different data types for every single property if i want some single line of data strtures that store
        //these all data that is roll name and marks in one single line then we can use class 
        //class is a named group of properties and functions(class start with capital letter)
        Student[] students=new Student[5];
        students[0]=new Student(1,"satyarth",78.5f);
        students[1]=new Student(2,"satyarth",78.5f);     
        students[2]=new Student(3,"satyarth",78.5f);
        students[3]=new Student(4,"satyarth",78.5f);
        students[4]=new Student(5,"satyarth",78.5f);
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollno+" "+students[i].name+" "+students[i].marks);
        }
        

    }
}
