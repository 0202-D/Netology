package HomeWork3_2_1;

import HomeWork3_2_1.Weapon.*;

/**
 * @author Dm.Petrov
 * DATE: 14.04.2022
 */
public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new MachineGun(),
                new WaterPistol(),
                new RPG(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= 0 && slot < weaponSlots.length) {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        } else {
            System.out.println("Некорректный номер слота");
        }
    }
}
