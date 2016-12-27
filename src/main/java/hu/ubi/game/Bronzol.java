package hu.ubi.game;

import hu.ubi.game.player.Player;
import hu.ubi.game.races.eRaceType;
import hu.ubi.game.roles.eRoleType;
import hu.ubi.game.settings.PlayerSettings;
import hu.ubi.game.settings.PlayerSkillsPoints;

import static hu.ubi.game.races.eRaceType.*;
import static hu.ubi.game.roles.eRoleType.*;

public class Bronzol {
    private static Player player;
    private static PlayerSettings playerSettings;
    private static PlayerSkillsPoints playerSkillsPoints;

    static{
        player = new Player();
        playerSettings = new PlayerSettings();
        playerSkillsPoints = new PlayerSkillsPoints();
    }

    public static void main(String[] args) {
        SetPlayerName("Dave");
        SetPlayerRace(HUMAN);
        SetPlayerRole(WARRIOR);
        PlayerSkillDistribution();
        System.out.println("Name: " + player.getName() +
                        ", HP: " + player.getHP() +
                        ", AP: " + player.getAP() +
                        ", MP: " + player.getMP() +
                        ", Luck: " + player.getLuck());
    }

    private static void PlayerSkillDistribution() {
        playerSkillsPoints.SkillsDistribution(player, 4,2,3,5);
    }
    private static void SetPlayerName(String name) {
        playerSettings.SetPlayerName(player, name);
    }
    private static void SetPlayerRace(eRaceType raceType) {
        playerSettings.SetPlayerRace(player, raceType);
    }
    private static void SetPlayerRole(eRoleType roleType) {
        playerSettings.SetPlayerRole(player, roleType);
    }
}