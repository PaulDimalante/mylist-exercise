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

    @Test
    public void getShouldReturn3ObjectAfter5Adds() {
        MyList myList = new MyList();
        Object object0 = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        myList.add(object0);
        myList.add(object1);
        myList.add(object2);
        myList.add(object3);
        myList.add(object4);
        Object result = myList.get(2);
        assertEquals(object2, result);
    }

    @Test
    public void removeShouldReturnObjectRemoved() {
        MyList myList = new MyList();
        Object object0 = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        myList.add(object0);
        myList.add(object1);
        myList.add(object2);
        myList.add(object3);
        myList.add(object4);
        Object result = myList.remove(2);
        assertEquals(object2, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void removeShouldThrowArrayIndexOutOfBoundsExceptionWhenIndexIsInvalid() {
        MyList myList = new MyList();
        Object object0 = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        myList.add(object0);
        myList.add(object1);
        myList.add(object2);
        myList.add(object3);
        myList.add(object4);
        Object result = myList.remove(5);
    }

    @Test
    public void isEmptyShouldReturnTrueAfterAddAndRemove() {
        MyList myList = new MyList();
        Object object = new Object();
        myList.add(object);
        myList.remove(0);
        boolean result = myList.isEmpty();
        assertEquals(true, result);
    }

    @Test
    public void sizeReturns0WhenEmptyList() {
        MyList myList = new MyList();
        int result = myList.size();
        assertEquals(0, result);
    }

    @Test
    public void sizeIncreasesBy1AfterAdd() {
        MyList myList = new MyList();
        Object object = new Object();
        int initialResult = myList.size();
        myList.add(object);
        int afterAddResult = myList.size();
        assertEquals(1, afterAddResult - initialResult);
    }

    @Test
    public void sizeDecreasesBy1AfterRemove() {
        MyList myList = new MyList();
        Object object = new Object();
        myList.add(object);
        int initialResult = myList.size();
        myList.remove(0);
        int afterRemoveResult = myList.size();
        assertEquals(-1, afterRemoveResult - initialResult);
    }

    @Test
    public void containsShouldReturnFalseWhenObjectNotInList() {
        MyList myList = new MyList();
        Object object1 = new Object();
        Object object2 = new Object();
        myList.add(object1);
        boolean result = myList.contains(object2);
        assertEquals(false, result);
    }

    @Test
    public void containsShouldReturnTrueWhenObjectInList() {
        MyList myList = new MyList();
        Object object = new Object();
        myList.add(object);
        boolean result = myList.contains(object);
        assertEquals(true, result);
    }


}
