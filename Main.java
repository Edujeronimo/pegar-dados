import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome ="";
        int idade = 0 ;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual é o seu nome?:");
        nome = teclado.nextLine();
        System.out.print("Qual a sua idade?");
        idade = teclado.nextInt();

        System.out.println("Olá "+ nome +" é um prazer te-lo aqui!");
        System.out.println("sua idade é: " + idade + " anos");

       // System.out.println("hello");
       // System.out.println(nome);
       // System.out.println("é um Desprazer ter você aqui");

//        System.out.println("A aula começou a ficar legal!");
//        System.out.println("mentira, esta uma bosta!!");

    }
}