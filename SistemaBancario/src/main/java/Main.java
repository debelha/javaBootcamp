public class Main {

    public static void main(String[] args) {

        Conta corrente = new ContaCorrente();
        corrente.depositar(100);


        Conta poupanca = new ContaPoupanca();
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
