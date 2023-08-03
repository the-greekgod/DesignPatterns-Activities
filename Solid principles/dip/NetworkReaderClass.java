package solid.live.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReaderClass implements Reader {
    private String protocol ;
    private String host ;
    private String file ;

    public NetworkReaderClass(String protocol, String host, String file){
        this.protocol = protocol ;
        this.host = host ;
        this.file = file ;
    }

    public String read(){
         URL url = null;
        try {
            url = new URL(this.protocol, this.host, this.file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputString = inputString1.toString();
        return inputString ;
    }

}
