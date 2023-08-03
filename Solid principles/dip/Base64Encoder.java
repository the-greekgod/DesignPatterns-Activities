package solid.live.dip;

import java.util.Base64;

public class Base64Encoder implements Encoder {

    public String encode(String data) {
        String encodedData = Base64.encodeBytes(data.getBytes());
        return encodedData ;
    }
    
}
