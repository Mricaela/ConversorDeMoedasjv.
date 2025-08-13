import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RequisicaoApi requisicao = new RequisicaoApi();
        Conversor conversor = new Conversor();

        boolean continuar = true;

        while (continuar) {
            System.out.println("=== Conversor de Moedas ===");
            System.out.println("1. Converter moeda");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Moeda base (ex: USD): ");
                    String moedaBase = sc.nextLine().toUpperCase();

                    System.out.print("Moeda destino (ex: BRL): ");
                    String moedaDestino = sc.nextLine().toUpperCase();

                    System.out.print("Valor a converter: ");
                    double valor = sc.nextDouble();

                    try {
                        String json = requisicao.buscarDadosDaAPI(moedaBase);
                        double taxa = conversor.obterTaxa(json, moedaDestino);
                        double convertido = conversor.calcularConversao(valor, taxa);
                        System.out.printf("Valor convertido: %.2f %s%n", convertido, moedaDestino);
                    } catch (Exception e) {
                        System.out.println("Erro ao realizar conversão: " + e.getMessage());
                    }
                    break;

                case 2:
                    continuar = false;
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(); // linha em branco
        }

        sc.close();
    }
    }

