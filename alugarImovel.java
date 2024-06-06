public class alugarImovel {

    public static void MenuAlugarCasa(){
        while (true) {
            System.out.println("");
            System.out.println("1 - Listar Casa");
            System.out.println("2 - Listar Apartamento");
            System.out.println("3 - Agendar Visita");
            System.out.println("X - VOLTAR");
            var escolha = LerDados.lerTexto().toUpperCase();

            if(escolha.equals("1")){
                listarCasaAlugar();
            } else if(escolha.equals("2")){
                listarApartamentoAlugar();
            } else if (escolha.equals("3")) {
                agendarVisita();
            }else if(escolha.equals("X")){
                return;
            }
        }
    }
    

    private static void listarCasaAlugar(){
        var propriedades = ArquivoCadastrar.lerTudo();
		for(var p: propriedades) {
            if(p.tipoImovel().equalsIgnoreCase("casa") && !p.situacaoImovel() ){
			System.out.println();
			mostrarPropriedades(p);
            }	
		}
    }
    
    private static void listarApartamentoAlugar() {
    	var propriedades = ArquivoCadastrar.lerTudo();
    	for(var p: propriedades) {
    		if(p.tipoImovel().equalsIgnoreCase("apartamento") && !p.situacaoImovel()) {
    			System.out.println();
    			mostrarPropriedades(p);
    		}
    	}
    }
    

    private static void mostrarPropriedades(Propriedade p) {
    	System.out.println("Registro: "               + p.Id()         );
		System.out.println("Endereço: "               + p.endereco()   );
		System.out.println("Preço: "                  + p.preco()      );
		System.out.println("Tipo do Imóvel: "         + p.tipoImovel() );
		System.out.println("Tipo(Vender ou alugar): " + p.tipo()       );
		System.out.println("Nome: "                   + p.nome()       );
		System.out.println("Telefone: "               + p.telefone()   );
	}
    
    private static void agendarVisita() {
        System.out.println("Digite o registro do imóvel a ser agendado:");
        var Id = LerDados.lerInt("Tente novamente");
        var propriedades = ArquivoCadastrar.lerTudo();
        var propriedade = Propriedade.buscar(propriedades, Id);
        if (propriedade.isEmpty()) {
            System.out.println("Imóvel não encontrado.");
            return;
        }
        	
        	System.out.println("Digite a data de agendamento (DD/MM/AAAA HH:MM:SS):");
        	var data = LerDados.lerDataHora("Informe a data corretamente (DD/MM/AAAA HH:MM:SS)");
        	
       
		        try {
		            System.out.println("Visita agendada para: " + data);
		            
		        } catch (Exception e) {
		            System.out.println("Data ou horário inválido. Tente novamente.");
		        }
    }
}
