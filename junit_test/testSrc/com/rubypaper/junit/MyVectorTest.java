package com.rubypaper.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyVectorTest {
	private MyVector v;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.out.println("setUpBeforeClass 수행");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("tearDownAfterClass 수행");
	}

	@Before
	public void setUp() throws Exception {
		v = new MyVector();
		//System.out.println("setUp 수행");
	}

	@After
	public void tearDown() throws Exception {
		//System.out.println("tearDown 수행");
	}

	@Test
	public void testIsEmpty() {
		assertTrue(v.isEmpty());
		v.addElement("abc");
		assertTrue(!v.isEmpty());
		System.out.println("testIsEmpty 수행");
		//fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		//fail("Not yet implemented");
		String str1 = "abc";
		v.addElement(str1);
		assertTrue(v.contains(str1));
		//System.out.println("testContains 수행");
	}

	@Test
	public void testIndexOf() {
		//fail("Not yet implemented");
		String str1 = "abc";
		String str2 = "def";
		v.addElement(str1);
		v.addElement(str2);
		assertEquals(1, v.indexOf(str2));
		//System.out.println("testIndexOf 수행");
	}

	@Test
	public void testElementAt() {
		//fail("Not yet implemented");
		String str1 = "abc";
		String str2 = "def";
		v.addElement(str1);
		v.addElement(str2);
		assertSame(str1, v.elementAt(0));
		assertSame(str2, v.elementAt(1));
		//System.out.println("testElemntAt 수행");
	}

	@Test
	public void testAddElement() {
		//fail("Not yet implemented");
		v.addElement("abc");
		v.addElement(new Integer(1));
		//assertEquals(2, v.size());
		//System.out.println("testAddElement 수행");
	}

}
