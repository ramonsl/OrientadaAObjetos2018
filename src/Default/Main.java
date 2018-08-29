package Default;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Livro livro = new Livro("Java","Descric",20,new Autor());








        Scanner tc= new Scanner(System.in);

        livro.mostrarDetalhes();

        System.out.println(livro.aplicarDesconto(0.4));


        livro.mostrarDetalhes();



    }

}
