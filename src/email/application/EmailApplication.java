package email.application;

public class EmailApplication {
    
    public static void main(String[] args) {
        Email em = new Email("John", "Smith");
        System.out.println(em.show_info());
        em.setAlternative_mail("js@gmail.com");
        System.out.println("Your Alternate Email is: "+em.getAlternate_mail());
    }
    
}
