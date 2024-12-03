package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.Joke;

public class RandomJokeLoader {
    private final JokeReader reader;
    private final JokeDeserializer deserializer;
    private final JokeAdapter adapter;

    public RandomJokeLoader(JokeReader reader, JokeDeserializer deserializer, JokeAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public Joke load(){
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
