package com.net.plus.console.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/image")
public class ImageUploadController {
	Log log = LogFactory.getLog(ImageUploadController.class);

	@RequestMapping(value = "upload.do")
	public String upload(
			@RequestParam(value = "file", required = false) MultipartFile file,
			HttpServletRequest request, ModelMap model) {
		System.out.println("开始");
		String path = request.getSession().getServletContext()
				.getRealPath("upload");
		String fileName = file.getOriginalFilename();
		// String fileName = new Date().getTime()+".jpg";
		System.out.println(path);
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}

		//保存
		try {
			file.transferTo(targetFile);
		} catch (Exception e) {
			log.error(e,e);
		}
		model.addAttribute("fileUrl", request.getContextPath() + "/upload/"
				+ fileName);
		return "common/imageUpload";
	}
}
