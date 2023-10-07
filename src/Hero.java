public class Hero extends Character {
    private String specialMove;

    public Hero(String name, Power power, String specialMove) {
        super(name, CharacterType.HERO, power);
        this.specialMove = specialMove;
    }

    public String getSpecialMove() {
        return specialMove;
    }

    public String performSpecialMove() {
        return "Hero " + getName() + " performs the special move: " + specialMove;
    }

    public final String finalHeroMethod() {
        return "This method cannot be overridden by villains.";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nSpecial Move: " + specialMove;
    }
}