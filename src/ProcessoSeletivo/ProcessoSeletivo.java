package ProcessoSeletivo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessoSeletivo {
    private static final ArrayList<Candidato> listaAprovados = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Cadastro de Candidato ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF (somente números): ");
            String cpf = scanner.nextLine();
            if (!ValidadorCandidato.cpfValido(cpf)) {
                System.out.println("❌ CPF inválido! O CPF deve conter 11 dígitos.");
                continue;
            }

            System.out.print("Idade: ");
            int idade = 0;
            try {
                idade = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Idade inválida. Por favor, insira um número.");
                continue;
            }
            if (!ValidadorCandidato.idadeValida(idade)) {
                System.out.println("❌ Idade inválida. O candidato deve ter pelo menos 18 anos.");
                continue;
            }

            System.out.print("Escolaridade (Fundamental, Médio, Superior): ");
            String escolaridade = scanner.nextLine();
            if (!ValidadorCandidato.escolaridadeValida(escolaridade)) {
                System.out.println("❌ Escolaridade inválida. A escolaridade deve ser 'Fundamental', 'Médio' ou 'Superior'.");
                continue;
            }

            System.out.print("Anos de experiência: ");
            int experiencia = 0;
            try {
                experiencia = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Experiência inválida. Por favor, insira um número.");
                continue;
            }
            if (!ValidadorCandidato.experienciaValida(experiencia)) {
                System.out.println("❌ Experiência insuficiente. O candidato deve ter pelo menos 1 ano de experiência.");
                continue;
            }

            System.out.print("Salário desejado: ");
            double salario = 0.0;
            try {
                salario = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Salário inválido. Por favor, insira um número.");
                continue;
            }
            if (!ValidadorCandidato.salarioAceitavel(salario)) {
                System.out.println("❌ Salário desejado acima do limite (R$ 2000).");
                continue;
            }

            // Cadastro aprovado
            Candidato candidato = new Candidato(nome, cpf, idade, escolaridade, experiencia, salario);
            listaAprovados.add(candidato);
            System.out.println("✅ Candidato aprovado!");

            // Pergunta se deseja continuar
            System.out.print("\nCadastrar outro candidato? (s/n): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Exibir todos os aprovados
        System.out.println("\n=== Lista de Candidatos Aprovados ===");
        if (listaAprovados.isEmpty()) {
            System.out.println("Nenhum candidato aprovado.");
        } else {
            for (Candidato c : listaAprovados) {
                System.out.println(c);
                System.out.println("---------------------------");
            }
        }

        scanner.close();
    }
}

