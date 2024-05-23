public class cadastrarImovel {


	public static void cadastrarImovel() {

		System.out.println("Passe as informações de seu imóvel.");
		System.out.println();
		
		System.out.println("Digite o endereço do imóvel:");
		var endereco = LerDados.lerTexto2("Informe um endereço!");
		
		System.out.println("Digite o preço do imóvel");
		var preco = LerDados.lerBigDecimal(2, "Informe um preço!");

		System.out.println("Informe o tipo do imóvel (Casa/Apartamento/Terreno)");
		var tipoImovel = LerDados.lerTexto2("Informe o tipo do imóvel!!!");
		
		if(tipoImovel.equals("Casa") || tipoImovel.equals("Apartamento")){}
		System.out.println("Informe se o imóvel é para vender (sim/nao)");
		var tipo = LerDados.lerSimNao("Informe o tipo do imóvel!");
		
		System.out.println("Passe suas informações pessoais.");
		System.out.println();
		
		System.out.println("Informe seu nome:");
		var nome = LerDados.lerTexto2("INFORME SEU NOME!");
		
		System.out.println("Informe seu e-mail");
		var email = LerDados.lerTexto2("INFORME SEU E-MAIL!");
		
		System.out.println("Informe seu telefone:");
		var telefone = LerDados.lerTexto2("INFORME SEU TELEFONE!");
		
		
		var imovel = new Propriedade(endereco, preco, tipoImovel, tipo, nome, email, telefone);
		ArquivoCadastrar.salvar(imovel);
		System.out.println("Imóvel cadastrado.");		
		
		
	}
}