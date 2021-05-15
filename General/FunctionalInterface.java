import java.util.function.Function;

/*
One liner code for null value check in  java
 */
class User {
    private int userId;
    private String userName;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

public class FunctionalInterface {
    public static void main(String[] args) {
        User user = new User();
        // Before
        System.out.println("User name before using Lambda method :: " + user.getUserName());

        // Functional interface
        Function<String, String> nullCheck = val -> (val == null) ? "NA" : val;

        // Using Functional interface
        user.setUserName(nullCheck.apply(user.getUserName()));
        System.out.println("User name after using Lambda method :: " + user.getUserName());

    }
}
