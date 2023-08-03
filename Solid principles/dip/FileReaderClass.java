package solid.live.dip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass implements Reader {

    private String filePath ;
    FileReaderClass(String filePath){
        this.filePath = filePath ;
    }

    public String read() {
      StringBuilder lines = new StringBuilder();

      try {
         BufferedReader reader = new BufferedReader(new FileReader(this.filePath));

         String aLine;
         while((aLine = reader.readLine()) != null) {
            lines.append(aLine);
         }

         reader.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

      return lines.toString();
   }
}
