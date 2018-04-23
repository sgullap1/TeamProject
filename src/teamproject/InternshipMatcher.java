/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;


import java.util.ArrayList;

public class InternshipMatcher {
    ArrayList<Company> companies;
    ArrayList<Student> students;
    ArrayList<String> internshipTypes;
    
    public InternshipMatcher() {
        companies = new ArrayList<Company>();
        students = new ArrayList<Student>();
        internshipTypes = new ArrayList<String>();
        
        this.addExistingCompanies();
    }
    
    private void addExistingCompanies() {
        ArrayList<Company> companies = new ArrayList<>();
        companies.add(new Company(
            "Google",
            "Jack Sullivan",
            "JSullivan@google.com",
            new CompanyInternship(
                "Information Technology Intern",
                "Programming",
                /* paid = */ true,
                "Fall 2018")));
            
         companies.add(new Company(
            "Apple",
            "Allie Smith",
            "ASmith3@apple.com",
            new CompanyInternship(
                "Software Engineering  Intern: Core iOS",
                "Software Engineering",
                /* paid = */ false,
                "Summer 2018")));
                
         companies.add(new Company(
            "Microsoft",
            "James Matthews",
            "JXMatthews@microsoft.com",
            new CompanyInternship(
                "Web & Content Development",
                "Web Development",
                /* paid = */ true,
                "Spring 2019")));
                
         companies.add(new Company(
            "Microsoft",
            "John Lawrence",
            "JXLawrence@microsoft.com",
            new CompanyInternship(
                "Database Internship",
                "Database",
                /* paid = */ false,
                "Fall 2018" )));
                
         companies.add(new Company(
            "Scratch",
            "Susan Taft",
            "STaft@scratch.mit.edu",
            new CompanyInternship(
                "Video & Graphic Developer",
                "Video Developer",
                /* paid = */ true,
                "Spring 2019")));
                
         companies.add(new Company(
            "Scratch",
            "Carrie Martin",
            "CXMartin@scratch.mit.edu",
            new CompanyInternship(
                "Web Developer",
                "Web Development",
                /* paid = */ false,
                "Fall 2018")));

         companies.add(new Company(
            "Google",
            "Phillip Young",
            "PHYoung@google.com",
            new CompanyInternship(
                "Product Design",
                "Programming",
                /* paid = */ false,
                "Summer 2018")));

         companies.add(new Company(
            "Apple",
            "Lisa Pope",
            "LPopeX@hp@apple.com",
            new CompanyInternship(
                "Product Design",
                "Programming",
                /* paid = */ false,
                "Summer 2018")));

         companies.add(new Company(
            "Samsung",
            "Avery Ryan",
            "ARyan@samsung.com",
            new CompanyInternship(
                "Software Engineering/ Co-Op",
                "Programming",
                /* paid = */ true,
                "Spring 2019")));
      
         companies.add(new Company(
            "Samsung",
            "Michelle Boseman",
            "Mboseman@samsung.com",
            new CompanyInternship(
                "IT/ Computer Systems Intern",
                "Computer Systems",
                /* paid = */ false,
                "Summer 2018")));
    }
    
    public void addCompany(Company c){
        this.companies.add(c);
    }
    
    public void removeCompany(Company c) {
        this.companies.remove(c);
    }
    
    public void addStudent(Student s) {
        this.students.add(s);
    }
    
    public void removeStudent(Student s) {
        this.students.remove(s);
    }
    
    public ArrayList<Company> getAllCompanies() {
        return this.companies;
    }
    
    public ArrayList<Student> getAllStudents() {
        return this.students;
    }
    
    public ArrayList<String> getAllInternships() {
        return this.internshipTypes;
    }
    
    public ArrayList<Company> getCompanyMatchesByStudent(Student s) {
        ArrayList<Company> matchingCompanies = new ArrayList<Company>();
        
        for (int i = 0; i < this.companies.size(); i++) {
            if (this.companies.get(i).checkInternshipOffered(s.getSemesterForIntership())) {
                matchingCompanies.add(this.companies.get(i));
            }
        }
        
        return matchingCompanies;
    }
}
