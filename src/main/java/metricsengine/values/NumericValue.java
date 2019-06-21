package metricsengine.values;

/**
 * @author Miguel Ángel León Bardavío - mlb0029
 *
 */
public abstract class NumericValue implements IValue {
	/**
	 * Description.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 */
	private static final long serialVersionUID = 6874013537289624369L;
	public abstract int intValue();
	public abstract long longValue();
	public abstract double doubleValue();
}
