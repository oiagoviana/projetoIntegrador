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
                cadastrarImovel.MenuImovel();
                
            } else if (escolha.equalsIgnoreCase("b")) {
            	comprarImovel.MenuComprarCasa();
                
            } else if(escolha.equalsIgnoreCase("c")){
                alugarImovel.MenuAlugarCasa();
            } else if (escolha.equalsIgnoreCase("X")) {
                return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }
}
