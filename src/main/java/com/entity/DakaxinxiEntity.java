package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 打卡信息
 *
 * @author 
 * @email
 */
@TableName("dakaxinxi")
public class DakaxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DakaxinxiEntity() {

	}

	public DakaxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 打卡学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 打卡时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 体温
     */
    @TableField(value = "dakaxinxi_tiwen")

    private Double dakaxinxiTiwen;


    /**
     * 打卡所在地
     */
    @TableField(value = "dakaxinxi_didian")

    private String dakaxinxiDidian;


    /**
     * 一月内是否接触过确诊病例
     */
    @TableField(value = "quezhen_types")

    private Integer quezhenTypes;


    /**
     * 一月内是否接触过疑似病例
     */
    @TableField(value = "yishi_types")

    private Integer yishiTypes;


    /**
     * 一月内是否去过中高风险地区
     */
    @TableField(value = "gaofengxian_types")

    private Integer gaofengxianTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：打卡学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：打卡学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：打卡时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：打卡时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：体温
	 */
    public Double getDakaxinxiTiwen() {
        return dakaxinxiTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setDakaxinxiTiwen(Double dakaxinxiTiwen) {
        this.dakaxinxiTiwen = dakaxinxiTiwen;
    }
    /**
	 * 设置：打卡所在地
	 */
    public String getDakaxinxiDidian() {
        return dakaxinxiDidian;
    }


    /**
	 * 获取：打卡所在地
	 */

    public void setDakaxinxiDidian(String dakaxinxiDidian) {
        this.dakaxinxiDidian = dakaxinxiDidian;
    }
    /**
	 * 设置：一月内是否接触过确诊病例
	 */
    public Integer getQuezhenTypes() {
        return quezhenTypes;
    }


    /**
	 * 获取：一月内是否接触过确诊病例
	 */

    public void setQuezhenTypes(Integer quezhenTypes) {
        this.quezhenTypes = quezhenTypes;
    }
    /**
	 * 设置：一月内是否接触过疑似病例
	 */
    public Integer getYishiTypes() {
        return yishiTypes;
    }


    /**
	 * 获取：一月内是否接触过疑似病例
	 */

    public void setYishiTypes(Integer yishiTypes) {
        this.yishiTypes = yishiTypes;
    }
    /**
	 * 设置：一月内是否去过中高风险地区
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 获取：一月内是否去过中高风险地区
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dakaxinxi{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", insertTime=" + insertTime +
            ", dakaxinxiTiwen=" + dakaxinxiTiwen +
            ", dakaxinxiDidian=" + dakaxinxiDidian +
            ", quezhenTypes=" + quezhenTypes +
            ", yishiTypes=" + yishiTypes +
            ", gaofengxianTypes=" + gaofengxianTypes +
            ", createTime=" + createTime +
        "}";
    }
}
