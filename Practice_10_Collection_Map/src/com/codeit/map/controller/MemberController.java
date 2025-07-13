package com.codeit.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.codeit.map.model.Member;

public class MemberController {
	private final Map<String, Member> map = new HashMap<>();
	
	public MemberController() {
		map.put("test1", new Member("1234", "홍길동"));
		map.put("test2", new Member("1234", "최길동"));
		map.put("test3", new Member("1234", "박길동"));
		map.put("test4", new Member("1234", "박길동"));
		map.put("test5", new Member("1234", "홍길동"));
	}

	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}
		map.put(id, m);
		return true;
	}

	public String login(String id, String password) {
		if(map.containsKey(id)) {
			if(password.equals(map.get(id).getPassword())) {
				return map.get(id).getName();
			}
		}
		return null;
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			if(oldPw.equals(map.get(id).getPassword())) {
				map.get(id).setPassword(newPw);
				return true;
			}
		}
		return false;
	}

	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}

	public TreeMap<String, Member> sameName(String name) {
		TreeMap<String, Member> sortedMap = new TreeMap<>();

		for(String key : map.keySet()) {
			if(name.equals(map.get(key).getName())) {
				sortedMap.put(key, map.get(key));
			}
		}
		return sortedMap;
	}
}















