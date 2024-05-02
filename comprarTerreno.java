import java.util.Scanner;

public class comprarTerreno {
    public static void main(String[] args) {
        comprarTerreno();
    }

    public static void comprarTerreno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trouxemos uma lista de terrenos disponíveis para você no momento.");

        while (true) {
            System.out.println("1. Um terreno em Rua Antônio Gabriel Franzon, Jardim Elba - SP | R$ 330.000 (250m²)");
            System.out.println("2. Um terreno em Rua Doutor Oliveira Pinto, Jardim Paulistano - SP | R$ 3.500.000 (177m²)");
            System.out.println("3. Um terreno em Rua Teodoro Sampaio, Pinheiros - SP | R$ 5.300.000 (400m²)");
            System.out.println("4. Próximo.");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1 || opcao == 2 || opcao == 3) {
                System.out.println("Ótimo! Por favor, conclua seu cadastro para darmos prosseguimento à compra!");

                System.out.print("Informe seu nome completo: ");
                String nome = scanner.nextLine();

                System.out.print("Informe seu telefone: ");
                String tel = scanner.nextLine();

                System.out.print("Informe seu e-mail: ");
                String email = scanner.nextLine();

                System.out.println("Obrigado! Entraremos em contato para agendar uma visita ao terreno!");
                System.exit(0);
            } else if (opcao == 4) {
                exibirTerrenosAdicionais();
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    public static void exibirTerrenosAdicionais() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "5. Um terreno em Rua General Roberto Alves De Carvalho Filho, Santo Amaro - SP | R$ 7.000.000 (1000m²)");
        System.out.println("6. Um terreno em Rua Mesquita, Vila Mariana - SP | R$ 4.000.000 (544m²)");
        System.out.println("7. Um terreno em Rua Vieira Pinto, Vila Matilde - SP | R$ 740.000 (490m²)");
        System.out.println("8. Próximo.");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao >= 5 && opcao <= 7) {
            System.out.println("Ótimo! Por favor, conclua seu cadastro para darmos prosseguimento à compra!");

            System.out.print("Informe seu nome completo: ");
            String nome = scanner.nextLine();

            System.out.print("Informe seu telefone: ");
            String tel = scanner.nextLine();

            System.out.print("Informe seu e-mail: ");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agendar uma visita ao imóvel!");
            System.exit(0);
        } else if (opcao == 8) {
            exibirTerrenosAdicionais2();
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    }

    public static void exibirTerrenosAdicionais2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("9. Um terreno em Rua Gonçalo Aldana, Vila Homero - SP | R$ 370.000 (500m²)");
        System.out.println("10. Um terreno em Rua Manuel Onha, Mooca - SP | R$ 450.000 (180m²)");
        System.out.println("11. Um terreno em Rua Antônio Venturi, Vila Sônia - SP | R$ 790.000 (275m²)");
        System.out.println("12. Voltar.");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao >= 9 && opcao <= 11) {
            System.out.println("Ótimo! Por favor, conclua seu cadastro para darmos prosseguimento à compra!");

            System.out.print("Informe seu nome completo: ");
            String nome = scanner.nextLine();

            System.out.print("Informe seu telefone: ");
            String tel = scanner.nextLine();

            System.out.print("Informe seu e-mail: ");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agendar uma visita ao imóvel!");
            System.exit(0);
        } else if (opcao == 12) {
            return;
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    
    }
}
