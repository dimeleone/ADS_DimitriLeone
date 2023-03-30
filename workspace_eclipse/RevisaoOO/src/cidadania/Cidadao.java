package cidadania;
import java.util.Scanner;

/*
 * @autor dimitri.leone
 * @since 30.03.2023
 */

public class Cidadao extends Pessoa {
	
	private String cpf;

    public Cidadao(String nome, String sexo, Integer idade, String cpf) {
        super(nome, sexo, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Entre com o sexo: ");
        String sexo = scanner.nextLine();

        System.out.println("Entre com a idade: ");
        Integer idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Entre com o CPF: ");
        String cpf = scanner.nextLine();

        Cidadao cidadao = new Cidadao(nome, sexo, idade, cpf);

        System.out.println("Nome: " + cidadao.getNome());
        System.out.println("Sexo: " + cidadao.getSexo());
        System.out.println("Idade: " + cidadao.getIdade());
        System.out.println("CPF: " + cidadao.getCpf());
    }
}
