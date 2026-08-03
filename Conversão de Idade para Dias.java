import java.util.Scanner;

public class ConversaoIdadeParaDias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade em anos: ");
        int idade = scanner.nextInt();

        int diasVividos = idade * 365;

        System.out.printf("Você já viveu aproximadamente %d dias.%n", diasVividos);

        scanner.close();
    }
}
