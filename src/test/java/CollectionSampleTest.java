/*Tashreeq Williams(217290671)*/

import com.sun.deploy.net.MessageHeader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collection;


import static org.junit.jupiter.api.Assertions.*;

class CollectionSampleTest {

    Collection<String> myTeam = new ArrayList<String>();

    @BeforeEach
    public void setup(){
//this method executes before each test
        myTeam.add("West Ham United");
        myTeam.add("Manchester City");
        myTeam.add("Manchester United");
        myTeam.add("Chelsea");
        myTeam.add("Fulham");

    }

    @Test
    public void addToColl() {
        //Adding an element
        myTeam.add("Liverpool");
        //then testing if that element was added by comparing it to .size() of list
        assertEquals(6,myTeam.size());
    }

    @Test
    public void removeFromColl(){
        //removing an element
        myTeam.remove("Manchester United");
        //testing if the element specified was removed then comparing it to .size() of list
        assertEquals(4,myTeam.size());
    }

    @Test
    public void findFromColl(){

        String find = "Chelsea";
        boolean found = false;

        //Checking if myTeam .contains "Chelsea" if so then return true
        if(myTeam.contains(find)){
            found = true;

        }
        //expecting true because "Chelsea" does exist in the list
        assertEquals(true,myTeam.contains(find));
    }
}