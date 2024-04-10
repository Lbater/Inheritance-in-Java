/**
 * This is the base class that all other will inherit from
 * Author: Logan Bateman, 000918989
 */
public class Inhabitants {
    private String name;
    private int health;
    private int agility;
    private int strength;
    private boolean alive = true;
    private String pack;

    /**
     * This is the base constructor all others will inherit from
     * @param name the name given when the object is created
     * @param health the health given when the object is created
     * @param agility the agility given when the object is created
     * @param strength the strength given when the object is created
     * @throws Exception if they try to create the Object with stats larger than 10
     */
    public Inhabitants(String name, int health, int agility, int strength) throws Exception {
        this.name = name;
        this.health = health;
        this.agility = agility;
        this.strength = strength;

        if(health > 10 || agility > 10 || strength > 10){
            throw new Exception("All the stats must be less than or equal to 10");
        }

        if(health == 0){
            setAlive(false);
        }
    }


    /**
     * Sets the health
     * @param health the health the function takes in
     */
    public void setHealth(int health) { this.health = health; }

    /**
     * Sets the strength
     * @param strength the strength the function takes in
     */
    public void setStrength(int strength) { this.strength = strength; }

    /**
     * Sets the agility
     * @param agility the agility the function takes in
     */
    public void setAgility(int agility) { this.agility = agility; }

    /**
     * Sets the alive status
     * @param alive the alive status the function takes in
     */
    public void setAlive(boolean alive) { this.alive = alive; }

    /**
     * Gets the pack for the werewolves and witches
     * @return the pack only for the witches and werewolves
     */
    public String getPack() { return pack; }

    /**
     * Checks if they're in the same pack
     * @param other the other object
     * @return true if they are in a pack false if they're not
     */
    public boolean isInSamePack(Inhabitants other) { return this.pack != null && this.pack.equalsIgnoreCase(other.getPack()); }

    /**
     * Gets the name
     * @return the name of the Object created
     */
    public String getName() { return name; }

    /**
     * Gets the health
     * @return the health of the Object created
     */
    public int getHealth() { return health; }

    /**
     * Gets the agility
     * @return the agility of the Object created
     */
    public int getAgility() { return agility; }

    /**
     * Gets the Strength
     * @return the Strength of the Object created
     */
    public int getStrength() { return strength; }

    /**
     * Gets the alive status
     * @return the alive status of the Object created
     */
    public boolean isAlive() { return alive; }

    /**
     * This is a damage calculator helper method
     * @return the average of the health, agility, strength
     */
    private int damageCalc(){
        return (getHealth()+getAgility()+getStrength())/3;
    }

    /**
     * This is for when people attack eachother
     * @param target the target of the attack
     * @return the updated health of the target
     */
    public int attack(Inhabitants target){
        int damageThrough = damageCalc() / (int) ((Math.random() * 10)+ 1);

        if(this.isInSamePack(target)){
            return 0;
        }else {
            if (damageThrough > 0) {
                target.setHealth(target.getHealth() - damageThrough);
            } else {
                target.setHealth(target.getHealth() - 1);
            }
            if (target.getHealth() <= 0) {
                target.setAlive(false);
            }
            if (!target.isAlive()) {
                return 0;
            }
        }
        return target.getHealth();
    }

    /**
     * This is the base toString
     * @return a formatted a String
     */
    @Override
    public String toString(){
        return String.format("%s \n"+
                "Name: %s \n" +
                "Health: %d \n"+
                "Agility: %d \n"+
                "Strength: %d \n"+
                "Alive: %b"
                , getClass(), getName(), getHealth(), getAgility(), getStrength(), isAlive());
    }
}
