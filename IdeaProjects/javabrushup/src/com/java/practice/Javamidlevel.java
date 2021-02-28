package com.java.practice;
import java.util.Scanner;
public class Javamidlevel {
    static String FName;
    static String MName;
    static String LName;
    static int RNumber;
    static String Address;
    static String Course;
    static String status="pending";
    public static void main(String args[]){


        Javamidlevel obj = new Javamidlevel();
while(status.equals("pending")){
    obj.getStudentDetails();
    status=obj.StudentDetails(FName,MName,LName,RNumber,Address,Course);
}
String concat= FName.concat(" "+LName);
System.out.println(concat);
obj.getDepartment(Course);
    }

    public void getStudentDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        FName = input.nextLine();
        System.out.println("Enter middle name");
        MName = input.nextLine();
        System.out.println("Enter last name");
        LName = input.nextLine();
        System.out.println("Enter roll number");
        RNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter address");
        Address = input.nextLine();
        System.out.println("Enter course name");
        Course = input.nextLine();
        while (!Course.equalsIgnoreCase("BE") && !Course.equalsIgnoreCase("B.Tech") && !Course.equalsIgnoreCase("BBA") && !Course.equalsIgnoreCase("MBA") && !Course.equalsIgnoreCase("B.Com") && !Course.equalsIgnoreCase("M.Com")) {
            System.out.println("Please enter one of the following:\"BE\",\"B.Tech\",\"BBA\",\"MBA\",\"B.Com\",\"M.Com\"");
            Course = input.nextLine();
        }
    }
    public String StudentDetails(String FName,String MName,String LName,int RNumber,String Address,String Course){
        System.out.println("Hello "+FName+" "+MName+" "+LName);

        Scanner input = new Scanner(System.in);
        System.out.println("Please confirm your details with yes/no");
            System.out.println("Roll number = " + RNumber);
            System.out.println("Address = " + Address);
            System.out.println("Course = " + Course);
        while(true) {
            String value = input.nextLine();
            if (value.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for confirming");
                status="completed";
                break;
            } else if (value.equalsIgnoreCase("no")) {
                System.out.println("No problem. Please reenter the details with correct information.");
                status="pending";
                break;
            } else {
                System.out.println("Please only enter yes/no");
            }
        }
        return status;
    }

    public void getDepartment(String course){
        if(course.equalsIgnoreCase("BE")|| course.equalsIgnoreCase("B.Tech")){
            System.out.println("Your Department is \"Engineering\"");
    }
        else if(course.equalsIgnoreCase("BBA")||course.equalsIgnoreCase("MBA")){
            System.out.println("Your Department is \"Business Administration\"");
        }
        else if(course.equalsIgnoreCase("B.Com")||course.equalsIgnoreCase("M.Com")){
            System.out.println("Your Department is \"Commerce\"");
        }else {
            System.out.println("Course not known");
        }
    }
}
