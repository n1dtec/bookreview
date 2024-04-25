package com.example.bookreview.controller;

import com.example.bookreview.model.BookReviewData;
import com.example.bookreview.service.BookReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Harnidh Kaur
 *
 * Class: Book Review Controller
 * Description: This is a REST controller to expose the API endpoints.
 */
@RestController
@RequestMapping("/bookreview")
public class BookReviewController {
    @Autowired
    private BookReviewService bookReviewService;

    /**
     * This API is used for getting all saved book reviews.
     *
     * @return responseEntity - returns the object containing list of all book reviews.
     */
    @GetMapping("/all")
    public ResponseEntity<List<BookReviewData>> getBookReviewData() {
        List<BookReviewData> bookReviewDataList = bookReviewService.getAllBookReviewData();

        return new ResponseEntity<>(bookReviewDataList, HttpStatus.OK);
    }

    /**
     * This API is used for saving book review data based on request body.
     *
     * @param bookReviewData - book review data to be saved
     *
     * @return responseEntity - returns the object that was saved in the database
     */
    @PostMapping("")
    public ResponseEntity<BookReviewData> addBookReview(@RequestBody BookReviewData bookReviewData) {
        BookReviewData savedData = bookReviewService.addBookReview(bookReviewData);

        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }
}
