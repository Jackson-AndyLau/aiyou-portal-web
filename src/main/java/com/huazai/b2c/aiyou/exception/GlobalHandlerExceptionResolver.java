package com.huazai.b2c.aiyou.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.huazai.b2c.aiyou.utils.SendMailUtils;
import com.huazai.b2c.aiyou.utils.SendSMSUtils;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description 全局异常处理类
 *              </ul>
 * @className GlobalHandlerExceptionResolver
 * @package com.huazai.b2c.aiyou.exception
 * @createdTime 2017年06月17日
 *
 * @version V1.0.0
 */
public class GlobalHandlerExceptionResolver implements HandlerExceptionResolver
{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex)
	{
		// 1、写日志文件
		
		// 2、发送邮件
		SendMailUtils.doSendTextMail();
		// 3、发送短信提醒
		SendSMSUtils.doSendSMS();
		// 4、捕获错误并跳转到友好的提示页面
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("code", "50000");
		modelAndView.addObject("message", "系统发生异常，程序员小哥哥正在火速的修复中！");
		modelAndView.setViewName("error/exception");
		return modelAndView;
	}

}
