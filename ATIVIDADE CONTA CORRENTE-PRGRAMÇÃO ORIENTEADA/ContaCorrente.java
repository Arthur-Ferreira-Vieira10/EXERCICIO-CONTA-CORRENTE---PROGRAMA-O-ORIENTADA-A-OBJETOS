public class ContaCorrente {

    String titular;
    String cpf;
    int numeroConta;
    String agencia;
    double saldo;

    public ContaCorrente(String titular, String cpf, int numeroConta, String agencia, double saldoInicial) {
        this.titular = titular;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente! Saldo atual: R$ " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência! Saldo atual: R$ " + saldo);
        } else {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
            System.out.println("Saldo da conta " + numeroConta + ": R$ " + saldo);
            System.out.println("Saldo da conta " + contaDestino.numeroConta + ": R$ " + contaDestino.saldo);
        }
    }

    public void exibirDados() {
        System.out.println("=== Dados da Conta ===");
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("======================");
    }
}