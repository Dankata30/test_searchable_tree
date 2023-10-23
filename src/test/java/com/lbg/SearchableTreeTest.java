package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchableTreeTest {

    @Test
    public void find_existing_item_of_tree_and_return_it_successfully() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        int expected_item = 2;
        int actual_item = cut.find("lecture");

        assertEquals(expected_item, actual_item);
    }

    @Test
    public void search_non_existing_item_of_tree_and_handle_it() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        int expected_item = -1;
        int actual_item = cut.find("test");

        assertEquals(expected_item, actual_item);
    }

    @Test
    void find_last_item_searched_is_actually_last() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        boolean expected_result = true;
        boolean actual_result = cut.findIfLastItem("taxes");

        assertEquals(expected_result, actual_result);
    }

    @Test
    void find_last_item_searched_is_NOT_actually_last() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        boolean expected_result = false;
        boolean actual_result = cut.findIfLastItem("lecture");

        assertEquals(expected_result, actual_result);
    }

    @Test
    void find_last_item_list_is_NOT_populated() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        boolean expected_result = false;
        boolean actual_result = cut.findIfLastItem("lecture");

        // result is true as the size of list is 0 and decrementation makes it -1, same return value as if item not found
        assertEquals(expected_result, actual_result);
    }

    @Test
    void find_first_item_searched_is_actually_first() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        boolean expected_result = true;
        boolean actual_result = cut.findIfFirstItem("selvyn");

        assertEquals(expected_result, actual_result);
    }

    @Test
    void find_first_item_searched_is_NOT_actually_first() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        boolean expected_result = false;
        boolean actual_result = cut.findIfFirstItem("lecture");

        assertEquals(expected_result, actual_result);
    }

    @Test
    void find_first_item_list_is_NOT_populated() {
        DataStorage ds = new DataStorage();
        SearchableTree cut = new SearchableTree(ds);

        boolean expected_result = false;
        boolean actual_result = cut.findIfFirstItem("lecture");

        // result is true as the size of list is 0 and decrementation makes it -1, same return value as if item not found
        assertEquals(expected_result, actual_result);
    }
}