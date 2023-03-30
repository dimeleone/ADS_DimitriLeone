package banco;

/*
 * @autor dimitri.leone
 * @since 30.03.2023
 */

public class ContaCorrente extends Conta {
    public void rentabilizar() {
        Double taxa = 0.01;
        Double novoSaldo = this.getSaldo() + this.getSaldo() * taxa;
        this.setSaldo(novoSaldo);
    }
}
