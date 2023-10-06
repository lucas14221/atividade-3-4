package PraticaHeranca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Secretario> secretarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("escolha uma opção:");
            System.out.println("1 - entrar em uma conta");
            System.out.println("2 - mudar informações de uma conta");
            System.out.println("3 - deletar uma conta");
            System.out.println("4 - criar um novo número de ramal");
            System.out.println("5 - verificar números de ramal existentes");
            System.out.println("6 - sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    entrarEmUmaConta(secretarios, scanner);
                    break;
                case 2:
                    mudarInformacoesDeUmaConta(secretarios, scanner);
                    break;
                case 3:
                    deletarConta(secretarios, scanner);
                    break;
                case 4:
                    criarNovoRamal(secretarios, scanner);
                    break;
                case 5:
                    verificarNumerosDeRamalExistentes(secretarios);
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void entrarEmUmaConta(List<Secretario> secretarios, Scanner scanner) {
        System.out.print("Digite o número do ramal: ");
        int numeroDeRamal = scanner.nextInt();

        boolean encontrou = false;
        for (Secretario secretario : secretarios) {
            if (secretario.getNumeroDeRamal() == numeroDeRamal) {
                System.out.println("você entrou na conta do ramal " + numeroDeRamal);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("ramal nao encontrado.");
        }
    }

    private static void mudarInformacoesDeUmaConta(List<Secretario> secretarios, Scanner scanner) {
        System.out.print("digite o numero do ramal que deseja modificar: ");
        int numeroDeRamal = scanner.nextInt();
        scanner.nextLine(); 
        boolean encontrou = false;
        for (Secretario secretario : secretarios) {
            if (secretario.getNumeroDeRamal() == numeroDeRamal) {
                System.out.print("Digite o novo número de ramal: ");
                int novoRamal = scanner.nextInt();
                scanner.nextLine(); 

                secretario.setNumeroDeRamal(novoRamal);
                System.out.println("Número de ramal modificado com sucesso.");
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Ramal não encontrado.");
        }
    }

    private static void deletarConta(List<Secretario> secretarios, Scanner scanner) {
        System.out.print("Digite o número do ramal que deseja deletar: ");
        int numeroDeRamal = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < secretarios.size(); i++) {
            if (secretarios.get(i).getNumeroDeRamal() == numeroDeRamal) {
                secretarios.remove(i);
                System.out.println("Ramal removido com sucesso.");
                return;
            }
        }

        System.out.println("Ramal não encontrado.");
    }

    private static void criarNovoRamal(List<Secretario> secretarios, Scanner scanner) {
        System.out.print("Digite o número do novo ramal: ");
        int novoRamal = scanner.nextInt();
        scanner.nextLine(); 
        Secretario secretario = new Secretario(novoRamal);
        secretarios.add(secretario);

        System.out.println("Novo ramal criado com sucesso.");
       
    }

    private static void verificarNumerosDeRamalExistentes(List<Secretario> secretarios) {
        System.out.println("Números de ramal existentes:");
        for (Secretario secretario : secretarios) {
            System.out.println(secretario.getNumeroDeRamal());
        }
    }
}





