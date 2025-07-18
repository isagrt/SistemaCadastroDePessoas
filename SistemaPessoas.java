import java.util.Scanner;

public class SistemaPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Pedindo informações ao usuário pessoa
        Pessoa pessoa = new Pessoa();
    
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        pessoa.setNome(nome);

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        pessoa.setSobrenome(sobrenome);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        pessoa.setIdade(idade);

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        pessoa.setCPF(cpf);

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();
        pessoa.setAltura(altura);
        
        pessoa.exibirDados();

        //Pedindo informações ao usuário Aluno
        Aluno aluno = new Aluno();
    
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        aluno.setNome(nome);

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        aluno.setSobrenome(sobrenome);

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine(); 
        aluno.setIdade(idade);

        System.out.print("Digite seu CPF: ");
        cpf = scanner.nextLine();
        aluno.setCPF(cpf);

        System.out.println("Digite sua altura: ");
         altura = scanner.nextDouble();
        aluno.setAltura(altura);
        
        aluno.exibirDados();

        scanner.close();
    }
}
