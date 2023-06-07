import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final List<Conta> contas = new ArrayList<>();

    public Banco(String nome) throws Exception {
        this.nome = checkNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void addContas(Conta... contas){

        for (Conta conta: contas) {
            if(conta != null)
                this.contas.add(conta);
            else
                System.err.println("Conta nula não pode ser adicionada");
        }
    }

    public void removeConta(int agencia, int numero){

        contas.stream()
                .filter(c -> c.getAgencia() == agencia && c.getNumero() == numero)
                .findFirst().ifPresent(conta -> {
                    if(!contas.remove(conta)) {
                        System.err.println("Conta nula não pode ser adicionada");
                    }
                });
    }

    public String checkNome(String nome) throws Exception {
        if(nome == null || nome.isBlank()){
            throw new Exception("Nome não pode ser vazio");
        }
        return nome;
    }
}