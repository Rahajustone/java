/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example21;
import java.util.Scanner;
/**
 *
 * @author raha
 * self study
 * solution of many example from  introduction to java prog (7 edition )
 * Y Daniel Liang 
 */
public class Convert {
    public static void main(String args[])
    {
        System.out.println("1)option for usd to hongkong");
        System.out.println("2)option for usd to hongkong");
        System.out.println("choose one of the option to use:");
        Scanner resut=new Scanner(System.in);
        int result=resut.nextInt();
        if(result==1)
        {
          //function to find hong kong 
          System.out.println("Para miktari:");
          Scanner a=new Scanner(System.in);
          double b=a.nextDouble();
          double hongkong;
          hongkong=(b*7.807);
          System.out.println("Result:"+hongkong);
        }
        else if(result==2)
        {
            //function to find dollar 
          System.out.println("Para miktari giriniz:");
          Scanner a=new Scanner(System.in);
          double b=a.nextDouble();
          double hongkong;
          double dolar=b/(7.807);
          System.out.println("Result:"+dolar+"$");
        }
        else
        {
             System.out.println("wrong option choose one of them please");  
        }    
   }
}
