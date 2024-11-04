import java.util.ArrayList;
import java.util.List;

public class ConcreteTVSeries extends TVSeries {
    private List<Episode> episodes;

    public ConcreteTVSeries(String title, String producer) {
        super(title, producer);
        this.episodes = new ArrayList<>();
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    @Override
    public void showDetails() {
        System.out.println("TV Series: " + getTitle() + ", Produced by: " + getProducer());
        for (Episode episode : episodes) {
            System.out.println(episode);
        }
    }
}
