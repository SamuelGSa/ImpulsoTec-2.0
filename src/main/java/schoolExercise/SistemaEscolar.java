package schoolExercise;

import java.util.ArrayList;
import java.util.List;
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

    public static void main(String[] args) {
        EscolaFactory escolaFactory = new EscolaFactory();
        var escola = escolaFactory.montaEscola();

        Scanner scanner = new Scanner(System.in);
        int escolhaAno;
        int escolhaTurma;


        do {
            System.out.println(" === Sistema Escolar 0.0.1 === ");
            System.out.println("Qual Ano Escolar Deseja ver? \n" +
                    "Digite:");
            System.out.println("* 1 = Primeiro Ano");
            System.out.println("* 2 = Segundo Ano");
            System.out.println("* 3 = Terceiro Ano");
            System.out.println("* 4 = Todos os anos");
            System.out.println("* 0 = Sair");
            System.out.print("Escolha: ");
            escolhaAno = scanner.nextInt();

            if (escolhaAno == 1) {
                do {
                    System.out.println("=== PRIMEIRO ANO ===");
                    System.out.println("Qual turma gostaria de ver?");
                    System.out.println("""
                        * 1 = para Turma A\s
                        * 2 = para Turma B\s
                        * 3 = para Turma C\s
                        * 4 = voltar""");
                    System.out.print("Escolha: ");
                    escolhaTurma = scanner.nextInt();

                    if (escolhaTurma == 1) {
                        listaAlunoComNota(escola.getPrimeiroAno().getTurmaA().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getPrimeiroAno().getTurmaA().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getPrimeiroAno().getTurmaA().getAlunos()));
                    }
                    if (escolhaTurma == 2) {

                        listaAlunoComNota(escola.getPrimeiroAno().getTurmaB().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getPrimeiroAno().getTurmaB().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getPrimeiroAno().getTurmaB().getAlunos()));
                    }
                    if (escolhaTurma == 3) {
                        listaAlunoComNota(escola.getPrimeiroAno().getTurmaC().getAlunos());
                        System.out.println("Porcentagem de aprovados: " + porcentagemAprovados(escola.getPrimeiroAno().getTurmaC().getAlunos()));
                        System.out.println("Media de nota: " + mediaNotaTurma(escola.getPrimeiroAno().getTurmaC().getAlunos()));
                    }

                }while (escolhaTurma != 4);

            }



        }while (escolhaAno != 0);



//        porcentagemAprovadosPorAno(escola);
//        mediaDaNotaPorAno(escola);
//        melhoresAlunosPorTurma(escola);

    }


}
