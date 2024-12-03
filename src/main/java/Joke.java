public record Joke(String setup, String punchline) {
    @Override
    public String toString() {
        return "Joke{" + setup + " "  + punchline + '}';
    }
}
