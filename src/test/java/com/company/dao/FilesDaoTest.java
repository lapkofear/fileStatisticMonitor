package com.company.dao;

import com.company.domain.File;
import com.company.domain.LineStatistics;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SqlGroup({@Sql("/clean-db.sql"), @Sql})
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class FilesDaoTest {

	@Autowired
	private FileRepository filesDao;

	@Test
	public void getAllFilesWithFetchedLinesTest() {
		List<File> filesWithStatistics = filesDao.getFilesWithStatistics();
		Assert.assertThat(filesWithStatistics, Is.is(Arrays.asList(
				new File(UUID.fromString("bd48f399-6299-413e-a1a3-de7fdd2a3554")),
				new File(UUID.fromString("a9f2760e-60a6-49b9-93d7-e4848fbfe4dd")))));
		Assert.assertThat(filesWithStatistics.get(0).getLineStatistics().toArray(), Is.is(new LineStatistics[]{//testing line sorting
				new LineStatistics(UUID.fromString("7a566213-50ea-4451-ac74-70cdd158da8d")),
				new LineStatistics(UUID.fromString("7a566213-50ea-4451-ac74-70cdd158d38d")),
				new LineStatistics(UUID.fromString("fffc410f-bd26-46ca-802f-45e95013b517"))}));
		Assert.assertThat(filesWithStatistics.get(1).getLineStatistics().toArray(), Is.is(new LineStatistics[]{
				new LineStatistics(UUID.fromString("aba2af47-b8eb-48c7-8976-84cbcf5c1764"))}));
	}
}