import junit.framework.Assert;
import org.junit.Test;

public class ListTest {
	@Test
	public void testEmptyList() {
		MovieList emptyList = new MovieList();
		Assert.assertEquals("Empty list should have size of 0", 0, emptyList.size());
	}
	
	public class MovieList {
		public int size() {
			return 0;
		}
	}
}
