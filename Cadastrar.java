
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cadastrar {
    private static final String NOME_ARQUIVO = "cadastrarImoveis.txt";

    public static List<Propriedade> lerTudo() {
        List<Propriedade> imoveis = new ArrayList<>();
        try {
            List<String> linhas = Files.readAllLines(Path.of(NOME_ARQUIVO));
            for (String linha : linhas) {
                String[] partes = linha.split(",");
                if (partes.length == 6) { // Verificar se há informações suficientes
                    Propriedade propriedade = new Propriedade(
                            partes[0], // Endereço
                            Double.parseDouble(partes[1]), // Preço
                            partes[2], // Tipo
                            partes[3].equals("true"),// para Alugar
                           partes [4],  // nome
                           partes [5], //email
                           partes[6] //telefone
                         
                            
                    );
                    imoveis.add(propriedade);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imoveis;
    }

    public static void salvarTudo(List<Propriedade> imoveis) {
        List<String> linhas = imoveis.stream()
                .map(imovel -> imovel.endereco + "," + imovel.preco + "," + imovel.tipo + "," +
                        imovel.paraAlugar + "," + imovel.nome + "," + imovel.email + "," + imovel.telefone)
                .collect(Collectors.toList());
        try {
            Files.write(Path.of(NOME_ARQUIVO), linhas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void salvar(Propriedade imovel) {
        List<Propriedade> imoveis = lerTudo();
        imoveis.removeIf(v -> v.endereco.equalsIgnoreCase(imovel.endereco));
        imoveis.add(imovel);
        salvarTudo(imoveis);
    }


    
}













