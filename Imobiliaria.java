public class Imobiliaria {

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("A - Cadastrar Imóvel");
            System.out.println("B - Buscar Imóvel");
            System.out.println("X - Sair");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var escolha = LerDados.lerTexto().toUpperCase();
            System.out.println();

            if (escolha.equals("A")) {
                cadastrarImovel.cadastrarImovel();
            } else if (escolha.equals("B")) {
                buscarImovel.listarCasa();
            } else if (escolha.equals("X")) {
                return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }
}