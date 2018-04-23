/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.util.Scanner;
import java.util.ArrayList;

public class TeamProject {

    ArrayList<Company> listOfCompanies;
    ArrayList<Student> listOfStudents;
	Scanner in;

	public Main() {
		listOfCompanies = new ArrayList<Company>();
		listOfStudents = new ArrayList<Student>();
		in = new Scanner(System.in);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Internship Program\n");

		Main main = new Main();

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
				menuChoice = main.in.nextInt();
			} catch (Exception e) {
				menuChoice = 0;
				main.in.nextLine();

				continue;

			}
			if (menuChoice < 1 || menuChoice > 9) {
				continue;
			}

			switch (menuChoice) {
			case 1: {
				Company company = new Company();

				System.out.println("Adding new company:\n");

				company = main.setCompanyDetails(company);

				main.listOfCompanies.add(company);

				System.out.println("Company added successfully!");
				break;
			}
			case 2: {
				if (main.listOfCompanies.size() < 1) {
					System.out.println("\nNo company exists yet!\n");
					break;
				}

				System.out.println("Select company to edit from list:");

				for (int i = 0; i < main.listOfCompanies.size(); i++) {
					System.out.println("Company No. " + i);
					main.listOfCompanies.get(i).printCompany();
				}

				System.out.println("\n\nEnter number to edit , -1 to return:");

				int companyNumber = main.in.nextInt();

				if (companyNumber == -1)
					break;

				Company company = main.listOfCompanies.get(companyNumber);

				company = main.setCompanyDetails(company);

				main.listOfCompanies.set(companyNumber, company);

				System.out.println("Company edited successfully!");

			}
				break;

			case 3: {
				if (main.listOfCompanies.size() < 1) {
					System.out.println("\nNo company exists yet!\n");
					break;
				}

				System.out.println("Select company to delete: ");

				for (int i = 0; i < main.listOfCompanies.size(); i++) {
					System.out.println("Company No. " + i);
					main.listOfCompanies.get(i).printCompany();
				}

				System.out.println("\n\nEnter number to delete , -1 to return:");

				int companyNumber = main.in.nextInt();

				if (companyNumber == -1)
					break;

				main.listOfCompanies.remove(companyNumber);

				System.out.println("Company deleted successfully!");

			}
				break;

			case 4: {
				if (main.listOfCompanies.size() < 1) {
					System.out.println("\nNo company exists yet!\n");
					break;
				}

				System.out.println("\nPrinting list of all companies\n");
				for (int i = 0; i < main.listOfCompanies.size(); i++) {
					System.out.println("Company No. " + i);
					main.listOfCompanies.get(i).printCompany();
				}

			}
				break;

			case 5: {

				Student student = new Student();

				System.out.println("Adding new student:\n");

				student = main.setStudentDetails(student);

				main.listOfStudents.add(student);

				System.out.println("Student added succesfully!");
			}
				break;

			case 6: {
				if (main.listOfStudents.size() < 1) {
					System.out.println("\nNo student exists yet!\n");
					break;
				}

				System.out.println("Select student to edit from list, -1 to return: ");

				for (int i = 0; i < main.listOfStudents.size(); i++) {
					System.out.println("Student No. " + i);
					main.listOfStudents.get(i).printStudent();
				}

				int studentNumber = main.in.nextInt();

				if (studentNumber == -1)
					break;

				Student student = main.listOfStudents.get(studentNumber);

				student = main.setStudentDetails(student);

				main.listOfStudents.set(studentNumber, student);

				System.out.println("Student edited successfully!");
			}
				break;

			case 7: {
				if (main.listOfStudents.size() < 1) {
					System.out.println("\nNo student exists yet!\n");
					break;
				}

				System.out.println("Select student to delete from list, -1 to return: ");

				for (int i = 0; i < main.listOfStudents.size(); i++) {
					System.out.println("Student No. " + i);
					main.listOfStudents.get(i).printStudent();
				}

				int studentNumber = main.in.nextInt();

				if (studentNumber == -1)
					break;

				main.listOfStudents.remove(studentNumber);

				System.out.println("Student deleted successfully!");
			}
				break;

			case 8: {
				System.out.println("Displaying all students: ");

				for (int i = 0; i < main.listOfStudents.size(); i++) {
					System.out.println("Student No. " + i);
					main.listOfStudents.get(i).printStudent();
				}
			}
				break;

			case 9: {

				System.out.println("\nFinding matching internships for students:");
				System.out.println("Searching for students who match their type of internship and year:");

				for (Company company : main.listOfCompanies) {
					for (Student student : main.listOfStudents) {
						if (student.semester.equalsIgnoreCase(company.semester)) {
							
							if (student.typeOfInternship.equalsIgnoreCase(company.typeOfInternship)) {
								System.out.println("\nInternship match found.");
								System.out.println("Student Name: "+student.name);
								System.out.println("Company Name: "+company.companyName);
								System.out.println("Internship Title: "+company.internshipTitle);
								System.out.println("Internship type: "+company.typeOfInternship);
								System.out.println("Intership paid: "+company.isPaid);
								System.out.println("Semester: "+company.semester);
							}
						}
					}
				}

			}
			System.out.println("\n");
				break;

			}


		}
		System.out.println("\nExiting...!");

	}

	private Student setStudentDetails(Student student) {

		in.nextLine();

		System.out.println("Enter Student Name:");
		String name = in.nextLine();

		System.out.println("Enter Student Email:");
		String email = in.nextLine();

		System.out.println("Enter Type of Internship:");
		String typeOfInternship = in.nextLine();

		System.out.println("Enter Student Semester:");
		String semester = in.nextLine();

		student.setStudent(name, email, typeOfInternship, semester);

		return student;
	}

	private Company setCompanyDetails(Company company) {

		in.nextLine();

		System.out.println("Enter Company Name:");
		String name = in.nextLine();

		System.out.println("Enter Company Number:");
		String number = in.nextLine();

		System.out.println("Enter Company Email:");
		String email = in.nextLine();

		System.out.println("Enter Internship Title:");
		String internshipTitle = in.nextLine();

		System.out.println("Enter Type of Internship:");
		String typeOfInternship = in.nextLine();

		System.out.println("Enter Semester Number: (1-8)");
		String semester = in.nextLine();

		System.out.println("Is Internship Paid (y/n):");
		String isPaid = in.nextLine();

		company.setCompany(name, number, email, internshipTitle, isPaid, typeOfInternship, semester);
		return company;
	}    
}
