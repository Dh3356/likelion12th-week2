package org.mjulikelion.computer.device.cooler;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;
import org.mjulikelion.computer.device.cooler.resources.Type;

public class Cooler extends Device {
    private final Type type;

    public Cooler(String name, int price, Manufacturer manufacturer, Type type) {
        super(name, price, manufacturer);
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println(this.name + " 냉각합니다.");
    }

    @Override
    public void on() {
        System.out.println("Cooler ON");
    }

    @Override
    public void off() {
        System.out.println("Cooler OFF");
    }
}
