/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author Msi-GK
 */
public class Npc extends Character {
    private String job;
    private int age;
    private String dialog;

    //constructor
    public Npc(String isName, String isJob, String isGender, int isAge, String dialog) {
        super(isName, isGender);
        this.job = isJob;
        this.age = isAge;
        this.dialog = dialog;
    }

    //setter
    public void setjob(String isJob) {
        this.job = isJob;
    }
    public void setAge(int isAge) {
        this.age = isAge;
    }
    public void setDialog(String dialog) {
        this.dialog = dialog;
    }
    
    //getter
    public String getJob(){
        return this.job;
    }
    public int getAge(){
        return this.age;
    }
    public String getDialog() {
        return dialog;
    }


    public void displayNpc(){
        System.out.println("  Name   : "+this.name);
        System.out.println("  Job    : "+this.job);
        System.out.println("  Gender : "+this.gender);
        System.out.println("  Age    : "+this.age);
        System.out.println("\n \""+this.dialog+"\"");
    }
}
