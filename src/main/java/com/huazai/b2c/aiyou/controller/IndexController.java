package com.huazai.b2c.aiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

		return "index";
	}
}
