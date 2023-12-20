package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    public void PlayerFirstWins() {
        Game game = new Game();

        Players kolya = new Players(5, "Kolya", 30);
        Players petya = new Players(7, "Petya", 10);

        game.register(kolya);
        game.register(petya);
        int actual = game.round("Kolya", "Petya");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayerSecondWins() {
        Game game = new Game();

        Players kolya = new Players(5, "Kolya", 10);
        Players petya = new Players(7, "Petya", 20);

        game.register(kolya);
        game.register(petya);
        int actual = game.round("Kolya", "Petya");
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayersEqual() {
        Game game = new Game();

        Players kolya = new Players(5, "Kolya", 10);
        Players petya = new Players(7, "Petya", 10);

        game.register(kolya);
        game.register(petya);
        int actual = game.round("Kolya", "Petya");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayersNotReg() {
        Game game = new Game();

        Players kolya = new Players(5, "Kolya", 10);
        Players petya = new Players(7, "Petya", 20);

        game.register(kolya);
        game.register(petya);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Olga", "Fedor");
        });
    }

    @Test
    public void OnePlayersNotReg() {
        Game game = new Game();

        Players kolya = new Players(5, "Kolya", 10);
        Players petya = new Players(7, "Petya", 20);

        game.register(kolya);
        game.register(petya);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Kolya", "Nikita");
        });
    }

    @Test
    public void getIdPlayers() {

        Players kolya = new Players(5, "Kolya", 30);

        int actual = kolya.getId();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIdPlayers() {

        Players kolya = new Players(5, "Kolya", 30);
        kolya.setId(10);
        int actual = kolya.getId();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNamePlayers() {

        Players kolya = new Players(5, "Kolya", 30);

        String actual = kolya.getName();
        String expected = "Kolya";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNamePlayers() {

        Players kolya = new Players(5, "Kolya", 30);
        kolya.setName("Kirill");
        String actual = kolya.getName();
        String expected = "Kirill";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getStrengthPlayers() {

        Players kolya = new Players(5, "Kolya", 30);

        int actual = kolya.getStrength();
        int expected = 30;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStrengthPlayers() {

        Players kolya = new Players(5, "Kolya", 30);
        kolya.setStrength(40);
        int actual = kolya.getStrength();
        int expected =40;
        Assertions.assertEquals(expected, actual);
    }
}
