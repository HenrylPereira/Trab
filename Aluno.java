import java.util.List;
import java.util.ArrayList;

public class Aluno implements AlunoInterface{
  private String nome;
  private String materia;
  private double soma;
  private int cont;
  private double media;
  
  List<Prova> notas = new ArrayList<Prova>();
  
  Aluno(String nome, String materia){
    this.nome = nome;
    this.materia = materia;
  }

  @Override
  public String getNome() {
    return nome;
  }

  @Override
  public String getMateria() {
    return materia;
  }

  @Override
  public void setNota(Prova prova){
    notas.add(prova);
  }

  @Override
  public double getMedia(){
    for(Prova nota : notas){
      cont++;
      soma = soma + nota.getNota();
    };
    media = soma / cont;
    return media;
  }
}
