import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public record Propriedade (
        String endereco,
        BigDecimal preco,
        Boolean tipo,
        String nome,
        String email,
        String telefone
) {
    private static final int CAMPOS = Propriedade.class.getRecordComponents().length;

    public List<String> desconstruir() {
        return List.of(endereco, preco.toString(), tipo.toString(), "" + nome);
    }

    public static Propriedade construir(List<String> listinha) {
        if (listinha.size() != CAMPOS) throw new IllegalArgumentException();
        return new Propriedade(
                listinha.get(0),
                new BigDecimal(listinha.get(1)).setScale(2),
                listinha.get(2).equals("true"),
                listinha.get(3),
                listinha.get(4),
                listinha.get(5)
               
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

    public static Optional<Propriedade> buscar(List<Propriedade> tudo, String endereco) {
        return tudo.stream().filter(p -> p.endereco().equalsIgnoreCase(endereco)).findAny();
    }

    /*

    // Método de buscar veículos, 4 implementações diferentes.
    // Todas as implementações fazem a mesma coisa.
    // Use apenas uma implementação no seu código.

    // Implementação 1.
    // Usando um for com um contador procurando o veículo desejado.
    public static Veiculo buscar1(List<Veiculo> tudo, String placaProcurada) {
        for (var i = 0; i < tudo.size(); i++) {
            var v = tudo.get(i);
            if (v.placa().equals(placaProcurada)) return v;
        }
        return null;
    }

    // Implementação 2.
    // O mesmo que a implementação 1, mas usando o enhanced-for do Java 5+ ao invés do for tradicional.
    public static Veiculo buscar2(List<Veiculo> tudo, String placaProcurada) {
        for (var v : tudo) {
            if (v.placa().equals(placaProcurada)) return v;
        }
        return null;
    }

    // Implementação 3.
    // Para evitar de retornar null, usamos a classe Optional do Java 8+.
    public static Optional<Veiculo> buscar3(List<Veiculo> tudo, String placaProcurada) {
        for (var v : tudo) {
            if (v.placa().equals(placaProcurada)) return Optional.of(v);
        }
        return Optional.empty();
    }

    // Implementação 4.
    // Usando os streams e o lambda do Java 8+, dá para fazer tudo numa linha só.
    public static Optional<Veiculo> buscar4(List<Veiculo> tudo, String placaProcurada) {
        return tudo.stream().filter(v -> v.placa().equals(placaProcurada)).findAny();
    }

    // */
}










/*public class Propriedade {
        String endereco;
        double preco;
        String tipo;
        boolean paraAlugar;
        String nome;
        String email;
        String telefone;
  
        
        public  Propriedade(String endereco, double preco, String tipo, boolean paraAlugar, String nome, String email, String telefone) {
          this.endereco = endereco;
          this.preco = preco;
          this.tipo = tipo;
          this.paraAlugar = paraAlugar;
          this.nome = nome;
          this.email =  email;
          this.telefone = telefone;
        }
  
        public void mostrarInformacoes() {
          System.out.println();
          System.out.println("Endereço: " + endereco);
          System.out.println("Preço: R$" + preco);
          System.out.println("Tipo: " + tipo);
          if (paraAlugar) {
            System.out.println("Para alugar");
            System.out.println("Quando o aluguel irá vencer");
            String vencer = LerDados.lerTexto();
          } else {
            System.out.println("Para vender");
          }
        }
}*/
