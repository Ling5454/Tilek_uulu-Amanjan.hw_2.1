final class Villain extends Character {
    private String evilPlan;

    public Villain(String name, Power power, String evilPlan) {
        super(name, CharacterType.VILLAIN, power);
        this.evilPlan = evilPlan;
    }

    public String getEvilPlan() {
        return evilPlan;
    }

    public String overrideParentMethod() {
        return "This method has been overridden by the villain " + getName();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nEvil Plan: " + evilPlan;
    }
}