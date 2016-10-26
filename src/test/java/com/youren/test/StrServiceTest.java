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

    /**
     * test abcabcbb
     */
    @Test
    public void test2() {
        assertEquals(3, strService.getMaxNoRepeatStr("abcabcbb"));
    }

    /**
     * 测试单个字符
     */
    @Test
    public void test3() {
        assertEquals(1, strService.getMaxNoRepeatStr("a"));
    }

    /**
     * 测试30000个字符
     */
    @Test
    public void test4() {
        String test = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 30000 - test.length(); i++) {
            buffer.append(test.charAt(i % test.length()));
        }
        assertEquals(26, strService.getMaxNoRepeatStr(test));
    }
}
