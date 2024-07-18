package com.example.test;

import com.example.Product;
import com.example.Input;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    @Test
    void fileInput() {
        List<Product> list = new ArrayList<>();
        Input input = new Input(list);
        input.fileInput();
        //assertNotNull(list);
        assertEquals("DISKETTE", list.get(5).getName());
    }
}