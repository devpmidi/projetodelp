import java.util.Scanner;
class Questao3 {
  public static void main(String[] args) {
    double doces[][] = {  
                          {30 ,1},
                          {15,0.5},
                          {55, 0.5},
                          {40, 0.75},
                          {25, 1.5},
                          {7, 2},
                          {9, 1},
                          {36, 0.75},
                          {48, 1.75}
                       };

    double total = precoTotal(doces);

    if (total != -1)
      System.out.printf("\nValor total: R$%.2f", total);
  }  

  public static double precoTotal(double doces[][]){
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a posicao do doce: ");
    int doce = input.nextInt()-1;
    
    if (0 <= doce && doce <= 8) {
        System.out.print("\nDigite a quantidade: ");
        int quantidadeCompra = input.nextInt();
        input.close();
        double quantidadeDoce = doces[doce][0];
      
        if (quantidadeDoce < quantidadeCompra){
          System.out.println("\nNao possuimos essa quantidade de doces.");
          return -1;
        }
        
        else {
          double preco = doces[doce][1];
          double total = quantidadeCompra*preco;

          return total;
        }
    }

    System.out.println("Doce invalido!!!");
    input.close();
    return -1;
  }
}