package matriz4;
import java.util.Scanner;


public class Matriz4{
    public static void main(String[] args) {

        int a,b;

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Filas");

        int x=teclado.nextInt();
        int y=x-1;
        System.out.println("Columnas");

        int c=teclado.nextInt();

        String matriz [][]= new String [x][c];

        for( a=0;a<x;a++){
            for(b=0;b<c;b++){
                if(a==b){
                    matriz[a][b]=" ";  
                }else{
                    matriz[a][b] = "°";
                }    
             }

            }
            for(b=0;b<c;b++){
                matriz[y][b]=" ";    
                y--;
           }

           for(a=0; a<x;a++){
            for(b=0;b<c;b++){
              System.out.print(matriz[a][b]);
            }
            System.out.println();
         }

        
    }
}