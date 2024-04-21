import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    System.out.println("Por favor, responda algumas perguntas para encontrar a casa mais adequada para você.");

    System.out.println("Em que local você gostaria de morar? ");
    System.out.println("A-Centro");
    System.out.println("B-Subúrbio");
    System.out.println("C-Periferia");
    String localizacao = scanner.nextLine();
    
    System.out.println("Deseja uma casa próxima a uma estação de metrô (s/n)?");
    char respMetro = scanner.next().charAt(0);
    boolean metro = (respMetro == 's' || respMetro == 'S'); 

    System.out.println("Quantos quartos você precisa? ");
    int numQuartos = scanner.nextInt();
    
    System.out.print("Você precisa de garagem (s/n)? ");
    char respostaGaragem = scanner.next().charAt(0);
    boolean temGaragem = (respostaGaragem == 's' || respostaGaragem == 'S');

    System.out.println("Qual é o valor máximo que você pode pagar pela casa? ");
    double valorMaximo = scanner.nextDouble();
    scanner.nextLine();

    // Verificando as preferências do comprador
    //Centro casa 1 
    if (localizacao.equalsIgnoreCase("A") && metro && numQuartos == 1 && temGaragem && valorMaximo >= 400000) {
        System.out.println("Parabéns! Temos uma ótima opções para você no centro da cidade.");
        System.out.println("Temos uma casa com 1 quarto, 2 banheiros e 1 vaga para carro localizada em Centro, São Paulo-SP, no valor de R$ 400.000!");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }


    //Centro casa 2     
    } else if (localizacao.equalsIgnoreCase("A") && metro && numQuartos == 2 && temGaragem && valorMaximo >= 500000) {
        System.out.println("Parabéns! Temos uma ótima opções para você no centro da cidade.");
        System.out.println("Temos uma casa com 2 quartos, 2 banheiros e 2 vagas para carro localizado em Centro, São Paulo-SP, no valor de R$ 500.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }

    //Centro casa 3
    } else if (localizacao.equalsIgnoreCase("A") && metro && numQuartos == 3 && temGaragem && valorMaximo >= 600000) {
        System.out.println("Parabéns! Temos uma ótima opções para você no centro da cidade.");
        System.out.println("Temos uma casa com 3 quartos, 2 banheiros e 2 vagas para carro localizado em Republica, São Paulo-SP, no valor de R$ 600.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }

    
    //Suburbio A    
    } else if (localizacao.equalsIgnoreCase("B") && metro && numQuartos >= 1 && temGaragem && valorMaximo >= 200000) {
        System.out.println("Encontramos uma bela casa no subúrbio que pode atender às suas necessidades.");
        System.out.println("Temos uma casa com 1 quartos, 1 banheiros e 1 vagas para carro localizado em Santo Amaro-SP, no valor de R$ 250.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }

    //suburbio B
    } else if (localizacao.equalsIgnoreCase("B") && metro && numQuartos == 2 && temGaragem && valorMaximo >= 280000) {
        System.out.println("Encontramos uma bela casa no subúrbio que pode atender às suas necessidades.");
        System.out.println("Temos uma casa com 2 quartos, 1 banheiros e 1 vagas para carro localizado em Santo Amaro-SP, no valor de R$ 300.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }


    //suburbuio C
    } else if (localizacao.equalsIgnoreCase("B") && metro && numQuartos == 3 && temGaragem && valorMaximo >= 350000) {
        System.out.println("Encontramos uma bela casa no subúrbio que pode atender às suas necessidades.");
        System.out.println("Temos uma casa com 3 quartos, 2 banheiros e 1 vagas para carro localizado em Santo Amaro-SP, no valor de R$ 350.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }


    //Periferia A
    } else if (localizacao.equalsIgnoreCase("C") && numQuartos >= 1 && valorMaximo >= 100000) {
        System.out.println("Há uma casa aconchegante na periferia que pode se encaixar no seu orçamento.");
        System.out.println("Temos uma casa com 1 quartos, 1 banheiros localizado em Grajaú-SP, no valor de R$ 115.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }

    //Periferia B
    } else if (localizacao.equalsIgnoreCase("C") && numQuartos == 2 && valorMaximo >= 130000) {
        System.out.println("Há uma casa aconchegante na periferia que pode se encaixar no seu orçamento.");
        System.out.println("Temos uma casa com 2 quartos, 1 banheiros e 1 vaga para carro, localizado em jardim Gaivotas, no valor de R$ 150.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }

    //periferia C
    } else if (localizacao.equalsIgnoreCase("C") && numQuartos == 3 && valorMaximo >= 150000) {
        System.out.println("Há uma casa aconchegante na periferia que pode se encaixar no seu orçamento.");
        System.out.println("Temos uma casa com 3 quartos, 2 banheiros e 2 vagas para carro, localizado em Grajaú-SP, no valor de R$ 175.000! ");
        System.out.println("Deseja prosseguir (s/n)? ");

        String Resposta = scanner.nextLine(); //le a Resposta do usuario

        if (Resposta.equalsIgnoreCase("s")) {
            System.out.println("Ótimo! Por favor conclua seu cadastro para darmos processedência a compra!");

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Informe seu cpf:");
            String cpf = scanner.nextLine();

            System.out.println("Infome seu telefone:");
            String tel = scanner.nextLine();

            System.out.println("Informe seu e-mail:");
            String email = scanner.nextLine();

            System.out.println("Obrigado! Entraremos em contato para agentar uma visita ao imóvel!");

        } else if (Resposta.equals("n")) {
            System.out.println("Entendido! Obrigado por sua resposta.");
        } else {
            System.out.println("Desculpe, não entendi sua resposta.");
        }

    } else {
        System.out.println("Desculpe, não encontramos nenhuma casa que atenda às suas preferências.");
    }

    scanner.close();
}
}
