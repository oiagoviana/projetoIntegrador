public class cadastrarImovel {

  public static void main(String[] args) {

    cadastrarImovel();

  }

  public static void cadastrarImovel() {

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
    	System.out.println();
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$" + preco);
        System.out.println("Tipo: " + tipo);
        if (paraAlugar) {
          System.out.println("Para alugar");
          System.out.println("Quando o aluguel irá vencer");
          String vencer = LerDados.lerTexto();
        } else {
          System.out.println("Para vender");
        }
      }
    }

    System.out.println("Que tipo de propriedade você deseja?");
    System.out.println("1. Casa");
    System.out.println("2. Apartamento");
    System.out.println("3. Terreno");
    System.out.print("Escolha uma opção: ");
    String escolha = LerDados.lerTexto();
    String endereco;
    double preco;
    String tipo;
    boolean paraAlugar;
    
    if (escolha.equals("1")) {
    	tipo = "Casa";
    	System.out.print("Endereço da casa: ");
    	endereco = LerDados.lerTexto();
      
    	System.out.print("Preço da casa: R$");
    	preco = LerDados.lerDouble("Digite o preço da casa!");

    	System.out.print("Número de quartos: ");
    	int quartos = LerDados.lerInt("Digite a quantidade quartos da casa!");

    	System.out.print("A casa tem garagem? (s/n): ");
    	String temGaragemStr = LerDados.lerTexto();
    	boolean temGaragem = temGaragemStr.equalsIgnoreCase("sim");
       
    	System.out.print("Para alugar? Caso responda não será realizado a venda.(s/n): ");
    	String paraAlugarStr = LerDados.lerTexto();
    	paraAlugar = paraAlugarStr.equalsIgnoreCase("s");
      
      
    	Propriedade casa = new Propriedade(endereco, preco, tipo, paraAlugar);
    	System.out.println();
    	casa.mostrarInformacoes();
    	} else if (escolha.equals("2")) {
    	tipo = "Apartamento";
      
    	System.out.print("Endereço do apartamento: ");
    	endereco = LerDados.lerTexto();
      
    	System.out.print("Preço do apartamento: R$");
    	preco = LerDados.lerDouble("Digite o preço do apartamento!");
      
    	System.out.print("Andar do apartamento: ");
    	int andar = LerDados.lerInt("Digite o andar do apartamento!");

    	System.out.print("A casa tem garagem? (s/n): ");
    	String temGaragemStr = LerDados.lerTexto();

    	System.out.print("Para alugar? ");
    	String paraAlugarStr = LerDados.lerTexto();
    	paraAlugar = paraAlugarStr.equalsIgnoreCase("sim");
      
    	Propriedade apartamento = new Propriedade(endereco, preco, tipo, paraAlugar);
      	apartamento.mostrarInformacoes();

    } else if (escolha.equals("3")) {
    	tipo = "Terreno";
      
      	System.out.print("Endereço do terreno: ");
      	endereco = LerDados.lerTexto();
      
      	System.out.print("Preço do terreno: R$");
      	preco = LerDados.lerDouble("Digite o preço do terreno!");
      	paraAlugar = false;
      
      	Propriedade terreno = new Propriedade(endereco, preco, tipo, paraAlugar);
      	terreno.mostrarInformacoes();
    } else{
    	System.out.println("Opção inválida");
    } 
    
    if (escolha.equals("1") || escolha.equals("2") || escolha.equals("3")) {
    	System.out.println("\nInforme os seus dados para continuar.");

    	System.out.println("Nome: ");
    	String nome = LerDados.lerTexto();
    	nome = nome.replaceAll("[^a-zA-Z]", "");
    
    	System.out.println("CPF: ");
    	String cpf = LerDados.lerTexto();
    	cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos
    	String cpf2 = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
      
    	System.out.println("Telefone: ");
    	String telefone = LerDados.lerTexto();
    	telefone = telefone.replaceAll("[^0-9]", "");
    	String telefone2 = telefone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3");

    	System.out.println("E-mail: ");
    	String email = LerDados.lerTexto();
      
    	System.out.println("Cadastro realizado!");
    	}
  	}
 }