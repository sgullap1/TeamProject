/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

public class StudentTester {
        private static void printstudent(student Student)
    {
        System.out.println("-----------------------------------");
        System.out.println("          Student           ");
        System.out.println("-----------------------------------");
        System.out.println("Student name:     " + Student.getname());
        System.out.println("Student Email:      " + Student.getemail());
        System.out.println("Internship Type:    " + Student.getinternshipType());
        System.out.println("Internship Semester:                   " + Student.getSemesterForIntership());
        System.out.println("-----------------------------------");
        System.out.println("            * * * *");      
    }    
}