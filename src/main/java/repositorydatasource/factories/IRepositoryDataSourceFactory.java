package repositorydatasource.factories;

import org.gitlab4j.api.GitLabApiException;

import repositorydatasource.IRepositoryDataSource;

/**
 * Factory interface of repository data sources.
 * 
 * @author MALB
 *
 */
public interface IRepositoryDataSourceFactory {
	IRepositoryDataSource createRepositoryDataSource() throws GitLabApiException;
}