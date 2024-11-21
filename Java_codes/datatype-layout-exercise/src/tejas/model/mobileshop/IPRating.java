package tejas.model.mobileshop;

public enum IPRating {
	IP66("IP66"),  // Protected against powerful jets of water
    IP67("IP67"),  // Protected against immersion in water up to 1 meter for 30 minutes
    IP68("IP68");  // Protected against immersion in water beyond 1 meter for extended periods

    private final String rating;

    IPRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return rating;
    }
}
