package hu.ubi.game.player;

import hu.ubi.game.races.IRaces;
import hu.ubi.game.races.RacesFactory;
import hu.ubi.game.races.eRaceType;
import hu.ubi.game.roles.IRoles;
import hu.ubi.game.roles.RolesFactory;
import hu.ubi.game.roles.eRoleType;

public class Player {
    private String name;
    private Boolean isAlive;
    private static int HP = 10;
    private static int MP = 10;
    private static int AP = 10;
    private int x;
    private int y;
    private int luck = 0;
    private int special;
    private IRaces race;
    private IRoles role;

    // ------------------------- SETTER ------------------------- //

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(eRoleType roleType) {
        role = new RolesFactory().getRole(roleType);
        role.setup(this);
    }

    public void setRace(eRaceType raceType) {
        race = new RacesFactory().getRace(raceType);
        race.setup(this);
    }

    // ------------------------- GETTER ------------------------- //

    public int getHP() {
        return HP;
    }

    public int getAP() {
        return AP;
    }

    public int getMP() {
        return MP;
    }

    public IRoles getRole() {
        return role;
    }

    public IRaces getRace() {
        return race;
    }

    public int getSpecial() {
        return special;
    }

    public int getLuck() {
        return luck;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }
}
