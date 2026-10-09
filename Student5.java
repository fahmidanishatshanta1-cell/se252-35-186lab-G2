public class Student {
    int id;
    String name;
    double marks;
 
    void showInfo(){
        System.out.println("ID: " + id + ", " + "Name: " + name + ", " + "Marks: " + marks );
    }

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        Student[] students = new Student[3];
 
        // Objcet Creation
       for (int i = 1; i < students.length; i++){
            students[i] = new Student();
        }
 
        // input informations
      for (int i = 1; i < students.length; i++){
            System.out.println("Enter ID for student " + (i+1));
            students[i].id = input.nextInt();
 
            input.nextLine(); // Buffer
 
            System.out.println("Enter Name for student " + (i+1));
            students[i].name = input.nextLine();
 
            System.out.println("Enter Marks for student " + (i+1));
            students[i].marks = input.nextDouble();
        }
 
        // print all student info
       for (int i = 1; i < students.length; i++){
            students[i].showInfo();
        }
 
        Student topper = students[0];
     for (int i = 1; i < students.length; i++){
            if(students[i].marks > topper.marks){
                topper = students[i];
            }
        }
 
        System.out.println("Highest mark: " + topper.marks);
        topper.showInfo();
 
        double total = 0;
        for (int i = 1; i < students.length; i++){
            total += students[i].marks;
        }
 
        System.out.println("Average: " + (total/students.length));
 
        input.close();
    }
}