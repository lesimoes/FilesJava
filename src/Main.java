import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		String csvPathFile = "../../Documents/Trabalho/countrys.csv";
        BufferedReader br = null;
        String line = "";
        
        try {
            br = new BufferedReader(new FileReader(csvPathFile));
            while ((line = br.readLine()) != null) {

           String[] country = line.split(",");

           System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
           }
            
        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        } finally {
        	if (br != null) {
        		br.close();
        	}
        }

	}

}
