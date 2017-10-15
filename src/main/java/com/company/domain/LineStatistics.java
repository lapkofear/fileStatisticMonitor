package com.company.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "line_statistics")
public class LineStatistics {
	private UUID lineId;
	private File sourceFile;

	private int lineNumber;
	private int lineLength;
	private String longestWord;
	private String shortestWord;
	private double averageWordLength;

	public LineStatistics() {
	}

	public LineStatistics(UUID lineId) {
		this.lineId = lineId;
	}

	@Id
	@Column(name = "line_id")
	public UUID getLineId() {
		return lineId;
	}

	public void setLineId(UUID lineId) {
		this.lineId = lineId;
	}

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="file_id", nullable=false)
	@JsonIgnore
	public File getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(File sourceFile) {
		this.sourceFile = sourceFile;
	}

	@Column(name = "line_number")
	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Column(name = "line_length")
	public int getLineLength() {
		return lineLength;
	}

	public void setLineLength(int lineLength) {
		this.lineLength = lineLength;
	}

	@Column(name = "longest_word")
	public String getLongestWord() {
		return longestWord;
	}

	public void setLongestWord(String longestWord) {
		this.longestWord = longestWord;
	}

	@Column(name = "shortest_word")
	public String getShortestWord() {
		return shortestWord;
	}

	public void setShortestWord(String shortestWord) {
		this.shortestWord = shortestWord;
	}

	@Column(name = "average_word_length")
	public double getAverageWordLength() {
		return averageWordLength;
	}

	public void setAverageWordLength(double averageWordLength) {
		this.averageWordLength = averageWordLength;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		LineStatistics that = (LineStatistics) o;

		return lineId != null ? lineId.equals(that.lineId) : that.lineId == null;
	}

	@Override
	public int hashCode() {
		return lineId != null ? lineId.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "LineStatistics{" + "lineId=" + lineId + ", sourceFile=" + sourceFile + ", lineNumber=" + lineNumber + '}';
	}
}
