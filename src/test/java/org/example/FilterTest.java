package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    void filterOut() {
        Filter filter = new Filter(6);
        List<Integer> source = new ArrayList<>();
        source.add(3);
        source.add(13);
        source.add(5);
        source.add(1);
        List<Integer> actual = filter.filterOut(source);
        List<Integer> expected = new ArrayList<>();
        expected.add(13);
        Assertions.assertEquals(expected.toString(), actual.toString());
    }
}