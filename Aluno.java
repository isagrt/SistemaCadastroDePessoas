public class Aluno extends Pessoa {
    private int matricula;
    private int grau;
    private String nomeResponsavel;

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getGrau(){
        return grau;
    }
    public void setGrau(int grau){
        this.grau = grau;
    }
    public String getNomeResponsavel(){
        return nomeResponsavel;
    }
    public void setNomeResponsável(String nomeResponsavel){
        this.nomeResponsavel = nomeResponsavel;
    }
    @Override
    public void exibirDados() {
        System.out.println("\n--- Dados do Aluno  ---");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Altura: " + altura);
    }
}
