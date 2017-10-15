package com.company.dao;

import com.company.domain.File;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FileRepository extends CrudRepository<File, Long> {

	@Query("SELECT DISTINCT file FROM File file JOIN FETCH file.lineStatistics line ORDER BY file.fileName, line.lineNumber")
	List<File> getFilesWithStatistics();
}