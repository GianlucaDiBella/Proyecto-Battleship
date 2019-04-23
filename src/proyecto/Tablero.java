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
public  class Tablero {
    
    
    String [][] tablero;
    

    public Tablero( String[][] tablero) {
       
        
        
    
        
        for (int r=0; r<tablero.length;r++){
            
            for (int c=0;c<tablero[0].length;c++){
                
                tablero[r][c]="~";
                
                
            }
        }
        
    }
    
    public String breakln(int n)
      {
          String breakline ="_____________________________________\n";
          if(n==1){
              return breakline;
          }else{
              return breakln(n-1);
          }
      }
    
    
    public void mostrarTablero ( String [][] tablero){
        
        System.out.println(breakln(2));
        
        
        System.out.print("\t");
        for (int i = 0; i < tablero[0].length; i++) {
            
            System.out.print((i+1)+("\t"));
            
            
        }
        
        System.out.println("");
        
         for(int r = 0; r < tablero.length; r++)
         {
             
              System.out.print((r+1)+")");
            
               for(int c = 0; c < tablero[0].length; c++)
               {
                  
                   
                  if(tablero[r][c]!=("▬"))
                  {
                     System.out.print("\t"+"~");
                  }
                  else
                  {
                     System.out.print("\t"+tablero[r][c]);
                  }
               }
               System.out.println("");
            }
         }
    public void ImprimirMatriz(String[][]tablero){
        
        System.out.println(breakln(2));
        
        System.out.print("  ");
        for (int i = 0; i < tablero[0].length; i++) {
            
            System.out.print((i+1)+("\t"));
            
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < tablero.length; i++) {
                System.out.print((i+1)+")");            
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
         
        
     
        
        
        
        
    }
    
    

