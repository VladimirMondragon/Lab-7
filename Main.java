import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Comic Book Hero Management System!");

        manager.addHero(new Hero("Spider-Man", 85, Affiliation.MARVEL));
        manager.addHero(new Hero("Batman", 88, Affiliation.DC));
        manager.addHero(new Hero("Spawn", 90, Affiliation.INDEPENDENT));

        System.out.println("\nAll Heroes:");
        manager.displayHeroes();

        System.out.println("\nSorted by Power Level:");
        manager.sortByPowerLevel();
        manager.displayHeroes();

        System.out.println("\nSorted by Name:");
        manager.sortByName();
        manager.displayHeroes();

        scanner.close();
    }
}
