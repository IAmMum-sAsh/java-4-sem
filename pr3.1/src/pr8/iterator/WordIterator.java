package pr8.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordIterator implements Iterator<WordPart> {

    private Word word;
    private int wordPartsCount;

    public WordIterator(Word word) {
        this.word = word;
        this.wordPartsCount = word.getPartCount();
    }

    @Override
    public boolean hasNext() {
        if (wordPartsCount == 4) {
            return word.hasPrefix() || word.hasRoot() || word.hasSuffix() || word.hasEnding();
        } else if (wordPartsCount == 3) {
            return word.hasPrefix() || word.hasRoot() || word.hasSuffix();
        } else if (wordPartsCount == 2) {
            return word.hasPrefix() || word.hasRoot();
        } else if (wordPartsCount == 1) {
            return word.hasRoot();
        }
        return false;
    }

    @Override
    public WordPart next() throws NoSuchElementException {
        if (wordPartsCount <= 0) {
            throw new NoSuchElementException("No more elements in this word!");
        }

        try {
            if (wordPartsCount == 4) {
                return word.getPrefix();
            }
            if (wordPartsCount == 3) {
                return word.getRoot();
            }
            if (wordPartsCount == 2) {
                return word.getSuffix();
            }
            return word.getEnding();
        } finally {
            wordPartsCount--;
        }
    }
}