import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Train {
    private String name;
    private String time;
    private String destination;

    public Train(String name, String time, String destination) {
        this.name = name;
        this.time = time;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getDestination() {
        return destination;
    }
}

public class train {
    private static Map<String, User> users = new HashMap<>();
    private static Map<String, Train> trains = new HashMap<>();

    static {
        // Initialize users and trains (you can extend this based on your needs)
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));

        trains.put("train1", new Train("Express Train", "10:00 AM", "Destination A"));
        trains.put("train2", new Train("Superfast Train", "02:30 PM", "Destination B"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticateUser(username, password)) {
            displayBanner(username);
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }

        scanner.close();
    }

    private static boolean authenticateUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    private static void displayBanner(String username) {
        System.out.println("Welcome, " + username + "!");
        System.out.println("Banner Details:");
        
        // Assuming the user is associated with a specific train (you can modify this based on your logic)
        Train userTrain = trains.get("train1");

        System.out.println("Train Name: " + userTrain.getName());
        System.out.println("Train Time: " + userTrain.getTime());
        System.out.println("Destination: " + userTrain.getDestination());

        // Add additional details and functionalities as needed
    }
}
