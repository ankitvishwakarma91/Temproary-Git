import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class first {

    void main(){
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("outp.txt", true));
            writer.append("\nhello after appedn true ");
            writer.write("\nhello after write true ");
            writer.append("\n so now ");
            writer.close();
        }catch(IOException io){
            System.out.println(io.getMessage());
        }

    }
}