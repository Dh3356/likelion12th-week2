package org.mjulikelion.computer.device.gpu;

import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.Manufacturer;
import org.mjulikelion.computer.device.cpu.resources.Purpose;

public class GraphicsCard extends Device {
    private final Purpose purpose;

    public GraphicsCard(String name, int price, Manufacturer manufacturer, Purpose purpose) {
        super(name, price, manufacturer);
        this.purpose = purpose;
    }

    @Override
    public void on() {
        System.out.println("Graphics Card ON");
    }

    @Override
    public void off() {
        System.out.println("Graphics Card OFF");
    }

    @Override
    public void run() {
        System.out.println(this.name + " 화면을 렌더링합니다.");
    }
}
