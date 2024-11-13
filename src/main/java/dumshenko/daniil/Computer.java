package dumshenko.daniil;

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