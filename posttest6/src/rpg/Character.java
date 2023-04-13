/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author Msi-GK
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Character {
    protected static InputStreamReader isr = new InputStreamReader(System.in);
    protected static BufferedReader br = new BufferedReader(isr);
    protected String name, gender;
    
    //Constructor
    Character(String isName, String isGender) {
        this.name = isName;
        this.gender = isGender;
    }

    //setter
    public void setName(String isName) {
        this.name = isName;
    }
    public void setGender(String isGender) {
        this.gender = isGender;
    }
    

    //getter
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    
    public abstract void display();
}
