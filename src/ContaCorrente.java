public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "- Extrato Conta Corrente -\n" + super.toString();
    }
}