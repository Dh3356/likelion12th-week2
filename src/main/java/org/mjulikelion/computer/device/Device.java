package org.mjulikelion.computer.device;

import static org.mjulikelion.computer.device.Manufacturer.isDeviceSupportedByManufacturer;

// 장치 추상 클래스
// 추상 클래스로 만든 이유는 공통된 기능을 갖는 클래스의 구조화를 위함
// 추상 클래스이기 때문에 Device 클래스를 생성할 수 없음. 상속을 통해 구현해야 함
public abstract class Device implements Turnable {
    protected String name;// 장치 이름
    protected int price;// 장치 가격
    protected Manufacturer manufacturer;// 제조사

    // 생성자
    // protected로 선언한 이유는 Device 클래스를 상속받은 클래스에서만 생성자를 사용할 수 있도록 하기 위함
    protected Device(String name, int price, Manufacturer manufacturer) {
        this.validateManufacturer(manufacturer);// 제조사 유효성 검사
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    // 제조사 유효성 검사
    // 해당 제조사가 이 장치를 지원하지 않으면 IllegalArgumentException 발생
    private void validateManufacturer(Manufacturer manufacturer) {
        if (!isDeviceSupportedByManufacturer(manufacturer, this.getClass())) {
            throw new IllegalArgumentException("해당 제조사는 이 장치를 지원하지 않습니다.");
        }
    }

    // 장치 실행 메서드
    public abstract void run();
}
