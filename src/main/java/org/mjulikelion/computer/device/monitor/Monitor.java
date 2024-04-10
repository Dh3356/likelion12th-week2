package org.mjulikelion.computer.device.monitor;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;

public class Monitor extends Device {
    private final int size;

    public Monitor(String name, int price, Manufacturer manufacturer, int size) {
        super(name, price, manufacturer);
        this.size = size;
    }

    @Override
    public void run() {
        System.out.println(this.name + " 화면을 출력합니다.");
    }

    @Override
    public void on() {
        System.out.println("Monitor ON");
    }

    @Override
    public void off() {
        System.out.println("Monitor OFF");
    }
}
