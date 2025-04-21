package ProcessoSeletivo;

public class ValidadorCandidato {
    public static final double SALARIO_LIMITE = 2000.00;

    public static boolean cpfValido(String cpf) {
        return cpf.matches("\\d{11}");
    }

    public static boolean idadeValida(int idade) {
        return idade >= 18;
    }

    public static boolean escolaridadeValida(String escolaridade) {
        return escolaridade.equalsIgnoreCase("Fundamental") || 
               escolaridade.equalsIgnoreCase("Médio") || 
               escolaridade.equalsIgnoreCase("Superior");
    }

    public static boolean experienciaValida(int experiencia) {
        return experiencia >= 1;
    }

    public static boolean salarioAceitavel(double salario) {
        return salario <= SALARIO_LIMITE;
    }
}

