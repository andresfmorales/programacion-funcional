package org.example.classes;

import java.util.List;

public class MutableObj {

   private String firstName;
   private String lastName;
   private List<String> hobbies;

   public MutableObj(String firstName, String lastName, List<String> hobbies) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.hobbies = hobbies;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public List<String> getHobbies() {
      return hobbies;
   }

   public void setHobbies(List<String> hobbies) {
      this.hobbies = hobbies;
   }

   @Override
   public String toString() {
      return "{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", hobbies=" + hobbies +
              '}';
   }
}
