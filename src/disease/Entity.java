package disease;

import java.util.*;

public class Entity{
	private ArrayList<int> statistics = new ArrayList<int>();
	private String name = "";
	private String description = "";
	
	public int getCurrentHealth(){
		return statistics.get(1);
	}
	public int getMaxHealth(){
		return statistics.get(0);
	}
	public int getMaxStamina(){
		return statistics.get(2);
	}
	public int getCurrentStamina(){
		return statistics.get(3);
	}
	public int getStrength(){
		return statistics.get(4);
	}
	public int getCritChance(){
		return statistics.get(5);
	}
	public int getSpeed(){
		return statistics.get(6);
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
	public void Attack(Entity person){
		// Find a random number between the total strength and one half of the strength and make it an integer
		// Get the health of the person and then take off the damage that is dealt from it
	}
	public void SkillAttack(Skill s){
		// Get the skill level
	}
}
