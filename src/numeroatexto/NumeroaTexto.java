/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroatexto;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class NumeroaTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int n;
        String nLetras = "";
        
        //Input
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite n: "));
        
        //Processing
        switch(n)
        {
            case 0:
                nLetras = "Cero";
                break;
            case 1:
                nLetras = "Uno";
                break;
                
            case 2:
                nLetras = "Dos";
                break;
                
            case 3:
                nLetras = "Tres";
                break;
            
            case 4:
                nLetras = "Cuatro";
                break;
            
            case 5:
                nLetras = "Cinco";
                break;
            case 6:
                nLetras = "Seis";
                break;
            case 7:
                nLetras = "Siete";
                break;
            case 8:
                nLetras = "Ocho";
                break;
            case 9:
                nLetras = "Nueve";
                break;
                
            default:
                nLetras = "No es un digito";
                break;
        }
        JOptionPane.showMessageDialog(null,n + "->" + nLetras);
    }
    
}
