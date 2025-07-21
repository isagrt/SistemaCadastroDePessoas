public class Professor extends Pessoa{
    private int codigo;
    private int anoQueLeciona;
    private String formacaoAcademica;

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
        public int getAnoQueLeciona(){
        return anoQueLeciona;
    }
    public void setAnoQueLeciona(int anoQueLeciona){
        this.anoQueLeciona = anoQueLeciona;
    }
        public String getFormacaoAcademica(){
        return formacaoAcademica;
    }
    public void setFormacaoAcademica(String formacaoAcademica){
        this.formacaoAcademica = formacaoAcademica;
    }
    @Override
    public void exibirDados() {
        System.out.println("\n--- Dados do Professor  ---");
        System.out.println("Nome: " + getNome()+ " " + getSobrenome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCPF());
        System.out.println("Altura: " + getAltura());
        System.out.println("Código de funcionário: " +codigo);
        System.out.println("Ano que leciona: " +anoQueLeciona);
        System.out.println("Formação acadêmica: " +formacaoAcademica);
    }
}
