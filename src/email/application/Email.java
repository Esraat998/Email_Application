package email.application;

import java.security.SecureRandom;
import java.util.*;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailbox_capacity = 500;
    private String alternative_mail;
    private String email;
    private String companySuffix = "company.com";
    
    //to generate name
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        
        
        //to return dept name
        this.department = setDepartment();
        
        
        //to generate random password
        this.password = RandomPassword(8);
        System.out.println("////////////////////////// *** EMAIL ADMINISTRATION *** ///////////////////////////");
        System.out.print("Your Password is: " + this.password + "\n");
        
        //to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department +"."+ companySuffix;
        
    }
    
    //set dept
    private String setDepartment(){
        System.out.println("////////////////////////// *** EMAIL ADMINISTRATION *** ///////////////////////////");
        System.out.print("New Worker: " + firstname +", Department Codes:\n1 For sales\n2 for developmet\n3 for accounting \n0 for none\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int deptchoice = sc.nextInt();
        System.out.println();
        if(deptchoice == 1) return "sales";
        else if(deptchoice == 2) return "devs";
        else if(deptchoice == 3) return "accounts";
        else return "";
    }
    
    //set randompass
    private String RandomPassword(int length){
        String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            int randomIndex = random.nextInt(pass.length());
            sb.append(pass.charAt(randomIndex));
        }
        
        return sb.toString();  
    }
    
    //set mailbox capacity 
    public void setMailbox_capacity(int capacity){
        this.mailbox_capacity = capacity;
    }
    
    //set the alternate email
    public void setAlternative_mail(String altEmail){
        this.alternative_mail = altEmail;
    }
    
    //change the password
    public void setchangePassword(String password){
        this.password = password;
    }
    
    public int getMailbox_capacity(){ return mailbox_capacity; }
    
    public String getAlternate_mail(){ return alternative_mail; }
    public String getchangePassword(){ return password; }
    
    public String show_info(){
        return "DISPLAY NAME: " + firstname + " " + lastname + 
               "\nCOMPANY EMAIL: " + email +
               "\nMAILBOX CAPACITY: " + mailbox_capacity + "mb";
    }
}
