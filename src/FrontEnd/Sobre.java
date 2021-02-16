package FrontEnd;

import BackEnd.Sistema;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Sobre extends javax.swing.JFrame {

    private Sistema sistemaSobre;

    public Sobre(Sistema sistema) {
        initComponents();
        sistemaSobre=sistema;
        setTitle(sistemaSobre.NOMEPROGRAMA + " - Sobre" ); //Nome da janela
        setIconImage(sistema.getIconFrame());  //Icon da janela
        setLocationRelativeTo(null);
        jTextPane1.setCaretPosition(0);
        hyperlinkLabel.setForeground(new Color(6, 69, 173));
        hyperlinkLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {//clique do rato no label
                try {
                    Desktop.getDesktop().browse(new URI("http://www.dsi.uminho.pt"));//Abre o site no browser
                    hyperlinkLabel.setForeground(new Color (102,51,102));//Cor laranja se for clicado

                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                hyperlinkLabel.setText("<html><a href=''>http://www.dsi.uminho.pt</a></html>");
                hyperlinkLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                hyperlinkLabel.setCursor(Cursor.getDefaultCursor());
                hyperlinkLabel.setText("http://www.dsi.uminho.pt");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hyperlinkLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestor de Projetos - Sobre");
        setBackground(new java.awt.Color(54, 54, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(435, 620));
        setMinimumSize(new java.awt.Dimension(435, 620));
        setPreferredSize(new java.awt.Dimension(435, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(435, 620));

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setText("Existem várias aplicações online gratuitas que permitem fazer a gestão de projetos, com algumas limitações. O Freedcamp (https://freedcamp.com/) e Trello (https://trello.com/) são exemplos deste tipo de aplicações. Nesta edição da unidade curricular de Paradigmas de Programação pretende-se a criação de uma aplicação informática cujo funcionamento se baseie numa dessas aplicações e que implemente as funcionalidades indicadas neste documento. A aplicação deverá ser desenhada de acordo com os princípios do Paradigma Orientado a Objetos e utilizar o Java SE.  A aplicação criada será uma versão simplificada, focando-se na gestão de tarefas. Os utilizadores têm de se registar para terem acesso às suas funcionalidades. Os utilizadores autenticados têm a possibilidade de criarem projetos e fazerem a sua gestão, incluindo criarem listas de tarefas e associarem pessoas aos projetos. Cada projeto tem um owner, que é o utilizador que criou o projeto, e só ele pode alterar os dados gerais do projeto, como o título, a descrição, a data de início e de fim do projeto. O owner do projeto pode, em cada momento, associar pessoas (outros utilizadores registados) ao projeto. Todos os utilizadores registados têm acesso à informação dos seus projetos (de que é owner) e dos projetos a que está associado, podendo, ainda, para cada projeto, criar listas de tarefas, e, para cada lista, criar tarefas. Para cada tarefa é indicado: título, descrição, associar pessoa à tarefa (um dos utilizadores associados ao projeto), prioridade (baixa, média, alta), data de fim, estado da tarefa (não iniciada, em progresso, terminada). Para cada lista ou tarefa deve ficar registado quem a criou.  Funcionalidades A aplicação informática deverá ser composta por duas partes: a parte de back-end que suporta o funcionamento do sistema, e a parte de front-end que suporta a interface gráfica que permite a interação com o utilizador.   O back-end e o front-end deverão estar implementados em pacotes distintos, ou seja, todas as classes que digam respeito à interface gráfica deverão estar arrumadas num pacote e as classes respeitantes ao negócio, noutro.  A entrada e saída de dados deve ser realizada via interface gráfico, assente numa ou mais janelas.  O desenvolvimento da interface deve ser baseado no uso das classes existentes nos packages AWT/Swing do JAVA. Pretende-se ainda que a aplicação tenha capacidade de persistência, ou seja, que tenha capacidade de guardar em ficheiro o estado do sistema num determinado momento e recuperá-lo quando pretendido. Refere-se que não é permitida a utilização de bases de dados. Ainda em relação à entrada e saída de dados importa referir que se pretende que o sistema tenha níveis de robustez adequados, ou seja, que seja capaz de se comportar adequadamente em situações de erro (nomeadamente aquando da introdução de dados por parte dos utilizadores).  A seguir estão listadas as funcionalidades que deverão ser implementadas:  1. Registar 2. Autenticar 3. Alterar dados do seu perfil     4. Criar projetos 5. Alterar dados do projeto de que é owner 6. Associar pessoas (outros utilizadores) aos projetos de que é owner 7. Para cada projeto, criar listas de tarefas 8. Para cada lista de tarefa, criar tarefas 9. Alterar qualquer tipo de informação respeitante às listas e às tarefas 10. Alterar o estado das tarefas. Quando a tarefa é indicada como terminada, é registada a data em que a tarefa foi concluída. 11. Visualizar a lista de projetos do utilizador, indicando o título, data de início e a data de fim do projeto 12. Selecionar um projeto para edição 13. Listar todas as tarefas do projeto (título, prioridade, data de fim, estado, utilizador associado) 14. Filtrar a listagem de tarefas por: utilizador que criou; utilizador associado; prioridade; estado; data de fim. 15. Ordenar (ascendente ou descendente) a listagem de tarefas por: ordem alfabética do título; data de fim. 16. Listar as tarefas que estão atrasadas 17. Visualizar um dashboard geral dos projetos que apresente: a. o número e percentagem de projetos concluídos, em curso e atrasados; b. os 3 projetos mais atrasados; c. o projeto mais problemático, isto é, mais pessoas envolvidas e mais tarefas concluídas. ");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Autores:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Flávio Santos(a89960)");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("João Silva(a89956)");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Pedro Magalhães(a89169)");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Site do DSI:");

        hyperlinkLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hyperlinkLabel.setText("http://www.dsi.uminho.pt");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png"))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Build Time  25 Maio 2019 17:00 ");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("   Gestor de Projetos");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/umDsiLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hyperlinkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hyperlinkLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addGap(53, 53, 53))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hyperlinkLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
