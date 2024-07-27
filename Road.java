public class Road {
    public enum LaneType {
        NATIONAL_HIGHWAY(4),
        INTER_STATE_HIGHWAY(3),
        HIGHWAY(2),
        MAIN_ROAD(1);

        private final int lanes;

        LaneType(int lanes) {
            this.lanes = lanes;
        }

        public int getLanes() {
            return lanes;
        }
    }

    private City city1;
    private City city2;
    private LaneType laneType;

    public Road(City city1, City city2, LaneType laneType) {
        this.city1 = city1;
        this.city2 = city2;
        this.laneType = laneType;
    }

    // Getters
    public City getCity1() {
        return city1;
    }

    public City getCity2() {
        return city2;
    }

    public LaneType getLaneType() {
        return laneType;
    }
}
