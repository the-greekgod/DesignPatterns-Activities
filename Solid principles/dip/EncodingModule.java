package solid.live.dip;

public class EncodingModule {
    public void encodeAnything(Reader filereader, Writer filewriter, Encoder encodeType) {

            String content = filereader.read() ;

            String encodedContent = encodeType.encode(content) ;

            filewriter.write(encodedContent);
            
    }

}

