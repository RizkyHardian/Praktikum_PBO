/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpg;

/**
 *
 * @author Msi-GK
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Rpg {
    /**
     * @param args the command line arguments
     */
    
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);
    private static ArrayList<Npc> dataNpc = new ArrayList<>();
    private static ArrayList<Player> dataPlayer = new ArrayList<>();
     
    public static void main(String[] args) throws NumberFormatException, IOException {

        Npc addNpc = new Npc("Dimas", "Merchant", "Male", 20, "Out of stock...");
        Npc addNpc1 = new Npc("Eko", "Hunter", "Male", 25, "There are bandits in that forest...");
        Npc addNpc2 = new Npc("Wahyu", "Farmer", "Male", 16, "Abundant harvest...");
        Npc addNpc3 = new Npc("Yudi", "Adventurer", "Male", 50, "I found an interesting treasure...");
        
        dataNpc.add(addNpc);
        dataNpc.add(addNpc1);
        dataNpc.add(addNpc2);
        dataNpc.add(addNpc3);

        Player addPlayer = new Player("Tito", "Sword Master", "Male", 5, 100, 80);
        Player addPlayer1 = new Player("Kirito", "Swordman", "Male", 10, 100, 100);

        dataPlayer.add(addPlayer);
        dataPlayer.add(addPlayer1);

        int select = 1;
        while (select != 0){
            System.out.print("""

            =========================
            |     Data Game RPG     |
            =========================
            |                       |
            |  1. Display Data      |
            |  2. Create Data       |
            |  3. Edit Data         |
            |  4. Delete Data       |
            |  0. Exit Program      |
            |                       |
            =========================
            """);
            System.out.print("\nInput Your Choice > ");
            select = Integer.parseInt(br.readLine());

            switch (select) {
                case 0:
                    System.out.println("\n> Exit Program <\n");
                    break;
                case 1:
                    read();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    pop();
                    break;
                default:
                    System.out.println("\n> Menu is not Availabe!! <\n");
                    break;
            }
        } 
    }

    private static void read() throws IOException {
        int select = 1;
        while (select != 0){
            System.out.print("""

            =========================
            |     Display Data      |
            =========================
            |                       |
            |  1. Player w/ Stat    |
            |  2. Player w/o Stat   |
            |  3. NPC               |
            |  0. Back              |
            |                       |
            =========================
            """);
            System.out.print("\nInput Your Choice > ");
            select = Integer.parseInt(br.readLine());

            switch (select) {
                case 0:
                    break;
                case 1:
                    System.out.println("\n=========================\n");
                    for (int i = 0; i < dataPlayer.size(); i += 1) {
                        System.out.println("    Player " + (i + 1));
                        System.out.println("");
                        dataPlayer.get(i).display(true);
                        System.out.println("\n=========================\n");
                    }
                    select = 0;
                    break;
                case 2:
                    System.out.println("\n=========================\n");
                    for (int i = 0; i < dataPlayer.size(); i += 1) {
                        System.out.println("    Player " + (i + 1));
                        System.out.println("");
                        dataPlayer.get(i).display(false);
                        System.out.println("\n=========================\n");
                    }
                    select = 0;
                    break;
                case 3:
                    System.out.println("\n=========================\n");
                    for (int i = 0; i < dataNpc.size(); i += 1) {
                        System.out.println("    NPC " + (i + 1));
                        System.out.println("");
                        dataNpc.get(i).display();
                        System.out.println("\n=========================\n");
                    }
                    select = 0;
                    break;
                default:
                    System.out.println("\n> Menu is not Availabe!! <\n");
                    break;
            }
        }
        
    }
    private static void add() throws IOException {
        int select = 1;
        while (select != 0){
            System.out.print("""

            =========================
            |      Create Data      |
            =========================
            |                       |
            |  1. Player            |
            |  2. NPC               |
            |  0. Back              |
            |                       |
            =========================
            """);
            System.out.print("\nInput Your Choice > ");
            select = Integer.parseInt(br.readLine());

            switch (select) {
                case 0:
                    break;
                case 1:
                    System.out.println("");
                    System.out.print("Input Name     > ");
                    String name = br.readLine();
                    System.out.print("Input Role     > ");
                    String role = br.readLine();
                    System.out.print("Input Gender   > ");
                    String gender = br.readLine();
                    System.out.print("Input Level    > ");
                    int level = Integer.parseInt(br.readLine());
                    System.out.print("Input Health   > ");
                    int hp = Integer.parseInt(br.readLine());
                    System.out.print("Input Strength > ");
                    int str = Integer.parseInt(br.readLine());
                    System.out.println("");
            
                    Player addPlayer = new Player(name, role, gender, level, hp, str);
                    dataPlayer.add(addPlayer);
                    select = 0;
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Input Name   > ");
                    String nameNpc = br.readLine();
                    System.out.print("Input Job    > ");
                    String job = br.readLine();
                    System.out.print("Input Gender > ");
                    String genderNpc = br.readLine();
                    System.out.print("Input Age    > ");
                    int age = Integer.parseInt(br.readLine());
                    System.out.print("Input Dialog > ");
                    String dialog = br.readLine();
                    System.out.println("");
            
                    Npc addNpc = new Npc(nameNpc, job, genderNpc, age, dialog);
                    dataNpc.add(addNpc);
                    select = 0;
                    break;
                default:
                    System.out.println("\n> Menu is not Availabe!! <\n");
                    break;
            }
        }
    }
    private static void edit() throws IOException {
        int select = 1;
        while (select != 0){
            System.out.print("""

            =========================
            |      Update Data      |
            =========================
            |                       |
            |  1. Player            |
            |  2. NPC               |
            |  0. Back              |
            |                       |
            =========================
            """);
            System.out.print("\nInput Your Choice > ");
            select = Integer.parseInt(br.readLine());

            switch (select) {
                case 0:
                    break;
                case 1:
                    System.out.println("");
                    System.out.print("Input Player Name > ");
                    String inName = br.readLine();
                    for (Player isPlayer : dataPlayer) {
                        if (isPlayer.getName().equals(inName)) {
                            System.out.print("Input New Name     > ");
                            isPlayer.setName(br.readLine());
                            System.out.print("Input New Role     > ");
                            isPlayer.setRole(br.readLine());
                            System.out.print("Input New Gender   > ");
                            isPlayer.setGender(br.readLine());
                            System.out.print("Input New Level    > ");
                            isPlayer.setLevel(Integer.parseInt(br.readLine()));
                            System.out.print("Input New Health   > ");
                            isPlayer.setHp(Integer.parseInt(br.readLine()));
                            System.out.print("Input New Strength > ");
                            isPlayer.setStr(Integer.parseInt(br.readLine()));
                            break;
                        }
                    }
                    System.out.println("\n>Success Edit Player<\n");
                    select = 0;
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Input NPC Name > ");
                    String inNameNpc = br.readLine();
                    for (Npc isNpc : dataNpc) {
                        if (isNpc.getName().equals(inNameNpc)) {
                            System.out.print("Input New Name   > ");
                            isNpc.setName(br.readLine());
                            System.out.print("Input New Job    > ");
                            isNpc.setjob(br.readLine());
                            System.out.print("Input New Gender > ");
                            isNpc.setGender(br.readLine());
                            System.out.print("Input New Age    > ");
                            isNpc.setAge(Integer.parseInt(br.readLine()));
                            System.out.print("Input New Dialog > ");
                            isNpc.setDialog(br.readLine());
                            break;
                        }
                    }
                    System.out.println("\n>Success Edit NPC<");
                    select = 0;
                    break;
                default:
                    System.out.println("\n> Menu is not Availabe!! <\n");
                    break;
            }
        }
    }

    private static void pop() throws IOException {
        int select = 1;
        while (select != 0){
            System.out.print("""

            =========================
            |      Delete Data      |
            =========================
            |                       |
            |  1. Player            |
            |  2. NPC               |
            |  0. Back              |
            |                       |
            =========================
            """);
            System.out.print("\nInput Your Choice > ");
            select = Integer.parseInt(br.readLine());

            switch (select) {
                case 0:
                    break;
                case 1:
                    System.out.println("");
                    System.out.print("Input Player Name > ");
                    String inName = br.readLine();
            
                    for (int i = 0; i < dataPlayer.size(); i++) {
                        if (dataPlayer.get(i).getName().equals(inName)) {
                            dataPlayer.remove(i);
                            break;
                        }
                    }
                    System.out.println("\n>Success Delete Player<\n");
                    select = 0;
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Input NPC Name > ");
                    String inNameNpc = br.readLine();
            
                    for (int i = 0; i < dataNpc.size(); i++) {
                        if (dataNpc.get(i).getName().equals(inNameNpc)) {
                            dataNpc.remove(i);
                            break;
                        }
                    }
                    System.out.println("\n>Success Delete NPC<");
                    select = 0;
                    break;
                default:
                    System.out.println("\n> Menu is not Availabe!! <\n");
                    break;
            }
        } 
    }
}
