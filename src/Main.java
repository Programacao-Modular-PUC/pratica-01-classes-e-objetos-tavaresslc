import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        p.setNome(readLine(sc, "Digite seu primeiro nome: "));
        p.setSobrenome(readLine(sc, "Digite seu sobrenome: "));
        p.setIdade(readInt(sc, "Digite a sua idade: "));
        p.setAltura(readDouble(sc, "Digite a sua altura: "));
        p.setPeso(readDouble(sc, "Digite o seu peso: "));
        p.setImc(p.calculaIMC());

        System.out.println(p.getNome() + " " + p.getSobrenome() + " - " + p.getIdade() + " anos");
        System.out.printf("IMC: %.1f%n", p.getImc());
        System.out.println("Faixa: " + p.informaObesidade());
    }

    public static String readLine(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String nome = sc.nextLine().trim();

            if (nome.matches("[a-zA-ZÀ-ÿ ]+")) {
                return nome;
            } else {
                System.out.println("Nome inválido! Digite apenas letras.");
            }
        }
    }

    public static int readInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            if (sc.hasNextInt()) {
                int x = sc.nextInt();

                if (x < 0) {
                    System.out.println("Valor invalido! Digite um numero inteiro positivo.");
                } else {
                    return x;
                }
            } else {
                System.out.println("Valor invalido! Digite um numero inteiro.");
                sc.next();
            }
        }
    }

    public static double readDouble(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            try {
                return Double.parseDouble(sc.next().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um numero decimal valido.");
            }
        }
    }
}