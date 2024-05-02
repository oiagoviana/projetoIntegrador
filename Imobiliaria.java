public class Imobiliaria {

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("A - Cadastrar Imóvel");
            System.out.println("B - Comprar Imóvel");
            System.out.println("C - Alugar Imóvel");
            System.out.println("X - Sair");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var escolha = LerDados.lerTexto();
            
            System.out.println();

            if (escolha.equalsIgnoreCase("a")) {
                cadastrarImovel.cadastrarImovel();
                
            } else if (escolha.equalsIgnoreCase("b")) {
            	System.out.println("1 - Comprar Apartamento");
             	System.out.println("2 - Comprar Casa");
             	System.out.println("3 - Comprar Terreno");
            	var subEscolha = LerDados.lerTexto();
                if(subEscolha.equalsIgnoreCase("1")){
                    comprarAp.comprarAp();
                } else if(subEscolha.equalsIgnoreCase("2")){
                    comprarCasa.comprarCasa();
                } else if(subEscolha.equalsIgnoreCase("3")){
                    comprarTerreno.comprarTerreno();
                }
                
               
            } else if(escolha.equalsIgnoreCase("c")){
                alugarImovel.alugarImovel();
            } else if (escolha.equalsIgnoreCase("X")) {
                return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }
}
