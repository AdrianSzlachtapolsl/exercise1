/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Adrian Szlachta
 * @version 1.0
 */
public class PalindromeException extends Exception {
    /**
     * 
     * @param info It is the text included informations about exception
     */
    public PalindromeException(String info){
        super(info);
    }
    
}
