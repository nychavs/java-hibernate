/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editora.questao2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Andre
 */
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int codigo;
    private String nome;
    private String dataNascimento;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    public int getCodigo() {
    return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
