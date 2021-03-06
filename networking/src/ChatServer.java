
import java.util.ArrayList;

public class ChatServer {
	// Lists of messages and incoming messages.
	ArrayList <String> messages;

	// Users and passwords.
	String[][] users =
		{{"prat", "moreland"},
			{"elisabeth", "foo"},
			{"deni", "cheesecake"},
			{"aditya", "7etapu8H"},
			{"nicholas", "bar"},
			{"andrew", "cows"},
			{"zane", "1234"}};

	/**
	 * Default constructor.
	 */
	public ChatServer() {
		messages = new ArrayList <String> ();
	}

	/**
	 * Adds a line to the incoming message array.
	 */
	public void add(String line) {
		messages.add(line);
	}

	public String get(int index) {
		if (index >= 0 && index < messages.size()) {
			return messages.get(index);
		}
		return "";
	}

	/**
	 * Returns true if the username and password is valid.
	 */
	public boolean authenticate(String username, String password) {
		for (int i = 0 ; i < users.length ; i++) {
			if (users[i][0].equals(username) && users[i][1].equals(password)) {
				return true;
			}
		}
		return false;
	}

	public int messageSize() {
		return messages.size();
	}
}