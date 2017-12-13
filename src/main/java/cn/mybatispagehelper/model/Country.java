package cn.mybatispagehelper.model;

import cn.mybatispagehelper.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author youfang
 * @date 2017-12-11 11:22
 **/
@Table(name = "country")
public class Country extends BaseEntity {
    /**
     * 名称
     */
    @Column(name = "countryname")
    private String countryname;

    /**
     * 代码
     */
    @Column(name = "countrycode")
    private String countrycode;

    /**
     * 获取名称
     *
     * @return countryname - 名称
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * 设置名称
     *
     * @param countryname 名称
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * 获取代码
     *
     * @return countrycode - 代码
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 设置代码
     *
     * @param countrycode 代码
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

}