/**
 * This is the Humans class
 * It inherits from the Inhabitants class
 * Author: Logan Bateman, 000918989
 */
public class Humans extends Inhabitants{
    /**
     * This is the Humans constructor
     * @param name is the name inherited from the Inhabitants class
     * @param health is the health inherited from the Inhabitants class
     * @param agility is the agility inherited from the Inhabitants class
     * @param strength is the strength inherited from the Inhabitants class
     * @throws Exception if they try to create the Object with stats larger than 10
     */
    public Humans(String name, int health, int agility, int strength) throws Exception {
        super(name, health, agility, strength);

        if(health > 10 || agility > 10 || strength > 10){
            throw new Exception("All the stats must be less than or equal to 10");
        }
    }

    /**
     * This is the overridden toString method that inherits the toString method from Inhabitants
     * @return a formatted String that also adds the class
     */
    @Override
    public String toString(){
        return String.format("\n"+
                "%s",
                super.toString());
    }
}
