/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Juan
 */
public abstract class Barco {
    
    int [] tamano;
    int activacion=1;
    
    public Barco(int[] tamano) {
        this.tamano = tamano;
       
    }



    public void setTamano(int[] tamano) {
        this.tamano = tamano;
    }

   

    public int[] getTamano() {
        return tamano;
    }
    
    public void Vida1 (Barco barcUser2){
        
        barcUser2.getTamano();
        
        for (int i = 0; i < barcUser2.getTamano().length; i++) {
            
         barcUser2.tamano[i]=1;
            
        }
        
        
    }
    
    public void Vida2 (Barco barcUser2){
        
        barcUser2.getTamano();
        
        for (int i = 0; i < barcUser2.getTamano().length; i++) {
            
         barcUser2.tamano[i]=2;
            
        }
        
        
    }
     
public void Vida3 (Barco barcUser2){
        
        barcUser2.getTamano();
        
        for (int i = 0; i < barcUser2.getTamano().length; i++) {
            
         barcUser2.tamano[i]=3;
            
        }
        
        
    }    
    
    
}
