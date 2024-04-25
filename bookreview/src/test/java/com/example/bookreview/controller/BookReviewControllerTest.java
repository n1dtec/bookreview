package com.example.bookreview.controller;

import com.example.bookreview.model.BookReviewData;
import com.example.bookreview.service.BookReviewService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author Harnidh Kaur
 */
@WebMvcTest(BookReviewController.class)
public class BookReviewControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookReviewService bookReviewService;

    @Test
    public void testGetAllBookReviews() throws Exception {
        List<BookReviewData> bookReviewDataList = new ArrayList<>();
        Mockito.when(bookReviewService.getAllBookReviewData()).thenReturn(bookReviewDataList);

        mockMvc.perform(get("/bookreview/all")).andExpect(status().isOk());
    }

    @Test
    public void testAddBookReview() throws Exception {
        BookReviewData bookReviewData = new BookReviewData();
        bookReviewData.setTitle("Sample title");
        bookReviewData.setAuthor("Sample author");
        bookReviewData.setReview_text("Sample review text");
        bookReviewData.setRating(3);
        bookReviewData.setPublisher("Sample publisher");
        bookReviewData.setId(2L);
        Mockito.when(bookReviewService.addBookReview(Mockito.any())).thenReturn(bookReviewData);

        mockMvc.perform(post("/bookreview")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\": \"book1\", \"author\": \"Jane Doe\", \"publisher\": \"New Pub\", \"review_text\": \"sample review text\", \"rating\": 4}"))
                .andExpect(status().isCreated());
    }
}
