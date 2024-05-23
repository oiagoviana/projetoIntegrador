    public class alugarImovel{

        public static void MenuImovel(){
            while (true) {
                System.out.println("Escolha uma opção");
                System.out.println("A - Listar casas");
                System.out.println("B - Listar apartamentos");
                System.out.println("X - VOLTAR");
                System.out.println();
                System.out.println("Digite a sua escolha:");
                var escolha = LerDados.lerTexto().toUpperCase();
            
                if(escolha.equals("A")){
                    System.out.println("teste");
                }else if(escolha.equals("B")){
                    System.out.println("teste");
                }else if(escolha.equals("X")){
                    return;
                } else{
                    System.out.println("Está não é uma opção válida vamos tentar novamente!");
                }
                System.out.println();

            }
        }

            private static void listarCasa(){
                
            }
            

        
    }