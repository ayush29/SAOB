/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AyushMuditMehul.SAOB.Builder;

import com.AyushMuditMehul.SAOB.Main.MainWindow;
import edu.stanford.nlp.ie.util.RelationTriple;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.simple.*;
import edu.stanford.nlp.util.Pair;
import java.awt.Cursor;
import java.util.Collection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Ayush
 */
public class AnalyserGUI extends javax.swing.JPanel {

    /**
     * Creates new form AnalyserGUI
     */
    Document doc;
    List<Sentence> sentenceList;
    Sentence currentSent;
    Collection<RelationTriple> currentTripleList;
    int iterator=-1;
    MainWindow manager;
    public AnalyserGUI(MainWindow m) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        headingLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mapButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        analysedSentenceView = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tripleTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        prevButton.setText("Analyse Prev. Sentence");
        prevButton.setEnabled(false);
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Analyse Next Sentence");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        headingLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("ANALYSER");

        mapButton.setText("Map to RDF Triple");
        mapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapButtonActionPerformed(evt);
            }
        });

        analysedSentenceView.setEditable(false);
        analysedSentenceView.setColumns(20);
        analysedSentenceView.setRows(5);
        jScrollPane2.setViewportView(analysedSentenceView);

        tripleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Predicate", "Object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tripleTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(52, 52, 52)
                        .addComponent(mapButton)
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(mapButton)))
                .addGap(45, 45, 45))
        );

        jLabel1.setText("Enter Text here:");

        startButton.setText("Start Analyser");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop Analyser");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startButton)
                                .addGap(18, 18, 18)
                                .addComponent(stopButton)
                                .addGap(700, 700, 700)
                                .addComponent(prevButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(2, 2, 2)))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(592, 592, 592)
                .addComponent(headingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(585, 585, 585))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevButton)
                    .addComponent(nextButton)
                    .addComponent(startButton)
                    .addComponent(stopButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        iterator++;
        if(iterator<sentenceList.size()&&iterator>=0)
        {
            currentSent=sentenceList.get(iterator);
            analysedSentenceView.setText(currentSent.text());
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));       
            currentTripleList=currentSent.openieTriples();
            setCursor(Cursor.getDefaultCursor());
            DefaultTableModel model=(DefaultTableModel) tripleTable.getModel();
            model.setRowCount(0);
            for(RelationTriple triple:currentTripleList)
            {
                Object rowData[]={triple.subjectGloss(),triple.relationGloss(),triple.objectGloss()};
                model.addRow(rowData);
            }
        }        
        
        if(iterator==sentenceList.size()-1)
        {
            nextButton.setEnabled(false);
        }
        if(iterator>0)
        {
            prevButton.setEnabled(true);
        }
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));       
        doc=new Document(textArea.getText());
        sentenceList= doc.sentences();
        setCursor(Cursor.getDefaultCursor());
        if(sentenceList.size()!=0)
        {
            textArea.setEditable(false);
            stopButton.setEnabled(true);
            startButton.setEnabled(false);
            if(sentenceList.size()>1)
             nextButton.setEnabled(true);
            iterator=0;
            currentSent=sentenceList.get(iterator);           
            analysedSentenceView.setText(currentSent.text());
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));   
            currentTripleList=currentSent.openieTriples();
            setCursor(Cursor.getDefaultCursor());
            DefaultTableModel model=(DefaultTableModel) tripleTable.getModel();
            for(RelationTriple triple:currentTripleList)
            {
                Object rowData[]={triple.subjectGloss(),triple.relationGloss(),triple.objectGloss()};
                model.addRow(rowData);                
                //triple.subject.get(0)
            }
        }
        else
        {
            doc=null;
            sentenceList=null;
        }
        //start analysing
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        // TODO add your handling code here:
        textArea.setEditable(true);
        startButton.setEnabled(true);
        stopButton.setEnabled(false);   
        nextButton.setEnabled(false);
        prevButton.setEnabled(false);
        doc=null;
        sentenceList=null;
        iterator=-1;
        ((DefaultTableModel)tripleTable.getModel()).setRowCount(0);
        analysedSentenceView.setText("");        
    }//GEN-LAST:event_stopButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:
        iterator--;
        if(iterator<sentenceList.size()&&iterator>=0)
        {
            currentSent=sentenceList.get(iterator);
            analysedSentenceView.setText(currentSent.text());
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));       
            currentTripleList=currentSent.openieTriples();
            setCursor(Cursor.getDefaultCursor());
            DefaultTableModel model=(DefaultTableModel) tripleTable.getModel();
            model.setRowCount(0);
            for(RelationTriple triple:currentTripleList)
            {
                Object rowData[]={triple.subjectGloss(),triple.relationGloss(),triple.objectGloss()};
                model.addRow(rowData);
            }
        }
        if(iterator==0)
        {
            prevButton.setEnabled(false);
        }
        if(iterator!=sentenceList.size()-1)
        {
            nextButton.setEnabled(true);
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void mapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapButtonActionPerformed
        // TODO add your handling code here:
        System.gc();
        //List<String> nerTags=currentSent.nerTags();
        RelationTriple triple=(RelationTriple) currentTripleList.toArray()[tripleTable.getSelectedRow()];
        /*Pair<Integer,Integer> s=triple.subjectTokenSpan();  //ner tagging
        for(int i=s.first;i<s.second;i++)
        {
        triple.subject.get(i).setNER(nerTags.get(i));
        System.out.println(triple.subject.get(i).originalText()+":"+triple.subject.get(i).ner());
        }
        s=triple.objectTokenSpan();
        for(int i=s.first;i<s.second;i++)
        {
        triple.object.get(i-s.first).setNER(nerTags.get(i));
        System.out.println(triple.object.get(i-s.first).originalText()+":"+triple.object.get(i-s.first).ner());
        }*/
        
        //pass triple object to Map2RDF
        manager.temporaryMethod(triple);
    }//GEN-LAST:event_mapButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea analysedSentenceView;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mapButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTable tripleTable;
    // End of variables declaration//GEN-END:variables
}
