/**
 * This is the main class
 * Author: Logan Bateman, 000918989
 */
public class Main {
    /**
     * This is the main method or the view for the other classes
     * @param args the arguments to make it run
     * @throws Exception for if they input stats above 10
     */
    public static void main(String[] args) throws Exception {
        Inhabitants inhabitants = new Inhabitants("Steve",3,2,6);
        System.out.println(inhabitants);

        Werewolves werewolves = new Werewolves("Josh", 5, 7, 10, "Yah Yeets", false);
        System.out.println(werewolves);

        Witches witches = new Witches("Kenzi", 5, 7, 6,"Yah Yeets");
        System.out.println(witches);

        Humans humans = new Humans("Zack", 1, 5, 6);
        System.out.println(humans);

        Hunters hunters = new Hunters("Jack", 10, 5, 6);
        System.out.println(hunters);

        Healers healers = new Healers("Joy", 10, 5, 3, 10);
        System.out.println(healers);

        inhabitants.attack(humans);
        witches.buff(healers);
        hunters.attack(werewolves);
        werewolves.attack(witches);
        healers.healing(witches);
    }
}