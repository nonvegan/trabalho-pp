/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.ListaTarefas;
import BackEnd.Projeto;
import BackEnd.Sistema;
import javax.swing.JOptionPane;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class NovaListaTarefas extends javax.swing.JFrame {

    private Sistema sistemaNovaListaTarefas;
    private Projeto projetoNovaListaTarefas;

    public NovaListaTarefas(Sistema sistema, Projeto projeto) {
        sistemaNovaListaTarefas = sistema;
        projetoNovaListaTarefas = projeto;
        initComponents();
        nomeEmptyLabel.setVisible(false);//torna o label de erro não visível
        projetoValue.setText(projetoNovaListaTarefas.getTítuloProjeto()); //Carrega o título do projeto
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Fechar a janela faz dispose da janela
        setTitle(sistemaNovaListaTarefas.NOMEPROGRAMA + " - Nova ListaTarefas Tarefa");//Título da janela
        setIconImage(sistemaNovaListaTarefas.getIconFrame());//Ícon da Janela
        setLocationRelativeTo(null);//Janela no meio do ecrã
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        novoProjetoLabel = new javax.swing.JLabel();
        descriçãoLabel = new javax.swing.JLabel();
        títuloLabel = new javax.swing.JLabel();
        títuloTextField = new javax.swing.JTextField();
        criarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        nomeEmptyLabel = new javax.swing.JLabel();
        descriçãoScrollPane = new javax.swing.JScrollPane();
        descriçãoEditorPane = new javax.swing.JEditorPane();
        projetoValue = new javax.swing.JLabel();
        projetoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(520, 570));
        setMinimumSize(new java.awt.Dimension(520, 570));
        setPreferredSize(new java.awt.Dimension(520, 570));
        setResizable(false);

        novoProjetoLabel.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        novoProjetoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novoProjetoLabel.setText("Nova Lista Tarefas");

        descriçãoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        descriçãoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriçãoLabel.setText("Descrição");

        títuloLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        títuloLabel.setText("Título");

        títuloTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                títuloTextFieldKeyReleased(evt);
            }
        });

        criarButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        criarButton.setText("Criar");
        criarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarButtonActionPerformed(evt);
            }
        });

        voltarButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        nomeEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nomeEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        nomeEmptyLabel.setText("*");

        descriçãoScrollPane.setViewportView(descriçãoEditorPane);

        projetoValue.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        projetoValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projetoValueMouseClicked(evt);
            }
        });

        projetoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        projetoLabel.setText("Projeto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriçãoScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(descriçãoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(novoProjetoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(títuloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(projetoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(títuloTextField)
                                    .addComponent(projetoValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addGap(18, 18, 18)
                .addComponent(criarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(novoProjetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(títuloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(títuloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomeEmptyLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projetoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriçãoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descriçãoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton)
                    .addComponent(criarButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void títuloTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_títuloTextFieldKeyReleased
        nomeEmptyLabel.setVisible(false);
        if (títuloTextField.getText().isEmpty()) {//se estiver vazio, torna nomeEmptyLabel visível
            nomeEmptyLabel.setVisible(true);
        }
    }//GEN-LAST:event_títuloTextFieldKeyReleased

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose();//dispose da janela
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void projetoValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projetoValueMouseClicked
        new ProjetoFrontEnd(sistemaNovaListaTarefas, projetoNovaListaTarefas).setVisible(true);//nova janela do projeto
    }//GEN-LAST:event_projetoValueMouseClicked

    private void criarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarButtonActionPerformed
        if (!sistemaNovaListaTarefas.getCurrentSave().getListaProjetosSave().getListaProjetos().contains(projetoNovaListaTarefas)) {//Se o projeto não for encontrado
            JOptionPane.showMessageDialog(this, "Este projeto não existe ou foi eliminado", "Erro ao editar tarefa.", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

        String erro = "";
        if (títuloTextField.getText().isEmpty()) {//se o título da lista estiver vazio, adicionar ao erro
            erro += "Nome inválido.\n";
            títuloLabel.setVisible(true);
        }

        if (!erro.isEmpty()) {//se houver errors
            JOptionPane.showMessageDialog(this, erro, "Erro ao criar nova Lista de Tarefas", JOptionPane.ERROR_MESSAGE);//Mensagem de erro
        } else { //se não houver erros
            projetoNovaListaTarefas.addListaListasTarefas(new ListaTarefas(títuloTextField.getText(), descriçãoEditorPane.getText(), sistemaNovaListaTarefas.getCurrentUser()));//cria nova tarefa
            sistemaNovaListaTarefas.setSaved(false);//muda o estado do objeto Sistema para não gravado
            sistemaNovaListaTarefas.getDashboardWindow().refreshUI();//atualiza as janelas
            dispose();//faz dispose da janela
        }
    }//GEN-LAST:event_criarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarButton;
    private javax.swing.JEditorPane descriçãoEditorPane;
    private javax.swing.JLabel descriçãoLabel;
    private javax.swing.JScrollPane descriçãoScrollPane;
    private javax.swing.JLabel nomeEmptyLabel;
    private javax.swing.JLabel novoProjetoLabel;
    private javax.swing.JLabel projetoLabel;
    private javax.swing.JLabel projetoValue;
    private javax.swing.JLabel títuloLabel;
    private javax.swing.JTextField títuloTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
