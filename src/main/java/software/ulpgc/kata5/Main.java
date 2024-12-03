package software.ulpgc.kata5;

import software.ulpgc.kata5.io.RandomJokeAdapter;
import software.ulpgc.kata5.io.RandomJokeDeserializer;
import software.ulpgc.kata5.io.RandomJokeLoader;
import software.ulpgc.kata5.io.RandomJokeReader;

public class Main {
    public static void main(String[] args) {
        RandomJokeLoader loader = new RandomJokeLoader(new RandomJokeReader(), new RandomJokeDeserializer(), new RandomJokeAdapter());
        for (int i = 0; i < 3; i++) {
            System.out.println(loader.load());
        }
    }
}
