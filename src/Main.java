import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TrianguloRetangulo t = new TrianguloRetangulo();

        t.setC1(readDouble(sc, "Digite o valor do primeiro cateto: "));
        t.setC2(readDouble(sc, "Digite o valor do segundo cateto: "));
        t.setH(t.calcHypotenuse());
        t.setA(t.calcArea());

        System.out.println("Hipotenusa: " + t.getH() + " Area: " + t.getA());
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