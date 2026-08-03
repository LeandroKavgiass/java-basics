import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();


        System.out.print("Digite o valor do desconto do INSS: ");
        double descontoINSS = scanner.nextDouble();


        double salarioLiquido = salarioBruto - descontoINSS;


        System.out.printf("O salário líquido do funcionário é: %.2f%n", salarioLiquido);


        scanner.close();
    }
}
