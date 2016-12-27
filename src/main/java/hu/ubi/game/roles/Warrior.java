package hu.ubi.game.roles;


import hu.ubi.game.player.Player;

class Warrior implements IRoles {
    private int HP = 10;
    private int AP = 10;
    private int MP = 10;

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

    // ------------------------- SETUP ------------------------- //

    public void setup(Player player) {
        player.setHP(player.getHP() + getHP());
        player.setAP(player.getAP() + getAP());
        player.setMP(player.getMP() + getMP());
    }
}
