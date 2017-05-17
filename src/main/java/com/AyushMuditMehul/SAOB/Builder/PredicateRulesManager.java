/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AyushMuditMehul.SAOB.Builder;

import com.google.common.io.Resources;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ayush
 */
public class PredicateRulesManager {
    
   final static File ruleFile= new File(".\\src\\main\\Resources\\predicateMappingRules.txt");
   
   
    void ruleInsertion(String left,String right)
    {
        try
        {
            File f2= new File("temp.txt");
            f2.createNewFile();
            PrintStream pout = new PrintStream(f2);
            FileReader fin = new FileReader(ruleFile);
            BufferedReader buf = new BufferedReader(fin);
            String line;
            String[] Sline;
            int flag=-1;
            left = left.toLowerCase();
            while((line=buf.readLine())!=null)
                {   Sline=line.split("->");
                    if(left.compareTo(Sline[0])<0)
                    {
                        flag=1;
                        pout.println(left+"->"+right);
                        pout.println(line);
                        while((line=buf.readLine())!=null)
                            pout.println(line);
                        break;
                    }
                    else if(left.compareTo(Sline[0])>0)
                    {
                        pout.println(line);
                    }
                    else        //string is already present
                    {
                        flag=1;
                        pout.println(line);
                        while((line=buf.readLine())!=null)
                            pout.println(line);
                    }
                }
            if(flag==-1)
                pout.println(left+"->"+right);
            buf.close();
            if(ruleFile.delete())
                System.out.println("file deleted");
            pout.close();
            if(f2.renameTo(ruleFile))
                System.out.println("rename");
                                    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    String ruleSearch(String left)
    {
        try
        {
            FileReader fin = new FileReader(ruleFile);
            BufferedReader buf = new BufferedReader(fin);
            String line;
            left=left.toLowerCase();
            String[] Sline;
            while((line=buf.readLine())!=null)
            {   
                Sline=line.split("->");
                if(left.compareTo(Sline[0])<0)
                {   buf.close();
                    break;
                }
                if(left.compareTo(Sline[0])==0)
                {    
                    buf.close();
                    return Sline[1];
                }
                    
             }
        }
        catch(Exception e)
        {
            Logger.getLogger(Map2RDF.class.getName()).log(Level.SEVERE, null, e);
            
        }
        return null;
    }   
}
