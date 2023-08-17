package schoolExercise;

import java.io.IOException;
import java.util.Scanner;

import static schoolExercise.EscolaImpl.*;

public class SistemaEscolar {

    /**
     Uma escola recebe alunos para as séries do 1°,2° e 3° ano
     Cada série é composta das turmas A, B, e C.
     As notas dos alunos são expressas em números de 1 a 5
     A regra é que a nota 1 é o pior resultado
     Para ter aprovação o aluno deve ter uma nota de 3 ou mais

     com base nessas informações, crie um código que fornece:
     porcentagem de alunos aprovados por turma, classificado por série,
     Média das notas desses alunos por turma, classificado por série
     Os melhores alunos e suas respectivas notas de cada serie em ordem crescente (por nota)
     */

    public static void main(String[] args) throws IOException, InterruptedException {
        EscolaFactory escolaFactory = new EscolaFactory();
        var escola = escolaFactory.montaEscola();

        Scanner scanner = new Scanner(System.in);
        int escolhaAno;
        int escolhaTurma;


        do {
            escolaFactory.criaMenuInicial();

            System.out.print("Escolha: ");
            escolhaAno = scanner.nextInt();

            if (escolhaAno == 1) {
                do {

                    escolaFactory.criaMenuEscolhaTurma();

                    System.out.print("Escolha: ");
                    escolhaTurma = scanner.nextInt();

                    if (escolhaTurma == 1) {
                        listaAlunoComNota(escola.getPrimeiroAno().getTurmaA().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getPrimeiroAno().getTurmaA().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getPrimeiroAno().getTurmaA().getAlunos()));
                        System.out.println(melhoresAlunosPorTurma(escola.getPrimeiroAno().getTurmaA()));
                    }
                    if (escolhaTurma == 2) {

                        listaAlunoComNota(escola.getPrimeiroAno().getTurmaB().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getPrimeiroAno().getTurmaB().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getPrimeiroAno().getTurmaB().getAlunos()));
                        System.out.println(melhoresAlunosPorTurma(escola.getPrimeiroAno().getTurmaB()));
                    }
                    if (escolhaTurma == 3) {
                        listaAlunoComNota(escola.getPrimeiroAno().getTurmaC().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getPrimeiroAno().getTurmaC().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getPrimeiroAno().getTurmaC().getAlunos()));
                        System.out.println(melhoresAlunosPorTurma(escola.getPrimeiroAno().getTurmaC()));
                    }
                } while (escolhaTurma != 0);
            }
                if (escolhaAno == 2) {
                    do {
                        escolaFactory.criaMenuEscolhaTurma();

                        System.out.print("Escolha: ");
                        escolhaTurma = scanner.nextInt();

                        if (escolhaTurma == 1) {
                            listaAlunoComNota(escola.getSegundoAno().getTurmaA().getAlunos());
                            System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getSegundoAno().getTurmaA().getAlunos()));
                            System.out.println("Media de nota: " + mediaNotaTurma(escola.getSegundoAno().getTurmaA().getAlunos()));
                            System.out.println(melhoresAlunosPorTurma(escola.getSegundoAno().getTurmaA()));
                        }
                        if (escolhaTurma == 2) {

                            listaAlunoComNota(escola.getSegundoAno().getTurmaB().getAlunos());
                            System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getSegundoAno().getTurmaB().getAlunos()));
                            System.out.println("Media de nota: " + mediaNotaTurma(escola.getSegundoAno().getTurmaB().getAlunos()));
                            System.out.println(melhoresAlunosPorTurma(escola.getSegundoAno().getTurmaB()));
                        }
                        if (escolhaTurma == 3) {
                            listaAlunoComNota(escola.getSegundoAno().getTurmaC().getAlunos());
                            System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getSegundoAno().getTurmaC().getAlunos()));
                            System.out.println("Media de nota: " + mediaNotaTurma(escola.getSegundoAno().getTurmaC().getAlunos()));
                            System.out.println(melhoresAlunosPorTurma(escola.getSegundoAno().getTurmaC()));
                        }
                    }while (escolhaTurma != 0);
            }
            if (escolhaAno == 3) {
                do {
                    escolaFactory.criaMenuEscolhaTurma();

                    System.out.print("Escolha: ");
                    escolhaTurma = scanner.nextInt();

                    if (escolhaTurma == 1) {
                        listaAlunoComNota(escola.getTerceiroAno().getTurmaA().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getTerceiroAno().getTurmaA().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getTerceiroAno().getTurmaA().getAlunos()));
                        System.out.println(melhoresAlunosPorTurma(escola.getTerceiroAno().getTurmaA()));
                    }
                    if (escolhaTurma == 2) {

                        listaAlunoComNota(escola.getTerceiroAno().getTurmaB().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getTerceiroAno().getTurmaB().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getTerceiroAno().getTurmaB().getAlunos()));
                        System.out.println(melhoresAlunosPorTurma(escola.getTerceiroAno().getTurmaB()));
                    }
                    if (escolhaTurma == 3) {
                        listaAlunoComNota(escola.getTerceiroAno().getTurmaC().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getTerceiroAno().getTurmaC().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getTerceiroAno().getTurmaC().getAlunos()));
                        System.out.println(melhoresAlunosPorTurma(escola.getTerceiroAno().getTurmaC()));
                    }
                } while (escolhaTurma != 0);
            }
            if (escolhaAno == 4) {

                System.out.println("Uma escola recebe alunos para as séries do 1°,2° e 3° ano\n" +
                        "Cada série é composta das turmas A, B, e C.\n" +
                        "As notas dos alunos são expressas em números de 1 a 5\n" +
                        "A regra é que a nota 1 é o pior resultado\n" +
                        "Para ter aprovação o aluno deve ter uma nota de 3 ou mais\n" +
                        "\n" +
                        "com base nessas informações, crie um código que fornece:\n" +
                        "- porcentagem de alunos aprovados por turma, classificado por série,\n" +
                        "- Média das notas desses alunos por turma, classificado por série\n" +
                        "Os melhores alunos e suas respectivas notas de cada serie em ordem crescente (por nota)");
            }

        }while (escolhaAno != 0);
    }


}
