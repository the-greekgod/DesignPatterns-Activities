package solid.live.dip;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass implements Writer{

    private String filePath ;
    
    public FileWriterClass(String filePath){
        this.filePath = filePath ;
    }

    public void write(String encodedString) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath));
            writer.write(encodedString);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
