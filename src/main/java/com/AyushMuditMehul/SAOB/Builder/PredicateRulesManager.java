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
            int count=0,i,n,x,flag=-1;
            left = left.toLowerCase();
            n=left.length();
            while((line=buf.readLine())!=null)
                {   if(left.charAt(0)<line.charAt(0))
                    {
                        flag=1;
                        pout.println(left+"->"+right);
                        pout.println(line);
                        while((line=buf.readLine())!=null)
                            pout.println(line);
                        break;
                    }
                    Sline=line.split("->");
                    i=0;
                    if(n<Sline[0].length())
                        x=n;
                    else
                        x=Sline[0].length();
                    while(i<x&&(left.charAt(i)==Sline[0].charAt(i)))
                    {
                        i++;
                    }
                    if(i>=count)
                    {
                        count=i;
                        pout.println(line);
                    }
                    else
                    {
                        flag=1;
                        pout.println(left+"->"+right);
                        pout.println(line);
                        while((line=buf.readLine())!=null)
                            pout.println(line);
                        break;
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
            int count=0,i,n,x;
            String[] Sline;
             n=left.length();
            while((line=buf.readLine())!=null)
            {   
                if(left.charAt(0)<line.charAt(0))
                {   buf.close();
                    break;
                }
                Sline=line.split("->");
                i=0;
                if(left.equals(Sline[0]))
                {    
                    buf.close();
                    return Sline[1];
                }
                if(n<Sline[0].length())
                        x=n;
                else
                        x=Sline[0].length();
                   
                while(i<x&&(left.charAt(i)==Sline[0].charAt(i)))
                    {
                        i++;
                    }
                    if(i<count)
                    {
                          buf.close();
                        break;
                    }
                    else
                        count=i;    
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        return null;
    }   
}
