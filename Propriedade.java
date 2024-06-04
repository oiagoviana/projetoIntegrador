import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public record Propriedade (
        int Id,
		String endereco,       
        BigDecimal preco,
        String tipoImovel,
        boolean tipo,
        String nome,
        String email,
        String telefone,
        boolean situacaoImovel
) {
    private static final int CAMPOS = Propriedade.class.getRecordComponents().length + 1;
    
    public List<String> desconstruir() {
        return List.of("" + Id, endereco, preco.toEngineeringString(), tipoImovel, tipo ? "Vender" : "Alugar", nome, email, telefone, situacaoImovel ? "Vendida" : "A venda", "");
    }
    
    public static Propriedade construir(List<String> listinha) {
        if (listinha.size() != CAMPOS) throw new IllegalArgumentException();
        return new Propriedade(
        		Integer.parseInt(listinha.get(0)),
        		listinha.get(1),
                new BigDecimal(listinha.get(2)).setScale(2),
                listinha.get(3),
                listinha.get(4).equals("SIM"),
                listinha.get(5),
                listinha.get(6),
                listinha.get(7),
                listinha.get(8).equals("SIM")
               
        );
    }

    public static List<Propriedade> construirTodos(List<String> listona) {
        if (listona.size() % CAMPOS != 0) throw new IllegalArgumentException();
        var resultado = new ArrayList<Propriedade>(listona.size() / CAMPOS);
        for (int i = 0; i < listona.size(); i += CAMPOS) {
            var listinha = listona.subList(i, i + CAMPOS);
            var elemento = construir(listinha);
            resultado.add(elemento);
        }
        return resultado;
    }

    public static List<String> desconstruirTodos(List<Propriedade> todos) {
        var listona = new ArrayList<String>(todos.size() * CAMPOS);
        for (var p : todos) {
            listona.addAll(p.desconstruir());
        }
        return listona;
    }

    public static Optional<Propriedade> buscar(List<Propriedade> tudo, int Id) {
        return tudo.stream().filter(p -> p.Id() == Id).findAny();
    }
}

