package schoolExercise;

import java.util.ArrayList;
import java.util.List;

public class EscolaFactory {
    public AnoEscolar criaPrimeiroAnoEscolar() {

        AnoEscolar primeiroAno = new AnoEscolar();
        // TURMA A
        Turmas turmaA = new Turmas();
        List<Alunos> alunosTurmaA = new ArrayList<>();

        alunosTurmaA.add(new Alunos("Aluno-1-1A", 4));
        alunosTurmaA.add(new Alunos("Aluno-2-1A", 3));
        alunosTurmaA.add(new Alunos("Aluno-3-1A", 5));
        alunosTurmaA.add(new Alunos("Aluno-4-1A", 5));
        alunosTurmaA.add(new Alunos("Aluno-5-1A", 1));

        turmaA.setAlunos(alunosTurmaA);
        primeiroAno.setTurmaA(turmaA);

        // TURMA B
        Turmas turmaB = new Turmas();
        List<Alunos> alunosTurmaB = new ArrayList<>();

        alunosTurmaB.add(new Alunos("Aluno-1-1B", 2));
        alunosTurmaB.add(new Alunos("Aluno-2-1B", 2));
        alunosTurmaB.add(new Alunos("Aluno-3-1B", 3));
        alunosTurmaB.add(new Alunos("Aluno-4-1B", 5));
        alunosTurmaB.add(new Alunos("Aluno-5-1B", 5));

        turmaB.setAlunos(alunosTurmaB);
        primeiroAno.setTurmaB(turmaB);

        // TURMA C
        Turmas turmaC = new Turmas();
        List<Alunos> alunosTurmaC = new ArrayList<>();

        alunosTurmaC.add(new Alunos("Aluno-1-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-2-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-3-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-4-1C", 2));
        alunosTurmaC.add(new Alunos("Aluno-5-1C", 4));

        turmaC.setAlunos(alunosTurmaC);
        primeiroAno.setTurmaC(turmaB);

        return primeiroAno;
    }

    public AnoEscolar criaSegundoAnoEscolar() {

        AnoEscolar segundoAno = new AnoEscolar();
        // TURMA A
        Turmas turmaA = new Turmas();
        List<Alunos> alunosTurmaA = new ArrayList<>();

        alunosTurmaA.add(new Alunos("Aluno-1-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-2-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-3-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-4-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-5-1A", 0));

        turmaA.setAlunos(alunosTurmaA);
        segundoAno.setTurmaA(turmaA);

        // TURMA B
        Turmas turmaB = new Turmas();
        List<Alunos> alunosTurmaB = new ArrayList<>();

        alunosTurmaB.add(new Alunos("Aluno-1-1B", 2));
        alunosTurmaB.add(new Alunos("Aluno-2-1B", 2));
        alunosTurmaB.add(new Alunos("Aluno-3-1B", 3));
        alunosTurmaB.add(new Alunos("Aluno-4-1B", 5));
        alunosTurmaB.add(new Alunos("Aluno-5-1B", 5));

        turmaB.setAlunos(alunosTurmaB);
        segundoAno.setTurmaB(turmaB);

        // TURMA C
        Turmas turmaC = new Turmas();
        List<Alunos> alunosTurmaC = new ArrayList<>();

        alunosTurmaC.add(new Alunos("Aluno-1-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-2-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-3-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-4-1C", 2));
        alunosTurmaC.add(new Alunos("Aluno-5-1C", 4));

        turmaC.setAlunos(alunosTurmaC);
        segundoAno.setTurmaC(turmaC);

        return segundoAno;
    }

    public AnoEscolar criaTerceiroAnoEscolar() {

        AnoEscolar terceiroAno = new AnoEscolar();
        // TURMA A
        Turmas turmaA = new Turmas();
        List<Alunos> alunosTurmaA = new ArrayList<>();

        alunosTurmaA.add(new Alunos("Aluno-1-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-2-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-3-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-4-1A", 0));
        alunosTurmaA.add(new Alunos("Aluno-5-1A", 0));

        turmaA.setAlunos(alunosTurmaA);
        terceiroAno.setTurmaA(turmaA);

        // TURMA B
        Turmas turmaB = new Turmas();
        List<Alunos> alunosTurmaB = new ArrayList<>();

        alunosTurmaB.add(new Alunos("Aluno-1-1B", 2));
        alunosTurmaB.add(new Alunos("Aluno-2-1B", 2));
        alunosTurmaB.add(new Alunos("Aluno-3-1B", 3));
        alunosTurmaB.add(new Alunos("Aluno-4-1B", 5));
        alunosTurmaB.add(new Alunos("Aluno-5-1B", 5));

        turmaB.setAlunos(alunosTurmaB);
        terceiroAno.setTurmaB(turmaB);

        // TURMA C
        Turmas turmaC = new Turmas();
        List<Alunos> alunosTurmaC = new ArrayList<>();

        alunosTurmaC.add(new Alunos("Aluno-1-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-2-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-3-1C", 1));
        alunosTurmaC.add(new Alunos("Aluno-4-1C", 2));
        alunosTurmaC.add(new Alunos("Aluno-5-1C", 4));

        turmaC.setAlunos(alunosTurmaC);
        terceiroAno.setTurmaC(turmaC);

        return terceiroAno;
    }

    public Escola montaEscola() {
        Escola escola = new Escola();

        escola.setPrimeiroAno(criaPrimeiroAnoEscolar());
        escola.setSegundoAno(criaSegundoAnoEscolar());
        escola.setTerceiroAno(criaTerceiroAnoEscolar());

        return escola;
    }

    public void criaMenuInicial(){

        System.out.println("    SISTEMA ESCOLAR 0.0.1    |");
        System.out.println("=============================|");
        System.out.println("Qual informação Deseja ver?  |");
        System.out.println("=============================|");
        System.out.println("* 1 = Primeiro Ano           |");
        System.out.println("* 2 = Segundo Ano            |");
        System.out.println("* 3 = Terceiro Ano           |");
        System.out.println("* 4 = Enunciado da Atividade |");
        System.out.println("* 0 = Sair                   |");
        System.out.println("=============================|");
    }


    public void criaMenuEscolhaTurma(){

        System.out.println("=============================|");
        System.out.println("Qual Turma Deseja ver?       |");
        System.out.println("=============================|");
        System.out.println("* 1 = Turma A                |");
        System.out.println("* 2 = Turma B                |");
        System.out.println("* 3 = Turma C                |");
        System.out.println("* 0 = Voltar                 |");
        System.out.println("=============================|");
    }

}


