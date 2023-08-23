import java.util.Arrays;

public class dataBase {
    private User[] user;
    private Post[] post;
    private Profile [] profiles;
    Comment comment;

    public dataBase() {
    }

    public dataBase(User[] user) {
        this.user = user;
    }

    public dataBase(User[] user,Profile[] profiles) {
        this.user = user;
        this.profiles = profiles;
    }

    public User[] getUser() {
        return user;
    }

    public void setUser(User[] user) {
        this.user = user;
    }

    public Post[] getPost() {
        return post;
    }

    public void setPost(Post[] post) {
        this.post = post;
    }

    public Profile[] getProfiles() {
        return profiles;
    }

    public void setProfiles(Profile[] profiles) {
        this.profiles = profiles;
    }
    public User[] saveUser(User userr) {

        for (User user1 : user) {
            if (user1.getUsername().equals(userr.getUsername())) {
                System.out.println(" This user is in the database");
                break;
            }
        }
        User[] users;
        users = Arrays.copyOf(user, user.length + 1);
        users[users.length - 1] = userr;
        System.out.println(Arrays.toString(users));
        user = Arrays.copyOf(users, users.length);

        return user;
    }
    public User findById(Long Id) {
        boolean found = false;
        for (User use : user) {
            if (use.getId() == Id) {
                found = true;
                System.out.println(" Account successfully found");
                System.out.println("Name of this id: " + use.getUsername());
                break;
            }
        }
        if (!found) {
            System.out.println("This user is in the database");
        }
        return null;
    }
    public void updateByProfile(Long userdId, Profile profile) {
        boolean found = false;
        for (User user : user) {
            if (user.getId() == userdId) {
                found = true;
                System.out.println();
                System.out.println("Person's name: " + user.getUsername());
                System.out.println("Profile of an old man: " + user.getProfile());
                user.setProfile(profile);
                System.out.println("Profile updated successfully.");
                System.out.println("The name of the person: " + user.getUsername());
                System.out.println("Updated person profile: " + user.getProfile());
                break;
            }
        }
        if (!found) {
            System.out.println("User with specified id not found ");
        }
    }
    public int deleteUser(Long userId) {
        int index = 0;
        User[] updatedUsers = new User[user.length - 1];

        for (int i = 0; i < user.length; i++) {
            if (user[i].getId() != userId) {
                updatedUsers[index] = user[i];
                index++;
            }
        }

        for (int i = Math.toIntExact(userId-1); i < updatedUsers.length; i++) {
            updatedUsers[i].setId(updatedUsers[i].getId() - 1);
        }
        user = Arrays.copyOf(updatedUsers, updatedUsers.length);

        System.out.println("User with id " + userId + " deleted ");
        System.out.println("New array after deletion: " + Arrays.toString(user));

        return index;
    }
    public User[] getAllUsers() {
        return user;
    }
    public void saveProfile(Long userId, Profile profile) {
        boolean idProv = true;
        for (User user1 : user) {
            if (user1.getId() == userId) {
                idProv = false;
                System.out.println();
                System.out.println("This user with this (ID) is in the database");
                if (user1.getProfile().equals(profile)) {
                    System.out.println("This profile is already on your account");
                } else {
                    System.out.println(" Profile updated successfully");
                    user1.setProfile(profile);
                    System.out.println(profile);
                }
            }
        }
        if (idProv) {
            System.out.println(" This user with this id is not in the database ");
        }
    }
    public void findProfileByUserId(Long userId) {
        boolean proverka = false;
        for (User user1 : user) {
            if (user1.getId() == userId) {
                proverka = true;
                System.out.println(" IDI will find successfully");
                System.out.println(user1.getProfile());
            }
        }
        if (!proverka) {
            System.out.println(" This user is not in the database");
        }
    }
    public String deleteProfileByUserId(Long userId) {
        for (User user1 : user) {
            if (user1.getId() == userId) {
                user1.setProfile(null);
                return "Profile deleted" + userId;
            }
        }
        return " User with this id " + userId + " not found ";
    }
    public void savePost(Long userId, Object post){
        boolean userFound = false;
        for (User user1 : user) {
            if (user1.getId() == userId) {
                userFound = true;
                System.out.println("This user with this (ID) is in the database");

                if (user1.getProfile().equals(post)) {
                    System.out.println("This post is already on his account");
                } else {
                    System.out.println(" Post added successfully");
                    user1.getProfile().setPosts((Post) post);
                    System.out.println(post);
                }
                break;
            }
        }

        if (!userFound) {
            System.out.println("User with given (ID) not found");
        }
    }
    public void getPostsByUserId(Long userId){
        boolean x = false;

        for (User user1 : user) {
            if (user1.getId() == userId) {
                x = true;
                System.out.println("ID successfully found");
                System.out.println("This user's posts:");
                System.out.println();
                Post[] posts = user1.getProfile().getPosts();
                if (posts != null) {
                    for (Post post : user1.getProfile().getPosts()) {
                        System.out.println(post);
                    }
                }else {
                    System.out.println("This user has no posts");
                }
                break;
            }
        }
        if (!x) {
            System.out.println(" User with given (ID) not found");
        }
    }
    public Comment saveComment(long postId, long userId, Comment comment) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].getId() == userId) {
                for (Post p : profiles[i].getPosts()) {
                    if (p.getPostId() == postId) {
                        Comment[] oldComments = p.getComments();
                        Comment[] newComments = new Comment[oldComments.length + 1];
                        for (int j = 0; j < oldComments.length; j++) {
                            newComments[j] = oldComments[j];
                        }
                        newComments[oldComments.length] = comment;
                        p.setComments(newComments);
                        System.out.println(profiles[i]);
                        return comment;
                    }
                }
            }
        }
        return comment;
    }
}
