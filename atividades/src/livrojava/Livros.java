package livrojava;

public class Livros {
    private String titulo;
    private String autor;
    private int anoPublicação;

    private int quantidadePaginas;
    public Livros(String titulo, String autor,int anoPublicação, int quantidadePaginas ){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicação = anoPublicação;
        this.quantidadePaginas = quantidadePaginas;
        //declarado o metodo construtor   
}
// iniciar trabalhar nas variaveis
public String getTitulo(){
    return titulo;
    }
    // precisa receber valor nos paranteses
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(String autor){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnoPublicacao(){
        return anoPublicação;     
    }
    public void setAnoPublicacao (int anoPublicaçao){
        this.anoPublicação = anoPublicaçao;
    }
    public int getquantidadePaginas(int getquantidadePaginas){
    return quantidadePaginas;   
    }
    public void setQuantidadePaginas(int quantidadePaginas) {
    this.quantidadePaginas = quantidadePaginas;
}
//calcular tempo de leitura:
public int calcularTempoLeitura(){
    return quantidadePaginas;
}
//Metodos para exibir informações:
public void exibirInformacoes(){
    System.out.println("Titulos :" + titulo);
    System.out.println("Autor : " + autor);
    System.out.println("Ano de Publicacao :" + anoPublicação);
    System.out.println("Paginas :" + quantidadePaginas);
    System.out.println("Tempo estimado de leitura : " + calcularTempoLeitura() + "minutos");
}

}

