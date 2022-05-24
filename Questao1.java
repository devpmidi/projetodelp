// código produzido por: Marcus, João, Vitória e Midian 
import java.util.Scanner;

public class Questao1{
   public static void main (String[] args) {
   Scanner receba = new Scanner(System.in);
   System.out.println ("digite 1, 2 ou 3: ");
   int N = receba.nextInt();
      switch(N){
         case 1:
            f1();
            break;
         case 2:                      
           int num = f2(); 
           if (num == 1)
             System.out.println ("aparece duas vezes no vetor"); 
           else
             System.out.println ("não aparece duas vezes no vetor");        
            break;
         case 3:
            int matriz [][] = new int[N][N];
            System.out.println("\nDigite os valores da matriz: ");
          for(int i = 0;i<N;i++) {
            for(int j = 0;j<N;j++) {
              System.out.printf("\n%d,%d: ",i+1,j+1);
              matriz[i][j] = receba.nextInt();
            }
          }
          if (f3(matriz)==1)
            System.out.println("A matriz e triangular superior");
          else
            System.out.println("A matriz nao e triangular superior");
            break;
         default: 
            System.out.println("numero invalido");
       }
    }
   public static void f1(){ 
     Scanner recebe = new Scanner(System.in);     
     String frase, palavra;     
     int cont=0;    
 
     System.out.println("digite uma frase");  
     frase = recebe.nextLine().toUpperCase();  
     String[] palavras =frase.split(" ");  
     System.out.println("digite uma palavra");          
     palavra = recebe.next().toUpperCase();     
     for (int i = 0; i<palavras.length; ++i){       
        if (palavras[i].contains(palavra))           
          cont++;    
     }  
     System.out.printf("para a palavra %s e a frase: %s tem-se que a palavra %s ocorre %d vezes na frase.",palavra,frase,palavra,cont);
  }
   public static int f2(){
      Scanner entrada = new Scanner(System.in);
      int num;
      int cont = 0;
 
      System.out.println("digite um numero:");
      num = entrada.nextInt();
      System.out.println("qual o tamanho do vetor?");     
      int val = entrada.nextInt();
      int[] vet = new int [val];
        for ( int i = 0; i < val; ++i){
          System.out.println("digite o " + (i+1) + "° numero do vetor: " );
            vet[i]= entrada.nextInt();
        }
        for (int x = 0; x < val; ++x ) {
           if(vet[x] == num) {
             cont++;
          }
        }
        if (cont == 2) 
          return 1;
        else
          return 0;
  }
  public static int f3(int[][] matriz){
    int triangular = 1;
    int N = 3;
    for(int i = 0; i<N ; i++) {
      for(int j = 0;j<N;j++) {
        
        if (i>j && matriz[i][j]!=0){
          triangular = 0;
          break;
        }
        
     }
    }
    return triangular;
  }

}