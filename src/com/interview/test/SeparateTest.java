package com.interview.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import com.interview.Separate;

public class SeparateTest {

	
	
	@Test
	public void testListForKMorethanListSize(){
		Separate s = new Separate();
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(2);
		System.out.println(s.separate(l, 90));
	}
	
	@Test
	public void testListnotGroupable(){
		Separate s = new Separate();
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(2);
		System.out.println(s.separate(l, 3));
	}
	
	@Test
	public void testListGroupable(){
		Separate s = new Separate();
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(1);
		System.out.println(s.separate(l, 2));
	}
}
