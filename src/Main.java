public class Main {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Fulano");

        try {
            c1.setNome("");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        Banco bb = new Banco("BB");
        bb.addContas(cc, poupanca, new ContaCorrente(new Cliente("Outro")));

        cc.depositar(100);
        imprimirContas(bb);

        cc.transferir(100, poupanca);
        bb.removeConta(1, 3);

        imprimirContas(bb);
    }

    public static void imprimirContas(Banco banco) {
        System.out.println("CONTAS NO BANCO " + banco.getNome() );
        for (Conta c : banco.getContas()) {
            System.out.println(c);
        }
        System.out.println();
    }
}