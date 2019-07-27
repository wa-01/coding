package org.fundacionjala.coding.carledriss;

import java.util.StringJoiner;

/**
 * Spin Word class.
 */
public class SpinWords {

    private static final int SPIN_WORD_LIMIT = 5;

    /**
     * Spin word method.
     * @param sentence words
     * @return reversed words.
     */
    public String spinWords(final String sentence) {
        String[] words = sentence.split(" ");
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : words) {
            joiner.add(word.length() >= SPIN_WORD_LIMIT ? new StringBuilder(word).reverse() : word);
        }
        return joiner.toString();
    }

}
