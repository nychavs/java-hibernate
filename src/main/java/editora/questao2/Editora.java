/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editora.questao2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class Editora {
    private String nome;
    private String cnpj;
    private List<Livro> livros = new ArrayList<Livro>();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the livros
     */
    public List<Livro> obterLivros() {
        return livros;
    }

    /**
     * @param livros the livros to set
     */
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    public int posicaoLivro(Livro l) {
        return livros.indexOf(l);
    }
}
