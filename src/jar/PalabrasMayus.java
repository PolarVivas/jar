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

public class PalabrasMayus extends divi{

    private String a1;
    
    protected void info() {
		Scanner teclado = new Scanner(System.in);
		
			boolean bandera=false;
		do {
                    try {
			bandera= false;
                        a1=JOptionPane.showInputDialog(null, "Ingrese la palabra");					
			String cadena=a1;		
                       JOptionPane.showMessageDialog(null,"Palabra en MAYUSCULA: "+cadena.toUpperCase());
					}
        		catch (java.util.InputMismatchException e) {
                       JOptionPane.showInputDialog("Dame la palabra");
                       teclado.next();
                       bandera=true;
		
                    }
		catch(Exception e) {
                       bandera=true;
						}
		}while(bandera);
			

		}
    
}
