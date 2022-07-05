import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class AlunoDAO implements AlunoDAOInterface{
  private int id;

  HashMap<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();

  @Override
  public void add(Aluno aluno){
    alunos.put(this.id++, aluno);
  }

  @Override
  public List<Aluno> getAll(){
    List<Aluno> list = new ArrayList<Aluno>(alunos.values());
    return list;
  }

  @Override
  public Aluno getById(int id){
    return alunos.get(id);
  }
}
