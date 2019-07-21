package com.huazai.b2c.aiyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huazai.b2c.aiyou.pojo.TbContent;
import com.huazai.b2c.aiyou.service.TbContentService;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description 首页controller
 *              </ul>
 * @className IndexController
 * @package com.huazai.b2c.aiyou.controller
 * @createdTime 2017年06月10日
 *
 * @version V1.0.0
 */
@Controller
public class IndexController
{
	@Autowired
	private TbContentService tbContentService;

	@Value("${AD_CATEGORY_ID}")
	private Long AD_CATEGORY_ID;
	@Value("${AD_HEIGHT}")
	private String AD_HEIGHT;
	@Value("${AD_HEIGHT_B}")
	private String AD_HEIGHT_B;
	@Value("${AD_WIDTH}")
	private String AD_WIDTH;
	@Value("${AD_WIDTH_B}")
	private String AD_WIDTH_B;

	/**
	 * 
	 * @author HuaZai
	 * @contact who.seek.me@java98k.vip
	 * @title showIndex
	 *        <ul>
	 * @description 首页展示
	 *              </ul>
	 * @createdTime 2017年06月10日
	 * @return
	 * @return String
	 *
	 * @version : V1.0.0
	 */
	@RequestMapping("/index")
	public String showIndex()
	{
		// 调用服务获取TbContent列表
		List<TbContent> tbContents = tbContentService.geTbContentListByCid(AD_CATEGORY_ID);
		
		return "index";
	}

}
