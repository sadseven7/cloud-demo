package com.sad7.demo.commons.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * IP 地址信息
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-10-22 07:32:02
 * @see com.sad7.demo.commons.dto
 */
@Data
public class IpInfo implements Serializable {

    private static final long serialVersionUID = 3755909427138194164L;
    private String ip;
    private String country;
    private String area;
    private String region;
    private String city;
    private String county;
    private String isp;
    private String country_id;
    private String area_id;
    private String region_id;
    private String city_id;
    private String county_id;
    private String isp_id;
}
