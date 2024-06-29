public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Bruce Wayne", 123456789);
        Cliente cliente2 = new Cliente("Clark Kent", 987654321);

        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        corrente.depositar(200);
        corrente.sacar(50);
        corrente.trasferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
