/*Tashreeq Williams(217290671)*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetSampleTest {
    Set<String> colours = new HashSet<>();

    @BeforeEach
    public void setup(){
//this method executes before each test
        colours.add("Blue");
        colours.add("Purple");
        colours.add("Grey");
        colours.add("Red");
        colours.add("Black");

    }
    @Test
    public void addToSet(){
        //Adding an element
        colours.add("Pink");
        //then testing if that element was added by comparing it to .size() of set
        assertEquals(6,colours.size());
    }

    @Test
    void removeFromSet() {
        //removing an element
        colours.remove("Blue");
        //testing if the element specified was removed then comparing it to .size() of set
        assertEquals(4,colours.size());

    }
    @Test
    void findFromSet(){
        String find = "Red";
        boolean found = false;
        //Checking if myTeam .contains "Red" if so then return true
        if(colours.contains(find)){
            found = true;


        }
        //expecting true because "Red" does exist in the set
        assertEquals(true,colours.contains(find));
    }

}

