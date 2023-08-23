import java.time.LocalDate;

public class Comment {
    private String text;
    private LocalDate comment_data;
    private static int comment_Id = 1;
    private int commentId;

    public Comment(String text, LocalDate comment_data) {
        this.text = text;
        this.comment_data = comment_data;
        this.commentId = comment_Id++;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getComment_data() {
        return comment_data;
    }

    public void setComment_data(LocalDate comment_data) {
        this.comment_data = comment_data;
    }

    public static int getComment_Id() {
        return comment_Id;
    }

    public static void setComment_Id(int comment_Id) {
        Comment.comment_Id = comment_Id;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "Comment:" +
                "text: " + text +
                "comment_data: " + comment_data +
                "commentId: " + commentId;
    }
}
