package com.prowings.treesetscenarios;

import java.util.Comparator;

public class StudentCityComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
	
		return s1.city.compareTo(s2.city);
	}

}
