/**
 * This is the Hunters class
 * It inherits from the Humans class
 * Author: Logan Bateman, 000918989
 */
public class Hunters extends Humans{
    /**
     * This is the Hunters constructor
     * @param name is the name inherited from the Humans class
     * @param health is the health inherited from the Humans class
     * @param agility is the agility inherited from the Humans class
     * @param strength is the strength inherited from the Humans class
     * @throws Exception if they try to create the Object with stats larger than 10
     */
    public Hunters(String name, int health, int agility, int strength) throws Exception {
        super(name, health, agility, strength);

        if(health > 10 || agility > 10 || strength > 10){
            throw new Exception("All the stats must be less than or equal to 10");
        }
    }

    /**
     * This is a damage calculator helper method that doubles the damage possibility by 2
     * @return the average of the health, agility, strength multiplied by 2
     */
    private int damageCalc(){
        return ((getHealth()+getAgility()+getStrength())/3)*2;
    }

    /**
     * This is for when hunter attack other things
     * @param target the target of the attack
     * @return the updated health of the target
     */
    public int attack(Inhabitants target){
        int damageThrough = damageCalc() / (int) ((Math.random() * 10)+ 1);
        if(damageThrough > 0){
            target.setHealth(target.getHealth() - damageThrough);
        }else{
            target.setHealth(target.getHealth() - 1);
        }
        if(target.getHealth() <= 0){
            target.setAlive(false);
        }
        if(!target.isAlive()){
            return 0;
        }
        return target.getHealth();
    }

    /**
     * This is the overridden toString method that inherits the toString method from Humans
     * @return a formatted String that also adds the class
     */
    @Override
    public String toString(){
        return String.format("\n"+
                "%s",
                super.toString());
    }
}
