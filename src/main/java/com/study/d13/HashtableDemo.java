package com.study.d13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashtableDemo {
    public static void main(String[] args) {
        Map<String, Collection<Integer>> lotto = new Hashtable<>();
        
    }
    
    public static Set<Integer> getBigLotto(int max, int count) { // 大樂透, 539
        Set<Integer> set = new TreeSet<>();
        while (set.size() < count) {            
            set.add(new Random().nextInt(max) + 1);
        }
        return set;
    }
    
    public static List<Integer> getStarsLotto(int count) { // 四星彩, 三星彩
        List<Integer> list = new ArrayList<>();
        while (list.size() < count) {            
            list.add(new Random().nextInt(9) + 1);
        }
        return list;
    }
    
    
}
