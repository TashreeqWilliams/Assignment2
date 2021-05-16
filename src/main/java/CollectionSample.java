/*Tashreeq Williams(217290671)*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class CollectionSample {

    public Collection<String> addToColl (Collection<String> myTeam, String teamName){
        myTeam.add(teamName);
        return myTeam;
    }
    public Collection<String> removeFromColl (Collection<String> myTeam, String teamName){
        myTeam.remove(teamName);
        return myTeam;
    }
    public Collection<String> findFromColl (Collection<String> myTeam, String teamName){

        myTeam.contains(teamName);
        return myTeam;
    }


}
