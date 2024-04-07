import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            String nome = "Lucas Assis";
            String tipoDeConta = "Corrente";
            double salDoInicial = 2500.00;
            int opcao = 0;
            double transferir = 0;
            double receber = 0;

            System.out.println("***********************************");
            System.out.println("Dados Iniciais do Cliente: ");
            System.out.println("Nome:            " + nome);
            System.out.println("Tipo Conta:      " + tipoDeConta);
            System.out.println("Saldo Inicial:   " + salDoInicial);
            System.out.println("***********************************");

            String menu = """
                **Digite a Opção**
                1 - Consultar Saldo
                2 - Transferir Saldo
                3 - Receber Valor
                4 - Sair
                """;

            while (opcao != 4){
                System.out.println(menu);
                opcao = leitor.nextInt();
                if (opcao == 1){
                    System.out.println("Seu Saldo é De: " + salDoInicial);
                } else if (opcao == 2){
                    System.out.println("Quanto você quer Transferir? ");
                    transferir = leitor.nextDouble();
                if (transferir > salDoInicial){
                    System.out.println("Não há Saldo Suficiente Para essa Transferencia: ");
                }   else {
                    salDoInicial = salDoInicial - transferir;
                    System.out.println("Saldo Atualizado: " + salDoInicial);
                }
                } else if (opcao == 3 ){
                    System.out.println("Quando você esta Recebendo? ");
                    receber = leitor.nextDouble();
                    salDoInicial = salDoInicial + receber;
                    System.out.println("Saldo Atualizado: " + salDoInicial);
                } else if (opcao != 4) {
                    System.out.println("Opção Inválida");
                }

            }
    }
}