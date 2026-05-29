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
        Student jyoti;
        System.out.println(Arrays.toString(students));   //as the value  is not intialise so the value is null
        //dynamically allots
        Student students[0]=new Student();
        //the first is  Student students[0] is the compile time(checking error) and the second is new Student() is the runtime(running time)
        //when we create object of a cass it means that its instanciated
        //new is dynamic memory allocation operator which is used to create object of a class and it returns the address of the object created
        //Student() is constructor
        //Student students[0] is reference variable which is used to refer the object created and it is used to access the properties and functions of the class
        
        //Jyoti.rno=04;
       //Jyoti.marks=90.8f;
       //Jyoti.name="jyoti";
    
       //Jyoti.changeName("Shoe Lover");
       //Jyoti.gretting();

       System.out.println(Jyoti.rno);
       System.out.println(Jyoti.name);
       System.out.println(Jyoti.marks);
        
       Student random=new Student(Jyoti);
       System.out.println(random.name);

       StudentS random2=new StudentS();
       System.out.println(random2.name);

       Student one=new Student();
       Student two=one;
       one.name="Astuti";
         System.out.println(two.name);

    }
}
//create a class student which has 3 properties roll no, name and marks
//for every single students
public classs Student{
    int rollno;
    String name;
    float marks=90;

    //we need a way to add the values of the above
    //properties object by object

    //we need one word to access every object
    //we need a function to change the name of the student
    void changeName(String name){
        this.name=name;  //this is used to refer the current object
    }
    void greeting(){
        System.out.println("Hello my name is "+name);
    }
         
    Student (){
        this.rno=15;
        this.name="Jyoti";
        this.marks=89.1f;
    }
    StudentS(){
        //this is how u call a constructor from another constructor
        //internally: new Student(13,"Default Men",90.1f);
        this(13,"Default Men",90.1f);   
    }
    //Student Arpit=new Student(17,"Arpit",90.8f);
    //here this will replaced with arpit
    Student(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student(Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }
}
