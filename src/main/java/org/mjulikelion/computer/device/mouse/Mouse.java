package org.mjulikelion.computer.device.mouse;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;

public class Mouse extends Device {
    public Mouse(String name, int price, Manufacturer manufacturer) {
        super(name, price, manufacturer);
    }

    @Override
    public void run() {
        System.out.println(this.name + " 클릭합니다.");
    }

    @Override
    public void on() {
        System.out.println("Mouse ON");
    }

    @Override
    public void off() {
        System.out.println("Mouse OFF");
    }
}
