package chapter03.section03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAroundPattern {

    public static void main(String[] args) {
        try {
            // Step 4. Pass lambdas
            String oneLine = processFile((BufferedReader br) -> br.readLine());
            System.out.println(oneLine);

            String twoLines = processFile((BufferedReader br) -> br.readLine() + "\n" + br.readLine());
            System.out.println(twoLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Step 1. Parameterise behaviour
    public static String processFile(BufferedReaderProcessor brp) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

            // Step 3. Execute behaviour
            return brp.process(br);
        }
    }
}
