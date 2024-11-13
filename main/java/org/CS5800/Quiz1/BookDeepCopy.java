package org.CS5800.Quiz1;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book implements Cloneable {
    public BookDeepCopy(String title, List<String> chapters) {
        super(title, chapters);
    }

    @Override
    public BookDeepCopy clone() {
        List<String> clonedChapters = new ArrayList<>(getChapters());
        return new BookDeepCopy(getTitle(), clonedChapters);
    }
}
