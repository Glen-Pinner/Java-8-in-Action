package chapter03.section03;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {

    // Step 2. Use a functional interface to pass behaviours
    String process(BufferedReader br) throws IOException;
}
