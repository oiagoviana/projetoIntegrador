import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record alugar (
        String nome,
        int estoque,
        BigDecimal preco
) {
    private static final int CAMPOS = alugar.class.getRecordComponents().length;

    public String precoString() {
        return preco.toPlainString();
    }

    public List<String> desconstruir() {
        return List.of(nome, "" + estoque, precoString());
    }

    public static alugar construir(List<String> listinha) {
        if (listinha.size() != CAMPOS) throw new IllegalArgumentException();
        return new alugar(
                listinha.get(0),
                Integer.parseInt(listinha.get(1)),
                new BigDecimal(listinha.get(2)).setScale(2)
        );
    }

    public static List<alugar> construirTodos(List<String> listona) {
        if (listona.size() % CAMPOS != 0) throw new IllegalArgumentException();
        var resultado = new ArrayList<alugar>(listona.size() / CAMPOS);
        for (int i = 0; i < listona.size(); i += CAMPOS) {
            var listinha = listona.subList(i, i + CAMPOS);
            var elemento = construir(listinha);
            resultado.add(elemento);
        }
        return resultado;
    }

    public static List<String> desconstruirTodos(List<alugar> todos) {
        var listona = new ArrayList<String>(todos.size() * CAMPOS);
        for (var v : todos) {
            listona.addAll(v.desconstruir());
        }
        return listona;
    }

    public static Optional<alugar> buscar(List<alugar> tudo, String nomeProcurado) {
        return tudo.stream().filter(v -> v.nome().equalsIgnoreCase(nomeProcurado)).findAny();
    }
}
