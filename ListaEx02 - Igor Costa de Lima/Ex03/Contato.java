package Ex03;

public class Contato implements Comparable<Contato> {

    String nome;
    String telefone;
    int prioridade;

    public Contato(String nome, String telefone, int prioridade) {
        this.nome = nome;
        this.telefone = telefone;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Contato o) {
        if (this.prioridade > o.getPrioridade()) {
            return 1;
        } else if (this.prioridade < o.getPrioridade()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Contao [Contato =" + nome + "[Telefone = " + telefone + ", Prioridade = " + prioridade + "} \n";
    }

}