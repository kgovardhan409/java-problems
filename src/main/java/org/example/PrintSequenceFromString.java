package org.example;

import java.util.HashMap;
import java.util.Map;

public class PrintSequenceFromString {
    public static void main(String[] args) {
        String str = "3(ab)4(cd)";
        HashMap<Long, String> map = new HashMap<>();
        Long key = 0L;
        for(int j = 0; j < str.length(); j++){
            String element = String.valueOf(str.charAt(j));
            String value = "";
            if(checkIsLong(element)){
                key = Long.valueOf(element);
            } else if(element.equals("(")){
                for(int k = j+1; k < str.length(); k++){
                    if(String.valueOf(str.charAt(k)).equals(")")){
                        map.put(key, value);
                        j = k;
                        break;
                    } else {
                        value = value + str.charAt(k);
                    }
                }
            }
        }

        String out = "";
        for(Map.Entry<Long, String> entry : map.entrySet()){
            for(int z = 0; z < entry.getKey(); z++){
                out += entry.getValue();
            }
        }

        System.out.println(out);
    }

    static boolean checkIsLong(String str){
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
