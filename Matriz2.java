package matriz2;

import java.util.Scanner;


public class Matriz2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
          
          int l,m;
     System.out.println("Digite un numero de filas impares: ");
    l=entrada.nextInt();
    System.out.println("Digite un numero de columnas impares: ");
    m=entrada.nextInt();

char matriz[][] = new char [l][m];

    for (int a=0; a<matriz.length; a++){
        for (int b=0; b<matriz.length; b++){
            if (a==b || a+b==matriz.length-1){
                matriz[a][b] = '°';
            }
                else{
                        matriz[a][b] = ' ';
                        }
            
                System.out.print(matriz[a][b]+" ");
            }
            System.out.println("");
        }
    }
    
}