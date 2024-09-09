package spcar;

import java.util.Scanner;

public class SPCar {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados do usuário
        Scanner leitor = new Scanner(System.in);
        
        // Declaração das variáveis
        String modeloCarro;      // Variável para armazenar o modelo do carro
        double valorDiaria;      // Variável para armazenar o valor da diária de locação
        double totalAPagar;      // Variável para armazenar o total a ser pago
        int diasLocacao;         // Variável para armazenar a quantidade de dias de locação
        double kmPercorridos;    // Variável para armazenar a quantidade de Km percorridos
        double valorPorKm = 0.20; // Valor por Km percorrido
        
        // Entrada de dados do usuário
        System.out.println("Digite o modelo do carro alugado:");
        modeloCarro = leitor.nextLine(); // Lê o modelo do carro
        
        System.out.println("Digite o valor da diária para locação:");
        valorDiaria = leitor.nextDouble(); // Lê o valor da diária
        
        System.out.println("Digite a quantidade de dias de locação:");
        diasLocacao = leitor.nextInt(); // Lê a quantidade de dias de locação
        
        System.out.println("Digite a quantidade de Km percorridos:");
        kmPercorridos = leitor.nextDouble(); // Lê a quantidade de Km percorridos
        
        // Cálculo do total a pagar
        totalAPagar = (valorDiaria * diasLocacao) + (kmPercorridos * valorPorKm);
        
         // Saída dos dados formatados
        System.out.println("\nSPCar - Cobrança de Serviços de Locação de Veículos");
        System.out.println("*************************************************");
        System.out.println("Modelo do carro: " + modeloCarro);
        System.out.println("Valor da Diária: R$ " + valorDiaria);
        System.out.println("Quantidade de dias de locação: " + diasLocacao + " dias");
        System.out.println("Kms percorridos: " + kmPercorridos + " Kms");
        System.out.println("*************************************************");
        System.out.println("Total a pagar: R$ " + totalAPagar);
        System.out.println("*************************************************");
        
        // Fechamento do objeto Scanner
        leitor.close();
    }
}
