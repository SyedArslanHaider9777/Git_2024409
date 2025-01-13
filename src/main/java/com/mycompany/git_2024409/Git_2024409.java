/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.git_2024409;

import java.util.Scanner;

/**
 *
 * @author Arslan Shah
 */
public class Git_2024409 {

    public static void main(String[] args) {
        System.out.println("Syed Arslan Haider-2024409");
        Scanner myKB = new Scanner (System.in);
//        The variable 'movieName' is a string used to store name of movie enter by user
        String movieName;
        int userAge;
        
//        Prompt for asking user thier favourate movie name
        System.out.println("Please enter the name of your favourite movie");
        
//        Store the user input into variable "moviename"
        movieName = myKB.nextLine();
        
//        Display the length of moviename enter by user
        System.out.println("Your movie name has : " + movieName.length()+" characters");
        
//        It Use to check if movie name has "Star" word in it or not
        if (!movieName.contains("Star")){
            
//        Tell the user that movie name does not contain 'Star'
            System.out.println("Your favourate movie: "+ movieName + " does not have 'Star' in its title");
          }
        else
        {
//        Tell the user that movie name contain 'Star'
            System.out.println("Your favourate movie: "+ movieName +" contain 'Star' in its title");
        }
    
        //POSSIBLE IMPROVEMENT 1 -- Can you improve the decision below? If yes --> How?
        // Change the code to show your improvement, but make sure the functionality is EXACTLY THE SAME !
        
        
        char firstLetter = Character.toUpperCase(movieName.charAt(0));
        
//      I don't use switch because if i use switch function i have to break it and thats not good

//      If first letter of movie is "X"
        if (firstLetter == 'X') {
             System.out.println("That is probably an X-Men movie");
             
//      If first letter of movie is "Z"     
       }else if (firstLetter == 'Z') {
             System.out.println("Interesting...is that a Zombie movie? Or Zoolander?");
             
//      If first letter of movie is "k"       
       }  else if (firstLetter == 'K') {
             System.out.println("I can't think of many movies that start with a K");
             
//      If user put any other First word then       
       } else {
    System.out.println("Your movie has a unique first letter");
}
        ///END OF POSSIBLE IMPROVEMENT 1
        
        
        try{
//           prompt for user to enter their age
            System.out.println("How old are you?");
            userAge = myKB.nextInt();
            
            //POSSIBLE IMPROVEMENT 2-- Can you improve the decision below? If yes --> How?
        // Change the code to show your improvement, but make sure the functionality is EXACTLY THE SAME !
        
//        I change the squence of code to make more efficent and smaller
            if (userAge >= 120){
                
                System.out.println("You have reached an amazing age!");
                
            }
            else if (userAge >= 50){
                
                System.out.println("You are still young ");
                
            }
            else if (userAge > 0){
                
                 System.out.println("You are in the prime age of your life");
            }
            else {
                
                System.out.println("Please enter a positive number!");
                
            }
            //End of Possible Improvement 2
            
        }catch(Exception e){
//            Change the output error to be more user friendly in case of error
            System.out.println("please enter a valid number");
        }

}
        
    }
    
}
