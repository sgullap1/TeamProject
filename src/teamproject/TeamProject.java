// Class:       IT5413
// Term:        Spring 2018
// Name:        Sindhuja Gullapalli, Stacey Tanner, Tamar McDowell
// Instructor:  Dr. Lynda Brown
// Assignment:  Group Project

/* 

Changes by team member:
------------------------
Sindhuja Gullapalli
    Make program user friendly, move common code to functions, integrate code from all team members, Bug fixes after integration, Comments
Stacey Tanner
    Menu options 1-4
Tamar McDowell:
    Program flow, Menu Options 5-9
------------------------

Creating Internship portion 
based on the UML diagram design
Declaring Instance/Class Variables
in: Scanner

Methods used
main (String[] args)
setStudentDetails (Student student)
setCompanyDetails (Company company)
printCompany (Company company, int index)
printStudent (Student student, int index)
printAllCompanies(ArrayList<Company> allCompanies)
printAllStudents(ArrayList<Student> allStudents)
*/

package teamproject;

import java.util.Scanner;
import java.util.ArrayList;

public class TeamProject {

    // Initialize scanner
    private static Scanner in = new Scanner(System.in);

    // Main starting point of the program
    public static void main(String[] args) {

        // Show welcome message
        System.out.println("***************************************************");
        System.out.println("        Welcome to Internship Program");
        System.out.println("***************************************************");
        System.out.println("\n\n");

        // Initialize InternshipMatcher class
        InternshipMatcher matcher = new InternshipMatcher();

        int menuChoice = 0;

        while (menuChoice != 10) {
            // Print Menu
            System.out.println("--------------------------------------");
            System.out.println("                MENU");
            System.out.println("--------------------------------------");
            System.out.println("1. Add Company");
            System.out.println("2. Edit Company");
            System.out.println("3. Delete Company");
            System.out.println("4. View All Companies");
            System.out.println("5. Add Student");
            System.out.println("6. Edit Student");
            System.out.println("7. Delete Student");
            System.out.println("8. View All Students");
            System.out.println("9. Match companies to students");
            System.out.println("10. Exit");
            System.out.println("--------------------------------------");

            System.out.print("\nPlease choose an option: ");

            // Get user selection 
            try {
                menuChoice = in.nextInt();
            } catch (Exception e) {
                menuChoice = 0;
                in.nextLine();

                // Show message if invalid
                System.out.println("Invalid Selection, Please try again.\n\n");
                continue;

            }
            if (menuChoice < 1 || menuChoice > 10) {
                // Show message if invalid
                System.out.println("Invalid Selection, Please try again.\n\n");
                continue;
            }

            switch (menuChoice) {
                // Option 1: Add a company
                case 1: {
                    // Initialize Company object
                    Company company = new Company();
                    System.out.println("\nAdding new company:");
                    
                    // Add details to company from user input
                    company = setCompanyDetails(company);
                    
                    // Add company to list
                    matcher.addCompany(company);
                    
                    // Show message
                    System.out.println("Company added successfully!");
                    break;
                }
                
                // Option 2: Edit Company
                case 2: {
                    // Get company list
                    ArrayList<Company> allCompanies = matcher.getAllCompanies();

                    // Show message if no company exists
                    if (allCompanies.size() < 1) {
                        System.out.println("\nNo company exists yet!\n");
                        break;
                    }

                    System.out.println("Select company to edit from list: ");

                    // Print All Companies
                    printAllCompanies(allCompanies);

                    System.out.print("\n\nEnter number to edit , -1 to return: ");

                    // Get company number to edit
                    int companyNumber = in.nextInt();

                    if (companyNumber == -1) {
                        break;
                    }

                    Company company = null;

                    // Find company based on company number
                    try {
                        company = allCompanies.get(companyNumber);
                    } catch (Exception e) {
                        System.out.println("Invalid company number.");
                        break;
                    }

                    // Modify company details from user input
                    setCompanyDetails(company);

                    System.out.println("Company edited successfully!");

                }
                break;

                // Option 3: Delete Company
                case 3: {
                    // Get all companies
                    ArrayList<Company> allCompanies = matcher.getAllCompanies();

                    if (allCompanies.size() < 1) {
                        System.out.println("\nNo company exists yet!\n");
                        break;
                    }

                    System.out.println("\nSelect company to delete: ");

                    // Print all Companies
                    printAllCompanies(allCompanies);

                    System.out.print("\nEnter number to delete , -1 to return: ");

                    // Get user selection
                    int companyNumber = in.nextInt();

                    if (companyNumber == -1) {
                        break;
                    }

                    // Remove company selected by user
                    try {
                        matcher.removeCompany(allCompanies.get(companyNumber));
                    } catch (Exception e) {
                        System.out.println("Invalid student number.");
                        break;
                    }

                    System.out.println("Company deleted successfully!");

                }
                break;

                // Option 4: Display all Companies
                case 4: {
                    if (matcher.getAllCompanies().size() < 1) {
                        System.out.println("\nNo company exists yet!\n");
                        break;
                    }

                    printAllCompanies(matcher.getAllCompanies());
                }
                break;

                // Option 5: Add student
                case 5: {
                    // Initialize new student
                    Student student = new Student();

                    System.out.println("\nAdding new student:");

                    // Add details to student from user inputs
                    student = setStudentDetails(student);

                    // Add student to student list
                    matcher.addStudent(student);

                    System.out.println("Student added succesfully!");
                }
                break;

                // Option 6: Edit Student
                case 6: {
                    ArrayList<Student> allStudents = matcher.getAllStudents();

                    System.out.println("Select student to edit from list");

                    // Show message if no student exists
                    if (allStudents.size() < 1) {
                        System.out.println("\nNo student exists yet!\n");
                        break;
                    }

                    // Print all Students
                    printAllStudents(allStudents);

                    System.out.print("\n\nEnter number to edit , -1 to return: ");

                    // Get user selection
                    int studentNumber = in.nextInt();

                    if (studentNumber == -1) {
                        break;
                    }

                    Student student = null;

                    // Get student based on user selection
                    try {
                        student = allStudents.get(studentNumber);
                    } catch (Exception e) {
                        System.out.println("Invalid student number.");
                        break;
                    }

                    // Update Student
                    student = setStudentDetails(student);

                    allStudents.set(studentNumber, student);

                    System.out.println("Student edited successfully!");
                }
                break;

                // Option 7: Delete Student
                case 7: {
                    // Get all students
                    ArrayList<Student> allStudents = matcher.getAllStudents();

                    if (allStudents.size() < 1) {
                        System.out.println("\nNo student exists yet!\n");
                        break;
                    }

                    System.out.println("Select student to delete from list");

                    // Print all Students
                    printAllStudents(allStudents);

                    System.out.print("\n\nEnter number to edit , -1 to return: ");

                    // Get user selection
                    int studentNumber = in.nextInt();

                    if (studentNumber == -1) {
                        break;
                    }

                    // Remove selected user from list.
                    try {
                        allStudents.remove(studentNumber);
                    } catch (Exception e) {
                        System.out.println("Invalid student number.");
                        break;
                    }

                    System.out.println("Student deleted successfully!");
                }
                break;

                // Option 8: Print all students
                case 8: {
                    if (matcher.getAllStudents().size() < 1) {
                        System.out.println("\nNo student exists yet!\n");
                        break;
                    }

                    // print students
                    printAllStudents(matcher.getAllStudents());
                }
                break;

                // Option 9: Print All students and their respective company matches
                case 9: {

                    System.out.println("\nFinding matching internships for students:");
                    System.out.println("Searching for students who match their type of internship and semester:");

                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                     Students and Matches");
                    System.out.println("-------------------------------------------------------------------");
                                        
                    for (int i = 0; i < matcher.getAllStudents().size(); i++) {
                        // Print each student
                        printStudent(matcher.getAllStudents().get(i), i);

                        // Get company matches for student's internship type and semester
                        ArrayList<Company> companyMatches = matcher.getCompanyMatchesByStudents(matcher.getAllStudents().get(i));
                        System.out.println("Companies offering internship \"" + matcher.getAllStudents().get(i).getInternshipType() + "\" during \"" + matcher.getAllStudents().get(i).getInternshipSemester() + "\":");
                        
                        if (companyMatches.size() > 0) {
                            // Print all matching companies
                            for (int j = 0; j < companyMatches.size(); j++) {
                                boolean isPaid = companyMatches.get(j).getOfferedInternships().get(0).isPaidInternship();

                                String paidOrUnpaid = "Paid";

                                if (!isPaid) {
                                    paidOrUnpaid = "Unpaid";
                                }

                                System.out.println("\t" + (j + 1) + ". " + companyMatches.get(j).getCompanyName() + " (" + paidOrUnpaid + ")");
                            }
                            
                            System.out.println("-------------------------------------------------------------------");
                        } else {
                            System.out.println("No match found.");
                            System.out.println("-------------------------------------------------------------------");
                        }                        
                    }
                }
                System.out.println("\n");
                break;

            }

        }
                
        // Print exit message
        System.out.println("\nThank you for using Internship Matcher.");
        System.out.println("\nExiting...!");
        System.out.println("***");
    }

    // Add student details from user input
    private static Student setStudentDetails(Student student) {

        in.nextLine();

        System.out.println("Enter Student Name:");
        // Get name from user input
        String name = in.nextLine();
        // Add/Update student name
        student.setName(name);

        System.out.println("Enter Student Email:");
        // Get email from user input
        String email = in.nextLine();
        // Add/Update email input
        student.setEmail(email);

        System.out.println("Enter Type of Internship:");
        // Get internship type from user input
        String typeOfInternship = in.nextLine();
        // Add/Update internship type
        student.setInternshipType(typeOfInternship);

        System.out.println("Enter Student Semester:");
        // Get internship semester from user input
        String semester = in.nextLine();
        // Add/Update internship semester
        student.setInternshipSemester(semester);

        return student;
    }

    // Add company details from user inputs
    private static Company setCompanyDetails(Company company) {

        in.nextLine();

        System.out.println("Enter Company Name:");
        // Get company name from user input
        String name = in.nextLine();
        // Add/Update company name
        company.setCompanyName(name);

        System.out.println("Enter Contact Name:");
        // Get contact name from user input
        String contactName = in.nextLine();
        // Add/Update contact name
        company.setContactName(contactName);

        System.out.println("Enter Company Email:");
        // Get email form user input
        String email = in.nextLine();
        // Add/Update email
        company.setContactEmail(email);

        if (company.getOfferedInternships() == null || company.getOfferedInternships().isEmpty()) {
            // Get internship title from user input
            System.out.println("Enter Internship Title:");
            String internshipTitle = in.nextLine();
            
            System.out.println("Enter Type of Internship:");
            // Get internship type from user input
            String typeOfInternship = in.nextLine();            
            System.out.println("Enter Semester Number (Example: Fall 2018): ");
            // Get Semester from user input
            String semester = in.nextLine();

            System.out.println("Is Internship Paid (y/n):");
            // Get whether paid/unpaid from user input
            String isPaid = in.nextLine();

            // Add internship to company
            company.addInternship(internshipTitle, typeOfInternship, isPaid.equalsIgnoreCase("y"), semester);
        } else {
            CompanyInternship internship = company.getOfferedInternships().get(0);
            
            System.out.println("Enter Internship Title:");
            // Get internship title from user input
            String internshipTitle = in.nextLine();            

            System.out.println("Enter Type of Internship:");
            // Get internship type from user input
            String typeOfInternship = in.nextLine();

            System.out.println("Enter Semester Number (Example: Fall 2018): ");
            // Get internship semester from user input
            String semester = in.nextLine();

            System.out.println("Is Internship Paid (y/n):");
            // Get wheter paid/unpaid from input
            String isPaid = in.nextLine();
            
            // Remove existing internship
            company.removeInternship(internship.getInternshipTitle());
            
            // Add updated internship details
            company.addInternship(internshipTitle, typeOfInternship, isPaid.equalsIgnoreCase("y"), semester);
        }

        return company;
    }

    // Print info of the company passed in the argument
    private static void printCompany(Company company, int index) {
        System.out.print("Company Number:\t\t\t");
        System.out.println(index);

        System.out.print("Company Name:\t\t\t");
        System.out.println(company.getCompanyName());

        System.out.print("Company Email:\t\t\t");
        System.out.println(company.getContactEmail());

        if (company.getOfferedInternships().size() > 0) {
            CompanyInternship internship = company.getOfferedInternships().get(0);
            System.out.print("Internship Title:\t\t");
            System.out.println(internship.getInternshipTitle());

            System.out.print("Type of Internship:\t\t");
            System.out.println(internship.getInternshipType());

            System.out.print("Semester:\t\t");
            System.out.println(internship.getInternshipSemester());

            System.out.print("Is Internship Paid (y/n):\t");
            System.out.println(internship.isPaidInternship() == true ? "Y" : "N");

            System.out.println();
        }
    }

    // Print info of student passed in the argument
    private static void printStudent(Student student, int index) {
        System.out.print("Student Number:\t\t");
        System.out.println(index);

        System.out.print("Student Name:\t\t");
        System.out.println(student.getName());

        System.out.print("Student Email:\t\t");
        System.out.println(student.getEmail());

        System.out.print("Type of Internship:\t\t");
        System.out.println(student.getInternshipType());

        System.out.print("Student Semester:\t\t");
        System.out.println(student.getInternshipSemester());
    }

    // Print All Companies
    private static void printAllCompanies(ArrayList<Company> allCompanies) {
        System.out.println("----------------------------------------------------------");
        System.out.println("                      All Companies");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < allCompanies.size(); i++) {
            printCompany(allCompanies.get(i), i);
            System.out.println("----------------------------------------------------------");
        }
        
        System.out.println("***");
    }

    // Print All Students
    private static void printAllStudents(ArrayList<Student> allStudents) {
        System.out.println("-------------------------------------------------------");
        System.out.println("                   All Students");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < allStudents.size(); i++) {
            printStudent(allStudents.get(i), i);
            System.out.println("-------------------------------------------------------");
        }
        
        System.out.println("***");
    }
}
