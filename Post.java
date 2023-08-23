import java.time.LocalDate;
import java.util.Arrays;

public class Post {
    private String image;
    private String decription;
    private LocalDate created;
    private static int post_Id = 1;
    private int postId;
    Comment[] comments;

    public Post(Post[] posts) {

    }

    public Post(String image, String decription, LocalDate created, Comment[] comments) {
        this.image = image;
        this.decription = decription;
        this.created = created;
        this.postId = post_Id++;
        this.comments = comments;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public static int getPost_Id() {
        return post_Id;
    }

    public static void setPost_Id(int post_Id) {
        Post.post_Id = post_Id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public void findCommentByPostId(Long postId){
        boolean x =false;
        for (int i = 0; i < comments.length; i++) {
            if (comments[i].getCommentId() == postId) {
                x = true;
                System.out.println(comments[i]);
                break;
            }
        }
        if (!x){
            System.out.println("This comment was not found by id ");
        }
    }

    public void updateComment(Long commentId, String newText){
        boolean x  =false;
        for (Comment comment:comments) {
            if(comment.getCommentId() == commentId){
                x = true;
                comment.setText(newText);
                System.out.println("Comment saved successfully");
                System.out.println(comment.getText());
            }
        }
        if(!x){
            System.out.println(" Comment id not found");
        }
    }

    public void deleteComment(Long commentId) {
        boolean x = false;

        for (Comment comment : comments) {
            if (comment != null && comment.getCommentId() == commentId) {
                x = true;
                comment.setText(null);
                System.out.println(" Comment successfully deleted ");
                System.out.println(comment);
                break;
            }
        }

        if (!x) {
            System.out.println(" ID comment not found");
        }
    }




    @Override
    public String toString() {
        return "Post: " +
                "image: " + image +
                "decription: " + decription +
                "created: " + created +
                "comments: " + Arrays.toString(comments) +
                "post id: " + postId;
    }
}
