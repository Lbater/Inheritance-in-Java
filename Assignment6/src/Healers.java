/**
 * This is the Healers class
 * It inherits from the Humans class
 * Author: Logan Bateman, 000918989
 */
public class Healers extends Humans{
    private int magic;

    /**
     * This is the Hunters constructor
     * @param name is the name inherited from the Humans class
     * @param health is the health inherited from the Humans class
     * @param agility is the agility inherited from the Humans class
     * @param strength is the strength inherited from the Humans class
     * @param magic is the magic created with the object
     * @throws Exception if they try to create the Object with stats larger than 10
     */
    public Healers(String name, int health, int agility, int strength, int magic) throws Exception {
        super(name, health, agility, strength);
        this.magic = magic;

        if(health > 10 || agility > 10 || strength > 10){
            throw new Exception("The stats have to be less than or equal to 10");
        }
    }

    /**
     * This sets the magic
     * @param magic the magic the function takes in
     */
    public void setMagic(int magic) { this.magic = magic; }

    /**
     * Gets the magic
     * @return the magic for other classes to view
     */
    public int getMagic() { return magic; }

    /**
     * This is the way the Healers heal
     * @param target the Object that needs healing
     * @return the updated health pool of the target
     */
    public int healing(Inhabitants target){
        if(this.isAlive()){
            do{
                int healingScore = (int)(magic / 2.5);
                target.setHealth(healingScore);
            }while(magic > 0);

            return target.getHealth();
        }
        return 0;
    }

    /**
     * This is the overridden toString method that inherits the toString method from Humans
     * @return a formatted String that also adds the class and the magic stat
     */
    @Override
    public String toString(){
        return String.format("\n"+
                "%s \n"+
                "Magic: %d",
                super.toString(), magic);
    }
}
