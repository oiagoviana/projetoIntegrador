import java.util.List;
public class ArquivoCadastrar {
	
	private static final String ARQUIVO = "propriedade.txt";
	
	public static List<Propriedade> lerTudo() {
        var listona = arquivo.lerLinhas(ARQUIVO);
        return Propriedade.construirTodos(listona);
    }

    public static void salvarTudo(List<Propriedade> tudo) {
        var listona = Propriedade.desconstruirTodos(tudo);
        arquivo.escreverLinhas(listona, ARQUIVO);
    }

    public static boolean deletar(String endereco) {
        var tudo = lerTudo();
        var deletou = tudo.removeIf(p -> p.endereco().equalsIgnoreCase(endereco));
        salvarTudo(tudo);
        return deletou;
    }

    public static void salvar(Propriedade endereco) {
        var tudo = lerTudo();
        tudo.removeIf(p -> p.endereco().equalsIgnoreCase(endereco.endereco()));
        tudo.add(endereco);
        salvarTudo(tudo);
    }
}	
