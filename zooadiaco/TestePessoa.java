import java.util.Scanner;

class Pessoa {
    // Variáveis privadas (encapsulamento)
    private String nome;
    private int idade;
    private int diaNascimento;
    private int mesNascimento;

    // Método construtor
    public Pessoa(String nome, int idade, int diaNascimento, int mesNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    // Método para calcular o signo baseado no dia e mês
    public String getSigno() {
        int d = this.diaNascimento;
        int m = this.mesNascimento;

        if ((m == 3 && d >= 21) || (m == 4 && d <= 19)) return "Áries";
        if ((m == 4 && d >= 20) || (m == 5 && d <= 20)) return "Touro";
        if ((m == 5 && d >= 21) || (m == 6 && d <= 20)) return "Gêmeos";
        if ((m == 6 && d >= 21) || (m == 7 && d <= 22)) return "Câncer";
        if ((m == 7 && d >= 23) || (m == 8 && d <= 22)) return "Leão";
        if ((m == 8 && d >= 23) || (m == 9 && d <= 22)) return "Virgem";
        if ((m == 9 && d >= 23) || (m == 10 && d <= 22)) return "Libra";
        if ((m == 10 && d >= 23) || (m == 11 && d <= 21)) return "Escorpião";
        if ((m == 11 && d >= 22) || (m == 12 && d <= 21)) return "Sagitário";
        if ((m == 12 && d >= 22) || (m == 1 && d <= 19)) return "Capricórnio";
        if ((m == 1 && d >= 20) || (m == 2 && d <= 18)) return "Aquário";
        if ((m == 2 && d >= 19) || (m == 3 && d <= 20)) return "Peixes";
        
        return "Data de nascimento inválida";
    }
}

public class TestePessoa {
    public static void main(String[] args) {
        // Cria o Scanner para ler as entradas do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Descubra seu Signo ===");
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite o dia do seu nascimento (ex: 15): ");
        int dia = scanner.nextInt();
        
        System.out.print("Digite o mdorivalês do seu nascimento (ex: 5 para Maio): ");
        int mes = scanner.nextInt();

        // Cria o objeto Pessoa com os dados fornecidos pelo usuário
        Pessoa usuario = new Pessoa(nome, idade, dia, mes);
        
        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade() + " anos");
        System.out.println("Data de Nascimento: " + usuario.getDiaNascimento() + "/" + usuario.getMesNascimento());
        System.out.println("Signo: " + usuario.getSigno());

        // Fecha o scanner
        scanner.close();
    }
}