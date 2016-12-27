package hu.ubi.game.races;

public class RacesFactory {

    public IRaces getRace(eRaceType Race) {
        if (Race.equals(eRaceType.DWARF)) {
            return new Dwarf();
        } else if (Race.equals(eRaceType.ELF)) {
            return new Elf();
        } else if (Race.equals(eRaceType.GNOME)) {
            return new Gnome();
        } else if (Race.equals(eRaceType.GOBLIN)) {
            return new Goblin();
        } else if (Race.equals(eRaceType.HUMAN)) {
            return new Human();
        } else if (Race.equals(eRaceType.ORC)) {
            return new Orc();
        } else if (Race.equals(eRaceType.TROLL)) {
            return new Troll();
        } else if (Race.equals(eRaceType.VAMPIRE)) {
            return new Vampire();
        } else if (Race.equals(eRaceType.WEREWOLF)) {
            return new Werewolf();
        } else {
            return null;
        }
    }
}
