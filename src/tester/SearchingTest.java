package tester;

import container.SearchImplement;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchingTest {
    @Test
    public void linearSearchTest(){
        int[] list = {1,2,3,4,5};
        SearchImplement test= new SearchImplement();
        assertTrue(test.linearSearch(list,5));
        assertFalse(test.linearSearch(list,6));
    }@Test
    public void binarySearchTest(){
        int[] list = {1,2,3,4,5};
        SearchImplement test= new SearchImplement();
        assertTrue(test.linearSearch(list,2));
        assertFalse(test.linearSearch(list,6));
    }

}
