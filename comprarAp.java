/*import java.util.Scanner;

public class comprarAp {
    public static void main(String[] args) {
        comprarAp();
    }

    public static void comprarAp() {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, responda algumas perguntas para encontrar a casa mais adequada para você.");

        String localizacao = getLocalizacao(scanner);
        int numQuartos = getNumQuartos(scanner);

        String[][][] ap = {
            {//Centro
                {"Rua Brigadeiro Tobias. Cambuci - SP | R$ 200.000(IPTU 12xR$ 41)", "Avanida Cásper Líbero, Bela Vista - SP | R$ 350.000 (IPTU 12xR$ 112)", "Rua Major Quedinho, Santa Cecilia - SP | R$ 545.000 (IPTU 12xR$ 193)"},
                {"Praça Pedro Lessa, Bom Retiro - SP | R$ 485.000 (IPTU 12xR$ 148)", "Rua Álvaro de Carvalho, Bela Vista - SP | R$ 605.000 (IPTU 12xR$ 180)","Rua Washington Luis, Consolação - SP | R$ 395.000 (IPTU 12xR$ 0)"},
                {"Rua Fernão Sales, Sé - SP | R$ 380.000 (IPTU 12xR$ 0)","Rua Martins Fontes, Bela Vista - SP | R$ 1.200.000 (IPTU 12xR$ 159)","Rua Durval Clemente, Liberdade - SP | R$ 700.000 (IPTU 12xR$ 0)"}
            },
            {//Industria
                {}

            }
        }

        } else if (localizacao.equalsIgnoreCase("2") && numQuartos == 1) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona industrial da cidade.");
            System.out.println("1. Um apartamento com 1 quarto, 1 banheiros, sem vaga para carros, localizada em Avenida Imperatriz Leopoldina, Vila Leopoldina - SP | R$ 240.000 (IPTU 12xR$ 0)");
            System.out.println("2. Um apartamento com 1 quarto, 1 banheiros, 1 vaga para carro, localizada em Avenida Mofarrej, Vila Leopoldina - SP | R$ 690.000 (IPTU 12xR$ 33)");
            System.out.println("3. Um apartamento proximo ao metrô, 1 quarto, 1 banheiros, sem vagas para carro, localizada em Rua Javari, Mooca - SP | R$ 250.000 (IPTU 12xR$ 0) ");
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
                    comprarAp();
                    break;

                default:
                    break;
            }
            
        //industrial ap 2
        } else if (localizacao.equalsIgnoreCase("2") && numQuartos == 2) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona industrial da cidade.");
            System.out.println("1. Um apartamento com 2 quartos, 1 banheiros, 3 vagas para carros, localizada em Rua Rua dos Campineiros, Mooca - SP | R$ 390.000 (IPTU 12xR$ 0)");
            System.out.println("2. Um apartamento proximo ao metrô com 2 quartos, 2 banheiros, sem vaga para carro, localizada em Rua da Mooca, Mooca - SP | R$ 320.000 (IPTU 12xR$ 0)");
            System.out.println("3. Um apartamento com 2 quartos, 2 banheiros, 1 vagas para carro, localizada em Rua Carlos Weber, Vila Leopoldina - SP | R$ 600.000 (IPTU 12xR$ 0)");
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
                    comprarAp();
                    break;

                default:
                    break;
            }

            //industrial ap 3 
        } else if (localizacao.equalsIgnoreCase("2") && numQuartos == 3) {
            System.out.println("Ótimo! Trouxemos algumas opções para você na zona industrial da cidade.");
            System.out.println("1. Um apartamento com 3 quartos, 1 banheiros, 1 vagas para carros, localizada em Rua Marcilio Dias, Lapa - SP | R$ 460.000 (IPTU 12xR$ 33)");
            System.out.println("2. Um apartamento proximo ao metrô com 3 quartos, 4 banheiros, 2 vaga para carro, localizada em Rua Sacadura Cabral, Lapa - SP | R$ 1.450.000 (IPTU 12xR$ 484)");
            System.out.println("3. Um apartamento com 3 quartos, 3 banheiros, 2 vagas para carro, localizada em Rua Dias Leme, Mooca - SP | R$ 600.000 (IPTU 12xR$ 124)");
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
                    comprarAp();
                    break;

                default:
                    break;
            }
        } else  {
            System.out.println("Desculpe, infelizmente não encontramos nenhum apartamento que atenda às suas preferências no momento.");
        }*/
    }
}*/