package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class mostVisitedPattern {
    String username,website;
    Integer time;

    public mostVisitedPattern(String user, String web,Integer time){
        this.username = user;
        this.website = web;
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(username);
        sb.append(",");
        sb.append(website);
        sb.append(",");
        sb.append(time);
        sb.append("]");

        return sb.toString();
    }
    
    public static List<String> visitedPattern(String[] username, int[] timestamp, String[] website) {

        HashMap<String,List<mostVisitedPattern>> hm = new HashMap<>();
        HashMap<List<String>,Integer> counts = new HashMap<>();
        for (int i = 0; i < username.length; i++) {
                hm.putIfAbsent(username[i], new ArrayList<mostVisitedPattern>());
                hm.get(username[i]).add(new mostVisitedPattern(username[i], website[i], timestamp[i]));
        }


        
        for (String string : hm.keySet()) {
            // System.out.println(string);

            List<mostVisitedPattern> list = hm.get(string);
            Collections.sort(hm.get(string), (v1, v2) -> v1.time - v2.time);
            Set<List<String>> patterns = getSequence(list);

            //hm.get(string).forEach(x -> System.out.println(x.toString()));
             patterns.forEach(x -> {
                if (counts.containsKey(x)) {
                    counts.replace(x, counts.get(x)+1);
                }
                 counts.putIfAbsent(x, 1);
                });
        }        

        Entry<List<String>, Integer> comp = null;
        List<String> resp = null;
        // for (Entry<List<String>, Integer> g : counts.entrySet()) {
        //     if (comp == null || g.getValue().compareTo(comp.getValue()) >= 0)
        //     {
        //         comp = g;
        //         resp = g.getKey();
        //         System.out.println(resp);
        //     }
        // }

        int max = 0;
        for(Entry<List<String>, Integer> entry: counts.entrySet()){
            if(max == 0 || entry.getValue() > max){
                max = entry.getValue();
                resp = entry.getKey();
            } else if(entry.getValue() == max){
                if(entry.getKey().toString().compareTo(resp.toString()) < 0)
                    resp = entry.getKey();
            }
            System.out.println(resp);
        }
        return resp;
    }

    public static Set<List<String>> getSequence(List<mostVisitedPattern> web) {
        Set<List<String>> hs = new HashSet<>();
        for (int i = 0; i < web.size(); i++) {
            for (int j = i+1; j < web.size(); j++) {
                for (int j2 = j+1; j2 < web.size(); j2++) {
                    List<String> list = new ArrayList<>();
                    list.add(web.get(i).website);
                    list.add(web.get(j).website);
                    list.add(web.get(j2).website);
                    hs.add(list);
                }
            }
        }
        return hs;
    }
    public static void main(String[] args) {
                String[] username ={"ua","ua","ua","ub","ub","ub"};
        int[] timestamp ={1,2,3,4,5,6};
        String[] website ={"a","b","a","a","b","c"};

        // String[] username ={"zkiikgv","zkiikgv","zkiikgv","zkiikgv"};
        // int[] timestamp ={436363475,710406388,386655081,797150921};
        // String[] website ={"wnaaxbfhxp","mryxsjc","oz","wlarkzzqht"};
        // String[] username ={"joe","joe","joe","james","james","james","james","mary","mary","mary"};
        // int[] timestamp ={1,2,3,4,5,6,7,8,9,10};
        // String[] website ={"home","about","career","home","cart","maps","home","home","about","career"};

        visitedPattern(username, timestamp, website);
    }
}
