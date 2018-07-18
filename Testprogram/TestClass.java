package Testprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestClass {
	 
public static int reverse(int number) {
int r,sum=0;

	while(number>0){    
	   r=number%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   number=number/10;    
	  } 
	  return sum;
}

public static boolean isPowerOfFour(int n)
{
    if (n == 0)
        return false;
    
    while (n != 1)
    {
        if (n % 4 != 0)
            return false;
        n = n / 4;
    }
    return true;
}
public static String convertUpper(String querystring) {
    try {
        FileReader file = new FileReader(querystring);
        BufferedReader br = new BufferedReader(file);
        for (String line; (line = br.readLine()) != null;) {

            String Upper = line.toUpperCase();
            return Upper;
        }
        file.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}

public static String findLength(String querystring) {
    try {
        File f = new File(querystring);
        double len = f.length();
        String leng = Double.toString(len);

        return leng;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}

      
    


public static boolean Even(int number) {
	if(number%2==0) {
		return true;
	}
	else {
		return false;
	}
}

}


	



