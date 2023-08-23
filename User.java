import java.util.Arrays;

public class User {
    private String username;
    private String email;
    private String password;
    private static int idPlus = 1;
    private int id;
    private Profile profile;

    public User(String username, String email, String password, Profile profile) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = idPlus++;
        this.profile = profile;
        profile.setId(id);
    }

    public User(Profile profiless) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getIdPlus() {
        return idPlus;
    }

    public static void setIdPlus(int idPlus) {
        User.idPlus = idPlus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public String searchPost(String query) {
        boolean postFound = false;
        for (Post post1 : profile.getPosts()) {
            if (query.equals(post1.getDecription())) {
                postFound = true;
                System.out.println("Post found:");
                System.out.println(post1);
                break;
            }
        }

        if (!postFound) {
            System.out.println(" Post not found ");
        }
        return query;
    }
    public String deletePostById(Long id){
        boolean found = false;
        Post[]posts= getProfile().getPosts();
        Post[]newPosts=new Post[posts.length-1];
        for (int i = 0; i < posts.length; i++) {
            if (posts[i].getPostId()!=id && !found){
                newPosts[i]=posts[i];
            }else{
                found=true;
            }
            if (found && i+1<posts.length){
                newPosts[i]=posts[i+1];
            }
        }
        return " Post deleted: " + Arrays.toString(newPosts);
    }

    @Override
    public String toString() {
        return "\nUser - " +
                "username: " + username +
                "email: " + email +
                "password: " + password +
                "id: " + id ;
    }
}
