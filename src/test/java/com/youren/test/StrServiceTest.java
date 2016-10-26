package com.youren.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.youren.StrService;

public class StrServiceTest {

    private StrService strService = null;

    @Before
    public void setup() {
        strService = new StrService();
    }

    @Test
    public void test() {
        assertEquals(0, strService.getMaxNoRepeatStr(""));
    }

}
