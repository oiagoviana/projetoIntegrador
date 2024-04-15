import java.util.ArrayList;

// Classe principal que contém o método main
public class Imobiliaria {
    public static void main(String[] args) {
        // Criando uma lista de imóveis
        ArrayList<Imovel> imoveis = new ArrayList<>();

        // Adicionando alguns imóveis à lista
        imoveis.add(new Casa("Casa", "Rua Stephen Benet, 123", 3, 2, 200.0, true));
        imoveis.add(new Apartamento("Apartamento", "Av. Dona Belmira Marim, 456", 2, 1, 80.0, 5, true));

        // Exibindo informações dos imóveis
        for (Imovel imovel : imoveis) {
            System.out.println(imovel);
            System.out.println("Preço: R$" + imovel.calcularPreco());
            System.out.println();
        }
    }
}

// Classe abstrata para representar um imóvel genérico
abstract class Imovel {
    private String nome;
    private String endereco;
    private int quartos;
    private int banheiros;
    private double tamanho;
    private boolean disponivel;

    // Construtor
    public Imovel(String nome, String endereco, int quartos, int banheiros, double tamanho, boolean disponivel) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.tamanho = tamanho;
        this.disponivel = disponivel;
    }

    // Método abstrato para calcular o preço do imóvel
    public abstract double calcularPreco();

    // Método toString para exibir informações do imóvel
    @Override
    public String toString() {
        return nome + " - " + endereco + "\n" +
               "Quartos: " + quartos + ", Banheiros: " + banheiros + ", Tamanho: " + tamanho + "m²";
    }
}

// Classe para representar uma casa
class Casa extends Imovel {
    private boolean possuiJardim;

    // Construtor
    public Casa(String nome, String endereco, int quartos, int banheiros, double tamanho, boolean possuiJardim) {
        super(nome, endereco, quartos, banheiros, tamanho, true); // Sempre marcando casa como disponível
        this.possuiJardim = possuiJardim;
    }

    // Método para calcular o preço da casa
    @Override
    public double calcularPreco() {
        // Lógica para calcular o preço da casa
        return getTamanho() * 1000;
    }
}

// Classe para representar um apartamento
class Apartamento extends Imovel {
    private int andar;

    // Construtor
    public Apartamento(String nome, String endereco, int quartos, int banheiros, double tamanho, int andar, boolean disponivel) {
        super(nome, endereco, quartos, banheiros, tamanho, disponivel);
        this.andar = andar;
    }

    // Método para calcular o preço do apartamento
    @Override
    public double calcularPreco() {
        // Lógica para calcular o preço do apartamento
        return getTamanho() * 1500; // Preço base de R$1500 por metro quadrado
    }
}
