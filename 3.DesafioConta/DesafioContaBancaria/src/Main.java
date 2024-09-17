import java.util.Scanner;

public class Main {
    public static double saldo = 2550;
    public static String nome = "Ranielli Soares";
    public static String tipoConta = "Corrente";

    public static void main(String[] args) {

        MenuPrincipal();

    }

    public static void MenuPrincipal() {
        System.out.println("*************************");
        System.out.println("Bem vindo ao Regex Bancos");
        System.out.println();
        System.out.println("Nome:  " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("*************************");
        System.out.println();
        OpcoesMenu();
    }

    public static void OpcoesMenu() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Selecione a opção desejada:");
        System.out.println("1 - Consultar Saldo.");
        System.out.println("2 - Depositar um valor.");
        System.out.println("3 - Enviar um valor.");
        System.out.println("4 - Sair.");
        int opcaoSelecionada = 0;
        opcaoSelecionada = leitura.nextInt();

        switch (opcaoSelecionada) {
            case 1:
                ConsultarSaldo();
            case 2:
                DepositarValor();
            case 3:
                RetirarValor();
            case 4:
                System.out.println("Você escolheu sair, obrigado");
                break;
            default:
                System.out.println("Opção selecionada inválida.");
                System.out.println();
                OpcoesMenu();
        }
    }

    //Metodo para consultar saldo
    public static void ConsultarSaldo() {
        System.out.println("Saldo disponível em conta: R$ " + saldo);
        System.out.println();
        OpcoesMenu();
    }

    //Metodo para adicionar saldo
    public static void DepositarValor() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar: ");
        saldo += leitura.nextDouble();
        System.out.println("Saldo atualizado: " + saldo);
        System.out.println();
        OpcoesMenu();
    }

    //Metodo para retirar saldo
    public static void RetirarValor() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor que deseja retirar: ");
        double saldoSaque = leitura.nextDouble();
        if (saldoSaque < saldo) {
            saldo -= saldoSaque;
            System.out.println("Saldo atualizado: " + saldo);
            System.out.println();
        } else {
            System.out.println("Saldo insuficiente para realizar a transação.");
        }
        OpcoesMenu();

    }
}