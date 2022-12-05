//package ru.podeli.bnpl.builder;
//;
//import ru.podeli.bnpl.entity.Feedback;
//
//import java.time.LocalDateTime;
//
//public class FeedbackBuilder {
//    private final Feedback feedback = new Feedback();
//public static FeedbackBuilder feedbackBuilder(long id,
//                                                         long clientId,
//                                                         String topic,
//                                                         long orderId,
//                                                         String email,
//                                                         LocalDateTime dateTime,
//                                                         String text) {
//        return new FeedbackBuilder()
//                .id(id)
//                .clientId(clientId)
//                .topic(topic)
//                .orderId(orderId)
//                .email(email)
//                .dateTime(dateTime)
//                .text(text);
//    }
//    public FeedbackBuilder id(long id) {
//        this.feedback.setId(id);
//        return this;
//    }
//    public FeedbackBuilder clientId(long clientId) {
//        this.feedback.setClientId(clientId);
//        return this;
//    }
//    public FeedbackBuilder topic(String topic) {
//        this.feedback.setTopic(topic);
//        return this;
//    }
//    public FeedbackBuilder orderId(long orderId) {
//        this.feedback.setOrderId(orderId);
//        return this;
//    }
//    public FeedbackBuilder email(String email) {
//        this.feedback.setEmail(email);
//        return this;
//    }
//    public FeedbackBuilder dateTime(LocalDateTime dateTime) {
//        this.feedback.setDateTime(dateTime);
//        return this;
//    }
//    public FeedbackBuilder text(String text) {
//        this.feedback.setText(text);
//        return this;
//    }
//
//
//    public Feedback buildFeedback() {
//        return feedback;
//    }
//}
