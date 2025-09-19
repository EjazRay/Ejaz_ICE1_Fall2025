/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * Modifier: Ejaz Rayman
 * Student Number: 991809346
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner inp = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        
        // This loop generates a card object and randomly assigns an integer value and a suit 
        //iterates over the magicHand array
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
         
            c.setValue(rnd.nextInt(1,14));
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(0,4)]);
            
            //each object is added to the array in the index value of i
            magicHand[i] = c;
            
            
        }
        
        //This loop displays the Card objects values and suit that are in the magicHand array 
        
        for(Card c: magicHand){
            System.out.print(c.getSuit() + " ");
            System.out.println(c.getValue());
        }
        
        //prompts the user to eneter a value
        System.out.println("Enter the card value between 1 and 13");
        
        // saves value to this variable below 
        int userValue = inp.nextInt(); 
        inp.nextLine(); // used to clear the input. 
        
        
        //Prompt user for suit
        System.out.println("Enter the card suit ");
        
        // saves value to variable 
        String userSuit = inp.nextLine();
        
        // create Card object for user and sets the value and suit
        Card userC = new Card();
        userC.setValue(userValue);
        userC.setSuit(userSuit);
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        
        //boolean set to false. Will be used to determine if the user Card is in the array 
        boolean isFound = false; 
        
        //loop will iterate over the array and check each object
        for(Card c:magicHand){
            
            // check condition for the user suit and value. 
            if(userC.getSuit().equalsIgnoreCase(c.getSuit()) && userC.getValue() == c.getValue()){
                //if the condition is true, it changes the boolean flag to true
                isFound = true;
                System.out.println("Its a match"); // message is printed 
                break; // break from the for loop 
        }// end of if statement 
            
            
        }// end of for loop 
        
        // if there is no match the flag remains false and the message prints 
        if(!isFound){
                System.out.println("Better luck next time");
            }
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
