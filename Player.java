class Player {
    private int position;
    private String name;

    public Player(String name) {
        this.name = name;
        position = 0;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int step) {
        position = step;
    }

}