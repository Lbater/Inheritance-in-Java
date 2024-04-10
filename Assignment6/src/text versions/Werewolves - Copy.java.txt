/**
 * This is the Werewolves class
 * It inherits from the Inhabitants class
 * Author: Logan Bateman, 000918989
 */
public class Werewolves extends Inhabitants{
    private String pack;
    private boolean alpha;

    /**
     * This is the Werewolves constructor
     * @param name is the name inherited from the Inhabitants class
     * @param health is the health inherited from the Inhabitants class
     * @param agility is the agility inherited from the Inhabitants class
     * @param strength is the strength inherited from the Inhabitants class
     * @param pack is the pack name assigned when created
     * @param alpha is the alpha status when created
     * @throws Exception if they try to create the Object with stats larger than 10
     */
    public Werewolves(String name, int health, int agility, int strength, String pack, boolean alpha) throws Exception {
        super(name, health, agility, strength);
        this.pack = pack;
        this.alpha = alpha;

        if(getHealth() > 10 || getAgility() > 10 || getStrength() > 10){
            throw new Exception("All the stats must be less than or equal to 10");
        }
        if(getHealth() < 5){
            setHealth(5);
        }else if (getAgility() < 5){
            setAgility(5);
        }else if (getStrength() < 5){
            setStrength(5);
        }else if (getHealth() < 5 && getAgility() < 5){
            setHealth(5);
            setAgility(5);
        }else if (getHealth() < 5 && getStrength() < 5){
            setHealth(5);
            setStrength(5);
        }else if (agility < 5 && getStrength() < 5){
            setAgility(5);
            setStrength(5);
        }else if (getHealth() < 5 && getAgility() < 5 && getStrength() < 5){
            setHealth(5);
            setAgility(5);
            setStrength(5);
        }

    }

    /**
     * This is the overridden toString method that inherits the toString method from Inhabitants
     * @return a formatted String that also adds the class, the pack and alpha status
     */
    @Override
    public String toString(){
        return String.format("\n"+
               "%s \n"+
               "Pack: %s \n"+
               "Alpha: %b"
                , super.toString(), pack, alpha);
    }
}
