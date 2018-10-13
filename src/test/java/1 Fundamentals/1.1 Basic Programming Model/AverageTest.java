import edu.princeton.cs.algs4.StdRandom;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Objects;

import static interceptor.StdIO.captureOutput;
import static interceptor.StdIO.injectInput;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageTest {

    @RepeatedTest(16)
    void main() {
        int size = StdRandom.uniform(1024) + 1;
        String input = captureOutput(() ->
                RandomSeq.main(
                        (String[]) Arrays.stream(new int[]{size, Integer.MIN_VALUE / size, Integer.MAX_VALUE / size})
                                .boxed()
                                .map(Objects::toString)
                                .toArray()));

        assertEquals(
                captureOutput(() -> injectInput(input, Average::main)),
                captureOutput(() -> injectInput(input, () -> edu.princeton.cs.algs4.Average.main(null)))
        );
    }
}