package application;

import entitis.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		String path = "dataset.csv";
                
               List<Product> list = new ArrayList<Product>();
                
                
                
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();
                        line = br.readLine();
                        while (line != null) {
                        	                    
                            
                            String[] vect = line.split(";");                            
                            String PrimeiroNome = (vect[0].replace(" ",""));                           
                            String Sobrenomes = (vect[1].replace(" ",""));                           
                            float peso = Float.parseFloat (vect[2].replace(",",""));                           
                            float altura = Float.parseFloat (vect[3].replace(",",".")); 
                            
                            
                        
                            Product prod = new Product(PrimeiroNome,Sobrenomes,peso,altura);
                            float IMC = peso/(altura*altura);                        
                            list.add(prod);

                            line = br.readLine();
                           System.out.println(PrimeiroNome.toUpperCase()+" "+Sobrenomes.toUpperCase()+" "+ IMC);
                            
                            
			}
                        
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
			}
		}
	}

    @SuppressWarnings("unused")
	private static String toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}