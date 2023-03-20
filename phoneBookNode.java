

public class phoneBookNode {
   private String firstName;
   private String lastName;
   private String email;
   private String phoneNum;
   private String city;
   protected phoneBookNode next;
   
   //constructor
   public phoneBookNode (String firstName, String lastName, String email,
                         String phoneNum, String city) {
      this.lastName = lastName;
      this.firstName = firstName;
      this.email = email;
      this.phoneNum = phoneNum;
      this.city = city;
      this.next = null;
   }

   
   public phoneBookNode () { //makes empty list
      next = null;
   }


   public String getFirstName() {
      return firstName;
   }
   
   
   public String getLastName() {
      return lastName;
   }
   
   
   public String getEmail() {
      return email;
   }

   
   public String getPhoneNum() {
      return phoneNum;
   }
   
   
   public String getCity() {
      return city;
   }


   public String toString() {
      return "Name: " + firstName + " " + lastName + "\nEmail: " + email + "\nPhone Number: " + phoneNum + "\nCity: " + city;
   }
} //end of class