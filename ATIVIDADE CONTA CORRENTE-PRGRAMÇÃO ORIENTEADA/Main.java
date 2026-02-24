public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("João Silva", "123.456.789-00", 1001, "0001", 1000.0);
        ContaCorrente conta2 = new ContaCorrente("Maria Souza", "987.654.321-00", 1002, "0001", 500.0);

        conta1.exibirDados();
        conta2.exibirDados();

        System.out.println("\n--- Testando Depósito ---");
        conta1.depositar(500.0);

        System.out.println("\n--- Testando Saque ---");
        conta1.sacar(200.0);

        System.out.println("\n--- Testando Saque com saldo insuficiente ---");
        conta2.sacar(9999.0);

        System.out.println("\n--- Testando Transferência ---");
        conta1.transferir(300.0, conta2);

        System.out.println("\n--- Dados finais ---");
        conta1.exibirDados();
        conta2.exibirDados();
    }
}