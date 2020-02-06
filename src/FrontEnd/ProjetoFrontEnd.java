/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.ListaTarefas;
import BackEnd.Projeto;
import BackEnd.Sistema;
import BackEnd.Tarefa;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class ProjetoFrontEnd extends javax.swing.JFrame {

    private Sistema sistemaProjetoFrontEnd;
    private Projeto projetoProjetoFrontEnd;
    private DefaultComboBoxModel listaTarefasComboModelProjetoFrontEnd;

    private boolean OrdemAlf_Asc, OrdemData_Asc;
    private ArrayList<Tarefa> novaListaTarefas;

    public ProjetoFrontEnd(Sistema sistema, Projeto projeto) {
        sistemaProjetoFrontEnd = sistema;
        projetoProjetoFrontEnd = projeto;
        listaTarefasComboModelProjetoFrontEnd = new DefaultComboBoxModel<ListaTarefas>();

        OrdemAlf_Asc = false;
        OrdemData_Asc = false;

        initComponents();
        tarefas.setLayout(new BoxLayout(tarefas, 3)); //Muda o layout do painel
        setSelectedDate(); //seleciona as datas para um periode de 3 meses antes e 3 meses depois
        setRadioButtonsSelected(true);//seleciona todos os filtros
        setListasTarefasComboModel();//Carrga o combo model da listas de tarefas
        refreshPanels(); //Atualiza os paineis
        setTitle(sistemaProjetoFrontEnd.NOMEPROGRAMA + " - Projeto ( " + projeto.getTítuloProjeto() + " )"); //Título da janela
        setIconImage(sistemaProjetoFrontEnd.getIconFrame());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Ao fechar janela faz fispose da janela
        setLocationRelativeTo(null);
        if (sistemaProjetoFrontEnd.getProjetoWindow() != null) {//Se houver outro projeto aberto, fecha-lo
            sistemaProjetoFrontEnd.getProjetoWindow().dispose();
        }
        sistemaProjetoFrontEnd.setProjetoWindow(this);//torna o projetoWindow este
        if (sistemaProjetoFrontEnd.getCurrentUser() != projeto.getOwnerProjeto()) {//se o utilizador não for owner do projeto não pode editar o projeto
            editarProjetoButton.setVisible(false);
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        nãoAtrasadasProgressBar = new javax.swing.JProgressBar();
        atrasadasProgressBar = new javax.swing.JProgressBar();
        concluídasProgressBar = new javax.swing.JProgressBar();
        nãoAtrasadasLabel = new javax.swing.JLabel();
        nãoAtrasadasValue = new javax.swing.JLabel();
        atrasadasValue = new javax.swing.JLabel();
        concluídasValue = new javax.swing.JLabel();
        tarefasLabel = new javax.swing.JLabel();
        concluídasLabel = new javax.swing.JLabel();
        atrasadasLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        procurarTítuloTarefaTextField = new javax.swing.JTextField();
        dataLimiteDeDateChooser = new datechooser.beans.DateChooserCombo();
        dataLimiteAtéDateChooser = new datechooser.beans.DateChooserCombo();
        dataLimiteLabel = new javax.swing.JLabel();
        deAtéLimiteLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        editarProjetoButton = new javax.swing.JButton();
        novaListaTarefasButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarefas = new javax.swing.JPanel();
        novaTarefaButton = new javax.swing.JButton();
        listasTarefasComboBox = new javax.swing.JComboBox<>();
        listasTarefasLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        prioridadeAltaRadioButton = new javax.swing.JRadioButton();
        prioridadeMédiaRadioButton = new javax.swing.JRadioButton();
        atrasadaRadioButton = new javax.swing.JRadioButton();
        nãoAtrasadasRadioButton = new javax.swing.JRadioButton();
        prioridadeBaixaRadioButton = new javax.swing.JRadioButton();
        concluídaRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        procurarOwnerTarefaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        procurarAssociadoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ordemDataButton = new javax.swing.JButton();
        ordemAlfabeticaButton = new javax.swing.JButton();
        dataInícioValue = new javax.swing.JLabel();
        dataLimiteValue = new javax.swing.JLabel();
        dataConclusãoValue = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(985, 680));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        nãoAtrasadasProgressBar.setStringPainted(true);

        atrasadasProgressBar.setStringPainted(true);

        concluídasProgressBar.setStringPainted(true);

        nãoAtrasadasLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nãoAtrasadasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nãoAtrasadasLabel.setText("Não atrasadas");

        nãoAtrasadasValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nãoAtrasadasValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        atrasadasValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atrasadasValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        concluídasValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        concluídasValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tarefasLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tarefasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        concluídasLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        concluídasLabel.setText("Concluídas");

        atrasadasLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atrasadasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atrasadasLabel.setText("Atrasadas");

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        procurarTítuloTarefaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                procurarTítuloTarefaTextFieldKeyReleased(evt);
            }
        });

        dataLimiteDeDateChooser.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dataLimiteDeDateChooserOnSelectionChange(evt);
            }
        });

        dataLimiteAtéDateChooser.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dataLimiteAtéDateChooserOnSelectionChange(evt);
            }
        });

        dataLimiteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataLimiteLabel.setText("Data Limite");

        deAtéLimiteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deAtéLimiteLabel.setText("   De                               Até              ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N

        editarProjetoButton.setText("Editar");
        editarProjetoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProjetoButtonActionPerformed(evt);
            }
        });

        novaListaTarefasButton.setText("Nova Lista Tarefas");
        novaListaTarefasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaListaTarefasButtonActionPerformed(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout tarefasLayout = new javax.swing.GroupLayout(tarefas);
        tarefas.setLayout(tarefasLayout);
        tarefasLayout.setHorizontalGroup(
            tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        tarefasLayout.setVerticalGroup(
            tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(tarefas);

        jTabbedPane1.addTab("Tarefas", jScrollPane1);

        novaTarefaButton.setText("Nova Tarefa");
        novaTarefaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaTarefaButtonActionPerformed(evt);
            }
        });

        listasTarefasLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        listasTarefasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listasTarefasLabel.setText("ListaTarefas");

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        prioridadeAltaRadioButton.setText("Alta");
        prioridadeAltaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadeAltaRadioButtonActionPerformed(evt);
            }
        });

        prioridadeMédiaRadioButton.setText("Média");
        prioridadeMédiaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadeMédiaRadioButtonActionPerformed(evt);
            }
        });

        atrasadaRadioButton.setText("Atrasadas");
        atrasadaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasadaRadioButtonActionPerformed(evt);
            }
        });

        nãoAtrasadasRadioButton.setText("Não Atrasadas");
        nãoAtrasadasRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nãoAtrasadasRadioButtonActionPerformed(evt);
            }
        });

        prioridadeBaixaRadioButton.setText("Baixa");
        prioridadeBaixaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadeBaixaRadioButtonActionPerformed(evt);
            }
        });

        concluídaRadioButton.setText("Concluídas");
        concluídaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluídaRadioButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Prioridade           Estado ");

        procurarOwnerTarefaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                procurarOwnerTarefaTextFieldKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N

        procurarAssociadoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                procurarAssociadoTextFieldKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Username Owner");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Nome Tarefa");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Username Associado");

        ordemDataButton.setText("Ordem Data");
        ordemDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemDataButtonActionPerformed(evt);
            }
        });

        ordemAlfabeticaButton.setText("Ordem Alfabética");
        ordemAlfabeticaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemAlfabeticaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataInícioValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataLimiteValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataConclusãoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ordemAlfabeticaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(203, 203, 203))
                                    .addComponent(ordemDataButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(novaTarefaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(novaListaTarefasButton)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listasTarefasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(listasTarefasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(editarProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nãoAtrasadasProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(nãoAtrasadasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nãoAtrasadasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(atrasadasLabel)
                                    .addComponent(atrasadasProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(atrasadasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(concluídasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(concluídasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(concluídasProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tarefasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(procurarTítuloTarefaTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(procurarOwnerTarefaTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(procurarAssociadoTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dataLimiteDeDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataLimiteAtéDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(dataLimiteLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deAtéLimiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(concluídaRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nãoAtrasadasRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(atrasadaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(prioridadeMédiaRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(prioridadeAltaRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(prioridadeBaixaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(novaListaTarefasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(novaTarefaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listasTarefasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listasTarefasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(procurarTítuloTarefaTextField)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(procurarOwnerTarefaTextField)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(procurarAssociadoTextField)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addComponent(dataLimiteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deAtéLimiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataLimiteDeDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataLimiteAtéDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nãoAtrasadasRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atrasadaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prioridadeAltaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prioridadeMédiaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(prioridadeBaixaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(concluídaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarefasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(nãoAtrasadasProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nãoAtrasadasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(atrasadasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(concluídasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nãoAtrasadasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(atrasadasProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(concluídasProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(concluídasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(atrasadasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ordemAlfabeticaButton)
                                    .addComponent(ordemDataButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataInícioValue, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataLimiteValue, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataConclusãoValue, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        refreshUI();//atualiza as janelas
    }//GEN-LAST:event_formMouseClicked

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose();//faz dispose da janela
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void procurarTítuloTarefaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procurarTítuloTarefaTextFieldKeyReleased
        refreshPanels();//atualiza os paineis
    }//GEN-LAST:event_procurarTítuloTarefaTextFieldKeyReleased

    private void dataLimiteAtéDateChooserOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dataLimiteAtéDateChooserOnSelectionChange
        refreshPanels();//atualiza os paineis
    }//GEN-LAST:event_dataLimiteAtéDateChooserOnSelectionChange

    private void novaListaTarefasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaListaTarefasButtonActionPerformed
        new NovaListaTarefas(sistemaProjetoFrontEnd, projetoProjetoFrontEnd).setVisible(true);//nova janela novalistatarefas
    }//GEN-LAST:event_novaListaTarefasButtonActionPerformed

    private void editarProjetoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProjetoButtonActionPerformed
        new EditarProjeto(sistemaProjetoFrontEnd, projetoProjetoFrontEnd).setVisible(true);// nova janela editar projeto
    }//GEN-LAST:event_editarProjetoButtonActionPerformed

    private void novaTarefaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaButtonActionPerformed
        new NovaTarefa(sistemaProjetoFrontEnd, projetoProjetoFrontEnd).setVisible(true);// nova janela nova tarefa
    }//GEN-LAST:event_novaTarefaButtonActionPerformed

    private void jTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseEntered
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_jTabbedPane1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (listasTarefasComboBox.getSelectedIndex() > -1) {//se houver uma lista de tarefas selecionada, abre uma nova janela da lista de tarefas
            new ListaTarefasFrontEnd(sistemaProjetoFrontEnd, projetoProjetoFrontEnd, (ListaTarefas) listasTarefasComboBox.getSelectedItem()).setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dataLimiteDeDateChooserOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dataLimiteDeDateChooserOnSelectionChange
        refreshPanels();//atualiza os paineis
    }//GEN-LAST:event_dataLimiteDeDateChooserOnSelectionChange

    private void prioridadeAltaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadeAltaRadioButtonActionPerformed
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_prioridadeAltaRadioButtonActionPerformed

    private void prioridadeMédiaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadeMédiaRadioButtonActionPerformed
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_prioridadeMédiaRadioButtonActionPerformed

    private void atrasadaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasadaRadioButtonActionPerformed
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_atrasadaRadioButtonActionPerformed

    private void nãoAtrasadasRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nãoAtrasadasRadioButtonActionPerformed
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_nãoAtrasadasRadioButtonActionPerformed

    private void prioridadeBaixaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadeBaixaRadioButtonActionPerformed
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_prioridadeBaixaRadioButtonActionPerformed

    private void concluídaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluídaRadioButtonActionPerformed
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_concluídaRadioButtonActionPerformed

    private void procurarOwnerTarefaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procurarOwnerTarefaTextFieldKeyReleased
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_procurarOwnerTarefaTextFieldKeyReleased

    private void procurarAssociadoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procurarAssociadoTextFieldKeyReleased
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_procurarAssociadoTextFieldKeyReleased

    private void ordemDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemDataButtonActionPerformed
        if (projetoProjetoFrontEnd.getNumeroTarefas() > 0) {
            if (OrdemData_Asc) {
                ordemDataButton.setText("Ordem Data Asc");
                OrdemData_Asc = false;
            } else {
                ordemDataButton.setText("Ordem Data Des");
                OrdemData_Asc = true;
            }

            SetOrder_Data(OrdemData_Asc);
        }

    }//GEN-LAST:event_ordemDataButtonActionPerformed

    private void ordemAlfabeticaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemAlfabeticaButtonActionPerformed

        if (projetoProjetoFrontEnd.getNumeroTarefas() > 0) {
            if (OrdemAlf_Asc) {
                OrdemAlf_Asc = false;
                ordemAlfabeticaButton.setText("Ordem Alfabética Asc");
            } else {
                OrdemAlf_Asc = true;
                ordemAlfabeticaButton.setText("Ordem Alfabética Des");
            }

            SetOrder_Alf(OrdemAlf_Asc);
        }

    }//GEN-LAST:event_ordemAlfabeticaButtonActionPerformed

    public void refreshUI() {
        refreshPanels();
        setListasTarefasComboModel();

        if (projetoProjetoFrontEnd.getNumeroTarefas() == 0) {
            ordemDataButton.setText("Ordem Data");
            ordemAlfabeticaButton.setText("Ordem Alfabética");
        }
    }

    public void refreshPanels() { //Método que adiciona todas as tarefas do projeto, aplicados todos os filtros(barras de pesquisa e botões)
        tarefas.removeAll();
        boolean dataLimiteBooleano = true;
        dataInícioValue.setText("Data Início: " + projetoProjetoFrontEnd.getDataInícioProjeto().toLocalDate().toString() + " " +  projetoProjetoFrontEnd.getDataInícioProjeto().getHour() + " : " +projetoProjetoFrontEnd.getDataInícioProjeto().getMinute());
        dataLimiteValue.setText("Data Limite: " + projetoProjetoFrontEnd.getDataLimiteProjeto().toLocalDate().toString() + " " +  projetoProjetoFrontEnd.getDataLimiteProjeto().getHour() + " : " +projetoProjetoFrontEnd.getDataLimiteProjeto().getMinute());
        if(projetoProjetoFrontEnd.getIsConcluídoProjeto()){
            dataConclusãoValue.setText("Data Conclusão: " + projetoProjetoFrontEnd.getDataConclusãoProjeto().toLocalDate().toString() + " " +  projetoProjetoFrontEnd.getDataConclusãoProjeto().getHour() + " : " +projetoProjetoFrontEnd.getDataConclusãoProjeto().getMinute());
            if(projetoProjetoFrontEnd.getDataConclusãoProjeto().isBefore(projetoProjetoFrontEnd.getDataLimiteProjeto())){
                dataConclusãoValue.setForeground(new Color(34, 139, 34));
                dataLimiteValue.setForeground(new Color(60,63,65));
            }
            else{
                 dataConclusãoValue.setForeground(Color.red);
                 dataLimiteValue.setForeground(new Color(60,63,65));
            }
        }else{
            dataConclusãoValue.setText("Data Conclusão: ");
            if(LocalDateTime.now().isBefore(projetoProjetoFrontEnd.getDataLimiteProjeto())){
                dataLimiteValue.setForeground(new Color(34, 139, 34));
                dataConclusãoValue.setForeground(new Color(60,63,65));
            }
            else{
                 dataLimiteValue.setForeground(Color.red);
                 dataConclusãoValue.setForeground(new Color(60,63,65));
            }
        }

        for (ListaTarefas listaTarefas : projetoProjetoFrontEnd.getListasTarefas()) {
            for (Tarefa tarefa : listaTarefas.getListaTarefas()) {
                if (dataLimiteDeDateChooser.getSelectedDate() != null && dataLimiteDeDateChooser.getSelectedDate() != null) {
                    dataLimiteBooleano = !(LocalDate.of(dataLimiteDeDateChooser.getSelectedDate().get(Calendar.YEAR), dataLimiteDeDateChooser.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteDeDateChooser.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isAfter(tarefa.getDataLimiteTarefa().toLocalDate())) && !(LocalDate.of(dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.YEAR), dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isBefore(tarefa.getDataLimiteTarefa().toLocalDate()));
                }
                if (dataLimiteBooleano && procurarString(procurarTítuloTarefaTextField.getText(), tarefa.getTítuloTarefa()) && procurarString(procurarOwnerTarefaTextField.getText(), tarefa.getOwnerTarefa().getUsernameUser()) && procurarString(procurarAssociadoTextField.getText(), tarefa.getAssociatedUserTarefa().getUsernameUser()) && ((prioridadeBaixaRadioButton.isSelected() && tarefa.getPrioridadeTarefa().equals("Baixa") || (prioridadeMédiaRadioButton.isSelected() && tarefa.getPrioridadeTarefa().equals("Média")) || (prioridadeAltaRadioButton.isSelected() && tarefa.getPrioridadeTarefa().equals("Alta")))) && ((tarefa.isConcluídaTarefa() && concluídaRadioButton.isSelected()) || (tarefa.isAtrasada() && atrasadaRadioButton.isSelected()) || (!tarefa.isConcluídaTarefa() && nãoAtrasadasRadioButton.isSelected() && tarefa.isAtrasada() && atrasadaRadioButton.isSelected()) || (nãoAtrasadasRadioButton.isSelected() && !tarefa.isConcluídaTarefa() && !tarefa.isAtrasada()))) {
                    tarefas.add(new TarefaDisplay(sistemaProjetoFrontEnd, projetoProjetoFrontEnd, tarefa));
                    tarefas.add(new JToolBar.Separator(new Dimension(625, 2)));
                }
            }

        }
        int numeroTarefasProjeto = projetoProjetoFrontEnd.getNumeroTarefas();
        tarefasLabel.setText("Tarefas ( " + numeroTarefasProjeto + " )");

        nãoAtrasadasProgressBar.setMaximum(numeroTarefasProjeto);
        atrasadasProgressBar.setMaximum(numeroTarefasProjeto);
        concluídasProgressBar.setMaximum(numeroTarefasProjeto);

        nãoAtrasadasProgressBar.setValue(projetoProjetoFrontEnd.getNumeroTarefasEmCurso());
        nãoAtrasadasValue.setText(String.valueOf(projetoProjetoFrontEnd.getNumeroTarefasEmCurso()));

        atrasadasProgressBar.setValue(projetoProjetoFrontEnd.getNumeroTarefasAtrasadas());
        atrasadasValue.setText(String.valueOf(projetoProjetoFrontEnd.getNumeroTarefasAtrasadas()));

        concluídasProgressBar.setValue(projetoProjetoFrontEnd.getNumeroTarefasConcluidas());
        concluídasValue.setText(String.valueOf(projetoProjetoFrontEnd.getNumeroTarefasConcluidas()));

        tarefas.revalidate();
        nãoAtrasadasProgressBar.revalidate();
        atrasadasProgressBar.revalidate();
        concluídasProgressBar.revalidate();

        tarefas.repaint();
        nãoAtrasadasProgressBar.repaint();
        atrasadasProgressBar.repaint();
        concluídasProgressBar.repaint();

    }

    public void setSelectedDate() {//carraga as datas selecionadas para 3 meses antes e 3 meses depois
        LocalDateTime instante = LocalDateTime.now();
        Calendar calendarDe = Calendar.getInstance();
        Calendar calendarAté = Calendar.getInstance();
        calendarDe.set(instante.minusMonths(3).getYear(), instante.minusMonths(3).getMonthValue() - 1, instante.minusMonths(3).getDayOfMonth());
        calendarAté.set(instante.plusMonths(3).getYear(), instante.plusMonths(3).getMonthValue() - 1, instante.plusMonths(3).getDayOfMonth());
        dataLimiteDeDateChooser.setSelectedDate(calendarDe);
        dataLimiteAtéDateChooser.setSelectedDate(calendarAté);
    }

    public boolean procurarString(String stringProcura, String stringProcurada) {//Método de procura, que comprara strings
        int index = 0;
        boolean returnValue = true;
        if (stringProcura.length() > stringProcurada.length()) {
            return false;
        } else {
            index = stringProcura.length();
        }
        char[] arrayProcura = stringProcura.toLowerCase(Locale.ITALY).toCharArray();
        char[] arrayProcurado = stringProcurada.toLowerCase(Locale.ITALY).toCharArray();
        for (int i = 0; i < index; i++) {
            if (!(arrayProcura[i] == arrayProcurado[i])) {
                returnValue = false;
            }
        }
        return returnValue;
    }

    public void setListasTarefasComboModel() {//Carrega as listas de tarefas do projeto para a combo box
        listasTarefasComboBox.removeAllItems();
        listaTarefasComboModelProjetoFrontEnd.addAll(projetoProjetoFrontEnd.getListasTarefas());
        listasTarefasComboBox.setModel(listaTarefasComboModelProjetoFrontEnd);
    }

    public void setRadioButtonsSelected(boolean booleano) {//Seleciona todos os butões de filtos  selecionados
        prioridadeAltaRadioButton.setSelected(booleano);
        prioridadeMédiaRadioButton.setSelected(booleano);
        prioridadeBaixaRadioButton.setSelected(booleano);
        nãoAtrasadasRadioButton.setSelected(booleano);
        atrasadaRadioButton.setSelected(booleano);
        concluídaRadioButton.setSelected(booleano);
    }

    private void SetOrder_Data(boolean OrdemData_Asc) {

        tarefas.removeAll();
        boolean dataLimiteBooleano = true;
        novaListaTarefas = new ArrayList<>();

        for (ListaTarefas listaTarefas : projetoProjetoFrontEnd.getListasTarefas()) {
            for (Tarefa tarefa : listaTarefas.getListaTarefas()) {
                novaListaTarefas.add(tarefa);
            }
        }

        int index = 0;
        ArrayList<Tarefa> listaTarefas_Temp = new ArrayList<>();

        if (OrdemData_Asc) {
            while (!novaListaTarefas.isEmpty()) {
                for (int i = 0; i < novaListaTarefas.size() - 1; i++) {
                    if (novaListaTarefas.get(index).getDataLimiteTarefa().isAfter(novaListaTarefas.get(i + 1).getDataLimiteTarefa()) || novaListaTarefas.get(index).getDataLimiteTarefa().isEqual(novaListaTarefas.get(i + 1).getDataLimiteTarefa())) {
                        index = i + 1;
                    }
                }

                listaTarefas_Temp.add(novaListaTarefas.get(index));
                novaListaTarefas.remove(index);
                index = 0;
            }

        } else {
            while (!novaListaTarefas.isEmpty()) {
                for (int i = 0; i < novaListaTarefas.size() - 1; i++) {
                    if (novaListaTarefas.get(index).getDataLimiteTarefa().isBefore(novaListaTarefas.get(i + 1).getDataLimiteTarefa()) || novaListaTarefas.get(index).getDataLimiteTarefa().isEqual(novaListaTarefas.get(i + 1).getDataLimiteTarefa())) {
                        index = i + 1;
                    }
                }

                listaTarefas_Temp.add(novaListaTarefas.get(index));
                novaListaTarefas.remove(index);
                index = 0;
            }

        }

        novaListaTarefas = listaTarefas_Temp;

        for (int i = 0; i < novaListaTarefas.size(); i++) {
            if (dataLimiteDeDateChooser.getSelectedDate() != null && dataLimiteDeDateChooser.getSelectedDate() != null) {
                dataLimiteBooleano = !(LocalDate.of(dataLimiteDeDateChooser.getSelectedDate().get(Calendar.YEAR), dataLimiteDeDateChooser.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteDeDateChooser.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isAfter(novaListaTarefas.get(i).getDataLimiteTarefa().toLocalDate())) && !(LocalDate.of(dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.YEAR), dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isBefore(novaListaTarefas.get(i).getDataLimiteTarefa().toLocalDate()));
            }
            if (dataLimiteBooleano && procurarString(procurarTítuloTarefaTextField.getText(), novaListaTarefas.get(i).getTítuloTarefa()) && procurarString(procurarOwnerTarefaTextField.getText(), novaListaTarefas.get(i).getOwnerTarefa().getUsernameUser()) && procurarString(procurarAssociadoTextField.getText(), novaListaTarefas.get(i).getAssociatedUserTarefa().getUsernameUser()) && ((prioridadeBaixaRadioButton.isSelected() && novaListaTarefas.get(i).getPrioridadeTarefa().equals("Baixa") || (prioridadeMédiaRadioButton.isSelected() && novaListaTarefas.get(i).getPrioridadeTarefa().equals("Média")) || (prioridadeAltaRadioButton.isSelected() && novaListaTarefas.get(i).getPrioridadeTarefa().equals("Alta")))) && ((novaListaTarefas.get(i).isConcluídaTarefa() && concluídaRadioButton.isSelected()) || (novaListaTarefas.get(i).isAtrasada() && atrasadaRadioButton.isSelected()) || (!novaListaTarefas.get(i).isConcluídaTarefa() && nãoAtrasadasRadioButton.isSelected() && novaListaTarefas.get(i).isAtrasada() && atrasadaRadioButton.isSelected()) || (nãoAtrasadasRadioButton.isSelected() && !novaListaTarefas.get(i).isConcluídaTarefa() && !novaListaTarefas.get(i).isAtrasada()))) {
                tarefas.add(new TarefaDisplay(sistemaProjetoFrontEnd, projetoProjetoFrontEnd, novaListaTarefas.get(i)));
                tarefas.add(new JToolBar.Separator(new Dimension(625, 2)));
            }

        }

        tarefas.revalidate();
        tarefas.repaint();

    }

    private void SetOrder_Alf(boolean OrdemAlf_Asc) {

        tarefas.removeAll();
        boolean dataLimiteBooleano = true;
        novaListaTarefas = new ArrayList<>();

        for (ListaTarefas listaTarefas : projetoProjetoFrontEnd.getListasTarefas()) {
            for (Tarefa tarefa : listaTarefas.getListaTarefas()) {
                novaListaTarefas.add(tarefa);
            }
        }

        int index = 0;
        ArrayList<Tarefa> listaTarefas_Temp = new ArrayList<>();

        if (OrdemAlf_Asc) {

            while (!novaListaTarefas.isEmpty()) {
                for (int i = 0; i < novaListaTarefas.size() - 1; i++) {
                    if (novaListaTarefas.get(index).getTítuloTarefa().compareTo(novaListaTarefas.get(i + 1).getTítuloTarefa()) >= 0) {
                        index = i + 1;
                    }
                }

                listaTarefas_Temp.add(novaListaTarefas.get(index));
                novaListaTarefas.remove(index);
                index = 0;
            }

        } else {
            while (!novaListaTarefas.isEmpty()) {
                for (int i = 0; i < novaListaTarefas.size() - 1; i++) {
                    if (novaListaTarefas.get(index).getTítuloTarefa().compareTo(novaListaTarefas.get(i + 1).getTítuloTarefa()) <= 0) {
                        index = i + 1;
                    }
                }

                listaTarefas_Temp.add(novaListaTarefas.get(index));
                novaListaTarefas.remove(index);
                index = 0;
            }

        }

        novaListaTarefas = listaTarefas_Temp;

        for (int i = 0; i < novaListaTarefas.size(); i++) {
            if (dataLimiteDeDateChooser.getSelectedDate() != null && dataLimiteDeDateChooser.getSelectedDate() != null) {
                dataLimiteBooleano = !(LocalDate.of(dataLimiteDeDateChooser.getSelectedDate().get(Calendar.YEAR), dataLimiteDeDateChooser.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteDeDateChooser.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isAfter(novaListaTarefas.get(i).getDataLimiteTarefa().toLocalDate())) && !(LocalDate.of(dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.YEAR), dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteAtéDateChooser.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isBefore(novaListaTarefas.get(i).getDataLimiteTarefa().toLocalDate()));
            }
            if (dataLimiteBooleano && procurarString(procurarTítuloTarefaTextField.getText(), novaListaTarefas.get(i).getTítuloTarefa()) && procurarString(procurarOwnerTarefaTextField.getText(), novaListaTarefas.get(i).getOwnerTarefa().getUsernameUser()) && procurarString(procurarAssociadoTextField.getText(), novaListaTarefas.get(i).getAssociatedUserTarefa().getUsernameUser()) && ((prioridadeBaixaRadioButton.isSelected() && novaListaTarefas.get(i).getPrioridadeTarefa().equals("Baixa") || (prioridadeMédiaRadioButton.isSelected() && novaListaTarefas.get(i).getPrioridadeTarefa().equals("Média")) || (prioridadeAltaRadioButton.isSelected() && novaListaTarefas.get(i).getPrioridadeTarefa().equals("Alta")))) && ((novaListaTarefas.get(i).isConcluídaTarefa() && concluídaRadioButton.isSelected()) || (novaListaTarefas.get(i).isAtrasada() && atrasadaRadioButton.isSelected()) || (!novaListaTarefas.get(i).isConcluídaTarefa() && nãoAtrasadasRadioButton.isSelected() && novaListaTarefas.get(i).isAtrasada() && atrasadaRadioButton.isSelected()) || (nãoAtrasadasRadioButton.isSelected() && !novaListaTarefas.get(i).isConcluídaTarefa() && !novaListaTarefas.get(i).isAtrasada()))) {
                tarefas.add(new TarefaDisplay(sistemaProjetoFrontEnd, projetoProjetoFrontEnd, novaListaTarefas.get(i)));
                tarefas.add(new JToolBar.Separator(new Dimension(625, 2)));
            }

        }

        tarefas.revalidate();
        tarefas.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton atrasadaRadioButton;
    private javax.swing.JLabel atrasadasLabel;
    private javax.swing.JProgressBar atrasadasProgressBar;
    private javax.swing.JLabel atrasadasValue;
    private javax.swing.JRadioButton concluídaRadioButton;
    private javax.swing.JLabel concluídasLabel;
    private javax.swing.JProgressBar concluídasProgressBar;
    private javax.swing.JLabel concluídasValue;
    private javax.swing.JLabel dataConclusãoValue;
    private javax.swing.JLabel dataInícioValue;
    private datechooser.beans.DateChooserCombo dataLimiteAtéDateChooser;
    private datechooser.beans.DateChooserCombo dataLimiteDeDateChooser;
    private javax.swing.JLabel dataLimiteLabel;
    private javax.swing.JLabel dataLimiteValue;
    private javax.swing.JLabel deAtéLimiteLabel;
    private javax.swing.JButton editarProjetoButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> listasTarefasComboBox;
    private javax.swing.JLabel listasTarefasLabel;
    private javax.swing.JButton novaListaTarefasButton;
    private javax.swing.JButton novaTarefaButton;
    private javax.swing.JLabel nãoAtrasadasLabel;
    private javax.swing.JProgressBar nãoAtrasadasProgressBar;
    private javax.swing.JRadioButton nãoAtrasadasRadioButton;
    private javax.swing.JLabel nãoAtrasadasValue;
    private javax.swing.JButton ordemAlfabeticaButton;
    private javax.swing.JButton ordemDataButton;
    private javax.swing.JRadioButton prioridadeAltaRadioButton;
    private javax.swing.JRadioButton prioridadeBaixaRadioButton;
    private javax.swing.JRadioButton prioridadeMédiaRadioButton;
    private javax.swing.JTextField procurarAssociadoTextField;
    private javax.swing.JTextField procurarOwnerTarefaTextField;
    private javax.swing.JTextField procurarTítuloTarefaTextField;
    private javax.swing.JPanel tarefas;
    private javax.swing.JLabel tarefasLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
