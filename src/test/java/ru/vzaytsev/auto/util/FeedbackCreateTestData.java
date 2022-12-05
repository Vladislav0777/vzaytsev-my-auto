//package ru.podeli.bnpl.util;
//
//import ru.podeli.bnpl.entity.Feedback;
//
//import java.time.LocalDateTime;
//
//import static ru.podeli.bnpl.builder.FeedbackBuilder.feedbackBuilder;
//
//public final class FeedbackCreateTestData {
//    public static Feedback getFeedbackDto() throws Exception {
//        Feedback feedbackDto = feedbackBuilder(
//                1,
//                1,
//                "test",
//                1,
//                "sum@mail.ru",
//                LocalDateTime.parse("2021-12-27T18:59:29.000000"),
//                "cool").buildFeedback();
//        return feedbackDto;
//    }
//}
