package solid.live.lsp;

public class PersistentSet<T> extends Set<T> {
    public void add(T element) {
        PersistentObject persistentObject = new PersistentObject(element);
        super.add((T) persistentObject);
    }

    public boolean isMember(T element) {
        for (Object o : innerSet) {
            if (o.equals(element))
                return true;
        }
        return false;
    }
}