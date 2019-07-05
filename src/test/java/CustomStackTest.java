import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomStackTest {

    private CustomStack myStack;

    @Before
    public void init() {
        myStack = new CustomStack();
    }

    @Test
    public void testWhenListIsEmptyThenIsEmptyMethodsReturnsTrue(){
        assertEquals(true, myStack.isEmpty());
    }
    @Test
    public void testWhenListReturnsTheObjectFromTheTopOfStack(){
        myStack.push(2);
        myStack.push(3);
        Integer a = 3;
        assertEquals(a, myStack.peek());
    }

    @Test
    public void testWhenListReturnsTheObjectFromTheTopOfStackThenRemoveIt(){
        myStack.push(3);
        Integer a = 3;
        assertEquals(a,myStack.pop());
    }
    @Test
    public void testWhenListReturnsTheObjectFromTheTopOfStackThenRemoveIt1(){
        myStack.push(5);
        myStack.push(8);
        Integer a = 8;
        Integer b = 5;
        assertEquals(a,myStack.pop());
        assertEquals(b,myStack.pop());
    }

    @Test
    public void testWhenAnElementIsAddedToListThenGetMethodReturnsThatElement(){
        myStack.push(8);
        Integer a = 8;
        assertEquals(a,myStack.push(8));
    }
    @Test
    public void testWhenAnElementIsInStackThenReturnItsPosition(){
        myStack.push(9);
        Integer a = 0;
        assertEquals(a,myStack.search(9));
    }
    @Test
    public void testWhenAnElementIsInStackWithMoreElementsThenReturnItsPosition(){
        myStack.push(9);
        myStack.push(10);
        Integer a = 0;
        Integer b = 1;
        assertEquals(a,myStack.search(9));
        assertEquals(b,myStack.search(10));
    }
    @Test
    public void testWhenAnElementIsNotInStackWithMoreElementsThenReturnItsPosition(){
        myStack.push(3);
        Integer a = -1;
        assertEquals(a,myStack.search(9));
    }
}
