package netology;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName) {
        super("Player with name" + playerName + " is not registered");
    }
}

