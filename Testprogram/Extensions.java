package Testprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;

public class Extensions {
	public  String findExte(String queryString){
		try {
        File file = new File(queryString);
        String[] files = file.list(new FilenameFilter() {
             
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
        	System.out.println(f);
        	String fullFile=queryString;
        	fullFile=fullFile.concat(f);
        	 FileReader file1= new FileReader(fullFile);
    	     BufferedReader br = new BufferedReader(file1);
    	     for(String line; (line =br.readLine()) != null;) {
    	    	 
    	    	 return line;
    	    	 
        }
    	     
    	    

		}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		 return null;
}
	

}
