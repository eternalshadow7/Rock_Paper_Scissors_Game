// Janelynn Camingue
// 1/17/17

// This program lets the user play a game of Rock-Paper-Scissors with the computer. 
// The program reads in an input from the user (1, 2, or 3), which are declared as rock,
// paper, and scissors, and then compares that with the computer's computer_input, which is 
// randomly generated with the Math.random().

import java.util.Scanner;

class Rock_Paper_Scissors{
   
   public static void main(String[] args){
      int user_input;
	  int computer_input;
	 
      Scanner sc = new Scanner(System.in);
// using Math.random to generate a random number between 1 and 3.      
// 1 is rock
// 2 is paper
// 3 is scissors    
      computer_input =1+ (int)(Math.random()*3);
	  
// prints out the instructions
      System.out.println("Let's play Rock-Paper-Scissors!") ;
	  System.out.println("Type 1 for R, 2 for P, 3 for S and press ENTER");
	
// Cpmpares the user's input with the computer's input to see if there is a tie or a winner
	  
      user_input = sc.nextInt();
// if the user plays rock
      if (user_input==1 && computer_input==1) {
          System.out.println("You and I played rock.");
		  System.out.println("It's a tie.");
      }else if (user_input==1 && computer_input==2) {
          System.out.println("My paper beat your rock!");
		  
	  }else if(user_input==1 && computer_input==3){
         System.out.println("Your rock beat my scissors.");
		 
// if the user plays paper		 
      }else if( user_input==2 && computer_input==1){
		   System.out.println("Your paper beat my rock.");
	  }else if(user_input==2 && computer_input==2){
		   System.out.println("You and I played paper.");
		   System.out.println("It's a tie.");
	  }else if(user_input==2 && computer_input==3){
		   System.out.println("My scissors beat your paper!");
		   
// if the user plays scissors		   
	  }else if(user_input==3 && computer_input == 1){
		   System.out.println("My rock beat your scissors!");
	  }else if (user_input==3 && computer_input ==2){
		   System.out.println("Your scissors beat my paper.");
	  }else if(user_input==3 && computer_input ==3){
		   System.out.println("You and I played scissors.");
		   System.out.println("It's a tie.");
	   }


}
}

