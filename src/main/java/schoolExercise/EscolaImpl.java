package schoolExercise;

import java.util.ArrayList;
import java.util.List;

public class EscolaImpl {

    static void mediaDaNotaPorAno(Escola escola) {

        System.out.println("=== ___ ===___===");
        System.out.println("MEDIA DE NOTAS DA TURMA");
        System.out.println("Primeiro Ano: A:" + mediaNotaTurma(escola.getPrimeiroAno().getTurmaA().getAlunos()) +
                " B:" + mediaNotaTurma(escola.getPrimeiroAno().getTurmaB().getAlunos()) +
                " C:" + mediaNotaTurma(escola.getPrimeiroAno().getTurmaC().getAlunos()));

        System.out.println("Segundo Ano: A:" + mediaNotaTurma(escola.getSegundoAno().getTurmaA().getAlunos()) +
                " B:" + mediaNotaTurma(escola.getSegundoAno().getTurmaB().getAlunos()) +
                " C:" + mediaNotaTurma(escola.getSegundoAno().getTurmaC().getAlunos()));

        System.out.println("Terceiro Ano: A:" + mediaNotaTurma(escola.getTerceiroAno().getTurmaA().getAlunos()) +
                " B:" + mediaNotaTurma(escola.getTerceiroAno().getTurmaB().getAlunos()) +
                " C:" + mediaNotaTurma(escola.getTerceiroAno().getTurmaC().getAlunos()));
    }

    static void porcentagemAprovadosPorAno(Escola escola) {

        System.out.println("=== ___ ===___===");
        System.out.println("PORCENTAGEM DE ALUNOS APROVADOS: ");
        System.out.println("Primeiro Ano: A:" + porcentagemAprovados(escola.getPrimeiroAno().getTurmaA().getAlunos()) +
                " B:" + porcentagemAprovados(escola.getPrimeiroAno().getTurmaB().getAlunos()) +
                " C:" + porcentagemAprovados(escola.getPrimeiroAno().getTurmaC().getAlunos()));

        System.out.println("Segundo Ano: A:" + porcentagemAprovados(escola.getSegundoAno().getTurmaA().getAlunos()) +
                " B:" + porcentagemAprovados(escola.getSegundoAno().getTurmaB().getAlunos()) +
                " C:" + porcentagemAprovados(escola.getSegundoAno().getTurmaC().getAlunos()));

        System.out.println("Terceiro Ano: A:" + porcentagemAprovados(escola.getTerceiroAno().getTurmaA().getAlunos()) +
                " B:" + porcentagemAprovados(escola.getTerceiroAno().getTurmaB().getAlunos()) +
                " C:" + porcentagemAprovados(escola.getTerceiroAno().getTurmaC().getAlunos()));
    }

    static void listaAlunoComNota(List<Alunos> alunosTurma) {
        alunosTurma.stream().forEach(S -> {
            System.out.println("Nome: " + S.getNome() + " Nota: " + S.getNota());
        });
    }

    static Integer mediaNotaTurma(List<Alunos> alunosTurma) {

        List<Integer> notas = new ArrayList<>();
        alunosTurma.stream().forEach(S -> {
            notas.add(S.getNota());
        });

        int sum = notas.stream().mapToInt(Integer::intValue).sum();

        return sum / notas.size();

    }


    static String porcentagemAprovados(List<Alunos> alunosTurma) {

        var aprovados = filtraAlunosAprovados(alunosTurma).size();
        var porcentagem = (aprovados * 100) / alunosTurma.size();

        return String.valueOf(porcentagem).concat("%");
    }

    private static List<String> filtraAlunosAprovados(List<Alunos> alunosTurma) {

        List<String> alunosAprovados = new ArrayList<>();
        alunosTurma.stream().forEach(Alunos -> { if (Alunos.getNota() >= 3){
            alunosAprovados.add("Nome: " + Alunos.getNome() + " = " + "Nota: " +  Alunos.getNota());
        }
        });
        return alunosAprovados;
    }

    static void melhoresAlunosPorTurma(Escola escola) {
        System.out.println("=== ___ ===___===");
        System.out.println("Melhores Alunos por turma, em cada Ano Escolar");
    }
}
