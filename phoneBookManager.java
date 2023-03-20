

public class phoneBookManager extends PhoneBookTest { 
   private phoneBookNode start;
 
   
   public phoneBookManager() { //creates empty node
      start = null;
   }


   public void add (phoneBookNode node) { //adds contact to phonebook
      phoneBookNode current;
      
      if (start == null) {
         start = node;
      } else {
         boolean found = false;
         current = start;
         while(current != null && found == false) {
            if (current.next == null) {
               current.next = node;
               found = true;
            } else {
               current = current.next;
            }
         }
      System.out.println("\nContact has successfully been added.");
      }
   } //end of add method


   public void delete (String toDelete) { //deletes contact from phonebook
      phoneBookNode current;
      boolean search = false;
      
      if (start == null) {
         System.out.println("\nThere are no contacts to delete.");
      } else if (start.getLastName().equalsIgnoreCase(toDelete)) {
         System.out.println("\n" + start.getLastName() + " has been successfully deleted.");
         start = start.next;
      } else {
         current = start;
         while(current != null && current.next != null && search == false) {
            if (current.next.getLastName().equalsIgnoreCase(toDelete)) {
               System.out.println("\n" + current.next.getLastName() + " has been successfully deleted.");
               current.next = current.next.next;
               search = true;
            } else {
               current = current.next;
            }
         }
            if (!search) {
               System.out.println("\n" + toDelete + " could not be found.");
            }
      }
   } //end of delete method


   public void search (String toSearch) { //searches for contact in phonebook
      phoneBookNode current;
      boolean search = false;
      
      if (start == null) {
         System.out.print("\nThere are no contacts to search for.");
      } else if (start.getLastName().equalsIgnoreCase(toSearch)) {
         System.out.println("\n" + start.getLastName() + " has successfully been found.");
      } else {
         current = start;
         while (current != null && search == false) {
            if (current.getLastName().equalsIgnoreCase(toSearch)) {
               System.out.println("\n" + current.getLastName() + " has successfully been found.");
               search = true;
            } else {
               current = current.next;
            }
         }   
         if (search == false) {
            System.out.println("\n" + toSearch + " could not be found.");
         }
      }
   } //end of search method


   public void print() { //prints current phonebook
      phoneBookNode current;
      
      if (start == null) {
         System.out.print("There are no contacts to print.");
      } else {
         current = start;
         while (current != null) {
            System.out.println(current.toString());
            System.out.println();
            current = current.next;
         }      
      }
   } //end of print method

} //end of class