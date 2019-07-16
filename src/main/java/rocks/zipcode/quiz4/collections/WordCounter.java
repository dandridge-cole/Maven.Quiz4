package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] words;
    public WordCounter(String... strings) {
        this.words=strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String,Integer> map=new HashMap<>();
        for(String s:this.words){
            if(map.containsKey(s))map.replace(s,map.get(s)+1);
            else map.put(s,1);
        }
        return map;
    }
}
