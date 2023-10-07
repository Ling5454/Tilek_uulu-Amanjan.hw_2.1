public class Main {
    public static void main(String[] args) {
        Power heroPower = new Power("Super Strength");
        Hero objectA = new Hero("Superman", heroPower, "Flight");
        
        Power villain1Power = new Power("Mind Control");
        Villain objectB = new Villain("Lex Luthor", villain1Power, "Take over the world");

        Power villain2Power = new Power("Teleportation");
        Villain objectC = new Villain("Joker", villain2Power, "Create chaos");

        System.out.println("Object A (Hero):");
        System.out.println(objectA.getInfo());
        System.out.println("Special Move: " + objectA.getSpecialMove());

        System.out.println("\nObject B (Villain 1):");
        System.out.println(objectB.getInfo());
        System.out.println("Evil Plan: " + objectB.getEvilPlan());

        System.out.println("\nObject C (Villain 2):");
        System.out.println(objectC.getInfo());
        System.out.println("Evil Plan: " + objectC.getEvilPlan());

        System.out.println("\nHero Special Move:");
        System.out.println(objectA.performSpecialMove());
        System.out.println(objectA.finalHeroMethod());

        System.out.println("\nVillain 1 Override:");
        System.out.println(objectB.overrideParentMethod());
    }
}