package ProcessoSeletivo;

public class Candidato {
    private String nome;
    private String cpf;
    private int idade;
    private String escolaridade;
    private int experiencia;
    private double salarioDesejado;

    public Candidato(String nome, String cpf, int idade, String escolaridade, int experiencia, double salarioDesejado) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.escolaridade = escolaridade;
        this.experiencia = experiencia;
        this.salarioDesejado = salarioDesejado;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public double getSalarioDesejado() {
        return salarioDesejado;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
               "\nCPF: " + cpf +
               "\nIdade: " + idade +
               "\nEscolaridade: " + escolaridade +
               "\nExperiência: " + experiencia + " ano(s)" +
               "\nSalário Desejado: R$ " + salarioDesejado;
    }
}

