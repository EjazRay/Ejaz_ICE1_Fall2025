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
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           // c.setSuit("diamond");
            //c.setValue(1);
            c.setValue(rnd.nextInt(1,14));
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(0,4)]);
            
            magicHand[i] = c;
            
            
        }
        
        for(Card c: magicHand){
            System.out.print(c.getSuit() + " ");
            System.out.println(c.getValue());
        }
        
        
        System.out.println("Enter the card value between 1 and 13");
        
        int userValue = inp.nextInt(); 
        inp.nextLine(); 
        
        System.out.println("Enter the card suit ");
        
        String userSuit = inp.nextLine();
        
        Card userC = new Card();
        userC.setValue(userValue);
        userC.setSuit(userSuit);
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        boolean isFound = false; 
        for(Card c:magicHand){
            
            if(userC.getSuit().equalsIgnoreCase(c.getSuit()) && userC.getValue() == c.getValue()){
                isFound = true;
                System.out.println("Its a match");
                break;
        }// end of if statement 
            
            
        }// end of for loop 
        
        if(!isFound){
                System.out.println("Better luck next time");
            }
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
