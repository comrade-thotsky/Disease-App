package disease;
import java.util.*;
public class Entity{
	private ArrayList statistics = new ArrayList();
	private String name;
	private String description;
	private String state = "None";
	private String status = "Normal";
	private int ID = 0;
    //
    //
    // Functions
	public int getID(){
		return ID;
	}
	public void setID(int x){
		ID = x;
	}
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
        
    }
    public String getState(){
        return state;
    }
    public void setName(String pName){
        name = pName;
    }
    public void setDescription(String pDescription){
        description = pDescription;
    }
    public void setState(String pState){
        state = pState;
    }
    public void setStatus(String pStatus){
        status = pStatus;
    }
	public int getCurrentHealth(){
		return (int) statistics.get(1);
	}
	public int getMaxHealth(){
		return (int) statistics.get(0);
	}
	public int getMaxStamina(){
		return (int)statistics.get(2);
	}
	public int getCurrentStamina(){
		return (int)statistics.get(3);
	}
	public int getStrength(){
		return (int) statistics.get(4);
	}
	public int getCritChance(){
		return (int) statistics.get(5);
	}
	public int getSpeed(){
		return (int) statistics.get(6);
	}
	public String getStatus(){
		return status;
	}
	public void setCurrentHealth(int health){
		statistics.set(1, health);
	}
	public void setMaxHealth(int health){
		statistics.set(0, health);
	}
	public void setMaxStamina(int s){
		statistics.set(2, s);
	}
	public void setCurrentStamina(int s){
		statistics.set(3, s);
	}
	public void setStrength(int s){
		statistics.set(4, s);
	}
	public void setCritChance(int s){
		statistics.set(5, s);
	}
	public void setSpeed(int s){
		statistics.set(6, s);
	}
    //
	public void Attack(Entity person){
		// Find a random number between the total strength and one half of the strength and make it an integer
		// Get the health of the person and then take off the damage that is dealt from it
	}
	public void SkillAttack(Skill s){
		// Get the skill level
	}
	public void Block(){
		// Reduce the damage by 3/5
	}
	public void UseItem(Item i){

	}

}
