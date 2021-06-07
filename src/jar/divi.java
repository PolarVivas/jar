/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jar;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jvivas
 */
public class divi extends principal{
    protected double numero1;
    protected double numero2;
    
    
    protected void info(){
       Scanner num = new Scanner(System.in);
       boolean bandera=false;
		
	do {
            try {
                    bandera= false;
                    numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero"));
                   
			
                    numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa un segundo numero"));
                   
                    double div = 0;
                    if(numero1 > 0 && numero2>0) {
                    div=numero1/numero2;
		    	JOptionPane.showMessageDialog(null," El resultado de la division es: "+div);
		    	
			}
			else {
                             if(numero1<numero2)
				JOptionPane.showMessageDialog(null," Ingrese el numero con el que se va a dividir ");
                                	    
			else {
                                 
                            if(numero1==0 && numero2==0)
					JOptionPane.showMessageDialog(null," Ingrese un numero que no sea 0");
                                 	    
				
						}
				}	
			}
			catch (java.util.InputMismatchException e) {
                            JOptionPane.showInputDialog("Dame un numero");
                               
				num.next();
				bandera=true;
			}
			
			catch(Exception e) {
                            bandera=true;
					}
	}while(bandera);
		

	
	
    }
    
}
