package com.metacube.jdbc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.jdbc.helper.TitleHelper;
import com.metacube.jdbc.model.Title;

public class TestBookPublished {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreatePositive() {
		Title titleObj = null;
		titleObj = TitleHelper.create("Basics Of C");
		assertNotNull(titleObj);
	}
	
	@Test
	public void testCreateNullTest() {
		Title titleObj;
		titleObj = TitleHelper.create(null);
		assertNull(titleObj);
	}
	
	@Test
	public void testCreateEmptyNameTest() {
		Title titleObj = null;
		titleObj = TitleHelper.create("");
		assertNull(titleObj);
	}
	
	@Test
	public void testCreateEmptyNameTestWithSpace() {
		Title titleObj = null;
		titleObj = TitleHelper.create("  ");
		assertNull(titleObj);
	}
	
	@Test
	public void testFetchBooksNullTest() {
		assertNull(null, TitleHelper.fetchBooks(null));
	}
	
	@Test
	public void testFetchBooksEmptyNameTest() {
		assertNull(null, TitleHelper.fetchBooks(""));
	}
	
	@Test
	public void getNameTestPositive() {
		Title titleObj = new Title();
		titleObj.setTitleName("Learn English");
		assertEquals("Learn English", titleObj.getTitleName());
	}
	
	@Test
	public void getNameTestNegative() {
		Title titleObj = new Title();
		titleObj.setTitleName("Learn English");
		assertNotEquals(null, titleObj.getTitleName());
	}
}
