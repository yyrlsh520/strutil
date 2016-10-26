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

    /**
     * 空串
     */
    @Test
    public void test() {
        assertEquals(0, strService.getMaxNoRepeatStr(""));
    }

    /**
     * 相同字符
     */
    @Test
    public void test1() {
        assertEquals(1, strService.getMaxNoRepeatStr("bbbbbbbbbb"));
    }

}
