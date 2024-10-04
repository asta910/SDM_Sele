package Day4;

public class Player {
    private  int playerId;
    private  String playerName;
    private String role;
    private int worldRank;
    Player(){}
    Player(int i,String n, String role,int r){
        this.playerId = i;
        this.playerName = n;
        this.role=role;
        this.worldRank=r;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getWorldRank() {
        return worldRank;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId :" + playerId +
                ", " + playerName + '\'' +
                ", role '" + role + '\'' +
                ", World-Rank=" + worldRank +
                '}';
    }

    public void setWorldRank(int worldRank) {
        this.worldRank = worldRank;
    }
}
