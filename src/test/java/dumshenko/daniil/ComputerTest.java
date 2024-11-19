package dumshenko.daniil;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void testEquals_SameAttributes_ShouldReturnTrue() {
        UUID serialNumber = UUID.randomUUID();
        Computer computer1 = new Computer(16, 8, "Dell XPS", serialNumber, OperatingSystem.WINDOWS);
        Computer computer2 = new Computer(16, 8, "Dell XPS", serialNumber, OperatingSystem.WINDOWS);

        assertEquals(computer1, computer2, "Computers with the same attributes should be equal");
    }

    @Test
    void testEquals_DifferentSerialNumber_ShouldReturnFalse() {
        Computer computer1 = new Computer(16, 8, "Dell XPS", UUID.randomUUID(), OperatingSystem.WINDOWS);
        Computer computer2 = new Computer(16, 8, "Dell XPS", UUID.randomUUID(), OperatingSystem.WINDOWS);

        assertNotEquals(computer1, computer2, "Computers with different serial numbers should not be equal");
    }

    @Test
    void testHashCode_SameAttributes_ShouldReturnSameHash() {
        UUID serialNumber = UUID.randomUUID();
        Computer computer1 = new Computer(16, 8, "Dell XPS", serialNumber, OperatingSystem.WINDOWS);
        Computer computer2 = new Computer(16, 8, "Dell XPS", serialNumber, OperatingSystem.WINDOWS);

        assertEquals(computer1.hashCode(), computer2.hashCode(), "Computers with the same attributes should have the same hash code");
    }

    @Test
    void testHashCode_DifferentAttributes_ShouldReturnDifferentHash() {
        Computer computer1 = new Computer(16, 8, "Dell XPS", UUID.randomUUID(), OperatingSystem.WINDOWS);
        Computer computer2 = new Computer(32, 12, "MacBook Pro", UUID.randomUUID(), OperatingSystem.MACOS);

        assertNotEquals(computer1.hashCode(), computer2.hashCode(), "Computers with different attributes should have different hash codes");
    }

    @Test
    void testEquals_NullObject_ShouldReturnFalse() {
        Computer computer = new Computer(16, 8, "Dell XPS", UUID.randomUUID(), OperatingSystem.WINDOWS);

        assertNotEquals(computer, null, "Computer should not be equal to null");
    }

    @Test
    void testEquals_DifferentClass_ShouldReturnFalse() {
        Computer computer = new Computer(16, 8, "Dell XPS", UUID.randomUUID(), OperatingSystem.WINDOWS);

        assertNotEquals(computer, "SomeString", "Computer should not be equal to an object of a different class");
    }
}
