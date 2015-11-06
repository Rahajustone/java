/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example22;
import javax.swing.*;

/**
 *
 * @author raha
 * solution of many example from  introduction to java prog (7 edition )
 * Y Daniel Liang 
 */
public class Computevalueofsilinder {
    public static void main(String args[])
    {
        String input=JOptionPane.showInputDialog("yaricap girin:");
        String input2=JOptionPane.showInputDialog("length of cilinder girin:");
        double radius=Double.parseDouble(input);
        double length=Double.parseDouble(input2);
        double area=radius*radius*3.14;
        double volume=area*length;
        JOptionPane.showMessageDialog(null,"volume of cylinder is:"+volume,"Volume of silinder hesaplanan program",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
