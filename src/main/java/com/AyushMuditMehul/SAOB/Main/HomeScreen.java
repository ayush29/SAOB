/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AyushMuditMehul.SAOB.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ayush
 */
public class HomeScreen extends javax.swing.JPanel {

    /**
     * Creates new form HomeScreen
     */
    File ontologyFile=new File(".\\src\\main\\Resources\\ontology.owl");
    File ruleFile=new File(".\\src\\main\\Resources\\predicateMappingRules.txt");
    File performanceFile=new File(".\\src\\main\\Resources\\performance.csv");
    MainWindow manager;
    public HomeScreen(MainWindow m) {
        initComponents();
        manager=m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importOwlButton = new javax.swing.JButton();
        exportOwlButton = new javax.swing.JButton();
        startBuilderSessionButton = new javax.swing.JButton();
        viewOntologyButton = new javax.swing.JButton();
        exportCsvFileButton = new javax.swing.JButton();
        exportRuleFileButton = new javax.swing.JButton();
        importRuleFileButton = new javax.swing.JButton();

        importOwlButton.setText("Import new ontology file");
        importOwlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importOwlButtonActionPerformed(evt);
            }
        });

        exportOwlButton.setText("Export current ontology file");
        exportOwlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportOwlButtonActionPerformed(evt);
            }
        });

        startBuilderSessionButton.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        startBuilderSessionButton.setText("Start New Builder Session");
        startBuilderSessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBuilderSessionButtonActionPerformed(evt);
            }
        });

        viewOntologyButton.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        viewOntologyButton.setText("View Ontology File");
        viewOntologyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOntologyButtonActionPerformed(evt);
            }
        });

        exportCsvFileButton.setText("Export performance CSV file");
        exportCsvFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCsvFileButtonActionPerformed(evt);
            }
        });

        exportRuleFileButton.setText("Export Rule File");
        exportRuleFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportRuleFileButtonActionPerformed(evt);
            }
        });

        importRuleFileButton.setText("Import Rule File");
        importRuleFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importRuleFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(importRuleFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importOwlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportRuleFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exportCsvFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exportOwlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startBuilderSessionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(viewOntologyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(importOwlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(importRuleFileButton)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBuilderSessionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewOntologyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(exportOwlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportCsvFileButton)
                    .addComponent(exportRuleFileButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startBuilderSessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBuilderSessionButtonActionPerformed
        // TODO add your handling code here:
        manager.builderSessionRatings=new int[7];
        for(int i=0;i<7;i++)
        {
            manager.builderSessionRatings[i]=0;
        }
        manager.createAnalyserScreen();
        manager.showAnalyserScreen();
    }//GEN-LAST:event_startBuilderSessionButtonActionPerformed

    private void viewOntologyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOntologyButtonActionPerformed
        // TODO add your handling code here:
        manager.createViewerScreen();
        manager.showViewerScreen();
    }//GEN-LAST:event_viewOntologyButtonActionPerformed

    private void importOwlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importOwlButtonActionPerformed
        // TODO add your handling code here:
        int userSelection = JOptionPane.showConfirmDialog(new JFrame(), "Importing new ontology will erase the current ontology,rule file and performance csv file.\n(Please export them before importing new ontology)\n Want to continue?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(userSelection!=JOptionPane.YES_OPTION)
        {
            return;
        }        
        JDialog jd=new JDialog();
        JFileChooser chooser=new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setDialogTitle("Select Ontology File");
        chooser.setApproveButtonText("Import");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("OWL File", "owl");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(jd);        
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
         File f= chooser.getSelectedFile();
            try {
                FileInputStream fin = new FileInputStream(f);
                FileOutputStream fout = new FileOutputStream(ontologyFile,false);
                int i;
                do {
                    i = fin.read();
                    if (i != -1) {
                        fout.write(i);
                    }
                    
                } while (i != -1);                
                fin.close();
                fout.close();
                
                //truncating rule file
                fout= new FileOutputStream(ruleFile,false);
                fout.close();
                //truncating performance csv file
                fout= new FileOutputStream(performanceFile,false);
                fout.close();
            } catch (Exception ex) {
                Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_importOwlButtonActionPerformed

    private void importRuleFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importRuleFileButtonActionPerformed
        // TODO add your handling code here:
        int userSelection = JOptionPane.showConfirmDialog(new JFrame(), "Importing new Rule File will erase the current rule file.\n(Please export old one before importing new)\n Want to continue?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(userSelection!=JOptionPane.YES_OPTION)
        {
            return;
        }
        JDialog jd=new JDialog();
        JFileChooser chooser=new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setDialogTitle("Select Rule File");
        chooser.setApproveButtonText("Import");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(jd);        
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
         File f= chooser.getSelectedFile();
            try {
                FileInputStream fin = new FileInputStream(f);
                FileOutputStream fout = new FileOutputStream(ruleFile,false);
                int i;
                do {
                    i = fin.read();
                    if (i != -1) {
                        fout.write(i);
                    }
                    
                } while (i != -1);                
                fin.close();
                fout.close();                                
            } catch (Exception ex) {
                Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_importRuleFileButtonActionPerformed

    private void exportOwlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportOwlButtonActionPerformed
        // TODO add your handling code here:
        JDialog jd=new JDialog();
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("OWL File", "owl");
        fileChooser.setFileFilter(filter);
		fileChooser.setDialogTitle("Save As");

		int userSelection = fileChooser.showSaveDialog(jd);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File newOntologyFile = fileChooser.getSelectedFile();
                     try {
                        FileInputStream fin = new FileInputStream(ontologyFile);
                        FileOutputStream fout = new FileOutputStream(newOntologyFile, false);
                        int i;
                        do {
                            i = fin.read();
                            if (i != -1) {
                                fout.write(i);
                            }

                        } while (i != -1);
                        fin.close();
                        fout.close();
                    } catch (Exception ex) {
                        Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }   
			
		}	
    }//GEN-LAST:event_exportOwlButtonActionPerformed

    private void exportRuleFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportRuleFileButtonActionPerformed
        // TODO add your handling code here:
        JDialog jd=new JDialog();
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt");
        fileChooser.setFileFilter(filter);
		fileChooser.setDialogTitle("Save As");

		int userSelection = fileChooser.showSaveDialog(jd);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File newRuleFile = fileChooser.getSelectedFile();
                     try {
                        FileInputStream fin = new FileInputStream(ruleFile);
                        FileOutputStream fout = new FileOutputStream(newRuleFile, false);
                        int i;
                        do {
                            i = fin.read();
                            if (i != -1) {
                                fout.write(i);
                            }

                        } while (i != -1);
                        fin.close();
                        fout.close();
                    } catch (Exception ex) {
                        Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }   
			
		}	
    }//GEN-LAST:event_exportRuleFileButtonActionPerformed

    private void exportCsvFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCsvFileButtonActionPerformed
        // TODO add your handling code here:
        JDialog jd=new JDialog();
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV File", "csv");
        fileChooser.setFileFilter(filter);
		fileChooser.setDialogTitle("Save As");

		int userSelection = fileChooser.showSaveDialog(jd);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File newPerformanceFile = fileChooser.getSelectedFile();
                     try {
                        FileInputStream fin = new FileInputStream(performanceFile);
                        FileOutputStream fout = new FileOutputStream(newPerformanceFile, false);
                        int i;
                        do {
                            i = fin.read();
                            if (i != -1) {
                                fout.write(i);
                            }

                        } while (i != -1);
                        fin.close();
                        fout.close();
                    } catch (Exception ex) {
                        Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }   
			
		}	
    }//GEN-LAST:event_exportCsvFileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportCsvFileButton;
    private javax.swing.JButton exportOwlButton;
    private javax.swing.JButton exportRuleFileButton;
    private javax.swing.JButton importOwlButton;
    private javax.swing.JButton importRuleFileButton;
    private javax.swing.JButton startBuilderSessionButton;
    private javax.swing.JButton viewOntologyButton;
    // End of variables declaration//GEN-END:variables
}
