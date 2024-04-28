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




---------------------------------------


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
      class Propriedade {
        String endereco;
        double preco;
        String tipo;
        boolean paraAlugar;
        

        public Propriedade(String endereco, double preco, String tipo, boolean paraAlugar) {
            this.endereco = endereco;
            this.preco = preco;
            this.tipo = tipo;
            this.paraAlugar = paraAlugar;
        }

        public void mostrarInformacoes() {
            System.out.println("Endereço: " + endereco);
            System.out.println("Preço: R$" + preco);
            System.out.println("Tipo: " + tipo);
          if(paraAlugar){
            System.out.println("Para alugar");
            System.out.println("Quando o aluguel irá vencer");
            String vencer = scanner.nextLine();            
          }
          else{
            System.out.println("Para vender");
          }
        }
      }


            System.out.println("Que tipo de propriedade você deseja?");
            System.out.println("1. Casa");
            System.out.println("2. Apartamento");
            System.out.println("3. Terreno");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            String endereco;
            double preco;
            String tipo;
            boolean paraAlugar;
  
            if(escolha == 1){
              tipo = "Casa";
              System.out.print("Endereço da casa: ");
              endereco = scanner.nextLine();
              System.out.print("Preço da casa: R$");
              preco = scanner.nextDouble();
              scanner.nextLine(); 
              System.out.print("Número de quartos: ");
              int quartos = scanner.nextInt();
              scanner.nextLine(); 
              System.out.print("A casa tem garagem? (s/n): ");
              String temGaragemStr = scanner.nextLine();
              boolean temGaragem = temGaragemStr.equalsIgnoreCase("sim");
              System.out.print("Para alugar? Caso responda não será realizado a venda.(s/n): ");
              String paraAlugarStr = scanner.nextLine();
              paraAlugar = paraAlugarStr.equalsIgnoreCase("s");
              Propriedade casa = new Propriedade(endereco, preco, tipo, paraAlugar);
              casa.mostrarInformacoes();
              
            } else if(escolha == 2){
              tipo = "Apartamento";
              System.out.print("Endereço do apartamento: ");
              endereco = scanner.nextLine();
              System.out.print("Preço do apartamento: R$");
              preco = scanner.nextDouble();
              scanner.nextLine(); 
              System.out.print("Andar do apartamento: ");
              int andar = scanner.nextInt();
              scanner.nextLine(); 
              System.out.print("A casa tem garagem? (s/n): ");
              String temGaragemStr = scanner.nextLine();
              System.out.print("Para alugar? ");
              String paraAlugarStr = scanner.nextLine();
              paraAlugar = paraAlugarStr.equalsIgnoreCase("sim");
              Propriedade apartamento = new Propriedade(endereco, preco, tipo, paraAlugar);
              apartamento.mostrarInformacoes();
            } else if(escolha == 3){
              tipo = "Terreno";
              System.out.print("Endereço do terreno: ");
              endereco = scanner.nextLine();
              System.out.print("Preço do terreno: R$");
              preco = scanner.nextDouble();
              scanner.nextLine(); 
              paraAlugar = false;
              Propriedade terreno = new Propriedade(endereco, preco, tipo, paraAlugar);
              terreno.mostrarInformacoes();
              
            } else{
              System.out.println("Opção inválida");
            }
      
      
           
            
            if(escolha == 1 || escolha == 2 || escolha == 3){
            System.out.println("Informe os seus dados para continuar.");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();
              nome = nome.replaceAll("[^a-zA-Z]", ""); 
              System.out.println(nome);
          
            
              
            System.out.println("CPF: ");
              
              String cpf = scanner.nextLine();
              cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos
              String cpf2 = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
              System.out.println(cpf2);
              
            System.out.println("Telefone: ");
            String telefone = scanner.nextLine();
            telefone = telefone.replaceAll("[^0-9]", "");
              String telefone2 = telefone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3");
              System.out.println(telefone2);
              
              
              scanner.nextLine(); //scanner vazio por conta que estava dando erro por ter dois nextLine existentes (nome, email)
              
            System.out.println("E-mail: ");
            String email = scanner.nextLine();

              System.out.println("Cadastro realizado!");
              
            }
        scanner.close();
    }
}
