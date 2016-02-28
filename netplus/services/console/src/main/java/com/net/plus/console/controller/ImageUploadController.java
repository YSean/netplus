package com.net.plus.console.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.net.plus.mapper.MetaImageMapper;
import com.net.plus.model.MetaImage;
import com.net.plus.util.Utils;
import com.net.plus.wechat.service.MediaService;

@Controller
@RequestMapping("/image")
public class ImageUploadController {
	Log log = LogFactory.getLog(ImageUploadController.class);

	@Autowired
	MetaImageMapper metaImageMapper;
	@Autowired
	MediaService mediaService;
	@RequestMapping(value = "upload.do")
	public String upload(
			@RequestParam(value = "file", required = true) MultipartFile file,
			HttpServletRequest request, ModelMap model) throws IOException {
		String path = request.getSession().getServletContext().getRealPath("upload");
		String fileName = file.getOriginalFilename();
		String fileType = "jpeg";
		if(fileName.indexOf(".")>0){
			fileType = fileName.substring(fileName.indexOf("."));
		}
		MetaImage image = new MetaImage();
		image.setImgData(file.getBytes());
		image.setImgId(Utils.getUuid());
		image.setImgName(fileName);
		image.setImgType(fileType);
		image.setImgSize(file.getSize());
		metaImageMapper.insert(image);
		return "common/imageUpload";
	}
	
	@RequestMapping(value = "publish.do")
	public String publish() throws IOException {
		//mediaService.uploadMedia("83a6d570-8aae-4f7f-a029-bd9d6002cefc", "f2b2efb1-6c9b-45dc-a5dc-d70f497b81d6", "image");
		return "common/imageUpload";
	}
}
