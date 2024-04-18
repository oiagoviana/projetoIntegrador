import java.util.Scanner;

public class ComprarCasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, responda algumas perguntas para encontrar a casa mais adequada para você.");

        System.out.println("Em que local você gostaria de morar? ");
        System.out.println("A-Centro");
        System.out.println("B-Subúrbio");
        System.out.println("C-Periferia");
        String localizacao = scanner.nextLine();

        System.out.println("Quantos cômodos você precisa? ");
        int numComodos = scanner.nextInt();

        System.out.print("Você precisa de garagem (s/n)? ");
        char respostaGaragem = scanner.next().charAt(0);
        boolean temGaragem = (respostaGaragem == 's' || respostaGaragem == 'S');

        System.out.println("Qual é o valor máximo que você pode pagar pela casa? ");
        double valorMaximo = scanner.nextDouble();

        // Verificando as preferências do comprador
        if (localizacao.equalsIgnoreCase("A") && numComodos >= 3 && temGaragem && valorMaximo >= 200000) {
            System.out.println("Parabéns! Temos uma ótima opção para você no centro da cidade.");
        } else if (localizacao.equalsIgnoreCase("B") && numComodos >= 4 && temGaragem && valorMaximo >= 150000) {
            System.out.println("Encontramos uma bela casa no subúrbio que pode atender às suas necessidades.");
        } else if (localizacao.equalsIgnoreCase("C") && numComodos >= 2 && valorMaximo >= 100000) {
            System.out.println("Há uma casa aconchegante na periferia que pode se encaixar no seu orçamento.");
        } else {
            System.out.println("Desculpe, não encontramos nenhuma casa que atenda às suas preferências.");
        }

        scanner.close();
    }
}
