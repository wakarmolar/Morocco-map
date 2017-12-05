

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hamza
 */
public class DialogChemin extends javax.swing.JFrame {

    CarteMaroc carteMaroc;
    Ville[] path = null;
    
    /**
     * Creates new form DialogChemin
     */
    public DialogChemin(CarteMaroc c) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setTitle("Recherche du chemin");
        carteMaroc = c;
        initComboBox(); // initialisation des ComboBox
    }

    public void initComboBox() {
        String[] nomVilles = new String[carteMaroc.villes.size()];
        String[] algo = new String[3];
        algo[0] = "BFS";
        algo[1] = "DFS";
        algo[2] = "astar";
        int i = 0;
        for (Ville item : carteMaroc.villes) {
            nomVilles[i++] = item.getNameVille();
        }
        Arrays.sort(nomVilles);
        jComboBox1.setModel(new DefaultComboBoxModel<>(algo));
        jComboBox2.setModel(new DefaultComboBoxModel<>(nomVilles));
        jComboBox3.setModel(new DefaultComboBoxModel<>(nomVilles));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 250));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Algorithme ");

        jLabel2.setText("Ville de départ");

        jLabel3.setText("Ville d'arrivée");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ville depart = carteMaroc.getVille(jComboBox2.getSelectedItem().toString());
        Ville arrivee = carteMaroc.getVille(jComboBox3.getSelectedItem().toString());
        Ville[] pathtest = null;
        double distance =0;
        if(depart.getNameVille().compareTo(arrivee.getNameVille())!=0){
            switch (jComboBox1.getSelectedItem().toString()) {
            case "BFS":
                // la recherche en largeur
                pathtest = carteMaroc.engine.findPath(depart, arrivee);
                carteMaroc.panel.choix = 1;
                carteMaroc.engine.searchPath = new Ville[carteMaroc.engine.maxDepth];
                path = new Ville[carteMaroc.engine.maxDepth];
                for (int j = 0; j < carteMaroc.engine.maxDepth; j++) {
                    path[j] = pathtest[j];
                }
                for (int i = 0; i < path.length; i++) {
                    System.out.println("ville : " + path[i].getNameVille());
                }
                sendPathToPanel(path, carteMaroc.panel.path); // envoyer le path à la classe panel pour le dessiner
                carteMaroc.panel.repaint();
                for (int i = 0; i < path.length-1; i++) {
                      distance += carteMaroc.engine.get_calculated_dist(carteMaroc.engine.getNodeIndex(path[i].getNameVille()),carteMaroc.engine.getNodeIndex(path[i+1].getNameVille()));
                }
                System.out.println("Distance à vol d'oiseau entre "+depart.getNameVille()+" et "
                        +arrivee.getNameVille()+" : "+ (distance*200)/77 +" Km"  );
                
                this.dispose();
                break;
            case "DFS":
                // la recherche en profondeur
                pathtest = carteMaroc.engine2.findPath(depart, arrivee);
                carteMaroc.panel.choix = 2;
                carteMaroc.engine2.searchPath = new Ville[carteMaroc.engine2.maxDepth];
                path = new Ville[carteMaroc.engine2.maxDepth];
                for (int j = 0; j < carteMaroc.engine2.maxDepth; j++) {
                    path[j] = pathtest[j];
                }
                for (int i = 0; i < path.length; i++) {
                    System.out.println("ville : " + path[i].getNameVille());
                }
                sendPathToPanel(path, carteMaroc.panel.path); // envoyer le path à la classe panel pour le dessiner
                carteMaroc.panel.repaint();
                for (int i = 0; i < path.length-1; i++) {
                      distance += carteMaroc.engine.get_calculated_dist(carteMaroc.engine.getNodeIndex(path[i].getNameVille()),carteMaroc.engine.getNodeIndex(path[i+1].getNameVille()));
                }
                System.out.println("Distance à vol d'oiseau entre "+depart.getNameVille()+" et "
                        +arrivee.getNameVille()+" : "+ (distance*200)/77 +" Km"  );
                this.dispose();
                break;
            case "astar":
                carteMaroc.panel.choix = 3;
                AstarSearch a = new AstarSearch();
                // la recherche informée
                a.findPath(depart, arrivee);
                System.out.println("résultat de l'algorithme Astar :");
                for (Ville item : a.pathf) {
                    System.out.println(item.getNameVille());
                }
                Ville pathAStar[] = new Ville[a.pathf.size()];
                for (int i = 0; i < a.pathf.size(); i++) {
                    pathAStar[i] = a.pathf.get(i);
                }
                sendPathToPanel(pathAStar, carteMaroc.panel.path); // envoyer le path à la classe panel pour le dessiner
                carteMaroc.panel.repaint();
                
                for (int i = 0; i < pathAStar.length-1; i++) {
                      distance += a.get_calculated_dist(
                              carteMaroc.engine.getNodeIndex(pathAStar[i].getNameVille()),
                              carteMaroc.engine.getNodeIndex(pathAStar[i+1].getNameVille())
                      );
                }
                
                System.out.println("Distance à vol d'oiseau entre "+depart.getNameVille()+" et "
                        +arrivee.getNameVille()+" : "+ (distance*200)/77 +" Km"  );
                this.dispose();
                break;
            }
        }
        else{
            new Erreur("veuillez choisir deux villes différentes");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void sendPathToPanel(Ville[] pathDialog, Ville[] pathPanel) {
        carteMaroc.panel.path = pathDialog;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}