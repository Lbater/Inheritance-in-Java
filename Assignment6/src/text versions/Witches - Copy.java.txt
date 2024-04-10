/**
 * This is the Witches class
 * It inherits from the Inhabitants class
 * Author: Logan Bateman, 000918989
 */
public class Witches extends Inhabitants {
    private String pack;

    /**
     * This is the Witches constructor
     * @param name is the name inherited from the Inhabitants class
     * @param health is the health inherited from the Inhabitants class
     * @param agility is the agility inherited from the Inhabitants class
     * @param strength is the strength inherited from the Inhabitants class
     * @param pack is the pack name assigned when created
     * @throws Exception if they try to create the Object with stats larger than 10
     */
    public Witches(String name, int health, int agility, int strength, String pack) throws Exception {
        super(name, health, agility, strength);
        this.pack = pack;

        if(getHealth() > 10 || getAgility() > 10 || getStrength() > 10){
            throw new Exception("All the stats must be less than or equal to 10");
        }
        if(getHealth() > 5){
            setHealth(5);
        }else if(getAgility() > 5){
            setAgility(5);
        }else if(getHealth() > 5 && getAgility() > 5){
            setHealth(5);
            setAgility(5);
        }
    }

    /**
     * This is the way that witches can buff the healers magic
     * @param target is the healer being targeted
     * @return the buffed magic stat
     */
    public int buff(Healers target){
        for (int i = 1; i < super.getStrength(); i += 3) {
            target.setMagic(i);
        }
        return target.getMagic();
    }

    /**
     * This is the overridden toString method that inherits the toString method from Inhabitants
     * @return a formatted String that also adds the class and the pack
     */
    @Override
    public String toString(){
        return String.format("\n"+
                "%s \n"+
                "Pack: %s"
                , super.toString(), pack);
    }
}
