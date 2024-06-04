import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class comprarImovel {

    public static void MenuComprarCasa(){
        while (true) {
            System.out.println("");
            System.out.println("1 - Listar Casa");
            System.out.println("2 - Listar Apartamento");
            System.out.println("3 - Listar Terreno");
            System.out.println("4 - Agendar Visita");
            System.out.println("X - VOLTAR");
            var escolha = LerDados.lerTexto().toUpperCase();

            if(escolha.equals("1")){
                listarCasaCompra();
            } else if(escolha.equals("2")){
                listarApartamentoCompra();
            } else if(escolha.equals("3")){
                listarTerrenoCompra();
            } else if (escolha.equals("4")) {
                agendarVisita();
            }else if(escolha.equals("X")){
                return;
            }
        }
    }
    

    private static void listarCasaCompra(){
        var propriedades = ArquivoCadastrar.lerTudo();
		for(var p: propriedades) {
            if(p.tipoImovel().equalsIgnoreCase("casa") && !p.situacaoImovel() ){
			System.out.println();
			mostrarPropriedades(p);
            }
			
		}
    }
    
    private static void listarApartamentoCompra() {
    	var propriedades = ArquivoCadastrar.lerTudo();
    	for(var p: propriedades) {
    		if(p.tipoImovel().equalsIgnoreCase("apartamento") && !p.situacaoImovel()) {
    			System.out.println();
    			mostrarPropriedades(p);
    		}
    	}
    }
    
    private static void listarTerrenoCompra() {
    	var propriedades = ArquivoCadastrar.lerTudo();
    	for(var p: propriedades) {
    		if(p.tipoImovel().equalsIgnoreCase("terreno") && !p.situacaoImovel()) {
    			System.out.println();
    			mostrarPropriedades(p);
    		}
    	}
    }

    private static void mostrarPropriedades(Propriedade p) {
		System.out.println("Endereço: "       + p.endereco()   );
		System.out.println("Preço: "          + p.preco()      );
		System.out.println("Tipo do Imóvel: " + p.tipoImovel() );
		System.out.println("Tipo: "           + p.tipo()       );
		System.out.println("Nome: "           + p.nome()       );
		System.out.println("Telefone: "       + p.telefone()   );
        System.out.println("Situação Venda: " + p.situacaoImovel());
	}
    
    private static void agendarVisita() {
        System.out.println("Digite o endereço do imóvel a ser agendado:");
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


