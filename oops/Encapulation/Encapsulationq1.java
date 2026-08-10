class GamingProfile {
    private String playerName;
    private int level;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getLevel() {
        return level;
    }

    public void updateLevel(int newLevel) {
        level = newLevel;
    }

    public void resetProfile() {
        playerName = "Guest";
        level = 1;
    }
}

public class Encapsulationq1 {
    public static void main(String[] args) {
        GamingProfile player = new GamingProfile();

        player.setPlayerName("Ansh");
        player.setLevel(100);

    
        player.updateLevel(120);

        System.out.println("After Update:");
        System.out.println(player.getPlayerName());
        System.out.println(player.getLevel());

        player.resetProfile();

        System.out.println("\nAfter Reset:");
        System.out.println(player.getPlayerName());
        System.out.println(player.getLevel());
    }
}