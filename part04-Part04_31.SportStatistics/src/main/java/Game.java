/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sjp12
 */
public class Game {
    private String homeTeam;
    private String oppTeam;
    private int home;
    private int opp;
    
    public Game(String homeTeam, String oppTeam, int home, int opp) {
        this.homeTeam = homeTeam;
        this.oppTeam = oppTeam;
        this.home = home;
        this.opp = opp;
    }
    
    public String getHome() {
        return homeTeam;
    }
    
    public String getOpp() {
        return oppTeam;
    }
    
    public boolean winner(String team) {
        if (homeTeam.equals(team) && home > opp) {
            return true;
        } else if (oppTeam.equals(team) && opp > home) {
            return true;
        } else {
            return false;
        } // end of if else
    }
} // end of class
