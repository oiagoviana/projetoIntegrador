
public class comprarImovel {

    public static void MenuComprarCasa(){
        while (true) {
            System.out.println("");
            System.out.println("1 - Listar Casa");
            System.out.println("2 - Listar Apartamento");
            System.out.println("3 - Listar Terreno");
            System.out.println("X - VOLTAR");
            var escolha = LerDados.lerTexto().toUpperCase();

            if(escolha.equals("1")){
                listarCasaCompra();
            } else if(escolha.equals("2")){
                //listarApartamentoCompra();
            } else if(escolha.equals("3")){
                //listarTerrenoCompra;
            } else if(escolha.equals("X")){
                return;
            }
        }
    }
    

    public static void listarCasaCompra(){
        var propriedades = ArquivoCadastrar.lerTudo();
		for(var p: propriedades) {
            if(p.tipoImovel().equalsIgnoreCase("casa") && !p.situacaoImovel() ){
			System.out.println();
			mostrarPropriedades(p);
            }
			
		}
    }

    /*public static void listarApartamentoCompra(){
        var propriedades = ArquivoCadastrar.lerTudo();
		for(var p: propriedades) {
            if(p.tipoImovel().equalsIgnoreCase("casa") && !p.situacaoImovel() ){
			System.out.println();
			mostrarPropriedades(p);
            }
			
		}
    }*/

    /*public static void listarTerrenoCompra(){
        var propriedades = ArquivoCadastrar.lerTudo();
		for(var p: propriedades) {
            if(p.tipoImovel().equalsIgnoreCase("casa") && !p.situacaoImovel() ){
			System.out.println();
			mostrarPropriedades(p);
            }
		}
    }*/


    private static void mostrarPropriedades(Propriedade p) {
		System.out.println("Endereço: "       + p.endereco()   );
		System.out.println("Preço: "          + p.preco()      );
		System.out.println("Tipo do Imóvel: " + p.tipoImovel() );
		System.out.println("Tipo: "           + p.tipo()       );
		System.out.println("Nome: "           + p.nome()       );
		System.out.println("Telefone: "       + p.telefone()   );
        System.out.println("Situação Venda: " + p.situacaoImovel());
	}
    





}
