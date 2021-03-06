package genericsusage.withoutgenerics;

import java.util.List;

public class Library {

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException();
        }
        if (books.size() < 1) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        if (!(books.get(0) instanceof Book)) {
            throw new ClassCastException("Not a book");
        }
        return (Book) books.get(0);
    }
}
