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

        String movieName;
        int userAge;
        
//        Prompt for asking user thier favourate movie name
        System.out.println("Please enter the name of your favourite movie");
        
//        Store the user input into variable "moviename"
        movieName = myKB.nextLine();
        
//        Display the length of moviename enter by user
        System.out.println("Your movie name has : " + movieName.length()+" characters");
        
        }

}