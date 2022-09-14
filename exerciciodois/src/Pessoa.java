public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String verificarNome() {
        if(this.nome.equals("admin")) {
            return "É administrador";            
        } else {
            return "Não é administrador";
        }
    }
    
}
