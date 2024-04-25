package com.example.bookreview.service;

import com.example.bookreview.repository.BookReviewDataRepository;
import com.example.bookreview.model.BookReviewData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Harnidh Kaur
 *
 * Class: Book Review Service
 * Description: This is the service layer to handle business logic of the application.
 */
@Service
public class BookReviewService {
    @Autowired
    private BookReviewDataRepository bookReviewDataRepository;

    /**
     * This method is used for getting all book review data from the database
     *
     * @return List<BookReviewData> - all book reviews that were saved in the database
     */
    public List<BookReviewData> getAllBookReviewData() {
        return bookReviewDataRepository.findAll();
    }

    /**
     * This method is used for saving book review data in the database
     *
     * @param bookReviewData - data object to be saved in the database
     *
     * @return BookReviewData - book review data that was saved in the database
     */
    public BookReviewData addBookReview(BookReviewData bookReviewData) {
        return bookReviewDataRepository.save(bookReviewData);
    }

}
