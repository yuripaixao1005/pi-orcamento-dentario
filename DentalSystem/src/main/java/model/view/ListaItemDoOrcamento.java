package model.view;

import java.util.List;
import javax.swing.JOptionPane;
import model.controller.ItemDoOrcamentoController;
import model.dao.DaoFactory;
import model.entities.ItemDoOrcamentoTableModel;

public class ListaItemDoOrcamento extends javax.swing.JInternalFrame {

    public ItemDoOrcamentoTableModel ctm;
    /**
     * Creates new form ListaItemDoOrcamento
     */
    public ListaItemDoOrcamento() {
        initComponents();
        
        ctm = new ItemDoOrcamentoTableModel();
        tabela.setModel(ctm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Orçamento", "Nome", "Serviço", "Valor", "Dente"
            }
        ));
        tabela.setName(""); // NOI18N
        tabela.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tabela);

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizaraoClicarAtualizar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizaraoClicarAtualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizaraoClicarAtualizar
        try {
            ItemDoOrcamentoController ic = DaoFactory.criarItemDoOrcamentoController();

            List itens = ic.buscarTodos();

            ctm.setItens(itens);
            tabela.revalidate();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Houve um erro na exclus�o","Exclus�o",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAtualizaraoClicarAtualizar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
