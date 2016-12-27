package hu.ubi.game.roles;

public class RolesFactory {

    public IRoles getRole(eRoleType Role) {
        if (Role.equals(eRoleType.ARCHER)) {
            return new Archer();
        } else if (Role.equals(eRoleType.HEALER)) {
            return new Priest();
        } else if (Role.equals(eRoleType.MAGE)) {
            return new Mage();
        } else if (Role.equals(eRoleType.ROGUE)) {
            return new Rogue();
        } else if (Role.equals(eRoleType.WARRIOR)) {
            return new Warrior();
        } else {
            return null;
        }
    }
}
