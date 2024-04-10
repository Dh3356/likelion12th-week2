package org.mjulikelion.computer.device;

import java.util.List;
import org.mjulikelion.computer.device.cooler.Cooler;
import org.mjulikelion.computer.device.cpu.Cpu;
import org.mjulikelion.computer.device.gpu.GraphicsCard;
import org.mjulikelion.computer.device.keyboard.KeyBoard;
import org.mjulikelion.computer.device.monitor.Monitor;
import org.mjulikelion.computer.device.mouse.Mouse;
import org.mjulikelion.computer.device.psu.PowerSupplier;
import org.mjulikelion.computer.device.ram.Ram;

// 제조사
public enum Manufacturer {
    INTEL(List.of(Cpu.class)),
    AMD(List.of(Cpu.class, GraphicsCard.class)),
    SAMSUNG(List.of(Ram.class, Monitor.class)),
    KINGSTON(List.of(Ram.class)),
    NVIDIA(List.of(GraphicsCard.class)),
    COOLER_MASTER(List.of(PowerSupplier.class, Cooler.class)),
    THERMALTAKE(List.of(PowerSupplier.class, Cooler.class)),
    LOGITECH(List.of(Mouse.class, KeyBoard.class)),
    RAZER(List.of(Mouse.class, KeyBoard.class)),
    LG(List.of(Monitor.class));

    // 제조사가 생산하는 기기 목록
    // Device 클래스를 상속받은 클래스만 추가 가능 ex) Cpu, GraphicsCard, Ram, Monitor, PowerSupplier, Cooler, Mouse, KeyBoard
    private final List<Class<? extends Device>> deviceList;

    // 제조사가 생산하는 기기 목록을 받아서 초기화
    Manufacturer(List<Class<? extends Device>> deviceList) {
        this.deviceList = deviceList;
    }

    // 제조사가 특정 기기를 생산하는지 확인
    public static boolean isDeviceSupportedByManufacturer(Manufacturer manufacturer, Class<? extends Device> device) {
        return manufacturer.getDeviceList().contains(device);
    }

    // 제조사가 생산하는 기기 목록을 반환
    private List<Class<? extends Device>> getDeviceList() {
        return this.deviceList;
    }
}
