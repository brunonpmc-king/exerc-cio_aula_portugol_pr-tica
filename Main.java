import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("O número escolhido é: " + numeroUm);
        
        System.out.println("Digite um segundo número: ");
        int numeroDois = scanner.nextInt();
        System.out.println("O número escolhido é: " + numeroDois);
        
        int soma = numeroUm + numeroDois;
        System.out.println("A soma total é " + (numeroUm+numeroDois));
        
        scanner.close();
    }
}