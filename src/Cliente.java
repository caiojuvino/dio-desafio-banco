public class Cliente {

    private String nome;

    public Cliente(String nome) throws Exception {
        this.nome = checkNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        checkNome(nome);
    }

    public String checkNome(String nome) throws Exception {
        if(nome == null || nome.isBlank()){
            throw new Exception("Nome não pode ser vazio");
        }
        return nome;
    }
}