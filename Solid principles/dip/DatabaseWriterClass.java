package solid.live.dip;

public class DatabaseWriterClass implements Writer{
    
    public void write(String encodedString){
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}
