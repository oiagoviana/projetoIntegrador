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
                //listarApartamentoCompra();
            } else if(escolha.equals("3")){
                //listarTerrenoCompra;
            } else if (escolha.equals("4")) {
                agendarVisita();
            }else if(escolha.equals("X")){
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
    
    private static void agendarVisita() {
        System.out.println("Digite o endereço do imóvel a ser agendado:");
        var endereco = LerDados.lerTexto().toUpperCase();
        var propriedades = ArquivoCadastrar.lerTudo();
        var propriedade = Propriedade.buscar(propriedades, endereco);
        if (propriedade.isEmpty()) {
            System.out.println("Imóvel não encontrado.");
            return;
        }

        System.out.println("Digite a data de agendamento (dd/mm/aaaaa):");
        var dataStr = LerDados.lerTexto();
        System.out.println("Digite o horário de agendamento (HH:mm):");
        var horaStr = LerDados.lerTexto();

        try {
            LocalDate data = LocalDate.parse(dataStr);
            LocalTime hora = LocalTime.parse(horaStr);
            LocalDateTime dataHora = LocalDateTime.of(data, hora);
            System.out.println("Visita agendada para: " + dataHora);
        } catch (Exception e) {
            System.out.println("Data ou horário inválido. Tente novamente.");
        }
    }
        

}


