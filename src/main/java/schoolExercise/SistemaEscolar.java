package schoolExercise;

import java.util.ArrayList;
import java.util.List;

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

        porcentagemAprovadosPorAno(escola);
        mediaDaNotaPorAno(escola);
        melhoresAlunosPorTurma(escola);

    }


}
