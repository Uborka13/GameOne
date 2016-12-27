package hu.ubi.game.races;

import hu.ubi.game.player.Player;

class Human implements IRaces{
    private int HP = 10;
    private int AP = 10;
    private int MP = 10;
    private int luck;

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

    public int getLuck() {
        return luck;
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

    public void setLuck(int luck) {
        this.luck = luck;
    }

    // ------------------------- SETUP ------------------------- //

    public void setup(Player player) {
        player.setHP(player.getHP() + getHP());
        player.setAP(player.getAP() + getAP());
        player.setMP(player.getMP() + getHP());
        player.setLuck(player.getLuck() + getLuck());
    }
}
