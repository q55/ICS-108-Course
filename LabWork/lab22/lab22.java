package lab22;

public class lab22 {
    public class DynamicArray<T> {
        private T[] array;
        private int size;

        public DynamicArray() {
            array = (T[]) new Object[2];
            size = 0;
        }

        public void add(T item) {
            if (size == array.length) {
                T[] newArray = (T[]) new Object[array.length * 2];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            array[size] = item;
            size++;
        }

        public T remove() {
            if (size == 0) {
                return null;
            }
            T item = array[size - 1];
            array[size - 1] = null;
            size--;
            return item;
        }
    }
}
