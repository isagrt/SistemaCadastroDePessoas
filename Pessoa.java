/*Criar um programa que solicite os dados de 3 pessoas, armazene esses dados usando métodos set, e depois exiba as
informações com métodos get e System.out.println().
▪ A classe Pessoa deve ter pelo menos 5 atributos, com três tipos de dados diferentes (por exemplo: String, int, boolean, double,
etc.).
▪ Além disso, o exercício deve evoluir para mostrar herança e polimorfismo com subclasses especializadas, como Aluno e
Professor.
▪ Implemente o método exibirInformacoes() de forma personalizada em cada classe (polimorfismo */

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private Double altura;

    Pessoa(){
        this.nome = "Sem nome cadastrado";
        this.sobrenome = "Sem sobrenome cadastrado";
        this.idade = 0;
        this.cpf ="Não consta";
        this.altura = 0.0;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
}
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getCPF(){
        return cpf;
}
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void exibirDados() {
        System.out.println("\n--- Dados da Pessoa ---");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Altura: " + altura);
    }

    
}

