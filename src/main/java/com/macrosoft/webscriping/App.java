package com.macrosoft.webscriping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String testUrl = "https://aws.amazon.com/solutions/ai-powered-speech-analytics-for-amazon-connect/";
        
        try {
			Document doc = Jsoup.connect(testUrl).get();
			System.out.println(doc.outerHtml());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
