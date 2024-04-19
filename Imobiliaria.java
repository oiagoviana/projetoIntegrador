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
            System.out.println("A - Cadastrar Imovel");
            System.out.println("B - Listar Casas");
            System.out.println("B - Listar Apartamentos");
            System.out.println("B - Listar Terrenos");
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
                cadastrarImovel();
            } else if (escolha.equals("X")) {
                return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }

    private static void cadastrarImovel() {
        System.out.println("Informe o tipo de imóvel (Casa, Apartamento ou Terreno)");
        var tipoImovel = LerDados.lerTexto();

        // DADOS CASA
        if (tipoImovel.equals("Casa")) {
            System.out.println("Informe o local da casa");
            var localizacaoCasa = LerDados.lerTexto();

            System.out.println("Informe a quantidade de comodos da casa");
            var comodosCasa = LerDados.lerTexto();

            System.out.println("Tem garagem?(sim/não)");
            var garagemCasa = LerDados.lerTexto().toUpperCase();
            if (garagemCasa.equals("SIM")) {
                System.out.println("Quantas vagas?");
                var vagasCasa = LerDados.lerInt("");
            }

            System.out.println("Informe o valor da casa");
            var valorCasa = LerDados.lerInt("");

        }
        // DADOS APARTAMENTO
        if (tipoImovel.equals("Apartamento")) {
            System.out.println("Informe o local do apartamento");
            var localizacaoApartamento = LerDados.lerTexto();

            System.out.print("Informe quantos comodos tem o apartamento");
            var comodosApartamento = LerDados.lerInt("");

            System.out.println("Informe o andar do apartamento");
            var andarApartamento = LerDados.lerInt("");

            System.out.println("Tem garagem?(sim/não)");
            var garagemApartamento = LerDados.lerTexto().toUpperCase();
            if (garagemApartamento.equals("SIM")) {
                System.out.println("Quantas vagas?");
                var vagasApartamento = LerDados.lerInt("");
            }

            System.out.println("Informe o valor do apartamento");
            var valorApartamento = LerDados.lerInt("");

        }

        // DADOS APARTAMENTO
        if (tipoImovel.equals("Terreno")) {
            System.out.println("Informe o local do terreno");
            var localizacaoTerreno = LerDados.lerTexto();

            System.out.println("Informe quantos mêtros quadrados o terreno tem");
            var metrosTerreno = LerDados.lerTexto();

            System.out.println(("Valor do terreno"));
            var valorTerreno = LerDados.lerInt("");
        }

    }
}
