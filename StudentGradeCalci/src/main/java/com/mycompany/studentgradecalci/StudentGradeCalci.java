/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgradecalci;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class StudentGradeCalci{

    public static void main(String[] args){
        String name;
        String std;
        String sec; String student_ID;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Student name:");
        name=obj.nextLine();
        System.out.println("Now enter ur standard using alphabets Ex:First,Second....Tenth");
        System.out.print("Standard of student :");
        std=obj.nextLine();
        System.out.print("Section:");
        sec=obj.nextLine();
        System.out.print("Enter Student ID_No:");
        student_ID=obj.nextLine();
        float sub1,sub2,sub3,sub4,sub5,sub6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Now enter ur scores for each subject one after the other");
        System.out.println("Now Enter the score including decimal value Ex:93.6,82.0,75.9...etc");
        System.out.print("Enter English marks here:");
        sub1= sc.nextFloat();
        System.out.print("Enter Kannada marks here:");
        sub2= sc.nextFloat();
        System.out.print("Enter Hindi marks here:");
        sub3= sc.nextFloat();
        System.out.print("Enter Maths marks here:");
        sub4= sc.nextFloat();
        System.out.print("Enter Science marks here:");
        sub5= sc.nextFloat();
        System.out.print("Enter Social marks here:");
        sub6= sc.nextFloat();
        float total=(sub1+sub2+sub3+sub4+sub5+sub6);
        System.out.println("Total score obtained out of 600="+ total);
        float avg=total/6;
        System.out.println("Percentage obtained="+ avg);
        if(avg<35){
            System.out.print("FAIL 'D' GRADE");
         }
        else if(avg>=35&&avg<45){
            System.out.print("PASS 'C' GRADE");
         }
        else if(avg>=45&&avg<65){
            System.out.print("SECOND CLASS 'B' GRADE");
         }
        else if(avg>=65&&avg<75){
            System.out.print("FIRST CLASS 'A' GRADE");
         }
        else{
            System.out.print("DISTINCTION 'EXCELLENT' GRADE ");
        }

        }
}
