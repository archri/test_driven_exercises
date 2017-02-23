import org.junit.Assert;
import org.junit.Test;

public class MovieTest {
    @Test
    public void testRating() {
        Movie starWars = new Movie("Star Wars");
        starWars.addRating(3);
        starWars.addRating(5);
        Assert.assertEquals("Bad average rating.", 4, starWars.getAverageRating());
    }

    @Test
    public void testLotsOfRatings() {
        Movie godzilla = new Movie("Godzilla");
        godzilla.addRating(1);
        godzilla.addRating(5);
        godzilla.addRating(1);
        godzilla.addRating(2);
        Assert.assertEquals("Bad average rating.", 2, godzilla.getAverageRating());
    }

    public class Movie {
        private int totalRating = 0;
        private int numberOfRatings = 0;

        public String name;

        public Movie(String name) {
            this.name = name;
        }

        public void addRating(int newRating) {
            this.totalRating += newRating;
            this.numberOfRatings++;
        }

        public int getAverageRating() {
            return this.totalRating / this.numberOfRatings;
        }
    }
}
