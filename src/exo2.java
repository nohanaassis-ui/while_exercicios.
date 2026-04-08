public class exo2 {}

void main () {
    IO.println("Digite um número ");

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    while (num != 0) {
        if (num % 2 ==1) {
            IO.println( "Esse número é ímpar");
        }else{
            IO.println("este numero  e par");
        }

        IO.println("Digite outro número");
        num = sc.nextInt();

    }

}