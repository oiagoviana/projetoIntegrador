public class Imobiliaria {

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("A - Cadastrar veículo");
            System.out.println("B - Listar veículos");
            System.out.println("X - Sair");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var escolha = LerDados.lerTexto().toUpperCase();
            System.out.println();

            if (escolha.equals("A")) {
                cadastrarVeiculo();
            } else if (escolha.equals("B")) {
                listarVeiculos();
            } else if (escolha.equals("C")) {
                buscarVeiculo();
            } else if (escolha.equals("D")) {
                manutencao();
            } else if (escolha.equals("E")) {
                vendaDePecas();
            } else if (escolha.equals("F")) {
                limpeza();
            } else if (escolha.equals("G")) {
                pintura();
            } else if (escolha.equals("X")) {
                return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }
}