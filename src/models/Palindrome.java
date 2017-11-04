/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import exceptions.PalindromeException;

/**
 *
 * @author Adrian Szlachta
 * @version 1.0
 */
public class Palindrome {
    private final String[] textPalindrome;
    private String joinedTextPalindrome;
    
    /**
    * The constructor deletes the textPalindrome and retrieves array of arguments.
    * @param arguments Contains all the words of the entered sentence in the form of a string array.
    */
    public Palindrome(String[] arguments){
        this.textPalindrome=arguments;
        this.joinedTextPalindrome="";
    }
    /**
     * Joins the texts contained in array textPalindrome and save in joinedTextPalindrome.
     */
    private void createString(){
        for(int i=0;i<this.textPalindrome.length;i++){
            this.joinedTextPalindrome=this.joinedTextPalindrome.concat(this.textPalindrome[i]);
        }
    }
    
    /**
     * Checks whether the combined words are palindromes.
     * @return return true when joinedTextPalindrome have the same characters from front and back or otherwise false.
     */
    private boolean checkString(){
        createString();
        char[] charsJoinedString=this.joinedTextPalindrome.toCharArray();
        int lengthString=charsJoinedString.length-1;
        for(int i=0;i<charsJoinedString.length;i++){
            if(charsJoinedString[i]!=charsJoinedString[lengthString]){
                return false;
            }
            lengthString--;
        }
        return true;
        
    }
    /**
     * Checked result method checkString and if length of the string is equals 0 then throw exception. 
     * @return Return true or false. If string is palindrome return true otherwise false. 
     * @throws PalindromeException An exception occurs when the length of the string is equal to 0
     */
    public boolean showfinalresult() throws PalindromeException{
         if((checkString()==true)){
            if(this.joinedTextPalindrome.length()==0){
                throw new PalindromeException("This text is too short");
            }else{
            return true;
            }
        }else{
            return false;
        }
    }

   
}
