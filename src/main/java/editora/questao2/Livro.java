/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editora.questao2;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andre
 */
@Entity
public class Livro {
    private String titulo;
    private int anoPublicacao;
    private int numeroPaginas;
    @Id
    private int isbn;
    private Autor autor1;
    private Autor autor2;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the anoPublicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * @param anoPublicacao the anoPublicacao to set
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * @return the numeroPaginas
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * @param numeroPaginas the numeroPaginas to set
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor1
     */
    public Autor getAutor1() {
        return autor1;
    }

    /**
     * @param autor1 the autor1 to set
     */
    public void setAutor1(Autor autor1) {
        this.autor1 = autor1;
    }

    /**
     * @return the autor2
     */
    public Autor getAutor2() {
        return autor2;
    }

    /**
     * @param autor2 the autor2 to set
     */
    public void setAutor2(Autor autor2) {
        this.autor2 = autor2;
    }
        
    
}
