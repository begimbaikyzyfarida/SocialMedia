import java.time.LocalDate;

public class Profile {
    private int id;
    private String full_name;
    private LocalDate date_of_birth;
    private String gender;
    private String bio;
    private Post[] posts;

    public Profile(String full_name, LocalDate date_of_birth, String gender, String bio, Post[] posts) {
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.bio = bio;
        this.posts = posts;
    }

    public Profile(String fullName) {
    }

    public String getFull_name() {
        return full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post posts) {
        this.posts = new Post[]{posts};
    }


    @Override
    public String toString() {
        return "Profile:" +
                "full_name: " + full_name  +
                "date_of_birth: " + date_of_birth +
                "gender: " + gender +
                "bio: " + bio;
    }
}
