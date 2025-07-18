import java.util.Scanner;

public class SistemaPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoaComum = new Pessoa();
    
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        pessoaComum.setNome(nome);

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        pessoaComum.setSobrenome(sobrenome);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        pessoaComum.setIdade(idade);

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        pessoaComum.setCPF(cpf);

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();
        pessoaComum.setAltura(altura);
        
        System.out.println("\n--- Dados da Pessoa ---");
        System.out.println("Nome: " + pessoaComum.getNome()+ " "+pessoaComum.getSobrenome());
        System.out.println("Idade: " + pessoaComum.getIdade());
        System.out.println("CPF: " + pessoaComum.getCPF());
        System.out.println("Altura: " + pessoaComum.getAltura());

        scanner.close();
    }
}
