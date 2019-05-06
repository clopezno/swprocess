package metricsengine;

import metricsengine.values.IValue;
import model.Repository;

/**
 * Defines the interface of a metric.
 * 
 * @author MALB
 *
 */
public interface IMetric {
	
	/**
	 * Calculate the metric for a repository passed by parameter and add it to the set passed also by parameter.
	 * 
	 * @param repository Entity to be measured
	 * @param metricConfig Configuration to apply in the metric. 
	 * @param metricsResults Collector where to store the result.
	 * @return The calculated value or ValueUncalculated if imposible to calculate.
	 */
	IValue calculate(Repository repository,MetricConfiguration metricConfig, MetricsResults metricsResults);
}
