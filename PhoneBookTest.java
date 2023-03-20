// Joanne To
// 02/01/2023
// CS&145
// Assignment #1: Phone Book
//
// This program allows the user to input contacts into a phonebook, as well as
// delete contacts, search for contacts, or print the phonebook.
//
// For extra credit I used switch case.

import java.util.*;
import java.io.*;


public class PhoneBookTest {
   public static void main(String[] args) throws IOException{
      phoneBookNode list = new phoneBookNode();
      phoneBookManager Bellingham = new phoneBookManager();
            
      Bellingham.add(new phoneBookNode("Catherine", "Pinchas", "catherinePins@gmail.com", "5149625793", "Dublin"));
      Bellingham.add(new phoneBookNode("Isabella", "Hallie", "bellHall@yahoo.com", "964852189", "Montevideo"));
      Bellingham.add(new phoneBookNode("Erin", "Aco", "acoacoerin@gmail.com", "5935821796", "Split"));
      Bellingham.add(new phoneBookNode("Nenad", "Ada", "nenadada@gmail.com", "2920158930", "Cairo"));
      
      Scanner input = new Scanner(System.in);
      
      int menu = 0;  
          
      while(menu != 5) { //menu options
         System.out.println();
         System.out.println("[1] Add new contact ");
         System.out.println("[2] Delete contact ");
         System.out.println("[3] Search contact ");
         System.out.println("[4] Print contact list ");
         System.out.println("[5] Exit ");
         System.out.print("Please select your choice: ");
         String choice = input.nextLine();
         System.out.println();
         menu = Integer.parseInt(choice);

         switch (menu) {
            case 1: //adds new contact
               System.out.print("Please enter First Name: ");
               String firstName = input.nextLine();
            
               System.out.print("Please enter Last Name: ");
               String lastName = input.nextLine();
            
               System.out.print("Please enter E-mail Address: ");
               String email = input.nextLine();
            
               System.out.print("Please enter Phone Number: ");
               String phoneNum = input.nextLine();
            
               System.out.print("Please enter City: ");
               String city = input.nextLine();
         
               phoneBookNode contactNode = new phoneBookNode(firstName, lastName, email, phoneNum, city);
               Bellingham.add(contactNode);
               break;
      
            case 2: //deletes contact
               System.out.print("Please enter Last Name: ");
               String toDelete = input.nextLine();
               Bellingham.delete(toDelete);
               break;
            
            case 3: //search for contact
               System.out.print("Please enter Last Name: ");
               String toSearch = input.nextLine();
               Bellingham.search(toSearch);
               break;
            
            case 4: //prints phonebook
               System.out.println("Printing Phonebook: ");
               System.out.println();
               Bellingham.print();
               break;
            
            case 5: //exits program
               System.out.println("Thank you for using this program.");
               break;
            
            default: //invaild option
               System.out.println("Invaild option, please try again.");
               break;
         } //end of switch case
      } //end of while 
      
   } //end of main method
      
} //end of PhoneBookTest class