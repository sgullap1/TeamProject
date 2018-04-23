package teamproject; 

public class CompanyInternship {
 
     // main added to test the class
    public static void main(String [] args ) {
        
    }
    
    // The values are final, they will not change.
    private final String internshipTitle;
    private final String internshipType;
    private final boolean paidInternship;
    private final String internshipSemester;
    
    public CompanyInternship(
            String title, String type, boolean isPaid, String semester) {
        // Initialize the value for internshipTitle.
        internshipTitle = title;
        internshipType = type;
        paidInternship = isPaid;
        internshipSemester = semester;
        
    }
    
    public String getInternshipTitle() {
        // get intershipTitle
        return internshipTitle;
    }
     public String getInternshipType() {
        // get intershipType
        return internshipType;
    }
     public boolean isPaidInternship() {
        // get boolean
        return paidInternship;
    } 
    
    public String getInternshipSemester() {
        // get intershipSemester
        return internshipSemester;
    }
}
