package com.company.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "files")
public class File {
	private UUID fileId;
	private String fileName;
	private Set<LineStatistics> lineStatistics;

	public File() {}

	public File(UUID fileId) {
		this.fileId = fileId;
	}

	@Id
	@Column(name = "file_id")
	public UUID getFileId() {
		return fileId;
	}

	public void setFileId(UUID fileId) {
		this.fileId = fileId;
	}

	@Column(name = "file_name")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sourceFile")
	public Set<LineStatistics> getLineStatistics() {
		return lineStatistics;
	}

	public void setLineStatistics(Set<LineStatistics> lineStatistics) {
		this.lineStatistics = lineStatistics;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		File file = (File) o;

		return fileId != null ? fileId.equals(file.fileId) : file.fileId == null;
	}

	@Override
	public int hashCode() {
		return fileId != null ? fileId.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "File{" + "fileId=" + fileId + ", fileName='" + fileName + '\'' + '}';
	}
}
