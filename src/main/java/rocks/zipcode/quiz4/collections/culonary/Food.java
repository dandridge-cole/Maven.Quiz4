package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spiceList = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return this.spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceMap = new HashMap<>();
        for(Spice spice:this.spiceList){
            SpiceType cls = (SpiceType)spice.getClass();
            if(spiceMap.containsKey(cls))spiceMap.replace(cls,spiceMap.get(cls)+1);
            else spiceMap.put(cls,1);
        }
        return spiceMap;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
