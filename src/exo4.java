public class exo4 {}
     void main () {
          Scanner sc = new Scanner(System.in);

         IO.println("Digite um número");
          int numerousuario = sc.nextInt();
          int resultado = 0;
          int contador = 4;

          while (contador <= numerousuario) {
              IO.println(resultado);
              resultado = resultado + contador;
              contador++;


          }
     }


