
public class counter {

    private String emailPrefix = "testuser";
    private String emailPostfix = "@example.com";
    private int counter = 1;  // Starts at 1 for unique emails

    public String generateUniqueEmail() {
        String uniqueEmail = emailPrefix + counter + emailPostfix;
        counter++; // Increment counter after generating the email
        return uniqueEmail;
    }
    
    public static void main(String[] args) {
    	counter counter=new counter();
    	String email1=counter.generateUniqueEmail();
    	String email2=counter.generateUniqueEmail();
    	System.out.println(email1);
    	System.out.println(email2);
	}
}
