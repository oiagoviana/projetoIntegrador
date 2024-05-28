
public class comprarCasa {

    public static void MenuComprarCasa(){
        while (true) {
            System.out.println("");
            System.out.println("Informe a opção desejada.");
            System.out.println("A - Listar Casas");
            System.out.println("B - Comprar casa");
            var escolha = LerDados.lerTexto().toUpperCase();

            if(escolha.equals("A")){
                listarCasas();
            }
        }
    }



    public static void listarCasas(){
        var propriedades = ArquivoCadastrar.lerTudo();
		for(var p: propriedades) {
            if(p.tipoImovel().equalsIgnoreCase("casa")){
			System.out.println();
			cadastrarImovel.mostrarPropriedades(p);
            }
			
		}
    }
    

    /*public static void comprarCasa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, responda algumas perguntas para encontrar a casa mais adequada para você.");

        String localizacao = getLocalizacao(scanner);
        int numQuartos = getNumQuartos(scanner);

        String[][][] casas = {
            { // Zona Central
                {"Rua Antônio de Godói, Liberdade - SP | R$ 295.000 (IPTU 12xR$ 94)", "Rua Tabatinguera, Sé - SP | R$ 320.000 (IPTU 12xR$ 43)", "Rua Paim, Bela Vista - SP | R$ 500.000 (IPTU 12xR$ 103)"},
                {"Rua São Domingos, Bela Vista - SP | R$ 700.000 (IPTU 12xR$ 395)", "Rua Brazeliza Alves Carvalho, Consolação - SP | R$ 530.000 (IPTU 12xR$ 130)", "Rua Baronesa de Porto Carreiro, Bom Retiro - SP | R$ 650.000 (IPTU 12xR$ 153)"},
                {"Rua Ribeiro do Vale, Santa Cecília - SP | R$ 1.000.000 (IPTU 12xR$ 1.416)", "Rua Luis Carlos Paraná, Cambuci - SP | R$ 680.000 (IPTU 12xR$ 100)", "Rua Durval Clemente, Bela Vista - SP | R$ 850.000 (IPTU 12xR$ 342)"}
            },
            { // Zona Industrial
                {"Rua Central de Minas, Vila Leopoldina - SP | R$ 550.000 (IPTU 12xR$ 158)", "Rua Guaricanga, Lapa - SP | R$ 700.000 (IPTU 12xR$ 233)", "Rua Enta, Mooca - SP | R$ 400.000 (IPTU 12xR$ 36)"},
                {"Rua Marcelo Homem de Melo, Mooca - SP | R$ 800.000 (IPTU 12xR$ 398)", "Ministro Salgado Filho, Vila Prudente - SP | R$ 720.000 (IPTU 12xR$ 312)", "Rua Kabul, Vila Leopoldina - SP | R$ 530.000 (IPTU 12xR$ 177)"},
                {"Rua Majubim, Lapa - SP | R$ 1.000.000 (IPTU 12xR$ 495)", "Rua Ibitinga, Mooca - SP | R$ 850.000 (IPTU 12xR$ 388)", "Rua Nanuque, Vila Leopoldina - SP | R$ 1.300.000 (IPTU 12xR$ 800)"}
            },
            { // Zona Periférica
                {"Travessa Presidente Roberto Orti, Grajaú - SP | R$ 250.000 (IPTU 12xR$ 93)", "Rua Charles Meryon, Capão Redondo - SP | R$ 300.000 (IPTU 12xR$ 113)", "Rua Rio Branco, Cocaia - SP | R$ 225.000 (IPTU 12xR$ 99)"},
                {"Rua Luis Mauro, Tiradentes - SP | R$ 175.000 (IPTU 12xR$ 72)", "Rua Serafim Ciuvalschi, Grajaú - SP | R$ 142.000 (IPTU 12xR$ 54)", "Rua dos Compassos, Ângela - SP | R$ 215.000 (IPTU 12xR$ 300)"},
                {"Rua Miguel Lopes, Capão Redondo - SP | R$ 267.000 (IPTU 12xR$ 112)", "Rua Cairu, Gaivotas - SP | R$ 175.000 (IPTU 12xR$ 76)", "Rua José Carlos Heffner, Grajaú - SP | R$ 320.000 (IPTU 12xR$ 170)"}
            }
        };

        if (!mostrarCasas(scanner, localizacao, numQuartos, casas)) {
            System.out.println("Desculpe, não encontramos nenhuma casa que atenda às suas preferências no momento.");
        }
    }

    private static String getLocalizacao(Scanner scanner) {
        System.out.println("Em que local você gostaria de morar?");
        System.out.println("1. Zona Central");
        System.out.println("2. Zona Industrial");
        System.out.println("3. Zona Periférica");
        System.out.print("Escolha uma opção: ");
        return scanner.nextLine();
    }

    private static int getNumQuartos(Scanner scanner) {
        System.out.print("Quantos quartos você precisa: ");
        return scanner.nextInt();
    }

    private static boolean mostrarCasas(Scanner scanner, String localizacao, int numQuartos, String[][][] casas) {
        int locIndex = Integer.parseInt(localizacao) - 1;
        int quartosIndex = numQuartos - 1;
        if (locIndex < 0 || locIndex >= casas.length || quartosIndex < 0 || quartosIndex >= casas[0].length) {
            return false;
        }
        System.out.println("Ótimo! Trouxemos algumas opções para você.");
        for (int i = 0; i < casas[locIndex][quartosIndex].length; i++) {
            System.out.println((i + 1) + ". " + casas[locIndex][quartosIndex][i]);
        }
        System.out.println("4. Voltar");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao >= 1 && opcao <= 3) {
            concluirCadastro(scanner);
        } else if (opcao == 4) {
            comprarCasa();
        } else {
            return false;
        }
        return true;
    }

    private static void concluirCadastro(Scanner scanner) {
        System.out.println("Ótimo! Por favor conclua seu cadastro para darmos prosseguimento à compra!");
    
        String nome;
        do {
            System.out.print("Informe seu nome completo: ");
            nome = scanner.nextLine();
        } while (!validarNome(nome));
    
        String telefone;
        do {
            System.out.print("Informe seu telefone: ");
            telefone = scanner.nextLine();
        } while (!validarTelefone(telefone));
    
        System.out.print("Informe seu e-mail: ");
        String email = scanner.nextLine();
    
        System.out.println("Obrigado! Entraremos em contato para agendar uma visita ao imóvel!");
    }
    
    private static boolean validarNome(String nome) {
        // Verifica se o nome contém apenas letras e espaços
        return nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]+");
    }
    
    private static boolean validarTelefone(String telefone) {
        // Verifica se o telefone contém apenas números
        return telefone.matches("[0-9]+");
    }*/



}
