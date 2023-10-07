public class Character {
    private String name;
    private CharacterType characterType;
    private Power power;

    public Character(String name, CharacterType characterType, Power power) {
        this.name = name;
        this.characterType = characterType;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public Power getPower() {
        return power;
    }

    public String getInfo() {
        return "Name: " + name + "\nCharacter Type: " + characterType + "\nPower: " + power.getAbility();
    }
}