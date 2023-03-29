/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author Msi-GK
 */
public class Player extends Character {
    private String role;
    private int level;
    private int hp;
    private int str;

    //constructor
    public Player(String isName, String isRole, String isGender, int isLevel, int isHp, int isStr) {
        super(isName, isGender);
        this.role = isRole;
        this.level = isLevel;
        this.hp = isHp;
        this.str = isStr;
    }

    //setter
    public void setRole(String isRole){
        this.role = isRole;
    }
    public void setLevel(int isLevel) {
        this.level = isLevel;
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
    public void display(){    
        super.display();
        System.out.println("  Role     : "+ this.role);
    }

    public void display(boolean y){
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
}
