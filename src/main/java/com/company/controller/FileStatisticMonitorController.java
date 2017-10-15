package com.company.controller;

import com.company.dao.FileRepository;
import com.company.domain.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FileStatisticMonitorController {
	@Autowired
	private FileRepository fileRepository;

	@RequestMapping(value = "/fileList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<File> fileList() {
		return fileRepository.getFilesWithStatistics();
	}

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
