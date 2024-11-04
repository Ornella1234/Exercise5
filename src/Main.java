public class Main {
    public static void main(String[] args) {
        ConcreteTVSeries tvSeries = new ConcreteTVSeries("My Favorite Show", "Nella Rosy");

        Episode episode1 = new Episode(1, "Pilot", "The beginning of their forever.");
        Episode episode2 = new Episode(2, "The Wedding", "An exciting day to remember.");
        Episode episode3 = new Episode(3, "Who killed my husband", "The secrets and tragedy .");

        tvSeries.addEpisode(episode1);
        tvSeries.addEpisode(episode2);
        tvSeries.addEpisode(episode3);

        tvSeries.showDetails();
    }
}
