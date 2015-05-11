package com.cetys.angelarambula.android.practica_02_base.model;

/**
 * Created by AngelArambula on 4/13/15.
 */
//POJO
//Plain Old Java Object
public class Coach {
    private int nID;
    private String sName;
    private String sTeam;

    public Coach() {

    }

    public Coach(int nID, String sName, String sTeam) {
        this.nID = nID;
        this.sName = sName;
        this.sTeam = sTeam;
    }

    public int getnID() {
        return nID;
    }

    public void setnID(int nID) {
        this.nID = nID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsTeam() {
        return sTeam;
    }

    public void setsTeam(String sTeam) {
        this.sTeam = sTeam;
    }

    public String toString() {
        return "POJO";
    }
}
