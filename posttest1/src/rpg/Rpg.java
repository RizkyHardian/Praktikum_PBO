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
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO code application logic here
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<character> dataChar = new ArrayList<>();

        character autoChar = new character("Dimas", "Pedagang", "Laki-Laki", 20);
        character autoChar1 = new character("Eko", "Pemburu", "Laki-Laki", 25);
        character autoChar2 = new character("Wahyu", "Petani", "Laki-Laki", 16);
        character autoChar3 = new character("Yudi", "Petualang", "Laki-Laki", 50);
        
        dataChar.add(autoChar);
        dataChar.add(autoChar1);
        dataChar.add(autoChar2);
        dataChar.add(autoChar3);

        int select = 1;
        while (select != 0){
            System.out.print("""

            =====================
            |   Data Game RPG   |
            =====================
            |                   |
            | 1. Lihat Data     |
            | 2. Tambah Data    |
            | 3. Edit Data      |
            | 4. Hapus Data     |
            | 0. Keluar Program |
            |                   |
            =====================
            """);
            System.out.print("Masukkan Pilihan > ");
            select = Integer.parseInt(br.readLine());

            switch (select) {
                case 0:
                    System.out.println("");
                    System.out.println("> Keluar dari Program <");
                    System.out.println("");
                    break;
                case 1:
                System.out.println("");
                for (int i = 0; i < dataChar.size(); i += 1) {
                        System.out.println("=====================");
                        System.out.println("    Character " + (i + 1));
                        System.out.println("");
                        dataChar.get(i).display();
                        System.out.println("");
                        dataChar.get(i).working();
                        System.out.println("=====================");
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Masukkan Nama > ");
                    String name = br.readLine();
                    System.out.print("Masukkan Jenis Pekerjaan > ");
                    String job = br.readLine();
                    System.out.print("Masukkan Jenis Kelamin > ");
                    String gender = br.readLine();
                    System.out.print("Masukkan Usia > ");
                    int age = Integer.parseInt(br.readLine());
                    System.out.println("");

                    character addChar = new character(name, job, gender, age);
                    dataChar.add(addChar);

                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Masukkan Nama Character > ");
                    String upName = br.readLine();
                    for (character chara : dataChar) {
                        if (chara.getName().equals(upName)) {
                            System.out.print("Masukkan Nama : ");
                            chara.setName(br.readLine());
                            System.out.print("Masukkan Jenis Pekerjaan : ");
                            chara.setjob(br.readLine());
                            System.out.print("Masukkan Jenis Kelamin : ");
                            chara.setGender(br.readLine());
                            System.out.print("Masukkan Usia : ");
                            chara.setAge(Integer.parseInt(br.readLine()));
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.print("Masukkan Nama Character > ");
                    String popName = br.readLine();
                    for (int i = 0; i < dataChar.size(); i++) {
                        if (dataChar.get(i).getName().equals(popName)) {
                            dataChar.remove(i);
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("");
                    System.out.println("> Menu Tidak Tersedia!! <");
                    System.out.println("");
                    break;
            }
        }
        
    }
    
}
