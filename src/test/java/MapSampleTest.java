/*Tashreeq Williams(217290671)*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapSampleTest {
    Map<Integer,String> jewels = new HashMap();

    @BeforeEach
    public void setup(){
        //this method executes before each test
        jewels.put(1,"Gold");
        jewels.put(2,"Silver");
        jewels.put(3,"Ruby");
        jewels.put(4,"Topaz");
        jewels.put(5,"Emerald");

    }
    @Test
    public void addToMap(){
        //Adding an element with the function .put()
        jewels.put(6,"Sapphire");
       //testing if that element was added by comparing it to .size() of Map
        assertEquals(6,jewels.size());
    }
    @Test
    public void removeFromMap(){
        //removing an element
        jewels.remove(3,"Ruby");
        //testing if the element specified was removed then comparing it to .size() of Map
        assertEquals(4,jewels.size());

    }
    @Test
    public void findFromMap(){

        boolean found = false;
        //If Map contains value "Silver" & Key 2 it'll return true
        if(jewels.containsValue("Silver") || jewels.containsKey(2)){
            found = true;


        }
        //Expecting true on both assert functions because Map contains both the specified Value & Key
        assertEquals(true,jewels.containsValue("Silver"));
        assertEquals(true,jewels.containsKey(2));
    }

    }


