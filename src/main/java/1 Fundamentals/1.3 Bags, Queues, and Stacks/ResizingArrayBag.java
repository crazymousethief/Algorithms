import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizingArrayBag<Item> implements IBag<Item> {
    private Item[] array;
    private int    size;

    public ResizingArrayBag() {
        @SuppressWarnings("unchecked")
        Item[] array = (Item[]) new Object[2];
        this.array = array;
        this.size = 0;
    }

    private void resize(int capacity) {
        assert capacity >= size;
        @SuppressWarnings("unchecked")
        Item[] tempArray = (Item[]) new Object[capacity];
        System.arraycopy(array, 0, tempArray, 0, this.size);
        array = tempArray;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Item item) {
        if (size == array.length) resize(2 * size);
        array[size++] = item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {
        private int count = 0;

        @Override
        public boolean hasNext() { return count < size; }

        @Override
        public void remove() { throw new UnsupportedOperationException(); }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return array[count++];
        }
    }
}
