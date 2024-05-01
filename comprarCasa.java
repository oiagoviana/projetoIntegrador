import java.util.Scanner;

public class comprarImovel {
    public static void main(String[] args) {
        comprarCasa();
    }

    public static void comprarCasa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, responda algumas perguntas para encontrar a casa mais adequada para você.");

        System.out.println("Em que local você gostaria de morar? ");
        System.out.println("1. Zona Central");
        System.out.println("2. Zona Industrial");
        System.out.println("3. Zona Periférica");
        System.out.print("Escolha uma opção: ");
        String localizacao = scanner.nextLine();

        System.out.println("Quantos quartos você precisa: ");
        int numQuartos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Verificando as preferências do comprador
        // Centro casa 1 quarto
        if (localizacao.equalsIgnoreCase("1") && numQuartos == 1) {
            System.out.println("Ótimo! Trouxemos algumas opções para você no centro da cidade.");
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
            System.out.println("Ótimo! Trouxemos algumas opções para você no centro da cidade.");
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
            System.out.println("Ótimo! Trouxemos algumas opções para você no centro da cidade.");
            System.out.println("1. Uma casa proxima ao metrô, 3 quartos, 4 banheiros, 3 vagas para carro, localizada em Rua Ribeiro do Vale, Santa Cecília - SP | R$ 1.000.000 (IPTU 12xR$ 1.416)");
            System.out.println("2. Uma casa proxima ao metrô, 3 quartos, 3 banheiros, 2 vagas para carro, localizada em Rua Luis Carlos Paraná, Cambuci - SP | R$ 680.000 (IPTU 12xR$ 100)");
            System.out.println("3. Uma casa proxima ao metrô, 3 quartos, 4 banheiros, 2 vagas para carro, localizada em Rua Durval Clemente, Bela Vista - SP | R$ 850.000 (IPTU 12xR$ 342) ");
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
        } else if (localizacao.equalsIgnoreCase("2") && numQuartos == 1) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona industrial da cidade.");
            System.out.println("1. Uma casa com 1 quarto, 1 banheiros, sem vaga para carros, localizada em Rua Central de Minas, Vila Leopoldina - SP | R$ 550.000 (IPTU 12xR$ 158)");
            System.out.println("2. Uma casa com 1 quarto, 1 banheiros, 1 vaga para carro, localizada em Rua Guaricanga, Lapa - SP | R$ 700.000 (IPTU 12xR$ 233)");
            System.out.println("3. Uma casa proxima ao metrô, 1 quarto, 1 banheiros, 1 vagas para carro, localizada em Rua Enta, Mooca - SP | R$ 400.000 (IPTU 12xR$ 36) ");
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

        } else if (localizacao.equalsIgnoreCase("2") && numQuartos == 2) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona industrial da cidade.");
            System.out.println("1. Uma casa com 2 quartos, 2 banheiros, 3 vagas para carros, localizada em Rua Marcelo Homem de Melo, Mooca - SP | R$ 800.000 (IPTU 12xR$ 398)");
            System.out.println("2. Uma casa com 2 quartos, 1 banheiros, 2 vaga para carro, localizada em Ministro Salgado Filho, Vila Prudente - SP | R$ 720.000 (IPTU 12xR$ 312)");
            System.out.println("3. Uma casa com 2 quartos, 1 banheiros, 1 vagas para carro, localizada em Rua Kabul, Vila Leopoldina - SP | R$ 530.000 (IPTU 12xR$ 177)");
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
        } else if (localizacao.equalsIgnoreCase("2") && numQuartos == 3) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona industrial da cidade.");
            System.out.println("1. Uma casa com 3 quartos, 4 banheiros, 2 vagas para carros, localizada em Rua Majubim, Lapa - SP | R$ 1.000.000 (IPTU 12xR$ 495)");
            System.out.println("2. Uma casa com 3 quartos, 3 banheiros, 2 vaga para carro, localizada em Rua Ibitinga, Mooca - SP | R$ 850.000 (IPTU 12xR$ 388)");
            System.out.println("3. Uma casa com 3 quartos, 2 banheiros, 2 vagas para carro, localizada em Rua Nanuque, Vila Leopoldina - SP | R$ 1.300.000 (IPTU 12xR$ 800)");
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
        } else if (localizacao.equalsIgnoreCase("3") && numQuartos == 1) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona periférica da cidade.");
            System.out.println("1. Uma casa proxima ao metrô com 1 quarto, 1 banheiros, 3 vagas para carros, localizada em Travessa Presidente Roberto Orti, Grajaú - SP | R$ 250.000 (IPTU 12xR$ 93)");
            System.out.println("2. Uma casa proxima ao metrô com 1 quarto, 1 banheiros, 1 vaga para carro, localizada em Rua Charles Meryon, Capão Redondo - SP | R$ 300.000 (IPTU 12xR$ 113)");
            System.out.println("3. Uma casa com 1 quartos, 1 banheiros, 2 vagas para carro, localizada em Rua Rio Branco , Cocaia - SP | R$ 225.000 (IPTU 12xR$ 99)");
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
        } else if (localizacao.equalsIgnoreCase("3") && numQuartos == 2) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona periférica da cidade.");
            System.out.println("1. Uma casa com 2 quartos, 2 banheiros, 3 vagas para carros, localizada em Rua Luis Mauro, Tiradentes - SP | R$ 175.000 (IPTU 12xR$ 72)");
            System.out.println("2. Uma casa proxima ao metrô com 2 quartos, 1 banheiros, 1 vaga para carro, localizada em Rua Serafim Ciuvalschi, Grajaú - SP | R$ 142.000 (IPTU 12xR$ 54)");
            System.out.println("3. Uma casa com 2 quartos, 2 banheiros, sem vagas para carro, localizada em Rua dos Compassos, Ângela - SP | R$ 215.000 (IPTU 12xR$ 300)");
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

                    System.out.print("Infome seu telefone:");
                    String tel = scanner.nextLine();

                    System.out.print("Informe seu e-mail:");
                    String email = scanner.nextLine();

                    System.out.println("Ótimo! Entraremos em contato para agendar uma visita ao imóvel!");
                    return;

                    case 4:
                    comprarCasa();
                    break;

                default:
                    break;
            }
        } else if (localizacao.equalsIgnoreCase("3") && numQuartos == 3) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona periférica da cidade.");
            System.out.println("1. Uma casa com 3 quartos, 2 banheiros, 1 vagas para carros, localizada em Rua Miguel Lopes, Capão Redondo - SP | R$ 267.000 (IPTU 12xR$ 112)");
            System.out.println("2. Uma casa com 3 quartos, 3 banheiros, 2 vaga para carro, localizada em Rua Cairu, Gaivotas - SP | R$ 175.000 (IPTU 12xR$ 76)");
            System.out.println("3. Uma casa proxima ao metrô com 3 quartos, 2 banheiros, 2 vagas para carro, localizada em Rua José Carlos Heffner, Grajaú - SP | R$ 320.000 (IPTU 12xR$ 170)");
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
        } else  {
            System.out.println("Desculpe, não encontramos nenhuma casa que atenda às suas preferências no momento.");
        }
    }
}
