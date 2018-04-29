/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

public class StudentTester {
    private static void main(String[] args)
    {
        // Create Student From Default Constructor
        Student student = new Student();
        
        student.setName("Test Name");
        student.setEmail("testEmail@students.kennesaw.edu");
        student.setInternshipType("Software");
        student.setInternshipSemester("fall");
        
        System.out.println("-----------------------------------");
        System.out.println("          Student           ");
        System.out.println("-----------------------------------");
        System.out.println("Student name:     " + student.getName());
        System.out.println("Student Email:      " + student.getEmail());
        System.out.println("Internship Type:    " + student.getInternshipType());
        System.out.println("Internship Semester:                   " + student.getInternshipSemester());
        System.out.println("-----------------------------------");
        System.out.println("            * * * *");      
        
        System.out.println("Updating Student");
        
        student.setName("Updated Student Name");
        student.setEmail("updatedEmail@students.kennesaw.edu");
        student.setInternshipType("Art");
        student.setInternshipSemester("spring");
        
        System.out.println("-----------------------------------");
        System.out.println("          Student           ");
        System.out.println("-----------------------------------");
        System.out.println("Student name:     " + student.getName());
        System.out.println("Student Email:      " + student.getEmail());
        System.out.println("Internship Type:    " + student.getInternshipType());
        System.out.println("Internship Semester:                   " + student.getInternshipSemester());
        System.out.println("-----------------------------------");
        System.out.println("            * * * *");  
        
        Student student2 = new Student("Test Student 2", "studen2@students.kennesaw.edu", "Web Development", "Fall 2018");
        
        System.out.println("-----------------------------------");
        System.out.println("          Student           ");
        System.out.println("-----------------------------------");
        System.out.println("Student name:     " + student2.getName());
        System.out.println("Student Email:      " + student2.getEmail());
        System.out.println("Internship Type:    " + student2.getInternshipType());
        System.out.println("Internship Semester:                   " + student2.getInternshipSemester());
        System.out.println("-----------------------------------");
        System.out.println("            * * * *");  
    }    
}