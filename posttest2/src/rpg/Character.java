/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author Msi-GK
 */

public class Character {
    private String name, job, gender;
    private int age;
    
    Character(String isName, String isJob, String isGender, int isAge) {
        this.name = isName;
        this.job = isJob;
        this.gender = isGender;
        this.age = isAge;
    }

    void display(){
        System.out.println("Nama          : "+this.name);
        System.out.println("Pekerjaan     : "+this.job);
        System.out.println("Jenis Kelamin : "+this.gender);
        System.out.println("Umur          : "+this.age);
    }

    //setter
    public void setName(String isName) {
        this.name = isName;
    }
    public void setjob(String isJob) {
        this.job = isJob;
    }
    public void setGender(String isGender) {
        this.gender = isGender;
    }
    public void setAge(int isAge) {
        this.age = isAge;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public String getJob(){
        return this.job;
    }
    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }

    void working(){
        System.out.println("    " + this.name + " Sedang Bekerja...");
    }
}
