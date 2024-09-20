
package calculadora;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ventanainicial extends javax.swing.JFrame
{
    public ventanainicial() 
    {
        initComponents();
        display.setEditable(false);
        Color fondo = new Color(28,28,28);
        getContentPane().setBackground(fondo);
        display.setHorizontalAlignment(SwingConstants.CENTER);
    }

    double primerNumero;
    String operacionPendiente;
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borrar = new javax.swing.JButton();
        entre = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        por = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(28, 28, 28));

        borrar.setBackground(new java.awt.Color(212, 212, 210));
        borrar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        borrar.setText("AC");
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        entre.setBackground(new java.awt.Color(255, 149, 0));
        entre.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        entre.setForeground(new java.awt.Color(255, 255, 255));
        entre.setText("/");
        entre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(80, 80, 80));
        ocho.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setText("8");
        ocho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(80, 80, 80));
        siete.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setText("7");
        siete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(80, 80, 80));
        nueve.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        nueve.setForeground(new java.awt.Color(255, 255, 255));
        nueve.setText("9");
        nueve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        por.setBackground(new java.awt.Color(255, 149, 0));
        por.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        por.setForeground(new java.awt.Color(255, 255, 255));
        por.setText("x");
        por.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(80, 80, 80));
        cinco.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setText("5");
        cinco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(80, 80, 80));
        cuatro.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setText("4");
        cuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(80, 80, 80));
        seis.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setText("6");
        seis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(255, 149, 0));
        menos.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        menos.setForeground(new java.awt.Color(255, 255, 255));
        menos.setText("-");
        menos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(80, 80, 80));
        dos.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setText("2");
        dos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(80, 80, 80));
        uno.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setText("1");
        uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(80, 80, 80));
        tres.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setText("3");
        tres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        mas.setBackground(new java.awt.Color(255, 149, 0));
        mas.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        mas.setForeground(new java.awt.Color(255, 255, 255));
        mas.setText("+");
        mas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(80, 80, 80));
        cero.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        cero.setForeground(new java.awt.Color(255, 255, 255));
        cero.setText("0");
        cero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        punto.setBackground(new java.awt.Color(80, 80, 80));
        punto.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        punto.setForeground(new java.awt.Color(255, 255, 255));
        punto.setText(".");
        punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(255, 149, 0));
        igual.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        display.setBackground(new java.awt.Color(28, 28, 28));
        display.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setToolTipText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(entre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        display.setText(display.getText() + uno.getText());
    }//GEN-LAST:event_unoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        realizarOperacion();
    }//GEN-LAST:event_igualActionPerformed

    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
        primerNumero = Double.parseDouble(display.getText());
                operacionPendiente = "*";
                display.setText("");
    }//GEN-LAST:event_porActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        primerNumero = Double.parseDouble(display.getText());
                operacionPendiente = "+";
                display.setText("");
    }//GEN-LAST:event_masActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        display.setText(display.getText() + cuatro.getText());
    }//GEN-LAST:event_cuatroActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        display.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void entreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreActionPerformed
        primerNumero = Double.parseDouble(display.getText());
                operacionPendiente = "/";
                display.setText("");
    }//GEN-LAST:event_entreActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        primerNumero = Double.parseDouble(display.getText());
                operacionPendiente = "-";
                display.setText("");
    }//GEN-LAST:event_menosActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        display.setText(display.getText() + cero.getText());
    }//GEN-LAST:event_ceroActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        display.setText(display.getText() + siete.getText());
    }//GEN-LAST:event_sieteActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        display.setText(display.getText() + dos.getText());
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        display.setText(display.getText() + tres.getText());
    }//GEN-LAST:event_tresActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        display.setText(display.getText() + cinco.getText());
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        display.setText(display.getText() + seis.getText());
    }//GEN-LAST:event_seisActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        display.setText(display.getText() + ocho.getText());
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        display.setText(display.getText() + nueve.getText());
    }//GEN-LAST:event_nueveActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        display.setText(display.getText() + punto.getText());
    }//GEN-LAST:event_puntoActionPerformed
   
    private void realizarOperacion()
    {
        if(!display.getText().isEmpty())
        {
            double segundoNumero = Double.parseDouble(display.getText());
            double resultado = 0;
            
            switch(operacionPendiente)
            {
                case "+":
                {
                    resultado = primerNumero + segundoNumero;
                    break;
                }
                case "-":
                {
                    resultado = primerNumero - segundoNumero;
                    break;
                }
                case "*":
                {
                    resultado = primerNumero * segundoNumero;
                    break;
                }
                case "/":
                {
                    if(segundoNumero != 0)
                    {
                        resultado = primerNumero / segundoNumero;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error: Division por cero");
                        display.setText("");
                    }
                    break;
                }
            }
            display.setText(String.valueOf(resultado));
        }
    }
    
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new ventanainicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JTextField display;
    private javax.swing.JButton dos;
    private javax.swing.JButton entre;
    private javax.swing.JButton igual;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton por;
    private javax.swing.JButton punto;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
