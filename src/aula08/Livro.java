package aula08;
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos Especiais
    public Livro(String t, String a, int tot, Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tot;
        this.leitor = l;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Métodos Públicos
    public String detalhes() {
        return " Livro: \n " + "Título: " + titulo + "\n Autor: " + autor + "\n Total de páginas: " + totPaginas + "\n Página atual: " + pagAtual + "\n Aberto: " + aberto + "\n Leitor: " + this.leitor.getNome() +
                " " + "\n Idade: " + this.leitor.getIdade() + " " + "\n Sexo: " + this.leitor.getSexo();
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
