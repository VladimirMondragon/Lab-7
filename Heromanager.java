import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HeroManager {
    private ArrayList<Hero> heroes;

    public HeroManager() {
        heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    public void sortByPowerLevel() {
        Collections.sort(heroes, Comparator.comparingInt(Hero::getPowerLevel).reversed());
    }

    public void sortByName() {
        Collections.sort(heroes, Comparator.comparing(Hero::getName));
    }
}
