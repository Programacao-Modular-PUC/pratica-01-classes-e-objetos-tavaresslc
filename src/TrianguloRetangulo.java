public class TrianguloRetangulo {
    private double c1;
    private double c2;
    private double h;
    private double a;

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double calcHypotenuse() {
        return Math.sqrt(Math.pow(this.c1, 2) + Math.pow(this.c2, 2));
    }

    public double calcArea() {
        return (this.c1 * this.c2) / 2;
    }
}
