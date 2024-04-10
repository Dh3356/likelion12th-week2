package org.mjulikelion.computer.device.cpu;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;
import org.mjulikelion.computer.device.cpu.resources.Purpose;

public class Cpu extends Device {
    private final int speed;
    private final Purpose purpose;

    public Cpu(String name, int price, Manufacturer manufacturer, int speed, Purpose purpose) {
        super(name, price, manufacturer);
        this.speed = speed;
        this.purpose = purpose;
    }

    @Override
    public void on() {
        System.out.println("Cpu ON");
    }

    @Override
    public void off() {
        System.out.println("CPU OFF");
    }

    @Override
    public void run() {
        System.out.println(this.name + " 명령어를 처리합니다.");
    }
}
