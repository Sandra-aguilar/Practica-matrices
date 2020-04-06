package matriz3;
import java.util.Scanner;


public class Matriz3{

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       int filas,columnas;
       
       System.out.print("Numero de filas");
       filas= entrada.nextInt();
       System.out.print("Numero de columnas");
       columnas=entrada.nextInt();
       char Matriz [][] =new char [filas][columnas];
       
       for (int a=0; a<columnas;a++){
           
           for(int b=0; b<filas; b++){
               if (a+b<Matriz.length-1 || a+b>Matriz.length-1){
                   Matriz[a][b]= '|';
                    }
              
               
              else{  Matriz [a][b] = ' '; 
              
           } 
           
           System.out.print(Matriz[a][b]+" ");
       } 
           System.out.println("");
    }
    
  }
}