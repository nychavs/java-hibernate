/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editora.questao2;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andre
 */
public class ModeloTabelaLivros extends AbstractTableModel {

    private Editora editora;
    private String[] colunas = {"Titulo", "Nome do 1 autor", "Nome do 2 autor", "ISBN"};
    
    public ModeloTabelaLivros(Editora editora) {
        this.editora = editora;
    }
    
    @Override
    public int getRowCount() {
        return editora.obterLivros().size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return colunas[index];
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro livro = editora.obterLivros().get(rowIndex);
    
        switch(columnIndex) {
            case 0:
                return livro.getTitulo();
            case 1:
                return livro.getAutor1().getNome();
            case 2:
                return livro.getAutor2().getNome();
            case 3:
                return livro.getIsbn();
            default:
                return "ERRO";
        }
    }
    
    @Override
    public boolean isCellEditable(int indexRow, int indexColumn) {
        return true;
    }
    
    @Override
    public void setValueAt(Object dado, int indexRow, int indexColumn) {
        Livro livro = editora.obterLivros().get(indexRow);
        
        switch(indexColumn) {
            case 0:
                String titulo = (String) dado;
                livro.setTitulo(titulo);
                break;
            case 1:
                String nomeAutor1 = (String) dado;
                livro.getAutor1().setNome(nomeAutor1);
                break;
            case 2:
                String nomeAutor2 = (String) dado;
                livro.getAutor2().setNome(nomeAutor2);
                break;
            case 3:
                Integer isbn = (Integer) dado;
                livro.setIsbn(isbn);
                break;
        }
    }
    
    @Override
    public Class getColumnClass(int indexColumn) {
    
        switch(indexColumn) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Integer.class;
            default:
                return String.class;
        }
    }
}
