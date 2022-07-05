import java.util.List;

public interface AlunoDAOInterface {
  public void add(Aluno aluno);
  public List<Aluno> getAll();
  public Aluno getById(int id);
}
