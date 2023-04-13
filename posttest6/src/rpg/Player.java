/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author Msi-GK
 */
public final class Player extends Character implements Battle{
    private String role;
    private int level;
    private int hp;
    private int str;
    private final int max_level = 100;

    //constructor
    public Player(String isName, String isRole, String isGender, int isLevel, int isHp, int isStr) {
        super(isName, isGender);
        this.role = isRole;
        if (isLevel > max_level) {
            System.out.println("Level Player Anda Melebihi Max Level 100");
            this.level = max_level;
        } else {
            this.level = isLevel;
        }
        this.hp = isHp;
        this.str = isStr;
    }
    
    //setter
    public void setRole(String isRole){
        this.role = isRole;
    }
    public void setLevel(int isLevel) {
        if (isLevel > max_level) {
            System.out.println("Level Player Anda Melebihi Max Level 100");
            this.level = max_level;
        } else {
            this.level = isLevel;
        }
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setStr(int str) {
        this.str = str;
    }

    //getter
    public String getRole() {
        return role;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return hp;
    }
    public int getStrength() {
        return str;
    }
    

    @Override
    public final void display(){    
        System.out.println("  Name     : "+this.name);
        System.out.println("  Gender   : "+this.gender);
        System.out.println("  Role     : "+ this.role);
    }

    public final void display(boolean y){
        if (y == true){
            this.display();
            System.out.println("\n  Stat Player");
            System.out.println("  Level    :"+ this.level);
            System.out.println("  Health   :"+ this.hp);
            System.out.println("  Strength :"+ this.str);
        } else {
            this.display();
        }
    }

    public final boolean isAlive(){
        return hp > 0;
    }
    public final void takeDamage(int damage){
        if (isAlive()) {
            hp -= damage;
            System.out.println(name + " take " + damage + " damage points.");
            if (!isAlive()) {
              System.out.println(name + " is dead!");
            }
          } else {
            System.out.println(name + " is already dead and can't take damage anymore!!");
          }
    }
    public final void attack(Player target){
        if (isAlive()) {
            System.out.println(name + " attack " + target.getName() + " with " + str + " damage points!");
            target.takeDamage(str);
          } else {
            System.out.println(name + " is already dead and can't attack anymore!!");
          }
    }
}
