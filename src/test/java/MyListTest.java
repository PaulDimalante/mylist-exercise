import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyListTest {
    @Test
    public void isEmptyShouldReturnTrueWhenEmptyList() {
        MyList myList = new MyList();
        boolean result = myList.isEmpty();
        assertEquals(true, result);
    }

    @Test
    public void isEmptyShouldReturnFalseAfterAdd() {
        MyList myList = new MyList();
        Object object = new Object();
        myList.add(object);
        boolean result = myList.isEmpty();
        assertEquals(false, result);
    }

    @Test
    public void isEmptyShouldReturnTrueWhenEverythingIsRemoved() {
        MyList myList = new MyList();
        Object object1 = new Object();
        Object object2 = new Object();
        myList.add(object1);
        myList.add(object2);
        myList.remove(0);
        myList.remove(0);
        boolean result = myList.isEmpty();
        assertEquals(true, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getShouldThrowArrayIndexOutOfBoundsExceptionWhenIndexIsInvalid() {
        MyList myList = new MyList();
        myList.get(0);
    }

    @Test
    public void getShouldReturnObjectAfterAdd() {
        MyList myList = new MyList();
        Object object = new Object();
        myList.add(object);
        Object result = myList.get(0);
        assertEquals(object, result);
    }

}
