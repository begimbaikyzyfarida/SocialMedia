import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        dataBase dataBase = new dataBase();
        Comment comment1 = new Comment("our smile is enough to make anyone's day.", LocalDate.of(2021,7,12));
        Comment comment2 = new Comment("Wow, what a masterpiece.", LocalDate.of(2023,6,14));
        Comment comment3 = new Comment("Stunning photo! You look amazing!", LocalDate.of(2021,4,16));
        Comment comment4 = new Comment("This is such a cool shot! Love it!", LocalDate.of(2020,5,18));
        Comment comment5 = new Comment("Your posts always brighten up my day! Thank you!", LocalDate.of(2020,8,20));
        Comment comment6 = new Comment("Love your style! Keep slaying!", LocalDate.of(2021,9,22));
        Comment comment7 = new Comment("Your creativity never fails to impress me!", LocalDate.of(2022,7,23));
        Comment comment8 = new Comment("Such a beautiful location! .", LocalDate.of(2023,1,31));
        Comment comment9 = new Comment("Your captions always make me think! ", LocalDate.of(2021,2,23));
        Comment comment10 = new Comment("Your hard work is paying off!", LocalDate.of(2022,3,2));
        Comment[] comments1 = {comment1, comment2};
        Comment[] comments2 = {comment3, comment4};
        Comment[] comments3 = {comment5, comment6};
        Comment[] comments4 = {comment7, comment8};
        Comment[] comments5 = {comment9, comment10};
        Comment[] comments = {comment1,comment2,comment3,comment4,comment5,comment6,comment7,comment8,comment9,comment10};
        Post post1 = new Post("photo1 ", "Typical me.", LocalDate.of(2021,7,12), comments1);
        Post post2 = new Post("photo2", "Selfie Sunday.", LocalDate.of(2021,7,12), comments1);
        Post post3 = new Post("photo3", "I was born to shine", LocalDate.of(2021,7,12), comments2);
        Post post4 = new Post("photo4", "Me doing me.", LocalDate.of(2021,7,12), comments2);
        Post post5 = new Post("photo5", "Confidence Level: Selfie with no Filter.", LocalDate.of(2021,7,12), comments3);
        Post post6 = new Post("photo6", "Me, myself and I.", LocalDate.of(2021,7,12), comments3);
        Post post7 = new Post("photo7", "Just me.", LocalDate.of(2021,7,12), comments4);
        Post post8 = new Post("photo8", "But first, let me take a selfie.", LocalDate.of(2021,7,12), comments4);
        Post post9 = new Post("photo9", "Be yourself – there's no one better.", LocalDate.of(2021,7,12), comments5);
        Post post10 = new Post("photo10", "Never let anyone treat you like you're ordinary.", LocalDate.of(2021,7,12), comments5);
        Post[] posts1 = {post1, post2};
        Post[] posts2 = {post3, post4};
        Post[] posts3 = {post5, post6};
        Post[] posts4 = {post7, post8};
        Post[] posts5 = {post9, post10};
        Profile profile1 = new Profile("Azamat Begimbai uulu", LocalDate.of(2021,7,12), "Male", "👋 Hey there! I'm Azamat 🧑: Exploring life one adventure at a time! 🌍 Nature lover 🌿 | Curious explorer 🔍 | Music enthusiast 🎶 | Capturing moments 📷 | Spreading positivity vibes ✨ Join me on my journey! 🚀 #LifeThroughAzamatsEyes", posts1);
        Profile profile2 = new Profile("Farida Begimbai kyzy", LocalDate.of(2021,7,12), "Female", "👩‍💻 Coding through Life's Algorithms | 📚 University Explorer | 🎓 20 and Passionate about Programming | 🌟 Turning Lines of Code into Dreams | Join me in my Digital Journey! 💻✨ #CodingWithFarida", posts2);
        Profile profile3 = new Profile("Adahan Jusupmamatov", LocalDate.of(2021,7,12), "Male", "Adventures with Adahan 👶🌈 | Embracing the Wonders of Childhood 🌼 | Giggles and Grins Galore 😄 | Two and Curious 🌟 | Spreading Joy, One Smile at a Time 😊🌼", posts3);
        Profile profile4 = new Profile("Alihan Jusupmamatov", LocalDate.of(2021,7,12), "Male", "👦 Alihan's World 🌍 | 5 Years Young and Full of Wonder 🌟 | Daddy's Sidekick for Life 👨‍👦 | Exploring, Learning, and Loving Every Moment ❤️ | Join us on our Father-Son Adventures! 🚀🌈", posts4);
        Profile profile5 = new Profile("Bekzat Jusupmamatov", LocalDate.of(2021,7,12), "Male", "👋 Hey, I'm Bekzat 🧒: Chasing Dreams and YouTube Streams! 🎥🌟 | Making Memories One Click at a Time 📸 | Capturing Life's Adventures 🌈 | Spreading Good Vibes and YouTube Love 🎉 | Join me as I share my world! 🌍🔥 #BekzatVlogs #YouTubeAddict", posts5);
        Profile[] profiles = {profile1, profile2, profile3, profile4, profile5};
        User user1 = new User("@b_azamat  ", "begimbaiuuluazamat@gmail.com  ", "azamat2004  ", profile1);
        User user2 = new User("@b_faridan  ", "faridabegimbaikyzy@gmail.com  ", "farida2003  ", profile2);
        User user3 = new User("@b_adahan  ", "adahanjusupmamatov@gmail.com  ", "adahan1234  ", profile3);
        User user4 = new User("@b_alihan  ", "alihanjusupmamatov@gmail.com  ", "alihan1234  ", profile4);
        User user5 = new User("@b_bekzat  ", "bekzatjusupmamatov@gmail.com  ", "bekzat1234  ", profile5);
        User[] users = {user1, user2, user3, user4, user5};
        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
        System.out.println("User 3: " + user3);
        System.out.println("User 4: " + user4);
        System.out.println("user 5: " + user5);
        dataBase dataBase2 = new dataBase(users);
        dataBase dataBase3 = new dataBase(users, profiles);
        Scanner scan  = new Scanner(System.in);
        while (true){
            System.out.println("1. Create an account");
            System.out.println("2. Find username by id");
            System.out.println("3. Update profile by id");
            System.out.println("4. Deleting an account by user ID");
            System.out.println("5. Save profile by id");
            System.out.println("6. Find profile by id");
            System.out.println("7. Delete profile by id");
            System.out.println("8. Save post to specific id");
            System.out.println("9. View posts by user by ID");
            System.out.println("10.Save comment to post");
            System.out.println("11. Deleting a post by its id");
            System.out.println("12. Find a comment by post id");
            System.out.println("13. Find decription and display its comments");
            System.out.println("14. Commentary Updates");
            System.out.println("15. Delete comment");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("To create an account, enter the following details:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    Profile newProfile = new Profile(name + "Profile");
                    User newUser = new User(username + "  ", email+ "  ", password+ "  ", newProfile);
                    dataBase2.saveUser(newUser);
                    System.out.println("Account saved successfully");
                    System.out.println(Arrays.toString(dataBase2.getUser()));
                    break;
                case 2:
                    System.out.print("Write user ID: ");
                    long iid = scan.nextInt();
                    dataBase2.findById(iid);
                    break;
                case 3:
                    System.out.print("Enter the id of the user you want to change the profile of: ");
                    long idUpdate  = scan.nextLong();
                    dataBase2.updateByProfile(idUpdate, profile1);
                    break;
                case 4:
                    System.out.println("Enter your id you want to delete: ");
                    long idDelete = scan.nextLong();
                    dataBase2.deleteUser(idDelete);
                    break;
                case 5:
                    System.out.print("Write the id where you want to save the profile: ");
                    long profileSave = scan.nextLong();
                    dataBase2.saveProfile(profileSave, profile4);
                    break;
                case 6:
                    System.out.print("Write id to see profile: ");
                    long findProfileById = scan.nextLong();
                    dataBase2.findProfileByUserId(findProfileById);
                    break;
                case 7:
                    System.out.print("Write the id whose profile you want to delete: ");
                    long profileRemove = scan.nextLong();
                    System.out.println(dataBase2.deleteProfileByUserId(profileRemove));
                    break;
                case 8:
                    System.out.println("To save a post, enter the following details:");
                    System.out.print("Enter the id where you want to save the post: ");
                    long postSave = scan.nextLong();
                    System.out.print("image: ");
                    String image = scan.next();
                    System.out.print("Description: ");
                    String decription = scan.next();
                    Post newPost = new Post(image, decription, LocalDate.of(2023, 9, 8), new Comment[]{comment2});
                    System.out.println("Post successfully saved");
                    dataBase2.savePost(postSave, newPost);
                    break;
                case 9:
                    System.out.print("Write id to get all his posts:");
                    long getPostAll = scan.nextLong();
                    dataBase2.getPostsByUserId(getPostAll);
                    break;
                case 10:
                    System.out.println("To save a comment, write");
                    System.out.print("Enter the id of the post where you want to save the comment: ");
                    long idPost1 = scan.nextLong();
                    System.out.print("Enter user ID: ");
                    long idUser1 = scan.nextLong();
                    System.out.print("Enter the text that will be in the comment: ");
                    String comment = scan.next();
                    Comment newComment = new Comment(comment, LocalDate.of(2023, 3, 23));
                    System.out.println(dataBase3.saveComment(idPost1, idUser1, newComment));
                    break;
                case 11:
                    System.out.print("Delete post by id: ");
                    long deletePost = scan.nextLong();
                    System.out.println(user1.deletePostById(deletePost));
                case 12:
                    System.out.print("Enter the id of the post for which you want to find a comment: ");
                    long findIDComment = scan.nextLong();
                    post4.findCommentByPostId(findIDComment);
                    break;
                case 13:
                    user1.searchPost("Typical me.");
                    break;
                case 14:
                    System.out.print("Enter the id of the comment you want to change: ");
                    long idComment = scan.nextLong();
                    System.out.print("Enter update text: ");
                    String newTexts = scan.next();
                    post1.updateComment(idComment, newTexts);
                    break;
                case 15:
                    System.out.print("Write the id of the comment you want to delete: ");
                    long deleteComment  = scan.nextLong();
                    post2.deleteComment(deleteComment);
                    break;
            }
        }
    }
}
