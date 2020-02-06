/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainfall;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author saleh
 */

public class RainFall
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String year;
        int y;
        String month;
        int m=0;
        int average;
        int totalinch=0;
        year=JOptionPane.showInputDialog(null,"ENTER YEAR: ");
        y=Integer.parseInt(year);
        System.out.println("Year: "+year);
        if(y>=1)
        {
            month=JOptionPane.showInputDialog(null,"ENTER Month: ");
            m=Integer.parseInt(month);
            System.out.println("Month: "+month);
            if(m>0&&m<=12)
            {
                for(int i=0;i<y;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        String inch=JOptionPane.showInputDialog(null,"ENTER INCH: ");
                        int in=Integer.parseInt(inch);
                        System.out.println("Inch: "+inch);
                        if(in>=1)
                        {
                            totalinch=totalinch+in;
                        }
                        else
                        {
                            System.out.println("Invalid Inch ");
                        }
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        average=totalinch/m;
        JOptionPane.showMessageDialog(null, "Year: "+y);
        JOptionPane.showMessageDialog(null, "Month: "+m);
        JOptionPane.showMessageDialog(null, "Total Inches: "+totalinch);
        JOptionPane.showMessageDialog(null, "Average RainFall: "+average);
        //JOptionPane.showMessageDialog(null, "Year: "+year,"Month: "+month,"Inch: "+totalinch);
        // TODO code application logic here
    }
}
