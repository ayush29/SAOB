/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AyushMuditMehul.SAOB.Builder;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.UIManager;
import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.data.Synset;
import net.didion.jwnl.data.Word;
import net.didion.jwnl.dictionary.Dictionary;

/**
 *
 * @author Mudit
 */
public class NewClass {
     public static void main(String[] args) throws JWNLException, FileNotFoundException {
        // TODO code application logic here
       /* String x="properties.xml";
        synonym c = new synonym();
         ArrayList<String> l = c.syn("red", x);
         if(l!=null)
         {
             for(String i : l)
             {
                 System.out.println(i);
             }
         }
   */ 
         try {
UIManager.setLookAndFeel(new WindowsLookAndFeel());
}catch (Exception e) {
}

    JFrame f = new JFrame("Annotator");
    f.setSize(800, 600);
    AnnotatorGUI s =new AnnotatorGUI();
     f.add(s);
     f.setVisible(true);
     }
/*         JWNL.initialize(new FileInputStream("C:\\Users\\Mudit\\Documents\\NetBeansProjects\\mavenproject1\\properties.xml"));    	
final Dictionary dictionary = Dictionary.getInstance();
 IndexWord indexWord = dictionary.lookupIndexWord(POS.VERB, "amazing");

		Synset[] senses = indexWord.getSenses();

			for (Synset set : senses) {
				System.out.println(indexWord + ": " + set.toString());
			}
    }
*/}
