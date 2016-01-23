package com.net.plus.console.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.net.plus.common.Constants;
import com.net.plus.exception.NetValidationException;
import com.net.plus.mapper.SvrInfoMapper;
import com.net.plus.model.SvrInfo;
import com.net.plus.model.SvrInfoExample;
import com.net.plus.util.DateUtils;

@Controller
@RequestMapping("/svrInfo")
public class SvrInfoController {

	Log log = LogFactory.getLog(SvrInfoController.class);
	@Autowired
	SvrInfoMapper svrInfoMapper;
	
	@RequestMapping(value = "svrList.do")
	public ModelAndView getSvrList(HttpServletRequest request,HttpServletResponse response ){
		List<SvrInfo> svrList = svrInfoMapper.selectByExample(null);
		ModelAndView model = new ModelAndView("svrInfo/svrList");
		model.addObject("SvrList", svrList);
		return model;
	}
	@RequestMapping(value = "svrAdd.do")
	public String goSvrAdd(){
		return "svrInfo/svrAdd";
	}
	@RequestMapping(value = "svrAddResult.do")
	public ModelAndView doSvrAdd(SvrInfo svrInfo) throws NetValidationException{
		log.debug(svrInfo);
		ModelAndView model = new ModelAndView("svrInfo/svrResult");
		
		if(svrInfo==null){
			throw new  NetValidationException("svrInfo.is.empty");
		}
		svrInfo.setSvrSeq(UUID.randomUUID().toString());
		svrInfo.setCtime(DateUtils.currentDate());
		svrInfo.setState(Constants.OK);
		svrInfo.setUrlRecv(Constants.wechatUrl);
		
		try{
			svrInfoMapper.insert(svrInfo);
			model.addObject("OperResult","成功");
		}catch(Exception ex){
			log.error(ex,ex);
			model.addObject("OperResult","失败");
			model.addObject("OperMessage",ex.getMessage());
		}finally{
			model.addObject("OperName", "新增公众号");
			model.addObject("OperTime",DateUtils.currentDateStr());
		}
		return model;
	}
	
	@RequestMapping(value = "svrChangeState.do")
	public ModelAndView doSvrAdd(@RequestParam (value="svrSeq",required=true) String svrSeq
			,@RequestParam(value="svrState",defaultValue=Constants.OFF) String svrState) throws NetValidationException{
		log.info("close Svr Info"+svrSeq);
		ModelAndView model = new ModelAndView("svrInfo/svrResult");
		
		
		try{
			SvrInfo svrInfo = new SvrInfo();
			svrInfo.setState(svrState);
			SvrInfoExample example = new SvrInfoExample();
			example.createCriteria().andSvrSeqEqualTo(svrSeq);
			int i = svrInfoMapper.updateByExampleSelective(svrInfo,example);
			if(i<=0) throw new NetValidationException("找不到记录");
			model.addObject("OperResult","成功");
		}catch(Exception ex){
			log.error(ex,ex);
			model.addObject("OperResult","失败");
			model.addObject("OperMessage",ex.getMessage());
		}finally{
			model.addObject("OperName", "修改公众号状态");
			model.addObject("OperTime",DateUtils.currentDateStr());
		}
		return model;
	}
	
	@RequestMapping(value = "svrDelResult.do")
	public ModelAndView doSvrDel(@RequestParam (value="svrSeq",required=true) String svrSeq)
			throws NetValidationException{
		log.info("del Svr Info"+svrSeq);
		ModelAndView model = new ModelAndView("svrInfo/svrResult");
		
		try{
			int i = svrInfoMapper.deleteByPrimaryKey(svrSeq);
			if(i<=0) throw new NetValidationException("找不到记录");
			model.addObject("OperResult","成功");
		}catch(Exception ex){
			log.error(ex,ex);
			model.addObject("OperResult","失败");
			model.addObject("OperMessage",ex.getMessage());
		}finally{
			model.addObject("OperName", "删除公众号");
			model.addObject("OperTime",DateUtils.currentDateStr());
		}
		return model;
	}
	
	@RequestMapping(value = "svrMod.do")
	public ModelAndView goSvrMod(@RequestParam (value="svrSeq",required=true) String svrSeq) throws NetValidationException{
		log.info("svr change State"+svrSeq);
		ModelAndView model = new ModelAndView("svrInfo/svrMod");
		SvrInfo svr = svrInfoMapper.selectByPrimaryKey(svrSeq);
		if(svr == null) throw new NetValidationException("找不到记录");
		model.addObject("svrInfo",svr);
		return model;
	}
	
	@RequestMapping(value = "svrModResult.do")
	public ModelAndView doSvrMod(SvrInfo svrInfo) throws NetValidationException{
		log.debug(svrInfo);
		ModelAndView model = new ModelAndView("svrInfo/svrResult");
		
		if(svrInfo==null||svrInfo.getSvrSeq()==null){
			throw new  NetValidationException("svrInfo.is.empty");
		}
		svrInfo.setState(Constants.OK);
		try{
			svrInfoMapper.updateByPrimaryKeySelective(svrInfo);
			model.addObject("OperResult","成功");
		}catch(Exception ex){
			log.error(ex,ex);
			model.addObject("OperResult","失败");
			model.addObject("OperMessage",ex.getMessage());
		}finally{
			model.addObject("OperName", "修改公众号");
			model.addObject("OperTime",DateUtils.currentDateStr());
		}
		return model;
	}
}
