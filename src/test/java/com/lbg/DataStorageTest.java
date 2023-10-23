package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataStorageTest {

    @Test
    void test_correct_size_of_data_storage_is_returned() {
        DataStorage cut = new DataStorage();

        int expected_size = cut.getSize();
        int actual_size = 6;

        assertEquals(actual_size, expected_size);
    }

    @Test
    void get_the_correct_index_of_item() {
        DataStorage cut = new DataStorage();

        int expected_size = cut.getItemIndex("selvyn");
        int actual_size = 0;

        assertEquals(actual_size, expected_size);
    }
}