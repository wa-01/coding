package org.fundacionjala.coding.carledriss;

import org.junit.Assert;
import org.junit.Test;

public class SpinWordTest {


    @Test
    public void testSpinWordsWordsWithSizeGreaterThan5() {
        SpinWords spinWords = new SpinWords();
        Assert.assertEquals("Hey wollef sroirraw",
                spinWords.spinWords("Hey fellow warriors"));
    }

    @Test
    public void testSpinWordsWithSizeLessThan5() {
        SpinWords spinWords = new SpinWords();
        Assert.assertEquals("This a test",
                spinWords.spinWords("This a test"));
    }
}
