package com.net.plus.model;

import java.util.ArrayList;
import java.util.List;

public class MetaImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaImageExample() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("IMG_ID is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("IMG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(String value) {
            addCriterion("IMG_ID =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(String value) {
            addCriterion("IMG_ID <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(String value) {
            addCriterion("IMG_ID >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_ID >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(String value) {
            addCriterion("IMG_ID <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(String value) {
            addCriterion("IMG_ID <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLike(String value) {
            addCriterion("IMG_ID like", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotLike(String value) {
            addCriterion("IMG_ID not like", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<String> values) {
            addCriterion("IMG_ID in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<String> values) {
            addCriterion("IMG_ID not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(String value1, String value2) {
            addCriterion("IMG_ID between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(String value1, String value2) {
            addCriterion("IMG_ID not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNull() {
            addCriterion("IMG_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNotNull() {
            addCriterion("IMG_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andImgSizeEqualTo(Long value) {
            addCriterion("IMG_SIZE =", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotEqualTo(Long value) {
            addCriterion("IMG_SIZE <>", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThan(Long value) {
            addCriterion("IMG_SIZE >", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("IMG_SIZE >=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThan(Long value) {
            addCriterion("IMG_SIZE <", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThanOrEqualTo(Long value) {
            addCriterion("IMG_SIZE <=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeIn(List<Long> values) {
            addCriterion("IMG_SIZE in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotIn(List<Long> values) {
            addCriterion("IMG_SIZE not in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeBetween(Long value1, Long value2) {
            addCriterion("IMG_SIZE between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotBetween(Long value1, Long value2) {
            addCriterion("IMG_SIZE not between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgTypeIsNull() {
            addCriterion("IMG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andImgTypeIsNotNull() {
            addCriterion("IMG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andImgTypeEqualTo(String value) {
            addCriterion("IMG_TYPE =", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotEqualTo(String value) {
            addCriterion("IMG_TYPE <>", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeGreaterThan(String value) {
            addCriterion("IMG_TYPE >", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_TYPE >=", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLessThan(String value) {
            addCriterion("IMG_TYPE <", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLessThanOrEqualTo(String value) {
            addCriterion("IMG_TYPE <=", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLike(String value) {
            addCriterion("IMG_TYPE like", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotLike(String value) {
            addCriterion("IMG_TYPE not like", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeIn(List<String> values) {
            addCriterion("IMG_TYPE in", values, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotIn(List<String> values) {
            addCriterion("IMG_TYPE not in", values, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeBetween(String value1, String value2) {
            addCriterion("IMG_TYPE between", value1, value2, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotBetween(String value1, String value2) {
            addCriterion("IMG_TYPE not between", value1, value2, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNull() {
            addCriterion("IMG_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNotNull() {
            addCriterion("IMG_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andImgHeightEqualTo(Integer value) {
            addCriterion("IMG_HEIGHT =", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotEqualTo(Integer value) {
            addCriterion("IMG_HEIGHT <>", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThan(Integer value) {
            addCriterion("IMG_HEIGHT >", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMG_HEIGHT >=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThan(Integer value) {
            addCriterion("IMG_HEIGHT <", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThanOrEqualTo(Integer value) {
            addCriterion("IMG_HEIGHT <=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightIn(List<Integer> values) {
            addCriterion("IMG_HEIGHT in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotIn(List<Integer> values) {
            addCriterion("IMG_HEIGHT not in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightBetween(Integer value1, Integer value2) {
            addCriterion("IMG_HEIGHT between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("IMG_HEIGHT not between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNull() {
            addCriterion("IMG_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNotNull() {
            addCriterion("IMG_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andImgWidthEqualTo(Integer value) {
            addCriterion("IMG_WIDTH =", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotEqualTo(Integer value) {
            addCriterion("IMG_WIDTH <>", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThan(Integer value) {
            addCriterion("IMG_WIDTH >", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMG_WIDTH >=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThan(Integer value) {
            addCriterion("IMG_WIDTH <", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThanOrEqualTo(Integer value) {
            addCriterion("IMG_WIDTH <=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthIn(List<Integer> values) {
            addCriterion("IMG_WIDTH in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotIn(List<Integer> values) {
            addCriterion("IMG_WIDTH not in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthBetween(Integer value1, Integer value2) {
            addCriterion("IMG_WIDTH between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("IMG_WIDTH not between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNull() {
            addCriterion("IMG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNotNull() {
            addCriterion("IMG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andImgNameEqualTo(String value) {
            addCriterion("IMG_NAME =", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotEqualTo(String value) {
            addCriterion("IMG_NAME <>", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThan(String value) {
            addCriterion("IMG_NAME >", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_NAME >=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThan(String value) {
            addCriterion("IMG_NAME <", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThanOrEqualTo(String value) {
            addCriterion("IMG_NAME <=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLike(String value) {
            addCriterion("IMG_NAME like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotLike(String value) {
            addCriterion("IMG_NAME not like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameIn(List<String> values) {
            addCriterion("IMG_NAME in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotIn(List<String> values) {
            addCriterion("IMG_NAME not in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameBetween(String value1, String value2) {
            addCriterion("IMG_NAME between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotBetween(String value1, String value2) {
            addCriterion("IMG_NAME not between", value1, value2, "imgName");
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