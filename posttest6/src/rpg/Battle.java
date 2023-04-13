/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rpg;

/**
 *
 * @author Msi-GK
 */
public interface Battle {
    public abstract boolean isAlive();
    public abstract void takeDamage(int damage);
    public abstract void attack(Player target);
}
