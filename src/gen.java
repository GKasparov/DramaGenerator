import java.io.IOException;
import java.util.stream.IntStream;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gen {
    public static void main(String[] args) {
        IntStream.range(0,1000000).forEach($ -> System.out.println(fillTemplate(pickLine(readLines("list")))));
   }
    private static final Pattern PATTERN = Pattern.compile("%([A-Za-z]+)");

    public static String pickLine(List<String> List) {
        return List.get(ThreadLocalRandom.current().nextInt(List.size()));
    }
    public static List<String> readLines(String file) {
        try {
            return Files.readAllLines(Paths.get("lists", file + ".txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
        }
    public static String fillTemplate(String string) {
        return PATTERN.matcher(string).replaceAll(result -> Matcher.quoteReplacement(pickLine(readLines(result.group(1)))));
    }
}
