package condicionais;

import java.util.Scanner;

public class if_else_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >=6) {
            System.out.printf("Aprovado");

        }
        else if (media <6 && media>=4) {
            System.out.printf("Recuperação ");
        }
        else if (media <=5) {
            System.out.printf("Reprovado ");
        }

    }
}
