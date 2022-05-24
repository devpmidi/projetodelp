import java.util.Scanner;

public class Questao2 {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
   
    int n[][] = new int[5][2];
    int numeros[] = new int[5];
    
    for(int i=0; i<5; i++){
      for(int j=0; j<2; j++){
      System.out.printf("%d, %d: ", i+1, j+1);
      n[i][j] = ler.nextInt();
      }
    }
   
    for(int i=0; i<5; i++){
      numeros[i] = saoAmigos(n[i][0], n[i][1]);
    }
     
    for(int i=0; i<5; i++){
      System.out.printf("%d e %d: %d\n" ,n[i][0], n[i][1], numeros[i]);
    } 
    }
  public static int saoAmigos(int num1, int num2) {
    int somaNum1 = 0, somaNum2 = 0;
    for(int i = 1; i < num1; i++) {
        if(num1 % i == 0) {
            somaNum2 += i;
        }
    }

    if(somaNum2 != num2) {
        return 0;
    }

    for (int i = 1; i < num2; i++) {
        if(num2 % i == 0) {
            somaNum1 += i;
        }
    }
         
    if(somaNum1 != num1) {
        return 0;
    }
    return 1;
  
    }
  }