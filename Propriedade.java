public class Propriedade {
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
}
