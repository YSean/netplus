package com.net.plus.model;

import java.util.ArrayList;
import java.util.List;

public class MenuGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGmenuSeqIsNull() {
            addCriterion("gmenu_seq is null");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqIsNotNull() {
            addCriterion("gmenu_seq is not null");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqEqualTo(String value) {
            addCriterion("gmenu_seq =", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqNotEqualTo(String value) {
            addCriterion("gmenu_seq <>", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqGreaterThan(String value) {
            addCriterion("gmenu_seq >", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqGreaterThanOrEqualTo(String value) {
            addCriterion("gmenu_seq >=", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqLessThan(String value) {
            addCriterion("gmenu_seq <", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqLessThanOrEqualTo(String value) {
            addCriterion("gmenu_seq <=", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqLike(String value) {
            addCriterion("gmenu_seq like", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqNotLike(String value) {
            addCriterion("gmenu_seq not like", value, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqIn(List<String> values) {
            addCriterion("gmenu_seq in", values, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqNotIn(List<String> values) {
            addCriterion("gmenu_seq not in", values, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqBetween(String value1, String value2) {
            addCriterion("gmenu_seq between", value1, value2, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuSeqNotBetween(String value1, String value2) {
            addCriterion("gmenu_seq not between", value1, value2, "gmenuSeq");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeIsNull() {
            addCriterion("gmenu_type is null");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeIsNotNull() {
            addCriterion("gmenu_type is not null");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeEqualTo(String value) {
            addCriterion("gmenu_type =", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeNotEqualTo(String value) {
            addCriterion("gmenu_type <>", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeGreaterThan(String value) {
            addCriterion("gmenu_type >", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gmenu_type >=", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeLessThan(String value) {
            addCriterion("gmenu_type <", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeLessThanOrEqualTo(String value) {
            addCriterion("gmenu_type <=", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeLike(String value) {
            addCriterion("gmenu_type like", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeNotLike(String value) {
            addCriterion("gmenu_type not like", value, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeIn(List<String> values) {
            addCriterion("gmenu_type in", values, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeNotIn(List<String> values) {
            addCriterion("gmenu_type not in", values, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeBetween(String value1, String value2) {
            addCriterion("gmenu_type between", value1, value2, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGmenuTypeNotBetween(String value1, String value2) {
            addCriterion("gmenu_type not between", value1, value2, "gmenuType");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNull() {
            addCriterion("provincecode is null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNotNull() {
            addCriterion("provincecode is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeEqualTo(String value) {
            addCriterion("provincecode =", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotEqualTo(String value) {
            addCriterion("provincecode <>", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThan(String value) {
            addCriterion("provincecode >", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThanOrEqualTo(String value) {
            addCriterion("provincecode >=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThan(String value) {
            addCriterion("provincecode <", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThanOrEqualTo(String value) {
            addCriterion("provincecode <=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLike(String value) {
            addCriterion("provincecode like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotLike(String value) {
            addCriterion("provincecode not like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIn(List<String> values) {
            addCriterion("provincecode in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotIn(List<String> values) {
            addCriterion("provincecode not in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeBetween(String value1, String value2) {
            addCriterion("provincecode between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotBetween(String value1, String value2) {
            addCriterion("provincecode not between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("citycode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("citycode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("citycode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("citycode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("citycode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("citycode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("citycode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("citycode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("citycode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("citycode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("citycode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("citycode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("citycode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("citycode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andCientPlatIsNull() {
            addCriterion("cient_plat is null");
            return (Criteria) this;
        }

        public Criteria andCientPlatIsNotNull() {
            addCriterion("cient_plat is not null");
            return (Criteria) this;
        }

        public Criteria andCientPlatEqualTo(String value) {
            addCriterion("cient_plat =", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatNotEqualTo(String value) {
            addCriterion("cient_plat <>", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatGreaterThan(String value) {
            addCriterion("cient_plat >", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatGreaterThanOrEqualTo(String value) {
            addCriterion("cient_plat >=", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatLessThan(String value) {
            addCriterion("cient_plat <", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatLessThanOrEqualTo(String value) {
            addCriterion("cient_plat <=", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatLike(String value) {
            addCriterion("cient_plat like", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatNotLike(String value) {
            addCriterion("cient_plat not like", value, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatIn(List<String> values) {
            addCriterion("cient_plat in", values, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatNotIn(List<String> values) {
            addCriterion("cient_plat not in", values, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatBetween(String value1, String value2) {
            addCriterion("cient_plat between", value1, value2, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andCientPlatNotBetween(String value1, String value2) {
            addCriterion("cient_plat not between", value1, value2, "cientPlat");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andExtentionIsNull() {
            addCriterion("extention is null");
            return (Criteria) this;
        }

        public Criteria andExtentionIsNotNull() {
            addCriterion("extention is not null");
            return (Criteria) this;
        }

        public Criteria andExtentionEqualTo(String value) {
            addCriterion("extention =", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionNotEqualTo(String value) {
            addCriterion("extention <>", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionGreaterThan(String value) {
            addCriterion("extention >", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionGreaterThanOrEqualTo(String value) {
            addCriterion("extention >=", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionLessThan(String value) {
            addCriterion("extention <", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionLessThanOrEqualTo(String value) {
            addCriterion("extention <=", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionLike(String value) {
            addCriterion("extention like", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionNotLike(String value) {
            addCriterion("extention not like", value, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionIn(List<String> values) {
            addCriterion("extention in", values, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionNotIn(List<String> values) {
            addCriterion("extention not in", values, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionBetween(String value1, String value2) {
            addCriterion("extention between", value1, value2, "extention");
            return (Criteria) this;
        }

        public Criteria andExtentionNotBetween(String value1, String value2) {
            addCriterion("extention not between", value1, value2, "extention");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}