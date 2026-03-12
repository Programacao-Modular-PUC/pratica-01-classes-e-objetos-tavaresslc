import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            Pessoa p = new Pessoa();

            p.setNome(readLine(sc, "Digite o primeiro nome da " + (i + 1) + "° pessoa: "));
            p.setSobrenome(readLine(sc, "Digite o sobrenome " + (i + 1) + "° pessoa: "));
            p.setDataNascimento(readDate(sc, "Digite a data de nascimento da " + (i + 1) + "° pessoa (d/m/a): "));
            p.setIdade(p.calculaIdade(new Data()));
            p.setAltura(readDouble(sc, "Digite a altura da " + (i + 1) + "° pessoa: "));
            p.setPeso(readDouble(sc, "Digite o peso da " + (i + 1) + "° pessoa: "));
            p.setImc(p.calculaIMC());

            pessoas[i] = p;
            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Cadastro " + (i + 1) + ":");
            System.out.println("Nome completo: " + pessoas[i].getNome() + " " + pessoas[i].getSobrenome());
            System.out.println("Nome de referencia: " + pessoas[i].getSobrenome() + ", " + pessoas[i].getNome());
            System.out.println("Idade: " + pessoas[i].getIdade());
            System.out.println("Peso: " + pessoas[i].getPeso());
            System.out.println("Altura: " + pessoas[i].getAltura());
            System.out.printf("IMC: %.1f%n\n", pessoas[i].getImc());
            System.out.println("Classificacao: " + pessoas[i].informaObesidade());
        }
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
                double decimal = Double.parseDouble(sc.next().trim().replace(",", "."));
                sc.nextLine();
                
                return decimal;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um numero decimal valido.");
            }
        }
    }

    public static Data readDate(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.next().trim();

            String[] partes = input.split("/");

            if (partes.length != 3) {
                System.out.println("Data inválida! Use o formato d/m/a.");
                continue;
            }

            try {
                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int ano = Integer.parseInt(partes[2]);

                if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
                    System.out.println("Data inválida! Valores fora do intervalo.");
                    continue;
                }

                Data data = new Data();
                data.setDia(dia);
                data.setMes(mes);
                data.setAno(ano);

                return data;

            } catch (NumberFormatException e) {
                System.out.println("Data inválida! Digite apenas números.");
            }
        }
    }
}