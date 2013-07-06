/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cofud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rendra
 */
class Bridge {
    private String SourceFile;
    private int [] totalPartCode;
    private StringBuilder commentsOfCode;
    private StringBuilder functionOfCode;
    private int totalLines;
    private String lastPath;
    
    public void setSourceFile(String sourceFile){
        if(this.SourceFile == null)
            this.SourceFile = "";
        this.SourceFile = sourceFile;
    }
    
    public String getSourceFile(){
        if(this.SourceFile == null)
            return "null";
        else if(this.SourceFile.equals(""))
            return "empty";
        return this.SourceFile;
    }
    
    public Boolean isSourceEmpty(){
        if(getSourceFile().equals("empty") || getSourceFile().equals("null"))
            return true;
        return false;
    }
    
    public void setPartCode(int [] parts){
        this.totalPartCode = new int[4];
        this.totalPartCode = parts;
    }
    
    public int [] getPartCode(){
        if (this.totalPartCode == null){
            this.totalPartCode = new int[4];
        }
        return this.totalPartCode;
    }
    
    public Boolean isPartEmpty(){
        if (this.totalPartCode == null)
            return true;
        return false;
    }
    
    public void setFunctionOfCode(StringBuilder fn){
        this.functionOfCode = new StringBuilder();
        this.functionOfCode = fn;
    }
    
    public void setCommentsOfCode(StringBuilder cm){
        this.commentsOfCode = new StringBuilder();
        this.commentsOfCode = cm;
    }
    
    public StringBuilder getComments(){
        return this.commentsOfCode;
    }
    
    public StringBuilder getFunctions(){
        return this.functionOfCode;
    }
    
    private String myFileReader(String filename) {
        try {
            this.totalLines=0;
            File fin = new File(filename);
            FileInputStream fis = new FileInputStream(fin);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            String aLine = null;
            StringBuilder theText = new StringBuilder((int)fin.length());
            while((aLine = in.readLine()) != null) {
                theText.append(aLine).append("\n");
                this.totalLines++;
            }
            return theText.toString();
        }
        catch (FileNotFoundException e) { return ""; }
        catch (IOException e) { return ""; }
    }
    
    public String readFile(String filename){
        return this.myFileReader(filename);
    }
    
    public int getTotalLines(){
        return this.totalLines;
    }
    
    public void setWorkingPath(String path){
        this.lastPath = path;
    }
    
    public String getWorkingPath(){
        return this.lastPath;
    }
}
