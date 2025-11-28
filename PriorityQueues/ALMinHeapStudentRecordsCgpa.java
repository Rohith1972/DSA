/*
    ProblemStatement:
    Construct an ArrayList to store n student records, sort them in ascending order of cgpa using 
    Min Priority Queue.

*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Student{
    int rollno;
    String sname,branch;
    int total;
    double cgpa;
    public Student(int rollno,String sname,String branch,int total,double cgpa){
        this.rollno=rollno;
        this.sname=sname;
        this.branch=branch;
        this.total=total;
        this.cgpa=cgpa;
    }
    @Override
    public String toString(){
        return "RollNo:"+rollno+" "+"Name:"+sname+" "+"Branch:"+branch+" "+"Total:"+total+" "+"CGPA:"+cgpa;
    }
}
class SortByCgpa implements Comparator<Student>{
    public int compare(Student s1 , Student s2){
        if(s1.cgpa==s2.cgpa)
            return 0;
        else if(s1.cgpa>s2.cgpa)
            return 1;
        else
            return -1;
    }
}
class ALMinHeapStudentRecordsCgpa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Student> p1= new PriorityQueue<>(new SortByCgpa());
        ArrayList<Student> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int rollno = sc.nextInt();
            String sname = sc.next();
            String branch = sc.next();
            int total = sc.nextInt();
            double cgpa = sc.nextDouble();
            Student s1 = new Student(rollno,sname,branch,total,cgpa);
            al.add(s1);
        }
        for(Student i : al){
            p1.add(i);
        }
        while(!p1.isEmpty()){
            System.out.println(p1.poll().toString());
        }
    }
}