/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;




/**
 *
 * @author ped90
 */
public class Boletin21 {
PrintWriter añade;
FileWriter fich;
    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    Boletin21 bol = new Boletin21();
    ArrayList<String>frase=new ArrayList<String>();
    
    frase.add("Mi gato se llama guantes");
    frase.add("Yo me llamo Ralph");
    frase.add("El aliento de mi gato huele a comida de gato");
    
    Collections.sort(frase);
    for(int z=0;z<frase.size();z++){
        System.out.println(frase);
    }
    
    bol.añadiratxt("bol21.txt",frase);
    }
    
    public void añadiratxt(String nomFich, ArrayList<String>frase){
        try{
            añade=new PrintWriter(new FileWriter(nomFich,true));
            añade.println(frase);
            
        }
        catch(IOException ex){
            System.out.println("Error"+ex.getMessage());
        }
        finally{
            añade.close();
    }
    }
}
     
    

       
    
    

