/*Tashreeq Williams(217290671)*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ListSampleTest {

    ArrayList<String> fruits = new ArrayList<>();

    @BeforeEach
    public void setup() {
        //this method executes before each test
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Litchi");
        fruits.add("Orange");
        fruits.add("Bluberry");
    }

    @Test
    public void addToList() {
        //Adding an element
        fruits.add("Bannana");
        //then testing if that element was added by comparing it to .size() of list
        assertEquals(6, fruits.size());

    }

    @Test
    public void removeFromList() {
        //removing an element
        fruits.remove("Mango");
        //testing if the element specified was removed then comparing it to .size() of list
        assertEquals(4, fruits.size());

    }

    @Test
    public void findFromList() {
     String find = "Orange";
     boolean found = false;
     //Checking if fruits ArrayList .contains "Orange" if so then return true
     if(fruits.contains(find)){
         found = true;


     }
        //expecting true because "Orange" does exist in the list
        assertEquals(true,fruits.contains(find));
    }
}





