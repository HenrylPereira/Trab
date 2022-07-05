class Main {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Thiago", "LPL");
    Aluno aluno2 = new Aluno("Rodrigo", "MAT");
    AlunoDAO alunoDAO = new AlunoDAO();

    alunoDAO.add(aluno1);
    alunoDAO.add(aluno2);

      
 //GET BY ID;
    System.out.println(alunoDAO.getById(1).getNome()+", "+alunoDAO.getById(1).getMateria());

//GET BY ALL;
    for(Aluno aluno : alunoDAO.getAll()){
        System.out.println(aluno.getNome()+", "+aluno.getMateria());
    }


    Prova prova1 = new Prova(9.5);
    Prova prova2 = new Prova(7.5);
    aluno1.setNota(prova1);
    aluno1.setNota(prova2);
    System.out.println("Média aluno 1: "+aluno1.getMedia());
    
  }
}
