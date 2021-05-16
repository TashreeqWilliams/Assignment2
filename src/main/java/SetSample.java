/*Tashreeq Williams(217290671)*/

import java.util.HashSet;
import java.util.Set;


public class SetSample {
    public Set <String> addToSet(Set<String> colours, String colourType) {
        colours.add(colourType);
        return colours;

    }

    public Set <String>  removeFromSet(Set<String> colours, String colourType) {
        colours.remove(colourType);
        return colours;
    }

    public Set <String> findFromSet(Set<String> colours, String colourType) {
        colours.contains(colourType);
        return colours;
    }
}
