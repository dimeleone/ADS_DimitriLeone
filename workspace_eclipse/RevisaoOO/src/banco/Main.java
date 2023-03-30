package banco;

/*
 * @autor dimitri.leone
 * @since 30.03.2023
 */

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000.0);
        cc.rentabilizar();
        System.out.println("Novo saldo da conta corrente: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1000.0);
        cp.rentabilizar();
        System.out.println("Novo saldo da conta poupança: " + cp.getSaldo());
    }
}