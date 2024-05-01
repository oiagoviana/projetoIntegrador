import java.util.Scanner;

public class comprarImovel {
    public static void main(String[] args) {
        comprarCasa();
    }

    public static void comprarCasa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, responda algumas perguntas para encontrar a casa mais adequada para você.");

        System.out.println("Em que local você gostaria de morar? ");
        System.out.println("1. Centro");
        System.out.println("2. Subúrbio");
        System.out.println("3. Periferia");
        System.out.print("Escolha uma opção: ");
        String localizacao = scanner.nextLine();

        System.out.println("Quantos quartos você precisa: ");
        int numQuartos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Verificando as preferências do comprador
        // Centro casa 1 quarto
        if (localizacao.equalsIgnoreCase("1") && numQuartos == 1) {
            System.out.println("Parabéns! Trouxemos algumas opções para você no centro da cidade.");
            System.out.println("1. Uma casa proxima ao metrô com 1 quarto, 1 banheiro, sem garagem, localizado em Rua Antônio de Godói, Liberdade - SP | R$ 295.000 (IPTU 12xR$ 94)");
            System.out.println("2. Uma casa proxima ao metrô com 1 quarto, 1 banheiro, 1 vaga para carro, localizado em Rua Tabatinguera, Sé - SP | R$ 320.000 (IPTU 12xR$ 43)");
            System.out.println("3. Uma casa proxima ao metrô com 1 quarto, 1 banheiro, 1 vaga para carro, localizado em Rua Paim, Bela Vista - SP | R$ 500.000 (IPTU 12xR$ 103)");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

                    System.out.print("Informe seu nome completo:");
                    String nome = scanner.nextLine();

                    System.out.print("Informe seu cpf:");
                    String cpf = scanner.nextLine();

                    System.out.print("Infome seu telefone:");
                    String tel = scanner.nextLine();

                    System.out.print("Informe seu e-mail:");
                    String email = scanner.nextLine();

                    System.out.println("Obrigado! Entraremos em contato para agendar uma visita ao imóvel!");
                    return;

                case 4:
                    comprarCasa();
                    break;

                default:
                    break;
            }
            // Centro casa 2 quartos
        } else if (localizacao.equalsIgnoreCase("1") && numQuartos == 2) {
            System.out.println("Parabéns! Trouxemos algumas opções para você no centro da cidade.");
            System.out.println("1. Uma casa próxima ao metrô, 2 quartos, 2 banheiros, 2 vagas para carro, localizado em Rua São Domingos, Bela Vista - SP | R$ 700.000 (IPTU 12xR$ 395)");
            System.out.println("2. Uma casa próxima ao metrô, 2 quartos, 3 banheiros, 2 vagas para carro, localizado em Rua Brazeliza Alves Carvalho, Consolação - SP | R$ 530.000 (IPTU 12xR$ 130)");
            System.out.println("3. Uma casa próxima ao metrô, 2 quartos, 2 banheiros, 1 vaga para carro, localizado em Rua Baronesa de Porto Carreiro, Bom Retiro - SP | R$ 650.000 (IPTU 12xR$ 153)");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

                    System.out.print("Informe seu nome completo:");
                    String nome = scanner.nextLine();

                    System.out.print("Informe seu cpf:");
                    String cpf = scanner.nextLine();

                    System.out.print("Infome seu telefone:");
                    String tel = scanner.nextLine();

                    System.out.print("Informe seu e-mail:");
                    String email = scanner.nextLine();

                    System.out.println("Obrigado! Entraremos em contato para agendar uma visita ao imóvel!");
                    return;

                case 4:
                    comprarCasa();
                    break;

                default:
                    break;
            }

        } else if (localizacao.equalsIgnoreCase("1") && numQuartos == 3) {
            System.out.println("Parabéns! Trouxemos algumas opções para você no centro da cidade.");
            System.out.println("1. Uma casa proxima ao metrô, 3 quartos, 4 banheiros, 3 vagas para carro, localizada em Rua Ribeiro do Vale, Santa Cecília - SP | R$ 1.000.000 (IPTU 12xR$ 1.416)");
            System.out.println("2. Uma casa proxima ao metrô, 3 quartos, 3 banheiros, 2 vagas para carro, localizada em Rua Luis Carlos Paraná, Cambuci | R$ 680.000 (IPTU 12xR$ 100)");
            System.out.println("3. Uma casa proxima ao metrô, 3 quartos, 4 banheiros, 2 vagas para carro, localizada em Rua Durval Clemente, Bela Vista | R$ 850.000 (IPTU 12xR$ 342) ");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

                    System.out.print("Informe seu nome completo:");
                    String nome = scanner.nextLine();

                    System.out.print("Informe seu cpf:");
                    String cpf = scanner.nextLine();

                    System.out.print("Infome seu telefone:");
                    String tel = scanner.nextLine();

                    System.out.print("Informe seu e-mail:");
                    String email = scanner.nextLine();

                    System.out.println("Obrigado! Entraremos em contato para agendar uma visita ao imóvel!");
                    return;

                    case 4:
                    comprarCasa();
                    break;

                default:
                    break;
            }
        }
    }
}
