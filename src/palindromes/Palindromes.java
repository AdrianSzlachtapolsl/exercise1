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
public class Palindromes {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Palindrome text=new Palindrome(args);
        Palindromes result= new Palindromes();
        System.out.println(result.thisIsPalindrome(text));


    }
    /**
     * 
     * @param text object from to check
     * @return string with result information
     */
    public String thisIsPalindrome(PalindromeInterface text){
        if(text.showfinalresult()){
            return "This is palindrome";
        }else{
            return "This is not palindrome";
        }
    }
    
}
