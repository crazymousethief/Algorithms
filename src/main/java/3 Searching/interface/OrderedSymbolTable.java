public interface OrderedSymbolTable<Key extends Comparable<Key>, Value> extends BasicSymbolTable<Key, Value> {

    Key min();

    Key max();

    Key floor(Key key);

    Key ceiling(Key key);

    int rank(Key key);

    Key select(int index);

    void deleteMin();

    void deleteMax();

    int size(Key l, Key r);

    Iterable<Key> keys(Key l, Key r);
}
