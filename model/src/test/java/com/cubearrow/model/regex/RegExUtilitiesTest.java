package com.cubearrow.model.regex;

import org.junit.Test;

import static com.cubearrow.model.regex.RegExUtilities.getStartingIndexOfFirstSubstring;

public class RegExUtilitiesTest {
    @Test
    public void getFirstSubstringExistingSubstring() {
        assert getStartingIndexOfFirstSubstring("3", "[1-9]", 0) == 0;
        assert getStartingIndexOfFirstSubstring("(x+y)-z", "\\+|\\-", 0) == 2;
    }

    @Test
    public void getFirstSubstringExistingSubstringStartingIndex() {
        assert getStartingIndexOfFirstSubstring("(4+4)-3", "[0-9]", 4) == 6;
    }

    @Test
    public void getFirstSubstringUnavailableSubstring() {
        assert getStartingIndexOfFirstSubstring("x", "[2]", 0) == -1;
        assert getStartingIndexOfFirstSubstring("x", "[a-z]", 1) == -1;
    }
}
