import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar (R$ por US$): ");
        double cotacaoDolar = scanner.nextDouble();

        double valorDolares = valorReais / cotacaoDolar;

        System.out.printf("O valor de R$ %.2f equivale a US$ %.2f%n", valorReais, valorDolares);

        scanner.close();
    }
}
