//package ru.podeli.bnpl.controller;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import ru.podeli.bnpl.entity.Feedback;
//import ru.podeli.bnpl.service.FeedbackService;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static ru.podeli.bnpl.util.FeedbackCreateTestData.getFeedbackDto;
//
//@WebMvcTest(FeedbackController.class)
//public class FeedbackControllerUnitTest {
//    @MockBean
//    private FeedbackService feedbackService;
//    @Autowired
//    private FeedbackController feedbackController;
//
//    @Test
//    void whenCreateClientSignedActions_Status201Returned() throws Exception {
//        Feedback feedbackDto = getFeedbackDto();
//
//        ResponseEntity<HttpStatus> response =
//                feedbackController.createFeedback(feedbackDto);
//        assertThat(response.getStatusCode(), is(HttpStatus.CREATED));
//    }
//}