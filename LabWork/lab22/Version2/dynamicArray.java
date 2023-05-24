package lab22.Version2;

public class dynamicArray<T> {
    private T[] array;
    private int size;

    public dynamicArray() {
        array = (T[]) new Object[2];
        size = 0;
    }

    public void add(T item) {
        if (size == array.length) {
            reSize();
        }
        array[size] = item;
        size++;
    }

    public void reSize() {
        T[] newArray = (T[]) new Object[2 * array.length];
        System.arraycopy(array,0,newArray,0,size);
        array = newArray;
    }

    public T remove() {
        if(size == 0){
            return null;
        }
        T item = array[size-1];
        size--;
        return item;
    }

    public static void main(String[] args){
        dynamicArray<String> da = new dynamicArray<>();
        da.add("X");
        da.add("Y");
        da.add("Z");

        System.out.println(da.remove()); // Returns Z
        System.out.println(da.remove()); // Returns Y
        System.out.println(da.remove()); // Returns X
        System.out.println(da.remove()); // Returns null
    }

}


