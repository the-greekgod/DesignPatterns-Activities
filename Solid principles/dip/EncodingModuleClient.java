package solid.live.dip;

public class EncodingModuleClient {
    public static void main(String[] args){


        EncodingModule encodingModule  = new EncodingModule();
        Encoder encodeType = new Base64Encoder() ;

        Reader filereader = new FileReaderClass("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt") ;
        Writer filewriter = new FileWriterClass("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt") ; 
        encodingModule.encodeAnything(filereader , filewriter, encodeType);

        Reader networkReader = new NetworkReaderClass("http", "myfirstappwith.appspot.com", "index.html") ;
        Writer databaseWriter = new DatabaseWriterClass() ;
        encodingModule.encodeAnything(networkReader , databaseWriter, encodeType);


    }
}
