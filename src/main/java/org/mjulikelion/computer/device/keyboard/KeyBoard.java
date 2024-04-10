package org.mjulikelion.computer.device.keyboard;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;
import org.mjulikelion.computer.device.keyboard.resources.Type;

public class KeyBoard extends Device {
    private final Type type;

    public KeyBoard(String name, int price, Manufacturer manufacturer, Type type) {
        super(name, price, manufacturer);
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println(this.name + " 타이핑합니다.");
    }

    @Override
    public void on() {
        System.out.println("KeyBoard ON");
    }

    @Override
    public void off() {
        System.out.println("KeyBoard OFF");
    }
}
