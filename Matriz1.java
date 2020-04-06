package matriz1;

public class Matriz1 {
    public static void main(String[] args) {
        int matriz [][]= new int [5][5];
        
for (int l=0; l<5; l++){
for (int m=0; m<5; m++){

if((l==0) || (l==4)){

matriz[l][m] = 1;
}
else
if((m==0) || (m==4)){

matriz[l][m] = 1;
}
System.out.print(matriz[l][m]+"   ");
}
System.out.println(" ");
}

