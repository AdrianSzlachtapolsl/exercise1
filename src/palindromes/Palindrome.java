/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromes;
/**
 *
 * @author Adrian Szlachta
 * @version 1.0;
 */
interface PalindromeInterface{
    /**
     * 
     *  @return return false when text is null and text is not palindrome. 
     */
    public boolean showfinalresult();
}

/**
 *
 * @author Adrian Szlachta
 * @version 1.0;
 * 
 */

class Palindrome implements PalindromeInterface{
    /**
     * @textPalindrome array of string entered by the user
     * @joinedTextPalindrome combined texts from array textPalindrome
     */
    private String[] textPalindrome;
    private String joinedTextPalindrome;
    
    /**
    * The constructor deletes the textPalindrome and retrieves array of arguments.
    * 
    */
    Palindrome(String[] arguments){
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
     * @charsJoinedString chars array  with contain joinedTextPalindrome
     * @lengthString joinedTextPalindrome text length
     * @return return true when joinedTextPalindrome have the same characters from front and back or otherwise false
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
     * 
     * @return return false when text is null and text is not palindrome. 
     */
    
    public boolean showfinalresult(){
        if((checkString()==true)&&(this.joinedTextPalindrome.length()>0)){
            return true;
        }else{
            return false;
        }
    }
    
}

