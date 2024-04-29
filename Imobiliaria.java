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
                comprarImovel.comprarCasa();
            } else if(escolha.equalsIgnoreCase("c")){
                alugarImovel.alugarImovel();
            } else if (escolha.equals("X")) {
                return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }
}