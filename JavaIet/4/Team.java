package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Team {
    private int teamId;
    private String teamName;
    private String coach;
    private Player captain;
    private Player[] playerList;
    static Scanner sc = new Scanner(System.in);

    private static int cnt;
    private static Team[] teams;

    static {
        cnt = 0;
        teams = new Team[10];


        Player[] rcbPlayers = new Player[3];
        rcbPlayers[0] = new Player(1, "Virat Kohli", "Captain", 1);
        rcbPlayers[1] = new Player(2, "AB Divillers", "Batsman", 2);
        rcbPlayers[2] = new Player(3, "Chris Gayle", "Batsman", 333);
        teams[cnt++] = new Team(1, "RCB", "Rahul Dravid", rcbPlayers[0], rcbPlayers);

        Player[] cskPlayers = new Player[3];
        cskPlayers[0] = new Player(4, "MS Dhoni", "Captain", 7);
        cskPlayers[1] = new Player(5, "Suresh Raina", "Batsman", 3);
        cskPlayers[2] = new Player(6, "Ravindra Jadeja", "All-rounder", 12);
        teams[cnt++] = new Team(2, "CSK", "Stephen Fleming", cskPlayers[0],  cskPlayers);
    }

    public Team(int teamId, String teamName, String coach, Player captain, Player[] playerList) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.coach = coach;
        this.captain = captain;
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", coach='" + coach + '\'' +
                ", captain=" + captain +
                ", playerList=" + Arrays.toString(playerList) +
                '}';
    }

    Team() {}

    //1. getTeam count
    public static int getTeamCout(){
        return cnt;
    }
    //Add team
    public static boolean addTeam(){
        System.out.print("Enter team id :");
        int tid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Tean Name :");
        String tName = sc.nextLine();
        System.out.println();
        System.out.print("Enter coach name");
        String coach = sc.nextLine();


        System.out.println("Enter captains id");
        int cid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter captains name : ");
        String cName = sc.nextLine();
        System.out.println("Enter captains world rank ");
        int cRank = sc.nextInt();

        Player player = new Player(cid,cName,"Captain",cRank);
        Player[] newTeamPlayers = new Player[10];
        Team newTeam = new Team(tid,tName,coach,player,newTeamPlayers);
        teams[cnt++] = newTeam;
//        if(teams[cnt - 1].findTeamById == newTeam){
//            return true;
//        }
        return false;
    }

    //findPlayerNumberByTeamId


}
