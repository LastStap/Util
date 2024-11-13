package dumshenko.daniil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.UUID;

public class OperatingSystemTest {

    @Test
    public void testToString() {
        UUID serialNumber = UUID.randomUUID();

        Computer computer = new Computer(16, 8, "Gaming PC", serialNumber, OperatingSystem.WINDOWS);

        String expectedOutput = "Computer{" +
                "RAM=16GB" +
                ", Cores=8" +
                ", Name='Gaming PC'" +
                ", SerialNumber=" + serialNumber +
                ", OS=WINDOWS" +
                '}';

        assertEquals(expectedOutput, computer.toString());
    }
}