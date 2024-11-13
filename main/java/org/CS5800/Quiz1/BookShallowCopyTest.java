package org.CS5800.Quiz1;

import java.util.ArrayList;
import java.util.List;

public class BookShallowCopyTest {
    public static void main(String[] args) {
        // Initial list of chapters
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookShallowCopy originalBook = new BookShallowCopy("Original Book", chapters);
        BookShallowCopy clonedBook = originalBook.clone();

        originalBook.getChapters().add("Chapter 3");

        System.out.println("Original Book (Shallow Copy): " + originalBook);
        System.out.println("Cloned Book (Shallow Copy): " + clonedBook);

        System.out.println("\nExplanation: Both original and cloned books have 'Chapter 3' in their chapters list because they share the same reference to the list.");
    }
}


