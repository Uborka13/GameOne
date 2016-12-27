package hu.ubi.game.settings;

import hu.ubi.game.player.Player;
import hu.ubi.game.races.eRaceType;
import hu.ubi.game.roles.eRoleType;

public class PlayerSettings {
    public void SetPlayerRole(Player player, eRoleType roleType) {
        player.setRole(roleType);
    }
    public void SetPlayerRace(Player player, eRaceType raceType) {
        player.setRace(raceType);
    }
    public void SetPlayerName(Player player, String name) { player.setName(name);}
}
