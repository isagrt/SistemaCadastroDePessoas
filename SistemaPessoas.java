import java.util.Scanner;

public class SistemaPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedindo informações ao usuário pessoa
        Pessoa pessoa = new Pessoa();

        System.out.print(" \n ---Insira Dados da Pessoa  ---\n");
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

        scanner.nextLine(); // comando que limpa o buffer prara não ignorar o prompt

        // Pedindo informações ao usuário Aluno
        Aluno aluno = new Aluno();
        System.out.print(" \n ---Insira Dados do Aluno  ---\n");
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

        System.out.print("Digite sua matricula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 
        aluno.setMatricula(matricula);

        System.out.print("Digite o ano que voce esta matriculado(a): ");
        int grau = scanner.nextInt();
        scanner.nextLine(); 
        aluno.setGrau(grau);

        System.out.print("Digite o nome do responsavel pelo aluno: ");
        String nomeResponsavel = scanner.nextLine();
        aluno.setNomeResponsavel(nomeResponsavel);

        // Pedindo informações ao usuário Professor
        Professor professor = new Professor();
        System.out.print(" \n ---Insira Dados do Professor  ---\n");
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        professor.setNome(nome);

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        professor.setSobrenome(sobrenome);

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        professor.setIdade(idade);

        System.out.print("Digite seu CPF: ");
        cpf = scanner.nextLine();
        professor.setCPF(cpf);

        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
        professor.setAltura(altura);

        System.out.print("Digite seu codigo de funcionario: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        professor.setCodigo(codigo);

        System.out.print("Digite o ano que voce leciona: ");
        int anoQueLeciona = scanner.nextInt();
        scanner.nextLine(); 
        professor.setAnoQueLeciona(anoQueLeciona);

        System.out.print("Digite sua formacao academica:  ");
        String formacaoAcademica = scanner.nextLine();
        professor.setFormacaoAcademica(formacaoAcademica);
        
        pessoa.exibirDados();
        aluno.exibirDados();
        professor.exibirDados();
        
        scanner.close();
    }
}
