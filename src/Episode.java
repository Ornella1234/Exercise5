public class Episode {
    private int episodeNumber;
    private String episodeTitle;
    private String storySynopsis;

    public Episode(int episodeNumber, String episodeTitle, String storySynopsis) {
        this.episodeNumber = episodeNumber;
        this.episodeTitle = episodeTitle;
        this.storySynopsis = storySynopsis;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public String getStorySynopsis() {
        return storySynopsis;
    }

    @Override
    public String toString() {
        return "Episode " + episodeNumber + ": " + episodeTitle + " - " + storySynopsis;
    }
}
