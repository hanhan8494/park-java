package com.itzeng.springbootstoptool.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("前端接收VO")
public class StallVO {

    @ApiModelProperty("车位Id")
    private Integer stallId;

    @ApiModelProperty("区域Id")
    private Integer areaid;

    @ApiModelProperty("区域")
    private String location;

    @ApiModelProperty("价格")
    private double price;

    @ApiModelProperty("结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    @ApiModelProperty("车牌")
    private String createName;

    @ApiModelProperty("车位状态")
    private Integer status;

    @ApiModelProperty("图片路径")
    private String url;
}
