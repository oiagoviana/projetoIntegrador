import java.util.List;

public class arquivoAlugar {

	    private static final String ARQUIVO = "alugar.txt";

	    public static List<alugarImovel> lerTudo() {
	        var listona = arquivo.lerLinhas(ARQUIVO);
	        return alugarImovel.construirTodos(listona);
	    }
	    
	

}
