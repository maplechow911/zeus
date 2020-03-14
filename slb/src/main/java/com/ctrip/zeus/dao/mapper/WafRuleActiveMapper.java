package com.ctrip.zeus.dao.mapper;

import com.ctrip.zeus.dao.entity.WafRuleActive;
import com.ctrip.zeus.dao.entity.WafRuleActiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WafRuleActiveMapper {
    long countByExample(WafRuleActiveExample example);

    int deleteByExample(WafRuleActiveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WafRuleActive record);

    int insertSelective(WafRuleActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_rule_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WafRuleActive selectOneByExample(WafRuleActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_rule_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WafRuleActive selectOneByExampleSelective(@Param("example") WafRuleActiveExample example, @Param("selective") WafRuleActive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_rule_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<WafRuleActive> selectByExampleSelective(@Param("example") WafRuleActiveExample example, @Param("selective") WafRuleActive.Column ... selective);

    List<WafRuleActive> selectByExample(WafRuleActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_rule_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WafRuleActive selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") WafRuleActive.Column ... selective);

    WafRuleActive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WafRuleActive record, @Param("example") WafRuleActiveExample example);

    int updateByExample(@Param("record") WafRuleActive record, @Param("example") WafRuleActiveExample example);

    int updateByPrimaryKeySelective(WafRuleActive record);

    int updateByPrimaryKey(WafRuleActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_rule_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsert(WafRuleActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waf_rule_active
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertSelective(WafRuleActive record);

    int upsertVersion(WafRuleActive record);
}