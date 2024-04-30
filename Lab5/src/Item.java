abstract class Item {
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    Item() {
        this.title = "";
    }

    Item(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    abstract public String getListing();
}
