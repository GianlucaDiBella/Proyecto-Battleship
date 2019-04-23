/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public final class Menu {

    Scanner sc = new Scanner (System.in);
    boolean creado1=true, creado2=true, creado3=true, creado4=true, creado5=true, creado6=true; 
    int golpes=0,golpesPc=0,balas=0,balasPc=0,contPc=0,cont=0;

    public Menu() throws InterruptedException {
        
        byte tamano=0;
     
        String [][] tablero;
        int [][] vidaUser= new int [9][9];
        int [][] vidaPc= new int [9][9];
        
        System.out.println("Bienvenido a REVOSHIPP La batalla de las 100 horas sin luz");
         
        System.out.println("Presione cualquier tecla para comenzar");
        String comenzar=sc.next();//Para darle comienzo al juego
        
        System.out.println("Ingrese su nombre de usuario: ");
        String nickname=sc.next();//Nickname
        
        while(tamano!=7 & tamano!=8 & tamano!=9 ){
        System.out.println("De que tamano desea el tablero de juego?\n[7]7x7\n[8]8x8\n[9]9x9");
        tamano = sc.nextByte();
        
        if (tamano!=7 & tamano!=8 & tamano!=9 ){
            
            System.out.println("\nSeleccione una opcion valida\n");
            
        }
        }
        
        tablero= new String [tamano][tamano];
        String[][] tableroPc = new String [tamano][tamano];
        String[][] tableroPcAgua = new String [tamano][tamano];

        int ult=1;
        while(ult<2 || ult>6){
        System.out.println("De que tamano entre 2-7 desee que sea su ultimo barco?");
        ult=sc.nextInt();
        if(ult<2 || ult>6){
            System.out.println("Ingrese una opcion valida");
        }
        }
        
        int [] tamBarcUserR= new int [ult];
        int ultPc= ThreadLocalRandom.current().nextInt(ult,8);
        int [] tamBarcPcR= new int [ultPc];
        int [] tamBarcUser2= new int [2];
        int [] tamBarcPc2= new int [2];
        int [] tamBarcUser3= new int [3];
        int [] tamBarcPc3= new int [3];
        int [] tamBarcUser3b= new int [3];
        int [] tamBarcPc3b= new int [3];
        int [] tamBarcUser4= new int [4];
        int [] tamBarcPc4= new int [4];
        int [] tamBarcUser5= new int [5];
        int [] tamBarcPc5= new int [5];
        Barco2 barcUser2 = new Barco2 (tamBarcUser2);
        Barco2 barcPc2 = new Barco2 (tamBarcPc2);
        Barco3 barcUser3 = new Barco3 (tamBarcUser3);
        Barco3 barcPc3 = new Barco3 (tamBarcPc3);
        Barco3 barcUser3b = new Barco3 (tamBarcUser3b);
        Barco3 barcPc3b = new Barco3 (tamBarcPc3b);
        Barco4 barcUser4 = new Barco4 (tamBarcUser4);
        Barco4 barcPc4 = new Barco4 (tamBarcPc4);
        Barco5 barcUser5 = new Barco5 (tamBarcUser5);
        Barco5 barcPc5 = new Barco5 (tamBarcPc5);
        BarcoRandom barcUserR = new BarcoRandom (tamBarcUserR);
        BarcoRandom barcPcR = new BarcoRandom (tamBarcUserR); 
        
        Tablero tablero1 = new Tablero (tablero);
        Tablero tableroPc1 = new Tablero (tableroPc);
        Tablero tableroAgua = new Tablero (tableroPcAgua);
        
        Dificultad difi = new Dificultad (barcUser2,barcPc2,barcUser3,barcPc3,barcUser3b,barcPc3b,barcUser4,barcPc4,barcUser5,barcPc5,barcUserR,barcPcR);
       //Colocar Barcos Random 
        while(creado1 || creado2 || creado3 || creado4 || creado5 || creado6){
      if(creado1){
          int num=1;
      ponerBarco(tableroPc,barcPc2,num);
      }

      else if(creado2){
          int num=2;
      ponerBarco(tableroPc,barcPc3,num);
      }
      else if(creado3){
          int num=3;
      ponerBarco(tableroPc,barcPc3b,num);
      }
      else if(creado4){
          int num=4;
      ponerBarco(tableroPc,barcPc4,num);
      }
      else if(creado5){
          int num=5;
      ponerBarco(tableroPc,barcPc5,num);
      }
      else if(creado6){
          int num=6;
      ponerBarco(tableroPc,barcPcR,num);
      }
      }
        //Colocar Barcos del usuario
        ponerVidaPc(tableroPc,vidaPc, barcPc4);
     
        tablero1.mostrarTablero(tablero);
        colocarBarcos(tablero,barcUser2,vidaUser);
        
        tablero1.mostrarTablero(tablero);
        colocarBarcos(tablero,barcUser3,vidaUser);
        
        tablero1.mostrarTablero(tablero);
        colocarBarcos(tablero,barcUser3b,vidaUser);
        
        tablero1.mostrarTablero(tablero);
        colocarBarcos(tablero,barcUser4,vidaUser);
        
        tablero1.mostrarTablero(tablero);
        colocarBarcos(tablero,barcUser5,vidaUser);
        
        tablero1.mostrarTablero(tablero);
        colocarBarcos(tablero,barcUserR,vidaUser);
        
        System.out.println("Los barcos han sido colocados exitosamente!");
     //Para calcular golpes = tiros acertados y balas=tiros totales.
      int finpartida=17+barcUserR.tamano.length;
      int finpartidaPc=17+barcPcR.tamano.length;
      
  
    
//DONDE EMPIEZA EL JUEGO

System.out.println("EMPIEZA LA BATALLA! ");
    long inicio = System.currentTimeMillis();
    Thread.sleep(2000);
    int habilidad=0;
    int atajo=0;
      while(cont<finpartida && contPc<finpartida){
          
          System.out.println("==================================================================\n                            [TABLERO ENEMIGO]                                                       \n==================================================================");
          tableroAgua.ImprimirMatriz(tableroPcAgua);
          System.out.println("==================================================================\n                                ["+nickname+"]                                                 \n==================================================================");
          tablero1.ImprimirMatriz(tablero);
          
          if(cont==10 || contPc==10 ){
              if(atajo==0){
              System.out.println("Pssst...¿Deseas activar la habilidad especial?\nAdvertencia... Puede tener un costo al final de la partida\nSi deseas tomar el atajo teclea [1], sino lo deseas teclea[2]");
              atajo=sc.nextInt();
              if(atajo==1){
              System.out.println("==================================================================\n                            [TABLERO ENEMIGO BONUS]                                                       \n==================================================================");    
              tableroPc1.ImprimirMatriz(tableroPc);
              habilidad=1;
              }else{
                  System.out.println("Has perdido una gran oportunidad...");
              }
          }
          }
          
          dispararUsuario(tableroPc,vidaPc,tableroPcAgua);
          dispararPc(tablero,vidaUser);
          
          acabarPartidaUser(tablero);
          acabarPartidaUser(tableroPc);

      }
        long fin = System.currentTimeMillis();
        
        double tiempo = (double) ((fin - inicio)/1000);
        
        System.out.println("==================================================================\n LA PARTIDA HA FINALIZADO \n==================================================================");
        System.out.println("==================================================================\n ESTADISTICAS DE PARTIDA: \nTotal de disparos acertados por el usuario:"+golpes+"\nTotal de disparos fallidos: "+ (balas-golpes));
        System.out.println("\nTotal de disparos acertados por la pc:"+golpesPc+"\nTotal de disparos fallidos: "+ (balasPc-golpesPc));
        int minutostiempo= (int)(tiempo/60);
        int segundos=(int) (tiempo%60);
        int milisegundos= (int) (tiempo*1000);
        System.out.println(minutostiempo +" Minutos: "+ segundos+" Segundos: "+ milisegundos+"milisegundos");
        if(cont>contPc){
            System.out.println("Ganaste!\nGracias por jugar \n==================================================================");
        }else{
            System.out.println("Perdiste...\nGracias por jugar \n==================================================================");
        }
        if(habilidad==1){
            System.out.println("Por tomar el atajo asi hayas ganado, no se valida la victoria, no haga trampa!");

        }
      }
    
public void colocarBarcos (String [][] tablero, Barco p, int [][]vida){
    byte salida=1;
    byte lugar=0;
    while(lugar!=1 & lugar!=2){
    System.out.println("Desea colocarlo horizontal o vertical?\n[1] Horizontal\n[2] Vertical");
    lugar=sc.nextByte();
    if(lugar!=1 & lugar!=2){
        System.out.println("Ingrese una opcion valida");
    }
    }
    if (lugar==1){
        
        while (salida==1){
            
            salida=2;
            byte check=0;
            byte fila=0;
            byte columna=0;
       
        while(fila<1||fila>tablero.length)   { 
        System.out.println("Indique la fila donde desee que este la cabeza del barco:");
        fila=sc.nextByte();
            if (fila<1||fila>tablero.length) {
                System.out.println("Ingrese una opcion valida");
            }
        }
         while(columna<1||columna>tablero.length)   { 
        System.out.println("Indique la columna donde desee que esta la cabeza del barco");
        columna=sc.nextByte();
        if (columna<1||columna>tablero.length) {
                System.out.println("Ingrese una opcion valida");
            }
         
         }
            for (int j = 0; j < p.tamano.length; j++) {
                
              if(tablero [fila-1][columna+j-1] == "▬"){
                  check++;
                  
              }  
                
            }
            
        if(check==0){    
            
        for (int i = 0; i < p.tamano.length; i++) {
            
            
            
             tablero [fila-1][columna+i-1] = "▬";
             vida [fila-1][columna+i-1] =p.tamano[0];
            
            
        }} else{
            
            salida=1;
            System.out.println("La posicion ya ha sido ocupada por otro barco, por favor seleccione una posicion valida");
            
        }
        
        }
        
    } else {
        
       while (salida==1){
            
            salida=2;
            byte check=0;
            byte fila=0;
            byte columna=0;
            
        while(fila<1||fila>tablero.length)   {     
        System.out.println("Indique la fila donde desee que este la cabeza del barco:");
        fila=sc.nextByte();
            if (fila<1||fila>tablero.length) {
                System.out.println("Ingrese una opcion valida");
            }
        
        }
        while(columna<1||columna>tablero.length)   { 
        System.out.println("Indique la columna donde desee que esta la cabeza del barco");
        columna=sc.nextByte();
        if (columna<1||columna>tablero.length) {
                System.out.println("Ingrese una opcion valida");
            }
        }
            for (int j = 0; j < p.tamano.length; j++) {
                
              if(tablero [fila+j-1][columna-1] == "▬"){
                  check++;
                  
              }  
                
            }
            
        if(check==0){    
            
        for (int i = 0; i < p.tamano.length; i++) {
            
            
            
             tablero [fila+i-1][columna-1] = "▬";
             vida [fila+i-1][columna-1] =p.tamano[0];
            
            
        }} else{
            
            salida=1;
            System.out.println("La posicion ya ha sido ocupada por otro barco, por favor seleccione una posicion valida");
            
        }
        
        }
        
    }  
}
public void ponerBarco(String [][] tablero,Barco p,int num){

    int numero = (int) (Math.random()* 2) +1;
    
    if(numero==1){
        //1 = horizontal
        int fila = (int) (Math.random()* 6);
        int columna = (int) (Math.random()* 6);
        byte lleno =0;
        byte cont=0;
    
        for (int i = 0; i < p.tamano.length; i++) {
            if(columna+i>=p.tamano.length){
                lleno=1;
            }
           else if(tablero[fila][columna+i]=="▬"){
                cont++;
            }
            
        }
        
        
        
        if(cont==0&lleno==0){
            
            
        for (int i = 0; i < p.tamano.length; i++) {
            
                tablero[fila][columna+i]="▬"; 
                
            
        }
            switch (num) {
                case 1:
                    creado1=false;
                    break;
                case 2:
                    creado2=false;
                    break;
                case 3:
                    creado3=false;
                    break;
                case 4:
                    creado4=false;
                    break;
                case 5:
                    creado5=false;
                    break;
                case 6:
                    creado6=false;
                    break;
                default:
                    break;
            }
        }
    }
    
    else{
            //1 = horizontal
        int fila = (int) (Math.random()* 7);
        int columna = (int) (Math.random()* 7);
        byte lleno =0;
        byte check=0;
    
        for (int i = 0; i < p.tamano.length; i++) {
            if(fila+i>=p.tamano.length){
                lleno=1;
            }else if(tablero[fila+i][columna]=="▬"){
                check++;
            }
            
        }
        
        if(check==0&lleno==0){
        for (int i = 0; i < p.tamano.length; i++) {
            
                tablero[fila+i][columna]="▬";    
                
        }
            switch (num) {
                case 1:
                    creado1=false;
                    break;
                case 2:
                    creado2=false;
                    break;
                case 3:
                    creado3=false;
                    break;
                case 4:
                    creado4=false;
                    break;
                case 5:
                    creado5=false;
                    break;
                case 6:
                    creado6=false;
                    break;
                default:
                    break;
            }
        }
    
    }
}   
public void dispararUsuario(String[][]tableroPc,int [][] vida,String[][]tableroPcAgua){
    int col,fil;
    
    System.out.println("Selecciona una fila donde disparar");
    fil=sc.nextInt();
    while(fil>9 || fil<0){ //error cheking
        System.out.println("Coloque una fila valida (0--->9)");
        fil=sc.nextInt();
    }
    System.out.println("Selecciona una columna donde disparar");
    col=sc.nextInt();
    
    while(col>9 || col<0){ //error cheking
        System.out.println("Coloque una fila valida (0--->9)");
         col=sc.nextInt();
    }
        if(tableroPc[fil-1][col-1]=="▬"){
            System.out.println("Haz dañado una parte del barco!");
                tableroPc[fil-1][col-1]="≡";
                tableroPcAgua[fil-1][col-1]="≡";
                vida[fil-1][col-1]--;
                balas++;
                golpes++;
        }else if(tableroPc[fil-1][col-1]=="~"){
                System.out.println("Fallaste el tiro!");
                tableroPc[fil-1][col-1]="X";
                tableroPcAgua[fil-1][col-1]="X";
                balas++;
        }else if(tableroPc[fil-1][col-1]=="≡" && vida[fil-1][col-1]==0){
                System.out.println("Destruiste una parte del barco!");
                tableroPc[fil-1][col-1]="♦";
                tableroPcAgua[fil-1][col-1]="♦";
                golpes++;
                balas++;
        }else if (tableroPc[fil-1][col-1]=="≡" && vida[fil-1][col-1]!=0){
                System.out.println("Haz dañado una parte del barco!");
                balas++;
                golpes++;
                vida[fil-1][col-1]--;
        }
    }

public void dispararPc(String[][]tablero,int [][]vida){ 
    int fila = (int) (Math.random()* tablero.length);
    int col = (int) (Math.random()* tablero.length);
    
        if(tablero[fila][col]=="▬"){
                tablero[fila][col]="≡";
                vida[fila][col]--;
                golpesPc++;
                balasPc++;
        }else if(tablero[fila][col]=="~"){
                tablero[fila][col]="X";
                balasPc++;
        }else if(tablero[fila][col]=="≡"& vida[fila][col]==0){
            tablero[fila][col]="♦";
            golpesPc++;
            balasPc++;
        }else if (tablero[fila][col]=="≡" & vida[fila][col]!=0){
            balasPc++;
            golpesPc++;
            vida[fila][col]--;
        }
        }
public void ponerVidaPc(String[][] tablero, int [][]vida,Barco4 b){
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[1].length; j++) {
            if(tablero[i][j]=="▬"){
                
                vida[i][j]= b.tamano[0];
            }
            
        }
    }
}
public int acabarPartidaUser(String[][]tablero){
    cont=0;
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[i].length; j++) {
            if(tablero[i][j]=="♦"){
                cont++;
            }
        }
    }
        return cont;
    
}
public int acabarPartidaPc(String[][]tablero){
    contPc=0;
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[i].length; j++) {
            if(tablero[i][j]=="♦"){
                contPc++;
              
            }
        }
    }
   
        return contPc;
    
    
}
}











