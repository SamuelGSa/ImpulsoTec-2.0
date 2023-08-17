package schoolExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EscolaImpl {

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

    static String melhoresAlunosPorTurma(Turmas turma) {
        HashMap<String,Integer> alunosMap = new HashMap<>();

        List<String> alunosAprovados = new ArrayList<>();
        turma.getAlunos().stream().forEach(Alunos -> {
            alunosMap.put(Alunos.getNome(),Alunos.getNota());
        });

        List<String> melhoresAlunos = new ArrayList<>();
        int maiorNota = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : alunosMap.entrySet()) {
            int nota = entry.getValue();
            String nome = entry.getKey();

            if (nota > maiorNota) {
                melhoresAlunos.clear();
                melhoresAlunos.add(nome);
                maiorNota = nota;
            } else if (nota == maiorNota) {
                melhoresAlunos.add(nome);
            }
        }

        return "Melhores Alunos: " + melhoresAlunos + " com nota " + maiorNota;
    }
}
