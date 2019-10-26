/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AyushMuditMehul.SAOB.Stats;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayush
 */
public class PerformanceCSVFileManager {

    
    
    File performanceFile=new File(".\\src\\main\\Resources\\performance.csv");
    String[] headers={"Session date and time","No. of lines analysed","0 Rating count","1 Rating count","2 Rating count","3 Rating count","4 Rating count","5 Rating count"};
    public PerformanceCSVFileManager() {
        CsvReader reader;
        try {
            reader=new CsvReader(new FileReader(performanceFile),',');
            reader.readHeaders();
            if(reader.getHeaderCount()==0)
            {
                CsvWriter writer = new CsvWriter(new FileWriter(performanceFile, true), ',');
                writer.writeRecord(headers);                        
                        writer.close();                
            }
            reader.close();
        } catch (Exception ex) {
            Logger.getLogger(PerformanceCSVFileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void insertRecord(int linesCount,int rating0Count,int rating1Count,int rating2Count,int rating3Count,int rating4Count,int rating5Count)
    {        				
			
		try {
			// use FileWriter constructor that specifies open for appending
			CsvWriter writer = new CsvWriter(new FileWriter(performanceFile, true), ',');
			String[] record={new Date().toString(),Integer.toString(linesCount),Integer.toString(rating0Count),Integer.toString(rating1Count),Integer.toString(rating2Count),Integer.toString(rating3Count),Integer.toString(rating4Count),Integer.toString(rating5Count)};
                        writer.writeRecord(record);                        
                        writer.close();
						
		} catch (Exception e) {
			Logger.getLogger(PerformanceCSVFileManager.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}
}
