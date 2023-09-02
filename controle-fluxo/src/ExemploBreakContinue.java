public class ExemploBreakContinue {
  
  public static void main(String[] args) {
    for(int numero = 1; numero <=5; numero++){
      if (numero == 3)
      continue;

      System.out.println(numero);
      //imprimiu todos de 1 à 5 menos o três
    }
  }
}
