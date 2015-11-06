/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeArea;
import javax.swing.*;
/**
 *
 * @author raha
 */

public class ComputeArea {
    public static void main(String args[]){
        String radius=JOptionPane.showInputDialog(null,"Lutfen bir radius(yaricap) girin:","Cember Hesaplanan",JOptionPane.QUESTION_MESSAGE);
        double area;
        int radus=Integer.parseInt(radius);
        area=radus*radus*3.14;
       
       
        JOptionPane.showMessageDialog(null,"area of circle equal to:"  +area);
        
        
        
    
    }
    
}
