package com.macrosoft.webscriping;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        String test[] = {"https://aws.amazon.com/quickstart/connect/callminer-eureka/",
        		"https://aws.amazon.com/lambda/features/",
        		"https://register.callminer.net/Content/Documents/callMiner-amazon-connect-integration-manual.pdf",
        		"https://introcs.cs.princeton.edu/java/home/chapter1.pdf",
        		"https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf"};
      
    	
        
    	try {
    		for(String url:test) {
    			Connection.Response result = Jsoup.connect(url).ignoreContentType(true).execute();
    			Document htmlDoc = Jsoup.connect(url).ignoreContentType(true).get();
    			String fileTitle = htmlDoc.title();
    			System.out.println("\"" + fileTitle + "\" is last modified in " + result.header("Last-Modified"));
    		}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

}
