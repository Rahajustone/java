/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovertotouppercase;

/**
 *
 * @author raha
 */
public class Lowertouppercase {
   public static void main(String args[])
   {
       char aa='a';
       int b=(int) aa ;
      
       int offset='a'-'A';
       
       for(int i=0;i<26;i++)
       {
           char character=(char)b; 
           char uppercase=(char) (b-offset);
           System.out.println("characterler:"+character+" uppercase:"+uppercase);
           b++;
       }
      
   }
    
}
