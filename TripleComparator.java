import java.util.Comparator;

/**
 *
 * @author gian 
 *
 */

public class TripleComparator implements Comparator<Triple> {
	public int compare(Triple t1, Triple t2)
	{
		return t1.getTimestamp() - t2.getTimestamp();
	}
}