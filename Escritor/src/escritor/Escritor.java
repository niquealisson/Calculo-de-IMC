
package escritor;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Nique
 */
public class Escritor {

    public static void main(String args[]) {
        try{
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            
            pr.println("linha1coluna1");
        }
        catch(Exception e){
            System.out.println("erro ao escrever o arquivo");
        }
    }
    
}
