package com.youren;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class StrService {

    public static void main(String args[]) {
        StrService t = new StrService();
        System.out.println(t.getMaxNoRepeatStr("abcde"));
        System.out.println(t.getMaxNoRepeatStr("abcabcbb"));
        System.out.println(t.getMaxNoRepeatStr("bbbb"));
    }

    /**
     * 获取子串内最长不重复子串长度
     * 
     * @param str 字符串
     */
    public int getMaxNoRepeatStr(String str) {
        // 字符串为空或者为Null，返回0
        if (StringUtils.isBlank(str)) {
            return 0;
        }

        // 记录字符串出现的位置
        Map<Character, Integer> charIndexMap = new HashMap<Character, Integer>();
        // 不重复字符最大长度
        int max = 0;
        // 上一个字符不重复字符长度
        int beforeLen = 0;
        // 当前不重复字符长度
        int curLen = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 字符已重复出现
            if (charIndexMap.containsKey(c)) {
                // 两个字符出现的位置与最大长度相比
                int len = i - charIndexMap.get(c);
                curLen = len;
            } else {
                // 当前长度
                curLen = beforeLen + 1;
            }
            max = Math.max(curLen, max);
            charIndexMap.put(c, i);
            beforeLen = curLen;
        }
        return max;
    }

}

