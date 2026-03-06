public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa() {
        this.nome = "";
        this.sobrenome = "";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
        this.imc = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double calculaIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public String informaObesidade() {
        if (this.imc < 18.5) {
            return "Abaixo do peso";
        } else if (this.imc <= 24.9) {
            return "Peso normal";
        } else if (this.imc <= 29.9) {
            return "Sobrepeso";
        } else if (this.imc <= 34.9) {
            return "Obesidade grau 1";
        } else if (this.imc <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }
}
