public class cadastrarImovel {

  public static void main(String[] args) {

    cadastrarImovel();

  }

  public static void cadastrarImovel() {

    System.out.println("Que tipo de propriedade você deseja?");
    System.out.println("1. Casa");
    System.out.println("2. Apartamento");
    System.out.println("3. Terreno");
    System.out.println("Escolha uma opção: ");
    String escolha = LerDados.lerTexto();
    String endereco;
    double preco;
    String tipo;
    boolean paraAlugar;
	String nome;
	String email;
	String telefone;

		
	
}}
    
    /*if (escolha.equals("1")) {
    	tipo = "Casa";
    	System.out.println("Endereço da casa: ");
    	endereco = LerDados.lerTexto2("Digite o endereço da casa!");
      
    	System.out.println("Preço da casa: R$");
    	preco = LerDados.lerDouble("Digite o preço da casa!");

    	System.out.println("Número de quartos: ");
    	int quartos = LerDados.lerInt("Digite a quantidade quartos da casa!");

    	System.out.println("A casa tem garagem? (s/n): ");
    	String temGaragemStr = LerDados.lerTexto2("Digite a sua resposta!1");
    	boolean temGaragem = temGaragemStr.equalsIgnoreCase("sim");
       
    	System.out.println           ("Para alugar? Caso responda não será realizado a venda.(s/n): ");
    	String paraAlugarStr = LerDados.lerTexto2("Digite a sua resposta!");
    	paraAlugar = paraAlugarStr.equalsIgnoreCase("s");
      
      
    	Propriedade casa = new Propriedade(endereco, preco, tipo, paraAlugar, nome, email, telefone);
    	System.out.println();
    	casa.mostrarInformacoes();
    	} else if (escolha.equals("2")) {
    	tipo = "Apartamento";
      
    	System.out.println("Endereço do apartamento: ");
    	endereco = LerDados.lerTexto2("Digite o endereço do apartamento!");
      
    	System.out.println("Preço do apartamento: R$");
    	preco = LerDados.lerDouble("Digite o preço do apartamento!");
      
    	System.out.println("Andar do apartamento: ");
    	int andar = LerDados.lerInt("Digite o andar do apartamento!");

    	System.out.println("A casa tem garagem? (s/n): ");
    	String temGaragemStr = LerDados.lerTexto2("Digite a sua resposta!");

    	System.out.println("Para alugar? Caso responda não será realizado a venda.(s/n) ");
    	String paraAlugarStr = LerDados.lerTexto2("Digite a sua resposta!");
    	paraAlugar = paraAlugarStr.equalsIgnoreCase("sim");
      
    	Propriedade apartamento = new Propriedade(endereco, preco, tipo, paraAlugar, nome, email, telefone);
      	apartamento.mostrarInformacoes();

    } else if (escolha.equals("3")) {
    	tipo = "Terreno";
      
      	System.out.println("Endereço do terreno: ");
      	endereco = LerDados.lerTexto2("Digite o endereço do terreno!");
      
      	System.out.println("Preço do terreno: R$");
      	preco = LerDados.lerDouble("Digite o preço do terreno!");
      	paraAlugar = false;
      
      	Propriedade terreno = new Propriedade(endereco, preco, tipo, paraAlugar, nome, telefone, email);
      	terreno.mostrarInformacoes();
    } else{
    	System.out.println("Opção inválida");
    } 
    
    if (escolha.equals("1") || escolha.equals("2") || escolha.equals("3")) {
    	System.out.println("\nInforme os seus dados para continuar.");

    	System.out.println("Nome: ");
    	 nome = LerDados.lerTexto2("Digite o seu nome!");
    	nome = nome.replaceAll("[^a-zA-Z]", "");
    
    	System.out.println("CPF: ");
    	String cpf = LerDados.lerTexto2("Digite o seu CPF!");
    	cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos

    	String cpf2 = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
      
    	System.out.println("Telefone: ");
       telefone = LerDados.lerTexto2("Digite o seu telefone!");
    	telefone = telefone.replaceAll("[^0-9]", "");
    	String telefone2 = telefone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3");

    	System.out.println("E-mail: ");
        email = LerDados.lerTexto2("Digite o seu e-mail!");

		
    	System.out.println("Cadastro realizado!");
      	}*/
