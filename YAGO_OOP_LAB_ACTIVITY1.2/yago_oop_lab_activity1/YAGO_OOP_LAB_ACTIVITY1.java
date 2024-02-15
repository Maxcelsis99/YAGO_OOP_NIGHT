
package com.mycompany.yago_oop_lab_activity1;

import java.util.Scanner;

public class YAGO_OOP_LAB_ACTIVITY1 {

    public static void main(String[] args) {
      Scanner variable = new Scanner(System.in);
      
      System.out.print("Enter message to Ivana: ");
      String message = variable.nextLine();
      FindMisplacedCapitalization(message);
    }
    
    public static void FindMisplacedCapitalization(String message) {
      boolean misplaced = false;
      
      for(int m=1;m<message.length();m++){
          char currentChar = message.charAt(m);
          char beforeChar = message.charAt(m-1);
          
          if(Character.isUpperCase(currentChar)){
              if(!Character.isWhitespace(beforeChar)){
                  misplaced = true;
                  break;
              }
          }
      }
      if(misplaced){
          System.out.println("JEJE!");
      }else{
          System.out.println("uWu");
      }
    }
}
