package lab22.Version3;

public class dynamicArray<T> {

    private T[] list;
    private int size;

    public dynamicArray(){
        list = (T[]) new Object[2];
        size = 0;
    }

    public void add(T item){
        if(size == list.length){
            T[] newArray = (T[]) new Object[2* list.length];
            int i = 0;
            for(T smth:list){
                newArray[i] = smth;
                i++;
            }
            list = newArray;
        }
        list[size] = item;
        size++;
    }

    public T remove(){
        if(size == 0){
            return null;
        }
        T item = list[size-1];
        size--;
        return item;

    }


    public static void main(String[] args) {
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
