package com.bug0.java.leetcode.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Daily20200804 {

	public static void main(String[] args) {
		System.out.println(canFinish(3, new int[][] { {1,0},{2,1}}));
	}

	// 暴力法
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
    	Map<Integer, Set<Integer>> map = new HashMap<>();
    	if (null == prerequisites || prerequisites.length == 0) {
    		return true;
    	}
    	for (int[] item : prerequisites) {
    		if (item[0] < numCourses) {
    			Set<Integer> set = map.get(item[0]);
    			if (null == set) {
    				set = new HashSet<Integer>();
    			}
    			set.add(item[1]);
    			map.put(item[0], set);
    		}
    	}
    	Set<Integer> orderedSet = new HashSet<>();
    	
    	List<Integer> list = new ArrayList<>();
    	for (int n = 0; n < numCourses; n++) {
    		list.add(n);
    	}
    	Integer param = null;
    	Set<Integer> preRequisiteSet = null;
    	int j = 0;
    	while (true) {
    		param = list.get(j);
    		if (orderedSet.contains(param)) {
    			break;
    		}
    		preRequisiteSet = map.get(param);
    		if (null == preRequisiteSet) {
    			list.remove(j);
    			list.add(param);
    		} else {
    			int maxIndex = 0;
    			for (int max: preRequisiteSet) {
    				if (max < numCourses) {
    					if (orderedSet.contains(max) && list.indexOf(max) > 0) {
    						return false;
    					}
    					if (list.indexOf(max) > maxIndex) {
    						maxIndex = list.indexOf(max);
    					}
    				}
				}
    			list.remove(param);
    			list.add(maxIndex, param);
    			orderedSet.add(param);
    		}
    	}
    	return true;
    }
}
