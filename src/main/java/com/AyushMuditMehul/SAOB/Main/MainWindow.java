/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AyushMuditMehul.SAOB.Main;

import com.AyushMuditMehul.SAOB.Builder.AnalyserGUI;
import com.AyushMuditMehul.SAOB.Builder.Map2RDF;
import com.AyushMuditMehul.SAOB.Builder.Validator;
import com.AyushMuditMehul.SAOB.View.Viewer;
import edu.stanford.nlp.ie.util.RelationTriple;
import java.awt.CardLayout;
import java.awt.Cursor;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.ArrayList;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 *
 * @author Ayush
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    HomeScreen homePanel;
    AnalyserGUI analyserPanel;
    Map2RDF mapperPanel;
    Validator validatorPanel;
    CardLayout cardLayout;
    Viewer viewerPanel;
    public int builderSessionRatings[];
    public MainWindow() {
        initComponents();
        cardLayout = (CardLayout) rootPanel.getLayout();
        createHomeScreen();
        showHomeScreen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void createHomeScreen() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (homePanel != null) {
                deleteHomeScreen();
            }
            homePanel = new HomeScreen(this);
            rootPanel.add("HomeScreen", homePanel);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    public void showHomeScreen() {
        if (homePanel != null) {            
            cardLayout.show(rootPanel, "HomeScreen");
            setCursor(Cursor.getDefaultCursor());
        }

    }

    public void deleteHomeScreen() {
        if (homePanel != null) {            
            cardLayout.removeLayoutComponent(homePanel);
            homePanel = null;
        }
    }

    public void createAnalyserScreen() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (analyserPanel != null) {
                deleteAnalyserScreen();
            }
            analyserPanel = new AnalyserGUI(this);
            rootPanel.add("Analyser", analyserPanel);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    public void showAnalyserScreen() {
        if (analyserPanel != null) {            
            cardLayout.show(rootPanel, "Analyser");
            setCursor(Cursor.getDefaultCursor());
        }

    }

    public void deleteAnalyserScreen() {
        if (analyserPanel != null) {            
            cardLayout.removeLayoutComponent(analyserPanel);
            analyserPanel = null;
        }
    }
    
    public void createMapperScreen(RelationTriple triple) {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (mapperPanel != null) {
                deleteMapperScreen();
            }
            mapperPanel = new Map2RDF(triple,this);
            rootPanel.add("Mapper", mapperPanel);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    public void showMapperScreen() {
        if (mapperPanel != null) {            
            cardLayout.show(rootPanel, "Mapper");
            setCursor(Cursor.getDefaultCursor());
        }

    }

    public void deleteMapperScreen() {
        if (mapperPanel != null) {            
            cardLayout.removeLayoutComponent(mapperPanel);
            mapperPanel = null;
        }
    }
    public void createValidatorScreen(ArrayList <OWLAxiom> axiomList) {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (validatorPanel != null) {
                deleteValidatorScreen();
            }
            validatorPanel = new Validator(axiomList,this);
            rootPanel.add("Validator", validatorPanel);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    public void showValidatorScreen() {
        if (validatorPanel != null) {            
            cardLayout.show(rootPanel, "Validator");
            setCursor(Cursor.getDefaultCursor());
        }

    }

    public void deleteValidatorScreen() {
        if (validatorPanel != null) {            
            cardLayout.removeLayoutComponent(validatorPanel);
            validatorPanel = null;
        }
    }
    
    public void createViewerScreen() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (viewerPanel != null) {
                deleteViewerScreen();
            }
            viewerPanel = new Viewer(this);
            rootPanel.add("Viewer", viewerPanel);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    public void showViewerScreen() {
        if (viewerPanel != null) {            
            cardLayout.show(rootPanel, "Viewer");
            setCursor(Cursor.getDefaultCursor());
        }

    }

    public void deleteViewerScreen() {
        if (viewerPanel != null) {            
            cardLayout.removeLayoutComponent(viewerPanel);
            viewerPanel = null;
        }
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainWindow m=new MainWindow();
                        m.setVisible(true);
                        m.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables
}
