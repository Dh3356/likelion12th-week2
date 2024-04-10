package org.mjulikelion.computer.device.psu;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;

public class PowerSupplier extends Device {
    private final String power;

    public PowerSupplier(String name, int price, Manufacturer manufacturer, String power) {
        super(name, price, manufacturer);
        this.power = power;
    }

    @Override
    public void on() {
        System.out.println("POWER Supplier ON");
    }

    @Override
    public void off() {
        System.out.println("POWER Supplier OFF");
    }

    @Override
    public void run() {
        System.out.println(this.name + " 전원을 공급합니다.");
    }
}
