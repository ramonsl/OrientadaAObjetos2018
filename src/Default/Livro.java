package Default;

import java.util.Random;
import java.util.Scanner;

public class Livro {

    private String nome;
    private String descriccao;
    private double valor;
    private String isbn;
    private Autor autor;



    public Livro(String nome,String descriccao,double valor, Autor a){
        this.nome=nome;
        Random random = new Random();
        this.isbn= "ABC"+random.nextInt(1000);
        this.descriccao=descriccao;
        this.valor=valor;
        this.autor=a;
    }
    public Livro(String nome,String isbn){
        this.nome=nome;
        this.isbn=isbn;
    }

    public Livro(){
        Random random = new Random();
        this.isbn= "ABC"+random.nextInt(1000);
    }

    public String getNome(){
        return nome.toLowerCase();
    }
    public void setNome(String nome){
        this.nome=nome.toUpperCase();
    }

    public String getDescriccao() {
        return descriccao;
    }

    public void setDescriccao(String descriccao) {
        this.descriccao = descriccao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void ler(){
        Scanner tc = new Scanner(System.in);
        this.nome=tc.next();
    }
    public double aplicarDesconto(double porcentagem){
        if (porcentagem<0.3){
            double desc = this.valor*porcentagem;
            this.valor = this.valor-desc;
            return desc;
        }else{
            return 0;
        }

    }


    public void mostrarDetalhes(){
        System.out.println("___________________________");
        System.out.println(this.nome);
        System.out.println(this.valor);
        System.out.println(this.descriccao);
        System.out.println(this.isbn);
        this.equals(autor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (nome != null ? !nome.equals(livro.nome) : livro.nome != null) return false;
        return isbn != null ? isbn.equals(livro.isbn) : livro.isbn == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }
}
