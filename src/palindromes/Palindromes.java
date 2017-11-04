/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromes;
import exceptions.PalindromeException;
import models.Palindrome;

/**
 *
 * @author Adrian Szlachta
 * @version 1.0
 */
public class Palindromes {

    /**
     * 
     * @param args Contains all the words of the entered sentence in the form of a string array
     */
    public static void main(String[] args) {
        Palindrome text=new Palindrome(args);
        try{
            if(text.showfinalresult()){
                System.out.println("This is palindrome");
            }else{
                System.out.println("This is not palindrome");
            }
        } catch(PalindromeException ex){
            System.out.println(ex);
        }


    }
    
    
}
