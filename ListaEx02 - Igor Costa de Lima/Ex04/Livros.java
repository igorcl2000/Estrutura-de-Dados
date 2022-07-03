package Ex04;

public class Livros implements Comparable<Livros> {

    String nomeLivro;
    String isbn;
    String anoLan;
    String autor;

    public Livros(String nomeLivro, String isbn, String anoLan, String auto) {
        this.nomeLivro = nomeLivro;
        this.isbn = isbn;
        this.anoLan = anoLan;
        this.autor = auto;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoLan() {
        return anoLan;
    }

    public void setAnoLan(String anoLan) {
        this.anoLan = anoLan;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livros [Nome do livro: " + nomeLivro + ", ISBN: " + isbn + ", Autor: " + autor
                + ", Data de Lançamento: " + anoLan + "]\n";
    }

    @Override
    public int compareTo(Livros o) {
        return 0;
    }

}
