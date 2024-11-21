package tejas.model.bookshelf;

public enum RATING {
	POOR(1), NOT_SATISFIED(2), SATISFIED(3), GOOD(4), EXCELLENT(5);

	private final Integer ratingNumber;

	RATING(Integer ratingNumber) {
		this.ratingNumber = ratingNumber;
	}

	public Integer getRatingNumer() {
		return this.ratingNumber;
	}

	public static RATING fromValue(int value) {
		for (RATING rating : RATING.values()) {
			if (rating.getRatingNumer() == value) {
				return rating;
			}
		}
		throw new IllegalArgumentException("Invalid rating value: " + value);
	}
}
