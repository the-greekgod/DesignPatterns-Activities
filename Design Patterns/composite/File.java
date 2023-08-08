
public class File implements FileSystemComponent{
    private final String name;
    private int size;
    private Directory parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Directory getParent() {
        return parent;
    }
}
