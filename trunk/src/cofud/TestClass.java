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
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rendra
 */
public class TestClass {
    public static void main( String [] args ){
        try{
            String filename = "D:\\test.java";
            
            // Read file into String
            FileInputStream fis = new FileInputStream(filename);
            int len= fis.available();
            byte b[]= new byte[len];
            fis.read(b);
            String content = new String(b);
            //System.out.println(content);
            //StringBuffer comBuf = new StringBuffer();
            //StringBuffer ruleBuf = new StringBuffer();

            String commRx = "/\\*(?>(?:(?>[^*]+)|\\*(?!/))*)\\*/|(//.*)";
            Pattern commPattern = Pattern.compile(commRx, (Pattern.MULTILINE));
            Matcher commMatcher = commPattern.matcher(content);
            //ArrayList commArr = new ArrayList();

            while( commMatcher.find() ) {
                System.out.println(commMatcher.group());
            }

        } catch( Exception ex ) {
            System.err.println(ex);
        }
    }
}
