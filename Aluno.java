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
    public void setNomeResponsavel(String nomeResponsavel){
        this.nomeResponsavel = nomeResponsavel;
    }
    @Override
    public void cadastrar(){
        System.out.print(" \n ---Insira Dados do Aluno  ---\n");
    }
    @Override
    public void exibirDados() {
        System.out.println("\n--- Dados do Aluno  ---");
        System.out.println("Nome: " + getNome()+ " " + getSobrenome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCPF());
        System.out.println("Altura: " + getAltura());
        System.out.println("Matricula: " +matricula);
        System.out.println("Grau: " +grau+ "° ano");
        System.out.println("Nome de pais ou reponsável: " +nomeResponsavel);
    }
}
