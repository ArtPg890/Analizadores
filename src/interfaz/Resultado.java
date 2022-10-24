package interfaz;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Clase utilizada para mostrar el resultado de análisis sintáctico
 * 
 * @author Arturo Guzmán Ávila
 * @version 1.0
 */
public class Resultado extends javax.swing.JDialog {

    /**
     * Inicialización de los objetos necesarios para la ejecución del programa
     * @param parent Ventana padre
     * @param modal Modo
     * @param pila Pila de análisis sintáctico
     * @param entrada Pila de entradas
     * @param accion Pila de acciones
     */
    public Resultado(java.awt.Frame parent, boolean modal, String pila, String entrada, String accion) {
        super(parent, modal);
        initComponents();
        this.pila.setText(pila);
        this.entrada.setText(entrada);
        this.accion.setText(accion);
        
        jSPila.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = jSPila.getVerticalScrollBar().getValue();
                jSEntrada.getVerticalScrollBar().setValue(value);
                jSAccion.getVerticalScrollBar().setValue(value);
            }
        });
        jSEntrada.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = jSEntrada.getVerticalScrollBar().getValue();
                jSPila.getVerticalScrollBar().setValue(value);
                jSAccion.getVerticalScrollBar().setValue(value);
            }
        });
        jSAccion.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = jSAccion.getVerticalScrollBar().getValue();
                jSEntrada.getVerticalScrollBar().setValue(value);
                jSPila.getVerticalScrollBar().setValue(value);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSPila = new javax.swing.JScrollPane();
        pila = new javax.swing.JTextPane();
        jSEntrada = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextPane();
        jSAccion = new javax.swing.JScrollPane();
        accion = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pila de análisis");
        setPreferredSize(new java.awt.Dimension(1040, 600));
        setSize(new java.awt.Dimension(1440, 900));

        jSPila.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        pila.setBorder(javax.swing.BorderFactory.createTitledBorder("Pila"));
        pila.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jSPila.setViewportView(pila);

        jSEntrada.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        entrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));
        entrada.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jSEntrada.setViewportView(entrada);

        jSAccion.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        accion.setBorder(javax.swing.BorderFactory.createTitledBorder("Accion"));
        accion.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jSAccion.setViewportView(accion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSPila, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPila, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addComponent(jSEntrada)
            .addComponent(jSAccion)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane accion;
    private javax.swing.JTextPane entrada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSAccion;
    private javax.swing.JScrollPane jSEntrada;
    private javax.swing.JScrollPane jSPila;
    private javax.swing.JTextPane pila;
    // End of variables declaration//GEN-END:variables
}
