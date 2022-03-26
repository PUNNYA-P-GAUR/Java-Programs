
Ques::=/*A HighSchool application has two classes: the Person superclass and the Student subclass. Using inheritance, you will create two new classes,
  Teacher and CollegeStudent. A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns)
  and subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). The CollegeStudent class will extend the Student class by adding
  a year (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”)*/
//Solution:
import java.lang.*;
import java.util.Scanner;
class Person{
    String name;
    int dob;
    Person(String a,int b){
        name=a;
        dob=b;

    }
    public String toString(){
        return name +" "+dob+" ";
    }
}
class Student extends Person{
    String gender;
    Student(String a,int b){
        super(a,b);
    }
    public String toString(){
        return super.toString();
    }

}
class Teacher extends Person{
    String sub;
    int sal;
    Teacher(String a,int b,String c,int d){
        super(a,b);
        sub=c;
        sal=d;
    }
    public String getsub(){
        return sub;
    }
    public int getSal(){
        return sal;
    }

    public void  setSub(String c) {
        sub=c;
    }

    public void setSal(int d) {
        sal=d;
    }
    public String toString(){
        return super.toString()+" "+sub+" "+sal+" ";
    }
}
class College_Student extends Student{
    int year;
    String major;
    College_Student(String a,int b,int c,String d){
        super(a,b);
        year=c;
        major=d;
    }
    public String getMajor(){
        return major;
    }
    public int getYear(){
        return  year;
    }
    public void setYear(int c){
        year=c;
    }
    public void setMajor(String d){
        major=d;
    }
    public String toString(){
        return super.toString()+" "+year+" "+major;
    }

}
class Main{
    public static void main(String[] args) {
        Teacher t=new Teacher("Mahesh",2002,"Computer",30000);
        College_Student cs=new College_Student("Punnya",2003,1,"Communications");
        System.out.println(t.toString());
        System.out.println(cs.toString());

    }
}
