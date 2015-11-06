/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter35;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * *lotary game
 * @author raha
 */
public class GuessLotary {
   public static void main(String args[])
   {
       while(true){
       int lottary=(int)(Math.random()*100);
       //System.out.println("Lutfen bir sayi giriniz:");
       //Scanner input=new Scanner(System.in);
       String input=JOptionPane.showInputDialog("Bir sayi girniz");
       int guess=Integer.parseInt(input);
       if(guess==lottary)
       {
           //System.out.println("Buldunuz 1000$");
           JOptionPane.showMessageDialog(null,"Kazandniz 1000$");
       }
       else{
           
           //System.out.println("Sorry, no match");
           JOptionPane.showMessageDialog(null,"kazanmadiniz");
       }
       //System.out.println("Bulmaniz gereken rakam:"+lottary);
   }
   }
    
}
