package ex02;

import java.util.List;


public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if (getLivros().isEmpty()) {
            System.out.println("A loja não tem livros no seu estoque.");
            return;
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("A loja " + getNome() + " possui estes livros para venda: ");
        getLivros().forEach(System.out::println);
    }

    public void listaVideoGames() {
        if (getLivros().isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque.");
            return;
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("A loja " + getNome() + " possui estes video-games para venda: ");
        getVideoGames().forEach(System.out::println);
    }

    public double calculaPatrimonio() {
        double patrimonio, totalLivros, totalVideoGames;

        totalLivros = getLivros().stream().mapToDouble(x -> x.getPreco() * x.getQtd()).sum();
        totalVideoGames = getVideoGames().stream().mapToDouble(x -> x.getPreco() * x.getQtd()).sum();
        patrimonio = totalLivros + totalVideoGames;

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("O patrimônio da loja: " + getNome() + " é de R$ " + patrimonio);
        return patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }
}