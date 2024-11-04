public abstract class TVSeries {
    private String title;
    private String producer;

    public TVSeries(String title, String producer) {
        this.title = title;
        this.producer = producer;
    }

    public String getTitle() {
        return title;
    }

    public String getProducer() {
        return producer;
    }

    public abstract void showDetails();
}


