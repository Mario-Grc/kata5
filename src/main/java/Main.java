public class Main {
    public static void main(String[] args) {
        RandomJokeLoader loader = new RandomJokeLoader(new RandomJokeReader(), new RandomJokeDeserializer(), new RandomJokeAdapter());
        for (int i = 0; i < 3; i++) {
            System.out.println(loader.load());
        }
    }
}
