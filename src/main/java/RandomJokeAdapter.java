public class RandomJokeAdapter implements JokeAdapter {
    @Override
    public Joke adapt(Object obj) {
        return adapt((RandomJokeGetResponse) obj);
    }

    public Joke adapt(RandomJokeGetResponse response) {
        return new Joke(response.setup(), response.punchline());
    }
}
