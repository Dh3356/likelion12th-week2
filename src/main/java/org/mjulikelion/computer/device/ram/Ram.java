package org.mjulikelion.computer.device.ram;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;

public class Ram extends Device {
    private final int capacity;

    public Ram(String name, int price, Manufacturer manufacturer, int capacity) {
        super(name, price, manufacturer);
        this.capacity = capacity;
    }

    @Override
    public void on() {
        System.out.println("RAM ON");
    }

    @Override
    public void off() {
        System.out.println("RAM OFF");
    }

    @Override
    public void run() {
        System.out.println(this.name + " 데이터를 읽습니다.");
    }
}
