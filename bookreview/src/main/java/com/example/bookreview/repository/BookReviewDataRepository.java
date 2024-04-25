package com.example.bookreview.repository;

import com.example.bookreview.model.BookReviewData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Harnidh Kaur
 *
 * Class Name: Book Review Data Repository
 * Description: This is a repository interface for accessing book review data from the database.
 */
public interface BookReviewDataRepository extends JpaRepository<BookReviewData, Integer> {
}
