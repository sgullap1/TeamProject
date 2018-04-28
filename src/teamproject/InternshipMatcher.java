// Class:       IT5413
// Term:        Spring 2018
// Name:        Tamar McDowell
// Instructor:  Dr. Lynda Brown
// Assignment:  Group Project

package teamproject;


import java.util.ArrayList;
import java.util.HashSet;

public class InternshipMatcher {

    //list of internships and companies maintained here
    public ArrayList<String> intershipTypes;
    private ArrayList<Company> companies = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    
    //adding a company
    public void addCompany(Company c) {
        getAllCompanies().add(c);
    }
    //removing a company
    public void removeCompany(Company c) {
        getAllCompanies().remove(c);
    }
    //adding a students
    public void addStudent(Student s) {
        getAllStudents().add(s);
    }
    //removing a student
    public void removeStudent(Student s) {
        getAllStudents().remove(s);
    }

    public ArrayList<Company> getAllCompanies() {
        return companies;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public ArrayList<String> getAllInterships() {
        intershipTypes = new ArrayList<String>();
        for (Company com : getAllCompanies()) {
            //System.out.println(com);
            for (CompanyInternship intern : com.getOfferedInternships()) {
                intershipTypes.add(intern.getInternshipType());
            }
        }
        return removeDuplicates(intershipTypes);
    }

    private ArrayList<String> removeDuplicates(ArrayList<String> list) {
        // Store unique items in result.
        ArrayList<String> result = new ArrayList<>();

        // Record encountered Strings in HashSet.
        HashSet<String> set = new HashSet<>();

        // Loop over argument list.
        for (String item : list) {

            // If String is not in set, add it to the list and the set.
            if (!set.contains(item)) {
                result.add(item);
                set.add(item);
            }
        }
        return result;
    }
    //check list and get student that matches intern
    public ArrayList<String> getStudentsPerIntershipType(String s) {
        ArrayList<String> intStu = new ArrayList<String>();
        for (Student stu : getAllStudents()) {
            if (stu.getInternShipType().equalsIgnoreCase(s)) {
                intStu.add(stu.getName());
            }
        }
        return intStu;
    }
    //check list and get company that matches student
    public ArrayList<String> getCompanyMatchesByStudents(Student s) {
        ArrayList<String> stuCom = new ArrayList<String>();
        for (Company com : getAllCompanies()) {
            for (CompanyInternship intern : com.getOfferedInternships()) {
                if (intern.getInternshipType().equalsIgnoreCase(s.getInternShipType())) {
                    stuCom.add(com.getName());
                }
            }

        }
        return stuCom;
    }
}

