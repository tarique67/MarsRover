import org.example.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverTest {

    @Test
    void expectExceptionWhenRoverCreatedWithInvalidCoordinates() {
        assertThrows(IllegalArgumentException.class, () -> new Rover(-1, -1, 'N'));
    }

    @Test
    void expectRoverToChangeDirectionToLeftFromNorth() {
        Rover rover = new Rover(0,0, 'N');
        String expected = "0 0 W";

        String actual = rover.move('L');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToChangeDirectionToLeftFromSouth() {
        Rover rover = new Rover(0,0, 'S');
        String expected = "0 0 E";

        String actual = rover.move('L');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToChangeDirectionToLeftFromEast() {
        Rover rover = new Rover(0,0, 'E');
        String expected = "0 0 N";

        String actual = rover.move('L');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToChangeDirectionToLeftFromWest() {
        Rover rover = new Rover(0,0, 'W');
        String expected = "0 0 S";

        String actual = rover.move('L');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToChangeDirectionToRightFromNorth() {
        Rover rover = new Rover(0,0, 'N');
        String expected = "0 0 E";

        String actual = rover.move('R');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToChangeDirectionToRightFromSouth() {
        Rover rover = new Rover(0,0, 'S');
        String expected = "0 0 W";

        String actual = rover.move('R');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToChangeDirectionToRightFromWest() {
        Rover rover = new Rover(0,0, 'W');
        String expected = "0 0 N";

        String actual = rover.move('R');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToChangeDirectionToRightFromEast() {
        Rover rover = new Rover(0,0, 'E');
        String expected = "0 0 S";

        String actual = rover.move('R');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToMoveTowardsNorth() {
        Rover rover = new Rover(0,0, 'N');
        String expected = "0 1 N";

        String actual = rover.move('M');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToMoveTowardsSouth() {
        Rover rover = new Rover(0,1, 'S');
        String expected = "0 0 S";

        String actual = rover.move('M');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToMoveTowardsEast() {
        Rover rover = new Rover(0,0, 'E');
        String expected = "1 0 E";

        String actual = rover.move('M');

        assertEquals(expected, actual);
    }

    @Test
    void expectRoverToMoveTowardsWest() {
        Rover rover = new Rover(1,0, 'W');
        String expected = "0 0 W";

        String actual = rover.move('M');

        assertEquals(expected, actual);
    }
}
