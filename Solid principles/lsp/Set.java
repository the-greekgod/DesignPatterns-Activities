package solid.live.lsp;

import java.util.LinkedHashSet;

public class Set<T> {
    protected java.util.Set innerSet = new LinkedHashSet();

    public void add(final T element) {
        innerSet.add(element);
    }

    public boolean isMember(final T element) {
        return innerSet.contains(element);
    }

    public int size() {
        return innerSet.size();
    }
}
