import java.util.List;

public class ArquivoAlugar {

	    private static final String ARQUIVO = "alugar.txt";

	    public static boolean arquivoExiste() {
			return arquivo.arquivoExiste(ARQUIVO);
		}
		
		public static List<alugar> lerTudo() {
	        var listona = arquivo.lerLinhas(ARQUIVO);
	        return alugar.construirTodos(listona);
	    }

		public static void salvarTudo(List<alugar> tudo) {
			var listona = alugar.desconstruirTodos(tudo);
			arquivo.escreverLinhas(listona, ARQUIVO);
		}
	
		/*public static boolean deletar(String chaveProcurada) {
			var tudo = lerTudo();
			var deletou = tudo.removeIf(v -> v.chave().equalsIgnoreCase(chaveProcurada));
			salvarTudo(tudo);
			return deletou;
		}*/
	
		/*public static void salvar(alugar registro) {
			var tudo = lerTudo();
			tudo.removeIf(v -> v.chave().equalsIgnoreCase(registro.chave()));
			tudo.add(registro);
			salvarTudo(tudo);
		}*/


}