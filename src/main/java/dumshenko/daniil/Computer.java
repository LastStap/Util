package dumshenko.daniil;

import java.util.Objects;
import java.util.UUID;

enum OperatingSystem {
    WINDOWS,
    LINUX,
    MACOS
}

public class Computer {
    private final int ram;
    private final int cores;
    private final String name;
    private final UUID serialNumber;
    private final OperatingSystem os;

    public Computer(int ram, int cores, String name, UUID serialNumber, OperatingSystem os) {
        this.ram = ram;
        this.cores = cores;
        this.name = name;
        this.serialNumber = serialNumber;
        this.os = os;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram &&
                cores == computer.cores &&
                Objects.equals(name, computer.name) &&
                Objects.equals(serialNumber, computer.serialNumber) &&
                os == computer.os;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, cores, name, serialNumber, os);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM=" + ram + "GB" +
                ", Cores=" + cores +
                ", Name='" + name + '\'' +
                ", SerialNumber=" + serialNumber +
                ", OS=" + os +
                '}';
    }

    public int getRam() {
        return ram;
    }

    public int getCores() {
        return cores;
    }

    public String getName() {
        return name;
    }

    public UUID getSerialNumber() {
        return serialNumber;
    }

    public OperatingSystem getOs() {
        return os;
    }
}
