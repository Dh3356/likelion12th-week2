package org.mjulikelion.computer;

import java.util.LinkedList;
import java.util.List;
import org.mjulikelion.computer.device.Device;
import org.mjulikelion.computer.device.cooler.Cooler;
import org.mjulikelion.computer.device.cpu.Cpu;
import org.mjulikelion.computer.device.gpu.GraphicsCard;
import org.mjulikelion.computer.device.keyboard.KeyBoard;
import org.mjulikelion.computer.device.monitor.Monitor;
import org.mjulikelion.computer.device.mouse.Mouse;
import org.mjulikelion.computer.device.psu.PowerSupplier;
import org.mjulikelion.computer.device.ram.Ram;

public class Computer {
    private final Cpu cpu;
    private final Ram ram;
    private final GraphicsCard graphicsCard;
    private final PowerSupplier powerSupplier;
    private final List<Device> additionalDevices;// 선택적 장치들

    public Computer(Cpu cpu, Ram ram, GraphicsCard graphicsCard, PowerSupplier powerSupplier) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupplier = powerSupplier;
        this.additionalDevices = new LinkedList<>();
    }

    public void boot() {
        System.out.println("컴퓨터 부팅합니다.");
        this.cpu.on();
        this.ram.on();
        this.graphicsCard.on();
        this.powerSupplier.on();
        this.additionalDevices.forEach(Device::on);
    }

    public void shutDown() {
        System.out.println("컴퓨터 종료합니다.");
        this.cpu.off();
        this.ram.off();
        this.graphicsCard.off();
        this.powerSupplier.off();
        this.additionalDevices.forEach(Device::off);
    }

    public void run() {
        System.out.println("컴퓨터 작동합니다.");
        this.cpu.run();
        this.ram.run();
        this.graphicsCard.run();
        this.powerSupplier.run();
        this.additionalDevices.forEach(Device::run);
    }

    // Builder Pattern
    public static class Builder {
        private Cpu cpu;
        private Ram ram;
        private GraphicsCard graphicsCard;
        private PowerSupplier powerSupplier;
        private Cooler cooler;// 선택적 장치들
        private Mouse mouse;// 선택적 장치들
        private KeyBoard keyBoard;// 선택적 장치들
        private Monitor monitor;// 선택적 장치들

        public Builder cpu(Cpu cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(Ram ram) {
            this.ram = ram;
            return this;
        }

        public Builder graphicsCard(GraphicsCard graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder powerSupplier(PowerSupplier powerSupplier) {
            this.powerSupplier = powerSupplier;
            return this;
        }

        public Builder cooler(Cooler cooler) {
            this.cooler = cooler;
            return this;
        }

        public Builder mouse(Mouse mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder keyBoard(KeyBoard keyBoard) {
            this.keyBoard = keyBoard;
            return this;
        }

        public Builder monitor(Monitor monitor) {
            this.monitor = monitor;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer(cpu, ram, graphicsCard, powerSupplier);

            // 선택적 장치들이 null이 아닐 경우 추가
            if (cooler != null) {
                computer.additionalDevices.add(cooler);
            }
            if (mouse != null) {
                computer.additionalDevices.add(mouse);
            }
            if (keyBoard != null) {
                computer.additionalDevices.add(keyBoard);
            }
            if (monitor != null) {
                computer.additionalDevices.add(monitor);
            }
            return computer;
        }
    }
}
