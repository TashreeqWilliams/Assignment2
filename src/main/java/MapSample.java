/*Tashreeq Williams(217290671)*/

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public Map<Integer,String> addToMap(Map<Integer,String> jewels, int x ,String jewelName){
        jewels.put(x,jewelName);
        return jewels;
    }
    public Map<Integer,String> removeFromMap(Map<Integer,String> jewels, int x ,String jewelName){
        jewels.remove(x,jewelName);
        return jewels;
    }
    public Map<Integer,String> findFromMap(Map<Integer,String> jewels, int x ,String jewelName){
        jewels.containsValue(jewelName);
        jewels.containsKey(x);
        return jewels;
    }
}
