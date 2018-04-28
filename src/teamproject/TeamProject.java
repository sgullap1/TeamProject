/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.util.Scanner;
import java.util.ArrayList;

public class TeamProject {
        private static Scanner in = new Scanner(System.in);
        
	public static void main(String[] args) {
            System.out.println("Welcome to Internship Program\n");

		InternshipMatcher matcher = new InternshipMatcher();

		int menuChoice = 0;

		while (menuChoice != 10) {
			// menu
			System.out.println("\nPlease choose an option:");
			System.out.println("1. Add Company");
			System.out.println("2. Edit Company");
			System.out.println("3. Delete Company");
			System.out.println("4. View All Companies");
			System.out.println("5. Add Student");
			System.out.println("6. Edit Student");
			System.out.println("7. Delete Student");
			System.out.println("8. View All Students");
			System.out.println("9. Match company to students");
			System.out.println("10. Exit");

			try {
				menuChoice = in.nextInt();
			} catch (Exception e) {
				menuChoice = 0;
				in.nextLine();

				continue;

			}
			if (menuChoice < 1 || menuChoice > 9) {
				continue;
			}

			switch (menuChoice) {
			case 1: {
				Company company = new Company();

				System.out.println("Adding new company:\n");

				company = setCompanyDetails(company);

				matcher.addCompany(company);

				System.out.println("Company added successfully!");
				break;
			}
			case 2: {
                ArrayList<Company> allCompanies = matcher.getAllCompanies();
                            
				if (allCompanies.size() < 1) {
					System.out.println("\nNo company exists yet!\n");
					break;
				}

				System.out.println("Select company to edit from list:");

				for (int i = 0; i < allCompanies.size(); i++) {
					System.out.println("Company No. " + i);
					printCompany(allCompanies.get(i), i);
				}

				System.out.println("\n\nEnter number to edit , -1 to return:");

				int companyNumber = in.nextInt();

				if (companyNumber == -1)
					break;

				Company company = allCompanies.get(companyNumber);
				setCompanyDetails(company);

				System.out.println("Company edited successfully!");

			}
				break;

			case 3: {
				ArrayList<Company> allCompanies = matcher.getAllCompanies();

				if (allCompanies.size() < 1) {
					System.out.println("\nNo company exists yet!\n");
					break;
				}

				System.out.println("Select company to delete: ");

				for (int i = 0; i < allCompanies.size(); i++) {
					System.out.println("Company No. " + i);
					printCompany(allCompanies.get(i), i);
				}

				System.out.println("\n\nEnter number to delete , -1 to return:");

				int companyNumber = in.nextInt();

				if (companyNumber == -1)
					break;

				matcher.removeCompany(allCompanies.get(companyNumber));

				System.out.println("Company deleted successfully!");

			}
				break;

			case 4: {
				if (matcher.getAllCompanies().size() < 1) {
					System.out.println("\nNo company exists yet!\n");
					break;
				}

				System.out.println("\nPrinting list of all companies\n");
				for (int i = 0; i < matcher.getAllCompanies().size(); i++) {
//					System.out.println("Company No. " + i);
					printCompany(matcher.getAllCompanies().get(i), i);
				}

			}
				break;

			case 5: {

				Student student = new Student();

				System.out.println("Adding new student:\n");

				student = setStudentDetails(student);

				matcher.addStudent(student);

				System.out.println("Student added succesfully!");
			}
				break;

			case 6: {
				ArrayList<Student> allStudents = matcher.getAllStudents();

				if (allStudents.size() < 1) {
					System.out.println("\nNo student exists yet!\n");
					break;
				}

				System.out.println("Select student to edit from list, -1 to return: ");

				for (int i = 0; i < allStudents.size(); i++) {
					// System.out.println("Student No. " + i);
					printStudent(allStudents.get(i), i);
				}

				int studentNumber = in.nextInt();

				if (studentNumber == -1)
					break;

				Student student = allStudents.get(studentNumber);

				student = setStudentDetails(student);

				allStudents.set(studentNumber, student);

				System.out.println("Student edited successfully!");
			}
				break;

			case 7: {
				ArrayList<Student> allStudents = matcher.getAllStudents();

				if (allStudents.size() < 1) {
					System.out.println("\nNo student exists yet!\n");
					break;
				}

				System.out.println("Select student to delete from list, -1 to return: ");

				for (int i = 0; i < allStudents.size(); i++) {
					// System.out.println("Student No. " + i);
					printStudent(allStudents.get(i), i);
				}

				int studentNumber = in.nextInt();

				if (studentNumber == -1)
					break;

					allStudents.remove(studentNumber);

				System.out.println("Student deleted successfully!");
			}
				break;

			case 8: {
				System.out.println("Displaying all students: ");

				for (int i = 0; i < matcher.getAllStudents().size(); i++) {
					System.out.println("Student No. " + i);
					printStudent(matcher.getAllStudents().get(i), i);
				}
			}
				break;

			case 9: {

				System.out.println("\nFinding matching internships for students:");
				System.out.println("Searching for students who match their type of internship and year:");
                                
                                for (int i = 0; i < matcher.getAllStudents().size(); i++) {
                                    printStudent(matcher.getAllStudents().get(i), i);
                                    
                                    ArrayList<Company> companyMatches = matcher.getCompanyMatchesByStudents(matcher.getAllStudents().get(i));
                                    System.out.println("Companies offering similar internship:");
                                    for (Company company : companyMatches) {
                                        System.out.println(company.getCompanyName());
                                    }
                                }

			}
			System.out.println("\n");
				break;

			}


		}
		System.out.println("\nExiting...!");

	}

	private static Student setStudentDetails(Student student) {

		in.nextLine();

		System.out.println("Enter Student Name:");
		String name = in.nextLine();
		student.setName(name);

		System.out.println("Enter Student Email:");
		String email = in.nextLine();
                student.setEmail(email);

		System.out.println("Enter Type of Internship:");
		String typeOfInternship = in.nextLine();
                student.setInternshipType(typeOfInternship);

		System.out.println("Enter Student Semester:");
		String semester = in.nextLine();
                student.setInternshipSemester(semester);
                
		return student;
	}

	private static Company setCompanyDetails(Company company) {

		in.nextLine();

		System.out.println("Enter Company Name:");
		String name = in.nextLine();
                company.setCompanyName(name);

		System.out.println("Enter Contact Name:");
		String contactName = in.nextLine();
                company.setContactName(contactName);

		System.out.println("Enter Company Email:");
		String email = in.nextLine();
                company.setContactEmail(email);
                
                if (company.getOfferedInternships() == null || company.getOfferedInternships().isEmpty()) {
                    System.out.println("Enter Internship Title:");
                    String internshipTitle = in.nextLine();

                    System.out.println("Enter Type of Internship:");
                    String typeOfInternship = in.nextLine();

                    System.out.println("Enter Semester Number: (1-8)");
                    String semester = in.nextLine();

                    System.out.println("Is Internship Paid (y/n):");
                    String isPaid = in.nextLine();
                    
                    company.addInternship(internshipTitle, typeOfInternship, isPaid.equalsIgnoreCase("y"), semester);		
                }
                
                return company;
	}
        
        private static void printCompany(Company company, int index) {
            System.out.print("Company Name:\t\t\t");
			System.out.println(company.getCompanyName());		

			System.out.print("Company Number:\t\t\t");
			System.out.println(index);
			
			System.out.print("Company Email:\t\t\t");
			System.out.println(company.getContactEmail());

			if (company.getOfferedInternships().size() > 0) {
				CompanyInternship internship = company.getOfferedInternships().get(0);
				System.out.print("Internship Title:\t\t");
				System.out.println(internship.getInternshipTitle());
		
				System.out.print("Type of Internship:\t\t");
				System.out.println(internship.getInternshipType());
		
				System.out.print("Semester Number: (1-8)\t\t");
				System.out.println(internship.getInternshipSemester());
		
				System.out.print("Is Internship Paid (y/n):\t");
				System.out.println(internship.isPaidInternship() == true ? "Y" : "N");
		
				System.out.println();
			}		
        }
        
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
}
