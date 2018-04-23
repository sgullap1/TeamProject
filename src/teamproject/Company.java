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
public class Company {
    //Instance variables
	private String name;
	private String email;
	private String contactName;
        
        //default constructor
        public Company()
        {
            //fill in the code to set default values to the instance variables
            name="";
            email="";
            contactName="";
            
        }
                //Constructor initializing instance variables with arguments
	public Company(String n, String e, String cn)
	{
            name=n;
            email=e;
            contactName=cn;
            
        }
        public void setName(String n)
	{
            name=n;
	}
        public void setemail(String e)
	{
            email=e;
	}
         public void setcontactName(String cn)
	{
            contactName=cn;
	}
        public String getName()
	{
            return name;
	}
        public String geteamil()
	{
            return email;
	}
        public String getcontactName()
	{
            return contactName;
	}
        public String getOfferedInternships()
        {
            return
        }
	
}//end Class

	
	


    

