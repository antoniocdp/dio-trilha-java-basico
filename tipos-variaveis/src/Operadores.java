public class Operadores {
    public static void main(String[] args) throws Exception {
      String nomeCompleto = "LINGUAGEM " + "JAVA";
      System.out.println(nomeCompleto);

      String concatenacao = "?";

      concatenacao = 1+1+1+"1";
      System.out.println(concatenacao);

      concatenacao = 1+"1"+1+1;
      System.out.println(concatenacao);

      concatenacao = 1+"1"+1+"1";
      System.out.println(concatenacao);

      concatenacao = "1"+1+1+1;
      System.out.println(concatenacao);

      concatenacao = "1"+(1+1+1);
      System.out.println(concatenacao);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
                   
        System.out.println(resultado);    

    }
}
