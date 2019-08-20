package com.Scripts;

import java.util.Map;

import org.apache.commons.collections4.map.LinkedMap;



public class Jenkin_Test {

	public static void main(String[] args) {
	
		String s1 = "Manuallll";
		char[] ch = s1.toCharArray();

		Map<Character, Integer> m1 = new LinkedMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			ch[i] = s1.charAt(i);
			if (m1.containsKey(ch[i])) {
				Integer v = m1.get(ch[i]);
				m1.put(ch[i], ++v);
			} else {
				m1.put(ch[i], 1);
			}
		}
		System.out.println(m1);
	}

}
