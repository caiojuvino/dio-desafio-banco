public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "- Extrato Conta Poupança -\n" + super.toString();
    }
}