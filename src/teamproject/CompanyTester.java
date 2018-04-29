public class CompanyTester {

    // Test Company in there
    public static void main(String [] args ) {
        // Create a Company Internship
        CompanyInternship internship = new CompanyInternship(
            "Information Technology Intern",
            "Programming",
            /* paid = */ true,
            "Summer 2018");
        
        // Create a new Company with the company internship and print
        Company company = Company.getNewCompany(
            "Google",
            "Jack Sullivan",
            "JSullivan@google.com",
            internship);
        System.out.println("Company initially");
        printCompany(company);
        
        // Set a new company name and print
        company.setCompanyName("Alphabet");
        System.out.println("Company new name: " + company.getCompanyName());
        
        // Set a new Contact name and print
        company.setContactName("Jack Dawson");
        System.out.println("Company new name: " + company.getContactName());

        // Set a new concact email and print
        company.setContactEmail("abc-contact@google.com");
        System.out.println("Company new contact email: " 
            + company.getContactEmail());

        // Create a new internship
        CompanyInternship otherInternship = new CompanyInternship(
            "Software Engineer Intern: Mountain View",
            "Programming",
            /* paid = */ true,
            "Fall 2018");
        
        // Add the new internship to the company, remove the first internship 
        // and print
        company.addInternship(otherInternship);
        company.removeInternship(internship.getInternshipTitle());
        System.out.println("Final state of the company");
        
    }
    
    // Shows company attributes for test
    private static void printCompany(Company company) {
        System.out.println("Company");
        System.out.println("Company name: " + company.getCompanyName());
        System.out.println("Contact name: " + company.getContactName());
        System.out.println("Contact email: " + company.getContactEmail());
        System.out.println("Internships:");
        for (CompanyInternship internship : company.getOfferedInternships()) {
            printInternship(internship);
        }
    }
    
    // Shows CompanyInternship attributes for test
    private static void printInternship(CompanyInternship internship) {
        System.out.println("Internship");
        System.out.println("Internship title: " + internship.getInternshipTitle());
        System.out.println("Internship type: " + internship.getInternshipType());
        System.out.println("Paid intership: " + internship.isPaidInternship());
        System.out.println("Semester: " + internship.getInternshipSemester());
    }
}