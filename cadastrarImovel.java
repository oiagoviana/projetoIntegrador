public class cadastrarImovel {
	
		public static void MenuImovel() {
			while (true) {
	            System.out.println("Escolha uma opção:");
	            System.out.println("A - Cadastrar Imóvel");
	            System.out.println("B - Listar Imóvel");
	            System.out.println("C - Buscar Imóvel");
	            System.out.println("D - Excluir Imóvel");
	            System.out.println("X - VOLTAR");
	            System.out.println();
	            System.out.print("Digite a sua escolha: ");
	            var escolha = LerDados.lerTexto().toUpperCase();

	            if (escolha.equals("A")) {
	                cadastroImovel();
	            } else if (escolha.equals("B")) {
	                listarImovel();
	            } else if (escolha.equals("C")) {
	                buscarPropriedade();
	            } else if (escolha.equals("D")) {
	                excluirPropriedade();
	            } else if (escolha.equals("X")) {
	                return;
	            } else {
	                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
	            }
	            System.out.println();
	        }
	    }
		


	public static void cadastroImovel() {
		var tipo = true;

		System.out.println("Passe as informações de seu imóvel.");
		System.out.println();
		
		System.out.println("Digite o endereço do imóvel:");
		var endereco = LerDados.lerTexto2("Informe um endereço!");
		
		System.out.println("Digite o preço do imóvel");
		var preco = LerDados.lerBigDecimal(2, "Informe um preço!");

		System.out.println("Informe o tipo do imóvel (Casa/Apartamento/Terreno)");
		var tipoImovel = LerDados.lerTexto2("Informe o tipo do imóvel!!!");
		
		 
		
		if(tipoImovel.equalsIgnoreCase("Casa") || tipoImovel.equalsIgnoreCase("Apartamento")) {
		System.out.println("Informe se o imóvel é para vender (sim/nao)");
		tipo = LerDados.lerSimNao("Informe o tipo do imóvel!");
		}
		
		System.out.println();
		System.out.println("Passe suas informações pessoais.");
		System.out.println();
		
		System.out.println("Informe seu nome:");
		var nome = LerDados.lerTexto2("INFORME SEU NOME!");
		
		System.out.println("Informe seu e-mail");
		var email = LerDados.lerTexto2("INFORME SEU E-MAIL!");
		
		System.out.println("Informe seu telefone:");
		var telefone = LerDados.lerTexto2("INFORME SEU TELEFONE!");

		boolean situacaoImovel = false;
		

		/*complemento, garagem, comodos, localProximo(estação, shopping, metro) */
		
		var imovel = new Propriedade(endereco, preco, tipoImovel, tipo, nome, email, telefone, situacaoImovel);
		ArquivoCadastrar.salvar(imovel);
		System.out.println("Imóvel cadastrado.");		
	}
	
	
	private static void listarImovel() {
		var propriedades = ArquivoCadastrar.lerTudo();
		for(var p: propriedades) {
			System.out.println();
			mostrarPropriedades(p);
			
		}
		
	}
	
	private static void buscarPropriedade() {
		System.out.println("");
		System.out.println("Digite o endereço: ");
		var endereco = LerDados.lerTexto().toUpperCase();
		
		var propriedades = ArquivoCadastrar.lerTudo();
		var encontrou = Propriedade.buscar(propriedades, endereco);
		if (encontrou.isEmpty()) {
			System.out.println("Não encontrei está propriedade.");
		}else {
			mostrarPropriedades(encontrou.get());
		}
	}
	
	private static void excluirPropriedade() {
		System.out.println("");
		System.out.println("Digite o endereço: ");
		var endereco = LerDados.lerTexto().toUpperCase();
		
		var excluir = ArquivoCadastrar.deletar(endereco);
		if(excluir) {
			System.out.println("Deletado.");
		} else {
			System.out.println("Propriedade inexistente..");
		}
	}
	
	private static void mostrarPropriedades(Propriedade p) {
		System.out.println("Endereço: "       + p.endereco()   );
		System.out.println("Preço: "          + p.preco()      );
		System.out.println("Tipo do Imóvel: " + p.tipoImovel() );
		System.out.println("Tipo: "           + p.tipo()       );
		System.out.println("Nome: "           + p.nome()       );
		System.out.println("Telefone: "       + p.telefone()   );
	}
	
	
}