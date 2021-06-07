
package jar;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author jvivas
 */
public class principal {
    
        protected void info() {
			Scanner teclado = new Scanner(System.in);
			JOptionPane.showMessageDialog(null,"Bienvenido\nSeleccione una opción ");
			
			String Resp ;
			int opc = 0; 
			boolean bandera=false;
			
	do {//ES PARA LOS ERRORES
				try {
            do {///ES PARA LA OPCION
                                        
          String eleccion=JOptionPane.showInputDialog("Cual de las opciones desea realizar"
                  + "\nSeleccione una opción "
                  + "\n1.Dividir dos Numeros"
                  + "\n2.Convertir una palabra en Mayusculas");
                                        
            opc = Integer.parseInt(eleccion);
				
		switch(opc) {
				  
		case 1:
                    divi obj=new divi();
                    obj.info();
						
                    break;
					
                case 2:
                    PalabrasMayus obj2=new  PalabrasMayus();
                    obj2.info();
					
                    break;
		
                default:
                    JOptionPane.showMessageDialog(null,"Opción inválida");
		
                break;
                    
                }
				
                    Resp=JOptionPane.showInputDialog("Desea seleccionar de nuevo","si o no");
				
               }while(Resp.equalsIgnoreCase("si"));
                        
                    JOptionPane.showMessageDialog(null,"Grasias por utilizar el programa");
			
                  }
             catch(java.util.InputMismatchException e) {
				
                    JOptionPane.showInputDialog("Ingresa un numero de la opcion ");
                        teclado.next();
                        bandera=true;
				}
				
            catch(Exception e) {
                        teclado.next();
			bandera=true;
				}

            }while(bandera);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        principal obj3=new principal();
        obj3.info();
    }
    
}
