package org.mjulikelion;

import org.mjulikelion.computer.Computer;
import org.mjulikelion.computer.device.Manufacturer;
import org.mjulikelion.computer.device.cpu.Cpu;
import org.mjulikelion.computer.device.cpu.resources.Purpose;
import org.mjulikelion.computer.device.gpu.GraphicsCard;
import org.mjulikelion.computer.device.keyboard.KeyBoard;
import org.mjulikelion.computer.device.keyboard.resources.Type;
import org.mjulikelion.computer.device.monitor.Monitor;
import org.mjulikelion.computer.device.mouse.Mouse;
import org.mjulikelion.computer.device.psu.PowerSupplier;
import org.mjulikelion.computer.device.ram.Ram;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .cpu(new Cpu("i7-10400K", 500000, Manufacturer.INTEL, 3000, Purpose.GAME))
                .ram(new Ram("Samsung ddr3", 200000, Manufacturer.SAMSUNG, 16))
                .graphicsCard(new GraphicsCard("GTX 3080", 1500000, Manufacturer.NVIDIA, Purpose.GAME))
                .powerSupplier(new PowerSupplier("Cooler Master 120s", 100000, Manufacturer.COOLER_MASTER, "700W"))
                .monitor(new Monitor("LG-WSQ27EWR", 300000, Manufacturer.LG, 27))
                .build();

        Computer computer2 = new Computer.Builder()
                .cpu(new Cpu("i5-1044F", 300000, Manufacturer.INTEL, 3000, Purpose.OFFICE))
                .ram(new Ram("Samsung ddr4", 200000, Manufacturer.SAMSUNG, 8))
                .graphicsCard(new GraphicsCard("GTX 1060", 500000, Manufacturer.NVIDIA, Purpose.OFFICE))
                .powerSupplier(new PowerSupplier("Cooler Master 34f", 100000, Manufacturer.COOLER_MASTER, "500W"))
                .mouse(new Mouse("Logitech G102", 50000, Manufacturer.LOGITECH))
                .keyBoard(new KeyBoard("Razer mechanic 23", 50000, Manufacturer.RAZER, Type.ANSI))
                .build();

        computer1.boot();
        System.out.println("\n\n");// 가독성을 위해 추가
        computer1.run();
        System.out.println("\n\n");// 가독성을 위해 추가
        computer1.shutDown();
        System.out.println("\n\n");// 가독성을 위해 추가
        System.out.println("\n\n");// 가독성을 위해 추가
        computer2.boot();
        System.out.println("\n\n");// 가독성을 위해 추가
        computer2.run();
        System.out.println("\n\n");// 가독성을 위해 추가
        computer2.shutDown();
    }
}