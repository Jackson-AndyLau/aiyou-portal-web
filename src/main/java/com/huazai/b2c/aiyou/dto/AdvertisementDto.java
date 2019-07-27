package com.huazai.b2c.aiyou.dto;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description 首页大广告位轮播图数据展示 Dto
 *              </ul>
 * @className PageDataDto
 * @package com.huazai.b2c.aiyou.dto
 * @createdTime 2017年06月13日
 *
 * @version V1.0.0
 */
public class AdvertisementDto
{

	private String src; // pic
	private String srcB; // pic2
	private String height; // 自定义
	private String heightB; // 自定义
	private String width; // 自定义
	private String widthB; // 自定义
	private String alt; // subtitle中获取
	private String href; // url

	public String getSrc()
	{
		return src;
	}

	public void setSrc(String src)
	{
		this.src = src;
	}

	public String getSrcB()
	{
		return srcB;
	}

	public void setSrcB(String srcB)
	{
		this.srcB = srcB;
	}

	public String getHeight()
	{
		return height;
	}

	public void setHeight(String height)
	{
		this.height = height;
	}

	public String getHeightB()
	{
		return heightB;
	}

	public void setHeightB(String heightB)
	{
		this.heightB = heightB;
	}

	public String getWidth()
	{
		return width;
	}

	public void setWidth(String width)
	{
		this.width = width;
	}

	public String getWidthB()
	{
		return widthB;
	}

	public void setWidthB(String widthB)
	{
		this.widthB = widthB;
	}

	public String getAlt()
	{
		return alt;
	}

	public void setAlt(String alt)
	{
		this.alt = alt;
	}

	public String getHref()
	{
		return href;
	}

	public void setHref(String href)
	{
		this.href = href;
	}

}
