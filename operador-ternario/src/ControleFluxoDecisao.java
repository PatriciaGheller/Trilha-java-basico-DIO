public class ControleFluxoDecisao {
    public static void main(String[] args) throws Exception {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if(a==b)
          resultado = "verdadeiro";
        else
          resultado = "falso";
        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
          System.out.println(resultado);
          
          /*Resumindo toda a expressao com operador ternario
           * 
           * String resultado = a == b?"verdadeiro" : "falso";
           */
      }

}
