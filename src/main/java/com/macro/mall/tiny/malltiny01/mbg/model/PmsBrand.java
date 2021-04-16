package com.macro.mall.tiny.malltiny01.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther Tyler Yao
 * @Desc 注释
 * @Date 2021-04-16 11:40
 */
@Data
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键")
    private Long id;

    private String name;

    /**
     * 首字母
     *
     * @mbggenerated
     */
    @ApiModelProperty("首字母")
    private String firstLetter;

    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     *
     * @mbggenerated
     */
    @ApiModelProperty("是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    private Integer showStatus;

    /**
     * 产品数量
     *
     * @mbggenerated
     */
    private Integer productCount;

    /**
     * 产品评论数量
     *
     * @mbggenerated
     */
    private Integer productCommentCount;

    /**
     * 品牌logo
     *
     * @mbggenerated
     */
    private String logo;

    /**
     * 专区大图
     *
     * @mbggenerated
     */
    private String bigPic;

    /**
     * 品牌故事
     *
     * @mbggenerated
     */
    private String brandStory;
}
