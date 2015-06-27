package com.example.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionDemo {

	private List<Person> list;
	private Set set;
	Map<String, Person> map;
	Properties properties;

	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map<String, Person> getMap() {
		return map;
	}

	public void setMap(Map<String, Person> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionDemo [list=" + list + ", set=" + set + ", map=" + map
				+ ", properties=" + properties + "]";
	}

}
