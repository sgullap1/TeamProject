/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

/**
 *
 * @author sindh
 */
public class Student {
    //Instance variables
	private String name;
	private String email;
	private String internshipType;
        private String internshipSemester;
         
        //default constructor
        public Student()
        {
            //fill in the code to set default values to the instance variables
            name="";
            email="";
            internshipType="";
            internshipSemester="";
            
        }
                //Constructor initializing instance variables with arguments
	public Student(String n, String e, String it,String is)
	{
            name=n;
            email=e;
            internshipType=it;
            internshipSemester=is;
            
        }
        public void setName(String n)
	{
            name=n;
	}
        public void setEmail(String e)
	{
            email=e;
	}
         public void setInternshipType(String it)
	{
            internshipType=it;
	}
          public void setInternshipSemester(String is)
	{
            internshipSemester=is;
	}
        public String getName()
	{
            return name;
	}
        public String getEmail()
	{
            return email;
	}
        public String getInternshipType()
	{
            return internshipType;
	}
        public String getInternshipSemester()
        {
            return internshipSemester;
        }
        
	
}//end Class
