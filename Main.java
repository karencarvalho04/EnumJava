import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\tBebidas");
        System.out.println("1." + Bebida.REFRIGERANTE.getNome() + ": R$" + Bebida.REFRIGERANTE.getPreco());
        System.out.println("2." + Bebida.SUCO.getNome() + ": R$" + Bebida.SUCO.getPreco());
        System.out.println("3." + Bebida.AGUA.getNome() + ": R$" + Bebida.AGUA.getPreco());

        System.out.println("\tComidas");
        System.out.println("4." + Comida.SANDUICHE.getNome() + ": R$" + Comida.SANDUICHE.getPreco());
        System.out.println("5." + Comida.HOTDOG.getNome() + ": R$" + Comida.HOTDOG.getPreco());
        System.out.println("6." + Comida.XBURGER.getNome() + ": R$" + Comida.XBURGER.getPreco());

        System.out.println("0. Sair");
        System.out.print("Escolha sua opção: ");
    }

    public static double preco(int opcao) {
        switch (opcao) {
            case 1:
                return Bebida.REFRIGERANTE.getPreco();
            case 2:
                return Bebida.SUCO.getPreco();
            case 3:
                return Bebida.AGUA.getPreco();
            case 4:
                return Comida.SANDUICHE.getPreco();
            case 5:
                return Comida.HOTDOG.getPreco();
            case 6:
                return Comida.XBURGER.getPreco();
            default:
                return 0.0;

        }
    }

    public static void main(String[] args) {
        double total = 0.0;
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            menu();
            opcao = entrada.nextInt();
            total += preco(opcao);

            System.out.println("Opção escolhida: " + opcao);
            System.out.println("Valor de sua conta: " + total + "\n");

        } while (opcao != 0);
    }
}
