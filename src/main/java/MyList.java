import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<Object> list = new ArrayList<Object>();

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public boolean add(Object object) {
        return this.list.add(object);
    }

    public Object get(int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index >= this.list.size()) throw new ArrayIndexOutOfBoundsException("Index is invalid");
        return this.list.get(index);
    }

    public Object remove(int index) throws ArrayIndexOutOfBoundsException {
        if(index<0 || index>=this.list.size()) throw new ArrayIndexOutOfBoundsException("Invalid index");
        return this.list.remove(index);
    }

    public int size() {
        return this.list.size();
    }

    public boolean contains(Object object) {
        return true;
    }

}
