import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int soma = 0;
        while (soma < 100) {
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        soma += num;
        }
        System.out.println("A soma deu: " + soma);
        sc.close();
    }
}
