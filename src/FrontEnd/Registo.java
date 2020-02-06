/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.TransferHandler;
import BackEnd.Sistema;
import BackEnd.User;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Registo extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Sistema sistemaRegisto;

    public Registo(Sistema sistema) {
        sistemaRegisto = sistema;
        initComponents();
        sexoButtons.add(masculinoRadioButton);
        sexoButtons.add(FemininoRadioButton);
        setLabelsVisible(false);
        setTitle(Sistema.NOMEPROGRAMA + " - Registo"); //Título da janela
        setIconImage(sistema.getIconFrame()); //Ícon da janela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Fechar a janela faz dispose da janela
        setLocationRelativeTo(null); //Centra a janelo no ecrã
        setTransferHandlers(null); //Impede copy paste para as caixas de text
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Login(sistemaRegisto).setVisible(true);
                dispose();
            }
        });

    }

    public char getSexoRegisto(JRadioButton masculino, JRadioButton feminimo) {//Método que retorna o sexo selecionada
        char sexo = '-';
        if (masculino.isSelected()) {
            sexo = 'm';
        }
        if (feminimo.isSelected()) {
            sexo = 'f';
        }
        return sexo;
    }

    public void setTransferHandlers(TransferHandler transferHandler) { //Método que impede as barras de texto de poderam receber cópias da clipboard
        nomeTextField.setTransferHandler(transferHandler);
        usernameTextField.setTransferHandler(transferHandler);
        telemóvelTextField.setTransferHandler(transferHandler);
        emailTextField.setTransferHandler(transferHandler);
        password1TextField.setTransferHandler(transferHandler);
        password2TextField.setTransferHandler(transferHandler);
    }

    public void setLabelsVisible(boolean booleano) {//Torna os labels de erro não visíveis
        nomeEmptyLabel.setVisible(booleano);
        sexoEmptyLabel.setVisible(booleano);
        emailErrorLabel.setVisible(booleano);
        telemóvelErrorLabel.setVisible(booleano);
        usernameErrorLabel.setVisible(booleano);
        usernameEmptyLabel.setVisible(booleano);
        password1EmptyLabel.setVisible(booleano);
        password2EmptyLabel.setVisible(booleano);
        passwordErrorLabel.setVisible(booleano);
    }

    public boolean isValidName(String name) {//Método que verifica um string como sendo um Nome
        return name.matches("[a-zA-ZãÃõÕêÊáÁíÍóÓ ]+");
    }

    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";//Método que verifica um string como sendo um email
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    private boolean isValidPhoneNumber(String pPhoneNumber) { //Método que verifica um string como sendo um número de telemóvel

        Pattern pattern = Pattern
                .compile("((\\+[1-9]{3,4}|0[1-9]{4}|00[1-9]{3})\\-?)?\\d{8,20}");
        Matcher matcher = pattern.matcher(pPhoneNumber);

        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoButtons = new javax.swing.ButtonGroup();
        registoLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomeEmptyLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        sexoLabel = new javax.swing.JLabel();
        sexoEmptyLabel = new javax.swing.JLabel();
        masculinoRadioButton = new javax.swing.JRadioButton();
        FemininoRadioButton = new javax.swing.JRadioButton();
        dataNascimentoLabel = new javax.swing.JLabel();
        dataNascimentoCombo = new datechooser.beans.DateChooserCombo();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailErrorLabel = new javax.swing.JLabel();
        telemóvelLabel = new javax.swing.JLabel();
        telemóvelTextField = new javax.swing.JTextField();
        telemóvelErrorLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        usernameEmptyLabel = new javax.swing.JLabel();
        usernameErrorLabel = new javax.swing.JLabel();
        password1Label = new javax.swing.JLabel();
        password1TextField = new javax.swing.JPasswordField();
        password1EmptyLabel = new javax.swing.JLabel();
        password2Label = new javax.swing.JLabel();
        password2TextField = new javax.swing.JPasswordField();
        password2EmptyLabel = new javax.swing.JLabel();
        passwordCheckbox = new javax.swing.JCheckBox();
        passwordErrorLabel = new javax.swing.JLabel();
        registarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestor de Projetos - Registo");
        setMinimumSize(new java.awt.Dimension(470, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(470, 600));

        registoLabel.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        registoLabel.setText("Registo");

        nomeLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nomeLabel.setText("Nome");

        nomeEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nomeEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        nomeEmptyLabel.setText("*");

        nomeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeTextFieldFocusLost(evt);
            }
        });
        nomeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeTextFieldKeyReleased(evt);
            }
        });

        sexoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        sexoLabel.setText("Sexo");

        sexoEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        sexoEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        sexoEmptyLabel.setText("*");

        sexoButtons.add(masculinoRadioButton);
        masculinoRadioButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        masculinoRadioButton.setText("M");
        masculinoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoRadioButtonActionPerformed(evt);
            }
        });

        sexoButtons.add(FemininoRadioButton);
        FemininoRadioButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        FemininoRadioButton.setText("F");
        FemininoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemininoRadioButtonActionPerformed(evt);
            }
        });

        dataNascimentoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dataNascimentoLabel.setText("D. Nascimento");

        dataNascimentoCombo.setFormat(1);
        dataNascimentoCombo.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        try {
            dataNascimentoCombo.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2000, 0, 1),
                new java.util.GregorianCalendar(2000, 0, 1))));
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dataNascimentoCombo.setFieldFont(new java.awt.Font("Lucida Console", java.awt.Font.BOLD, 14));
    dataNascimentoCombo.setLocale(new java.util.Locale("pt", "PT", ""));
    dataNascimentoCombo.setNavigateFont(new java.awt.Font("Lucida Console", java.awt.Font.PLAIN, 11));

    emailLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    emailLabel.setText("Email");

    emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            emailTextFieldFocusLost(evt);
        }
    });
    emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            emailTextFieldKeyReleased(evt);
        }
    });

    emailErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
    emailErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
    emailErrorLabel.setText("Email inválido");

    telemóvelLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    telemóvelLabel.setText("Telémovel");

    telemóvelTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            telemóvelTextFieldFocusLost(evt);
        }
    });
    telemóvelTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            telemóvelTextFieldKeyReleased(evt);
        }
    });

    telemóvelErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
    telemóvelErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
    telemóvelErrorLabel.setText("Número inválido");

    usernameLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    usernameLabel.setText("Username");
    usernameLabel.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            usernameLabelKeyReleased(evt);
        }
    });

    usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            usernameTextFieldKeyReleased(evt);
        }
    });

    usernameEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    usernameEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
    usernameEmptyLabel.setText("*");

    usernameErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
    usernameErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
    usernameErrorLabel.setText("Username já existente");

    password1Label.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    password1Label.setText("Password");

    password1TextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            password1TextFieldKeyReleased(evt);
        }
    });

    password1EmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    password1EmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
    password1EmptyLabel.setText("*");

    password2Label.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    password2Label.setText("Password*");

    password2TextField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            password2TextFieldActionPerformed(evt);
        }
    });
    password2TextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            password2TextFieldKeyReleased(evt);
        }
    });

    password2EmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    password2EmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
    password2EmptyLabel.setText("*");

    passwordCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    passwordCheckbox.setText("Mostrar");
    passwordCheckbox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            passwordCheckboxActionPerformed(evt);
        }
    });

    passwordErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
    passwordErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
    passwordErrorLabel.setText("Passwords não coincidem");

    registarButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    registarButton.setText("Registar");
    registarButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            registarButtonActionPerformed(evt);
        }
    });

    voltarButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    voltarButton.setText("Voltar");
    voltarButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            voltarButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(registoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(114, 114, 114))
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(passwordCheckbox)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordErrorLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dataNascimentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telemóvelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sexoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(telemóvelErrorLabel))
                                .addComponent(nomeTextField)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(masculinoRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FemininoRadioButton)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password2Label))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password1TextField)
                                .addComponent(emailTextField)
                                .addComponent(telemóvelTextField)
                                .addComponent(password2TextField)
                                .addComponent(usernameTextField)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(dataNascimentoCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(password1EmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(password2EmptyLabel)
                        .addComponent(sexoEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(31, 31, 31))
        .addGroup(layout.createSequentialGroup()
            .addGap(115, 115, 115)
            .addComponent(voltarButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(registarButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(registoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nomeEmptyLabel))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(sexoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(masculinoRadioButton)
                .addComponent(FemininoRadioButton)
                .addComponent(sexoEmptyLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(dataNascimentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(dataNascimentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(emailErrorLabel)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(telemóvelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(telemóvelErrorLabel)
                    .addGap(68, 68, 68))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(telemóvelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usernameEmptyLabel))
                            .addGap(0, 0, 0)
                            .addComponent(usernameErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(password1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(password1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(password1EmptyLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(password2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(password2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(password2EmptyLabel))
            .addGap(0, 0, 0)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(passwordErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(registarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(40, Short.MAX_VALUE))
    );

    usernameTextField.getAccessibleContext().setAccessibleDescription("");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarButtonActionPerformed
        String erro = "";

        if (nomeTextField.getText().length() > 50) {//se nome for maio de 50 caracteres, adicionar ao erro
            erro += ("Nome inválido(Demasiado grande[max 50]).\n");
        }

        if (!isValidName(nomeTextField.getText())) {//se nome não for válido, adicionar ao erro
            erro += ("Nome inválido(Caracteres inválidos).\n");
        }

        if (nomeTextField.getText().isEmpty() || usernameTextField.getText().isEmpty() || !masculinoRadioButton.isSelected() && !FemininoRadioButton.isSelected() || String.valueOf(password1TextField.getPassword()).equals("") | String.valueOf(password2TextField.getPassword()).equals("")) { //Se houver campos vazios, adicionar ao erro
            erro += ("Faltam Prencher campos.\n");

            if (nomeTextField.getText().isEmpty()) {
                nomeEmptyLabel.setVisible(true);
            }
            if (usernameTextField.getText().isEmpty()) {
                usernameEmptyLabel.setVisible(true);
            }
            if (!masculinoRadioButton.isSelected() && !FemininoRadioButton.isSelected()) {
                sexoEmptyLabel.setVisible(true);
            }
            if (String.valueOf(password1TextField.getPassword()).isEmpty()) {
                password1EmptyLabel.setVisible(true);
            }
            if (String.valueOf(password2TextField.getPassword()).isEmpty()) {
                password2EmptyLabel.setVisible(true);
            }
        }

        if (!emailTextField.getText().isEmpty() && !isValidEmailAddress(emailTextField.getText())) {//Se email não for válido adicionar ao erro
            erro += "Email inválido.\n";
            emailErrorLabel.setVisible(true);
        }

        if (dataNascimentoCombo.getSelectedDate() != null) {
            if (LocalDate.of(dataNascimentoCombo.getSelectedDate().get(Calendar.YEAR), dataNascimentoCombo.getSelectedDate().get(Calendar.MONTH) + 1, dataNascimentoCombo.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isAfter(LocalDate.now())) {//Se data de nascimento não for válida
                erro += "Data de Nascimento inválida (Data após hoje)\n";
            }
        } else {
            erro += "Data de Nascimento inválida.\n";
        }

        if (!telemóvelTextField.getText().isEmpty() && !isValidPhoneNumber(telemóvelTextField.getText())) {//Se número de telemóvel não for válido, adicionar ao erro
            erro += "Telemóvel inválido.\n";
            telemóvelErrorLabel.setVisible(true);
        }
        if (sistemaRegisto.getCurrentSave().getListaUsersSave().isUserNameListaUsers(usernameTextField.getText())) { //Se username já exister
            erro += "Username já Existente.\n";
            usernameErrorLabel.setVisible(true);
        }

        if (!String.valueOf(password1TextField.getPassword()).equals(String.valueOf(password2TextField.getPassword()))) {//Se palava-passes não coincidirem, adicionar ao erro
            erro += "Palavras-passe não coincidem.\n";
        }
        if (usernameTextField.getText().length() > 20) {//Se username for maior de 20 caracters, adicionar ao erro
            erro += "Username inválido(Demasiado grande[max 20]).\n";
        }

        if (erro.isEmpty()) {//Se não houver erros
            sistemaRegisto.getCurrentSave().getListaUsersSave().addUserListaUsers(new User(usernameTextField.getText(), String.valueOf(password1TextField.getPassword()), nomeTextField.getText(), this.getSexoRegisto(masculinoRadioButton, FemininoRadioButton))); //Cria um utilizador com os dados
            this.sistemaRegisto.getCurrentSave().getListaUsersSave().getUserListaUsers(usernameTextField.getText()).setDataNascimentoUser(LocalDate.of(dataNascimentoCombo.getSelectedDate().get(Calendar.YEAR), dataNascimentoCombo.getSelectedDate().get(Calendar.MONTH) + 1, dataNascimentoCombo.getSelectedDate().get(Calendar.DAY_OF_MONTH)));
            this.sistemaRegisto.getCurrentSave().getListaUsersSave().getUserListaUsers(usernameTextField.getText()).setEmailUser(emailTextField.getText());
            this.sistemaRegisto.getCurrentSave().getListaUsersSave().getUserListaUsers(usernameTextField.getText()).setTelemóvelUser(telemóvelTextField.getText());
            sistemaRegisto.setSaved(false); //sistema não gravado
            JOptionPane.showMessageDialog(this, "Novo utilizador com o username " + usernameTextField.getText() + "  registado com sucesso.", "Novo utilizador", JOptionPane.INFORMATION_MESSAGE);//Mensagem de aviso
            new Login(sistemaRegisto).setVisible(true);//volta para a janela de login
            this.dispose(); //dispose da janela

        } else {
            JOptionPane.showMessageDialog(this, erro, "Erro de Registo", JOptionPane.ERROR_MESSAGE);//Mensagem de erro
        }

    }//GEN-LAST:event_registarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        new Login(sistemaRegisto).setVisible(true);//volta para a janela de login
        dispose();//dispose da janela
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void FemininoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemininoRadioButtonActionPerformed
        sexoEmptyLabel.setVisible(false);
    }//GEN-LAST:event_FemininoRadioButtonActionPerformed

    private void masculinoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoRadioButtonActionPerformed
        sexoEmptyLabel.setVisible(false);
    }//GEN-LAST:event_masculinoRadioButtonActionPerformed

    private void passwordCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCheckboxActionPerformed
        if (passwordCheckbox.isSelected()) {//mostra os caracteres 
            password1TextField.setEchoChar((char) 0);
            password2TextField.setEchoChar((char) 0);
        } else {//esconde os caracteres
            password1TextField.setEchoChar('•');
            password2TextField.setEchoChar('•');
        }
    }//GEN-LAST:event_passwordCheckboxActionPerformed

    private void nomeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextFieldKeyReleased
        nomeEmptyLabel.setVisible(false);
        nomeTextField.setText(nomeTextField.getText().replaceAll(" +", " "));
        if (nomeTextField.getText().length() > 50) {
            nomeTextField.setText(nomeTextField.getText().substring(0, 49));
        }
        if (nomeTextField.getText().isEmpty()) {
            nomeEmptyLabel.setVisible(true);
        }
    }//GEN-LAST:event_nomeTextFieldKeyReleased

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        emailTextField.setText(emailTextField.getText().trim());
        emailErrorLabel.setVisible(true);
        if (emailTextField.getText().isEmpty()) {
            emailErrorLabel.setVisible(false);
        }
        if (isValidEmailAddress(emailTextField.getText())) {
            emailErrorLabel.setVisible(false);
        }
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void usernameLabelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameLabelKeyReleased

    }//GEN-LAST:event_usernameLabelKeyReleased

    private void password1TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password1TextFieldKeyReleased
        passwordErrorLabel.setVisible(false);
        password1EmptyLabel.setVisible(false);
        if (String.valueOf(password1TextField.getPassword()).isEmpty()) {
            password1EmptyLabel.setVisible(true);
        } else if (!String.valueOf(password1TextField.getPassword()).equals(String.valueOf(password2TextField.getPassword()))) {
            passwordErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_password1TextFieldKeyReleased

    private void usernameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyReleased
        usernameTextField.setText(usernameTextField.getText().trim());
        usernameErrorLabel.setVisible(false);
        usernameEmptyLabel.setVisible(false);
        if (usernameTextField.getText().length() > 20) {
            usernameTextField.setText(usernameTextField.getText().substring(0, 19));
        }
        if (usernameTextField.getText().isEmpty()) {
            usernameEmptyLabel.setVisible(true);
        }
        if (sistemaRegisto.getCurrentSave().getListaUsersSave().isUserNameListaUsers(usernameTextField.getText())) {
            usernameErrorLabel.setVisible(true);
        }

    }//GEN-LAST:event_usernameTextFieldKeyReleased

    private void password2TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password2TextFieldKeyReleased
        password2EmptyLabel.setVisible(false);
        passwordErrorLabel.setVisible(false);
        if (String.valueOf(password2TextField.getPassword()).isEmpty()) {
            password2EmptyLabel.setVisible(true);
        } else if (!String.valueOf(password2TextField.getPassword()).equals(String.valueOf(password1TextField.getPassword()))) {
            passwordErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_password2TextFieldKeyReleased

    private void telemóvelTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telemóvelTextFieldKeyReleased
        telemóvelTextField.setText(telemóvelTextField.getText().trim());
        if (telemóvelTextField.getText().isEmpty()) {
            telemóvelErrorLabel.setVisible(false);
        } else if (!isValidPhoneNumber(telemóvelTextField.getText())) {
            telemóvelErrorLabel.setVisible(true);
        } else {
            telemóvelErrorLabel.setVisible(false);
        }
    }//GEN-LAST:event_telemóvelTextFieldKeyReleased

    private void telemóvelTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telemóvelTextFieldFocusLost

    }//GEN-LAST:event_telemóvelTextFieldFocusLost

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost

    }//GEN-LAST:event_emailTextFieldFocusLost

    private void password2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2TextFieldActionPerformed

    private void nomeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTextFieldFocusLost
        nomeTextField.setText(nomeTextField.getText().trim());//Faz trim do nome
    }//GEN-LAST:event_nomeTextFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FemininoRadioButton;
    private datechooser.beans.DateChooserCombo dataNascimentoCombo;
    private javax.swing.JLabel dataNascimentoLabel;
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton masculinoRadioButton;
    private javax.swing.JLabel nomeEmptyLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel password1EmptyLabel;
    private javax.swing.JLabel password1Label;
    private javax.swing.JPasswordField password1TextField;
    private javax.swing.JLabel password2EmptyLabel;
    private javax.swing.JLabel password2Label;
    private javax.swing.JPasswordField password2TextField;
    private javax.swing.JCheckBox passwordCheckbox;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JButton registarButton;
    private javax.swing.JLabel registoLabel;
    private javax.swing.ButtonGroup sexoButtons;
    private javax.swing.JLabel sexoEmptyLabel;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JLabel telemóvelErrorLabel;
    private javax.swing.JLabel telemóvelLabel;
    private javax.swing.JTextField telemóvelTextField;
    private javax.swing.JLabel usernameEmptyLabel;
    private javax.swing.JLabel usernameErrorLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

}
