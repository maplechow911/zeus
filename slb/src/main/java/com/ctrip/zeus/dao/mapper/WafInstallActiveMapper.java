package com.ctrip.zeus.dao.mapper;

import com.ctrip.zeus.dao.entity.WafInstallActive;
import com.ctrip.zeus.dao.entity.WafInstallActiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WafInstallActiveMapper {
    long countByExample(WafInstallActiveExample example);

    int deleteByExample(WafInstallActiveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WafInstallActive record);

    int insertSelective(WafInstallActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_install_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WafInstallActive selectOneByExample(WafInstallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_install_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WafInstallActive selectOneByExampleSelective(@Param("example") WafInstallActiveExample example, @Param("selective") WafInstallActive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_install_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<WafInstallActive> selectByExampleSelective(@Param("example") WafInstallActiveExample example, @Param("selective") WafInstallActive.Column ... selective);

    List<WafInstallActive> selectByExample(WafInstallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_install_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WafInstallActive selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") WafInstallActive.Column ... selective);

    WafInstallActive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WafInstallActive record, @Param("example") WafInstallActiveExample example);

    int updateByExample(@Param("record") WafInstallActive record, @Param("example") WafInstallActiveExample example);

    int updateByPrimaryKeySelective(WafInstallActive record);

    int updateByPrimaryKey(WafInstallActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_install_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsert(WafInstallActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_install_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertSelective(WafInstallActive record);

    int upsertVersion(WafInstallActive record);
}