public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Bruce Wayne", 123456789);
        Cliente cliente2 = new Cliente("Clark Kent", 987654321);

        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        Banco banco = new Banco();

        System.out.println(banco.getNome());

        banco.abrirConta(corrente);
        banco.abrirConta(poupanca);

        System.out.println(banco.getContaList());

        System.out.println(banco.pesquisarContaCPF(123456789));

        System.out.println(banco.pesquisarContaNome("Clark Kent"));

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        corrente.depositar(200);
        corrente.sacar(50);
        corrente.trasferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarClientes();


    }
}
