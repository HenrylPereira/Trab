public class Prova implements ProvaInterface{
  private double nota;
  
  Prova(double nota){
    this.nota = nota;
  }

  @Override
  public double getNota() {
    return nota;
  }

  @Override
  public void setNota(double nota) {
    this.nota = nota;
  }
}
