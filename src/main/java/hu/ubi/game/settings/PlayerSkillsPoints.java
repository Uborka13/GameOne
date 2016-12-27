package hu.ubi.game.settings;

import hu.ubi.game.player.Player;

public class PlayerSkillsPoints {
    public void SkillsDistribution(Player player, int HP, int AP, int MP, int luck) {
        player.setHP(player.getHP() + (HP * 10));
        player.setAP(player.getAP() + (AP * 10));
        player.setMP(player.getMP() + (MP * 10));
        player.setLuck(player.getLuck() + (luck * 2));
    }
}
