package org.CS5800.Quiz1;

import java.util.List;

public class BookShallowCopy extends Book implements Cloneable {
    public BookShallowCopy(String title, List<String> chapters) {
        super(title, chapters);
    }

    @Override
    public BookShallowCopy clone() {
        try {
            return (BookShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }
}