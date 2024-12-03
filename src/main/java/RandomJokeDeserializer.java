import com.google.gson.Gson;

public class RandomJokeDeserializer implements JokeDeserializer {
    @Override
    public Object deserialize(String read) {
        return new Gson().fromJson(read, RandomJokeGetResponse.class);
    }
}
