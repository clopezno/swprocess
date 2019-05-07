package model;

import java.util.Collection;
import java.util.Date;

/**
 * Stores the metrics that can be obtained directly from the repository and used to calculate the rest of the metrics.
 * 
 * @author Miguel Ángel León Bardavío - mlb0029
 *
 */
public class RepositoryInternalMetrics {
	
	/*Metrics that are obtained directly from the repository.*/
	
	/**
	 * Total number of issues.
	 */
	private Integer totalNumberOfIssues = null;
	/**
	 * Total number of commits.
	 */
	private Integer totalNumberOfCommits = null;
	/**
	 * Number of closed issues.
	 */
	private Integer numberOfClosedIssues = null;
	/**
	 * Days to close each issue.
	 */
	private Collection<Integer> daysToCloseEachIssue = null;
	/**
	 * Dates of commits.
	 */
	private Collection<Date> commitDates = null;
	/**
	 * Number of months that have passed since the creation of the repository
	 * until the date of last activity.
	 */
	private Integer lifeSpanMonths = null;

	public RepositoryInternalMetrics() {}
	
	/**
	 * Sets all the metrics.
	 *
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @param totalNumberOfIssues Total number of issues.
	 * @param totalNumberOfCommits Total number of commits.
	 * @param numberOfClosedIssues Number of closed issues.
	 * @param daysToCloseEachIssue Days to close each issue.
	 * @param commitDates Dates of commits.
	 * @param lifeSpanMonths Number of months that have passed since the creation of the repository
	 * until the date of last activity.
	 */
	public RepositoryInternalMetrics(Integer totalNumberOfIssues, Integer totalNumberOfCommits, Integer numberOfClosedIssues,
			Collection<Integer> daysToCloseEachIssue, Collection<Date> commitDates, Integer lifeSpanMonths) {
		setTotalNumberOfIssues(totalNumberOfIssues);
		setTotalNumberOfCommits(totalNumberOfCommits);
		setNumberOfClosedIssues(numberOfClosedIssues);
		setDaysToCloseEachIssue(daysToCloseEachIssue);
		setCommitDates(commitDates);
		setLifeSpanMonths(lifeSpanMonths);
	}

	/**
	 * Gets the Total number of issues.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @return the totalNumberOfIssues
	 */
	public Integer getTotalNumberOfIssues() {
		return totalNumberOfIssues;
	}

	/**
	 * Sets the Total number of issues.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @param totalNumberOfIssues Total number of issues.
	 */
	private void setTotalNumberOfIssues(Integer totalNumberOfIssues) {
		this.totalNumberOfIssues = totalNumberOfIssues;
	}

	/**
	 * Gets the Total number of commits.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @return the totalNumberOfCommits
	 */
	public Integer getTotalNumberOfCommits() {
		return totalNumberOfCommits;
	}

	/**
	 * Sets the Total number of commits.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @param totalNumberOfCommits Total number of commits.
	 */
	private void setTotalNumberOfCommits(Integer totalNumberOfCommits) {
		this.totalNumberOfCommits = totalNumberOfCommits;
	}

	/**
	 * Gets the Number of closed issues.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @return the numberOfClosedIssues
	 */
	public Integer getNumberOfClosedIssues() {
		return numberOfClosedIssues;
	}

	/**
	 * Sets the Number of closed issues.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @param numberOfClosedIssues Number of closed issues.
	 */
	private void setNumberOfClosedIssues(Integer numberOfClosedIssues) {
		this.numberOfClosedIssues = numberOfClosedIssues;
	}

	/**
	 * Gets the Days to close each issue.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @return the daysToCloseEachIssue
	 */
	public Collection<Integer> getDaysToCloseEachIssue() {
		return daysToCloseEachIssue;
	}

	/**
	 * Sets the Days to close each issue.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @param daysToCloseEachIssue Days to close each issue.
	 */
	private void setDaysToCloseEachIssue(Collection<Integer> daysToCloseEachIssue) {
		this.daysToCloseEachIssue = daysToCloseEachIssue;
	}

	/**
	 * Gets the Dates of commits.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @return the commitDates
	 */
	public Collection<Date> getCommitDates() {
		return commitDates;
	}

	/**
	 * Sets the Dates of commits.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @param commitDates Dates of commits.
	 */
	private void setCommitDates(Collection<Date> commitDates) {
		this.commitDates = commitDates;
	}

	/**
	 * Gets the Number of months that have passed since the creation of the repository
	 * until the date of last activity.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @return Number of months that have passed since the creation of the repository
	 * until the date of last activity.
	 */
	public Integer getLifeSpanMonths() {
		return lifeSpanMonths;
	}

	/**
	 * Sets the Number of months that have passed since the creation of the repository
	 * until the date of last activity.
	 * 
	 * @author Miguel Ángel León Bardavío - mlb0029
	 * @param lifeSpanMonths Number of months that have passed since the creation of the repository
	 * until the date of last activity.
	 */
	private void setLifeSpanMonths(Integer lifeSpanMonths) {
		this.lifeSpanMonths = lifeSpanMonths;
	}
}