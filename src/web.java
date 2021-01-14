import static spark.Spark.*;

public class web {

    public static void main(String[] args) {
        port(8080);
        get("/", (req, rest) -> gen.fillTemplate(gen.pickLine(gen.readLines("list"))));
    }
}

