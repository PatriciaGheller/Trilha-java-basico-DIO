public class OperadorIncremento {
    public static void main(String[] args) throws Exception {
     int numero = 5;
        // x repeticao

        //numero = numero + 2;

        numero++;
        // numero++ é a msm coisa que: numero = numero +1;

        System.out.println(numero);

      /*   System.out.println(numero ++); quer dizer que ele imprime o valor e só depois incrementa
       * Nesse caso, vai imprimir 5 e na proxima impressão 6
       * 
       * System.out.println(++numero); Agora sim ele passa a ter um novo valor logo de primeira
       * 
       * A mesma regra se aplica ao decremento
       * 
       * System.out.println(numero --); OU
       * System.out.println(-- numero);
       * 
       */
    }
}
