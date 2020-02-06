package FrontEnd;

import javax.swing.JProgressBar;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public JProgressBar getBarraProgresso() {
        return barraProgressoSplashScreen;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();
        barraProgressoSplashScreen = new javax.swing.JProgressBar();
        gestorLabelSplashScreen = new javax.swing.JLabel();
        deProjetosSplashScreen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(325, 175));
        setMinimumSize(new java.awt.Dimension(325, 175));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(325, 175));
        setResizable(false);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/247205-200.png"))); // NOI18N

        barraProgressoSplashScreen.setForeground(new java.awt.Color(0, 0, 0));
        barraProgressoSplashScreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gestorLabelSplashScreen.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        gestorLabelSplashScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestorLabelSplashScreen.setText("Gestor");

        deProjetosSplashScreen.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        deProjetosSplashScreen.setText("de Projetos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(barraProgressoSplashScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deProjetosSplashScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gestorLabelSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gestorLabelSplashScreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deProjetosSplashScreen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgressoSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgressoSplashScreen;
    private javax.swing.JLabel deProjetosSplashScreen;
    private javax.swing.JLabel gestorLabelSplashScreen;
    private javax.swing.JLabel iconLabel;
    // End of variables declaration//GEN-END:variables
}
