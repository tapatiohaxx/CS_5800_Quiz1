package org.CS5800.Quiz1;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopyTest {
    public static void main(String[] args) {
        // Initial list of chapters
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookDeepCopy originalBook = new BookDeepCopy("Original Book", chapters);
        BookDeepCopy clonedBook = originalBook.clone();

        originalBook.getChapters().add("Chapter 3");
        System.out.println("Original Book (Deep Copy): " + originalBook);
        System.out.println("Cloned Book (Deep Copy): " + clonedBook);

        System.out.println("\nExplanation: Only the original book has 'Chapter 3' in its chapters list. The cloned book remains unaffected because it has a deep copy of the list.");
    }
}