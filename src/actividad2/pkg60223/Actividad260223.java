/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2.pkg60223;
import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Actividad260223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introducir un día de la semana: ") ;   
        
        String día = input.nextLine();
     
        switch (día){
            case "lunes": 
               System.out.print("Día habil ") ; 
                break; 
            case "martes" : 
             System.out.print("Día habil ") ; 
                break; 
             case "miercoles": 
               System.out.print("Día habil") ; 
                break; 
            case "jueves" : 
             System.out.print("Día habil ") ; 
                break;    
            case "viernes" : 
             System.out.print("Día habil ") ; 
                break;    
            default:
                 System.out.print("Es fin de semana");
                 break;
                
                
                
        }
    }
    
}
      
