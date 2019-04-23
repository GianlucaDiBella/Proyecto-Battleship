/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Dificultad {
    
    Barco2 barcUser2;
    Barco2 barcPc2;
    Barco3 barcUser3;
    Barco3 barcPc3;
    Barco3 barcUser3a;
    Barco3 barcPc3a;
    Barco4 barcUser4;
    Barco4 barcPc4;
    Barco5 barcUser5;
    Barco5 barcPc5;
    BarcoRandom barcUserR;
    BarcoRandom barcPcR;
    Scanner sc = new Scanner (System.in);

    public Dificultad(Barco2 barcUser2, Barco2 barcPc2, Barco3 barcUser3, Barco3 barcPc3,Barco3 barcUser3a, Barco3 barcPc3a, Barco4 barcUser4, Barco4 barcPc4, Barco5 barcUser5, Barco5 barcPc5, BarcoRandom barcUserR, BarcoRandom barcPcR) {
        this.barcUser2 = barcUser2;
        this.barcPc2 = barcPc2;
        this.barcUser3 = barcUser3;
        this.barcPc3 = barcPc3;
        this.barcUser3a = barcUser3a;
        this.barcPc3a = barcPc3a;
        this.barcUser4 = barcUser4;
        this.barcPc4 = barcPc4;
        this.barcUser5 = barcUser5;
        this.barcPc5 = barcPc5;
        this.barcUserR = barcUserR;
        this.barcPcR = barcPcR;
        
        
        
       System.out.println("En que dificultad desea jugar?\n[1] Muy Facil\n[2] Facil\n[3] Normal\n[4] Dificil\n[5] Muy Dificil");
       byte opc = sc.nextByte();
       
       switch (opc){
           
           case 1:
               
               muyFacil();
               
               
               
               break;
           
           case 2:
               
               facil();
               
               break;
           
           case 3:
               
               normal();
               
               break;
           
           case 4:
               
               dificil();
               
               break;
           
           case 5:
              
              muyDificil();
               
               break;
               
           default:
               
               System.out.println("Seleccione una opcion valida");
               break;
       }
       
       
        System.out.println(barcPc2);
       
    }
    
    
    public void muyFacil (){
        
        
               barcUser2.Vida3(barcUser2);
               barcUser3.Vida3(barcUser3);
               barcUser3a.Vida3(barcUser3a);
               barcUser4.Vida3(barcUser4);
               barcUser5.Vida3(barcUser5);
               barcUserR.Vida3(barcUserR);
               barcPc2.Vida1(barcPc2);
               barcPc3.Vida1(barcPc3);
               barcPc3a.Vida1(barcPc3a);
               barcPc4.Vida1(barcPc4);
               barcPc5.Vida1(barcPc5);
               barcPcR.Vida1(barcPcR);  
        
    }
    
    public void facil (){
        
        
                barcUser2.Vida2(barcUser2);
               barcUser3.Vida2(barcUser3);
               barcUser3a.Vida2(barcUser3a);
               barcUser4.Vida2(barcUser4);
               barcUser5.Vida2(barcUser5);
               barcUserR.Vida2(barcUserR);
               barcPc2.Vida1(barcPc2);
               barcPc3.Vida1(barcPc3);
               barcPc3a.Vida1(barcPc3a);
               barcPc4.Vida1(barcPc4);
               barcPc5.Vida1(barcPc5);
               barcPcR.Vida1(barcPcR);   
        
    }
    
   public void normal (){
        
        
            barcUser2.Vida1(barcUser2);
               barcUser3.Vida1(barcUser3);
               barcUser3a.Vida1(barcUser3a);
               barcUser4.Vida1(barcUser4);
               barcUser5.Vida1(barcUser5);
               barcUserR.Vida1(barcUserR);
               barcPc2.Vida1(barcPc2);
               barcPc3.Vida1(barcPc3);
               barcPc3a.Vida1(barcPc3a);
               barcPc4.Vida1(barcPc4);
               barcPc5.Vida1(barcPc5);
               barcPcR.Vida1(barcPcR);   
        
    }
    
    public void dificil (){
        
        
               barcUser2.Vida1(barcUser2);
               barcUser3.Vida1(barcUser3);
               barcUser3a.Vida1(barcUser3a);
               barcUser4.Vida1(barcUser4);
               barcUser5.Vida1(barcUser5);
               barcUserR.Vida1(barcUserR);
               barcPc2.Vida2(barcPc2);
               barcPc3.Vida2(barcPc3);
               barcPc3a.Vida2(barcPc3a);
               barcPc4.Vida2(barcPc4);
               barcPc5.Vida2(barcPc5);
               barcPcR.Vida2(barcPcR);   
        
    } 
    
    public void muyDificil (){
        
        
barcUser2.Vida1(barcUser2);
               barcUser3.Vida1(barcUser3);
               barcUser3a.Vida1(barcUser3a);
               barcUser4.Vida1(barcUser4);
               barcUser5.Vida1(barcUser5);
               barcUserR.Vida1(barcUserR);
               barcPc2.Vida3(barcPc2);
               barcPc3.Vida3(barcPc3);
               barcPc3a.Vida3(barcPc3a);
               barcPc4.Vida3(barcPc4);
               barcPc5.Vida3(barcPc5);
               barcPcR.Vida3(barcPcR);  
        
    } 
    
}