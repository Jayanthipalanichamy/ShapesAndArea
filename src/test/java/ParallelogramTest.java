import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParallelogramTest {
    private final double DELTA = 0.001;

    @Test
    public void shouldReturnAreaWhenLengthHeightAndBreadthIsGiven() {
        Parallelogram parallelogram = new Parallelogram(2, 3, 5);

        assertEquals(6, parallelogram.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnPerimeterWhenLengthHeightAndBreadthIsGiven() {
        Parallelogram parallelogram = new Parallelogram(2, 3, 5);

        assertEquals(14, parallelogram.calculatePerimeter(), DELTA);
    }

}
