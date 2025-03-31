import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🖩 Calculadora Simples em Java");
        System.out.println("Operações disponíveis: +, -, *, /");
        
        // Entrada do usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        // Realiza a operação selecionada
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }
        
        // Exibe o resultado (se a operação foi válida)
        if (operacaoValida) {
            System.out.printf("Resultado: %.2f %c %.2f = %.2f%n", num1, operacao, num2, resultado);
        }
        
        scanner.close();
    }
}
