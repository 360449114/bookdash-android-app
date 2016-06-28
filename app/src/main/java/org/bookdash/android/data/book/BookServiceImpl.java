package org.bookdash.android.data.book;

import org.bookdash.android.data.database.BookDatabase;
import org.bookdash.android.domain.model.firebase.FireBookDetails;
import org.bookdash.android.domain.model.firebase.FireLanguage;

import java.util.List;

import rx.Observable;


public class BookServiceImpl implements BookService {

    private final BookDatabase bookDatabase;

    public BookServiceImpl(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    @Override
    public Observable<List<FireLanguage>> getLanguages() {
        return bookDatabase.getLanguages();
    }

    @Override
    public Observable<List<FireBookDetails>> getBooksForLanguage(final FireLanguage fireLanguage) {
        return bookDatabase.getBooksForLanguage(fireLanguage);
    }
}