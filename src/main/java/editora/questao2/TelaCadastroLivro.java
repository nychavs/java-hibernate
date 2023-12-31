/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package editora.questao2;

import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class TelaCadastroLivro extends javax.swing.JFrame {
    private Editora editora;
    
    /**
     * Creates new form TelaCadastroLivro
     */
    public TelaCadastroLivro(Editora editora) {
        initComponents();
        this.editora = editora;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCadastrarLivro = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbAnoPublicacao = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        tfAnoPublicacao = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lbNumeroPaginas = new javax.swing.JLabel();
        tfNumeroPaginas = new javax.swing.JTextField();
        tfISBN = new javax.swing.JTextField();
        lbISBN = new javax.swing.JLabel();
        lbNumeroPaginas1 = new javax.swing.JLabel();
        lbNumeroPaginas2 = new javax.swing.JLabel();
        lbNomeAutor1 = new javax.swing.JLabel();
        tfNomeAutor1 = new javax.swing.JTextField();
        lbDataNascimentoAutor1 = new javax.swing.JLabel();
        tfDataNascimentoAutor1 = new javax.swing.JTextField();
        tfDataNascimentoAutor2 = new javax.swing.JTextField();
        lbDataNascimentoAutor2 = new javax.swing.JLabel();
        tfNomeAutor2 = new javax.swing.JTextField();
        lbNomeAutor2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCadastrarLivro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbCadastrarLivro.setText("Cadastrar Novo Livro");

        lbTitulo.setText("Título:");

        lbAnoPublicacao.setText("Ano de publicação:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lbNumeroPaginas.setText("Número de páginas:");

        lbISBN.setText("ISBN:");

        lbNumeroPaginas1.setText("Primeiro autor:");

        lbNumeroPaginas2.setText("Segundo autor:");

        lbNomeAutor1.setText("Nome:");

        lbDataNascimentoAutor1.setText("Data de nascimento:");

        lbDataNascimentoAutor2.setText("Data de nascimento:");

        lbNomeAutor2.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(46, 46, 46)
                .addComponent(btLimpar)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lbCadastrarLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAnoPublicacao)
                                .addGap(18, 18, 18)
                                .addComponent(tfAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNumeroPaginas1)
                            .addComponent(lbNumeroPaginas2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNumeroPaginas)
                                .addGap(18, 18, 18)
                                .addComponent(tfNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbISBN)
                                .addGap(18, 18, 18)
                                .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbNomeAutor1)
                        .addGap(18, 18, 18)
                        .addComponent(tfNomeAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbDataNascimentoAutor1)
                        .addGap(18, 18, 18)
                        .addComponent(tfDataNascimentoAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbDataNascimentoAutor2)
                        .addGap(18, 18, 18)
                        .addComponent(tfDataNascimentoAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbNomeAutor2)
                        .addGap(18, 18, 18)
                        .addComponent(tfNomeAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(171, 292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbCadastrarLivro)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnoPublicacao))
                .addGap(37, 37, 37)
                .addComponent(lbNumeroPaginas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeAutor1)
                    .addComponent(tfNomeAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimentoAutor1)
                    .addComponent(tfDataNascimentoAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lbNumeroPaginas2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeAutor2)
                    .addComponent(tfNomeAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimentoAutor2)
                    .addComponent(tfDataNascimentoAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroPaginas)
                    .addComponent(tfNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbISBN)
                    .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.tfAnoPublicacao.setText("");
        this.tfTitulo.setText("");
        this.tfNomeAutor1.setText("");
        this.tfDataNascimentoAutor1.setText("");
        this.tfNomeAutor2.setText("");
        this.tfDataNascimentoAutor2.setText("");
        this.tfNumeroPaginas.setText("");
        this.tfISBN.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Livro livro = new Livro();
        livro.setTitulo(tfTitulo.getText());
        livro.setAnoPublicacao(Integer.parseInt(tfAnoPublicacao.getText()));
        livro.setIsbn(Integer.parseInt(this.tfISBN.getText()));
        
        Autor autor1 = new Autor();
        autor1.setNome(this.tfNomeAutor1.getText());
        autor1.setDataNascimento(this.tfDataNascimentoAutor1.getText());

        Autor autor2 = new Autor();
        autor2.setNome(this.tfNomeAutor2.getText());
        autor2.setDataNascimento(this.tfDataNascimentoAutor2.getText());
        
        livro.setAutor1(autor1);
        livro.setAutor2(autor2);
        AutorDAOHibernate aDAO = new AutorDAOHibernate();
        aDAO.inserir(autor1);
        aDAO.inserir(autor2);
        editora.adicionarLivro(livro);
        
        JOptionPane.showMessageDialog(rootPane, "Livro cadastrado com sucesso!");
    }//GEN-LAST:event_btCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel lbAnoPublicacao;
    private javax.swing.JLabel lbCadastrarLivro;
    private javax.swing.JLabel lbDataNascimentoAutor1;
    private javax.swing.JLabel lbDataNascimentoAutor2;
    private javax.swing.JLabel lbISBN;
    private javax.swing.JLabel lbNomeAutor1;
    private javax.swing.JLabel lbNomeAutor2;
    private javax.swing.JLabel lbNumeroPaginas;
    private javax.swing.JLabel lbNumeroPaginas1;
    private javax.swing.JLabel lbNumeroPaginas2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfAnoPublicacao;
    private javax.swing.JTextField tfDataNascimentoAutor1;
    private javax.swing.JTextField tfDataNascimentoAutor2;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfNomeAutor1;
    private javax.swing.JTextField tfNomeAutor2;
    private javax.swing.JTextField tfNumeroPaginas;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
