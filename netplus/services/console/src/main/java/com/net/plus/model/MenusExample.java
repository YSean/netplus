package com.net.plus.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenusExample() {
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

        public Criteria andMenuSeqIsNull() {
            addCriterion("menu_seq is null");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIsNotNull() {
            addCriterion("menu_seq is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSeqEqualTo(String value) {
            addCriterion("menu_seq =", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotEqualTo(String value) {
            addCriterion("menu_seq <>", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqGreaterThan(String value) {
            addCriterion("menu_seq >", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqGreaterThanOrEqualTo(String value) {
            addCriterion("menu_seq >=", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLessThan(String value) {
            addCriterion("menu_seq <", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLessThanOrEqualTo(String value) {
            addCriterion("menu_seq <=", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLike(String value) {
            addCriterion("menu_seq like", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotLike(String value) {
            addCriterion("menu_seq not like", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIn(List<String> values) {
            addCriterion("menu_seq in", values, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotIn(List<String> values) {
            addCriterion("menu_seq not in", values, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqBetween(String value1, String value2) {
            addCriterion("menu_seq between", value1, value2, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotBetween(String value1, String value2) {
            addCriterion("menu_seq not between", value1, value2, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
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

        public Criteria andParentMenuIsNull() {
            addCriterion("parent_menu is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIsNotNull() {
            addCriterion("parent_menu is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuEqualTo(String value) {
            addCriterion("parent_menu =", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuNotEqualTo(String value) {
            addCriterion("parent_menu <>", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuGreaterThan(String value) {
            addCriterion("parent_menu >", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuGreaterThanOrEqualTo(String value) {
            addCriterion("parent_menu >=", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuLessThan(String value) {
            addCriterion("parent_menu <", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuLessThanOrEqualTo(String value) {
            addCriterion("parent_menu <=", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuLike(String value) {
            addCriterion("parent_menu like", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuNotLike(String value) {
            addCriterion("parent_menu not like", value, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuIn(List<String> values) {
            addCriterion("parent_menu in", values, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuNotIn(List<String> values) {
            addCriterion("parent_menu not in", values, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuBetween(String value1, String value2) {
            addCriterion("parent_menu between", value1, value2, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andParentMenuNotBetween(String value1, String value2) {
            addCriterion("parent_menu not between", value1, value2, "parentMenu");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andDefIsNull() {
            addCriterion("def is null");
            return (Criteria) this;
        }

        public Criteria andDefIsNotNull() {
            addCriterion("def is not null");
            return (Criteria) this;
        }

        public Criteria andDefEqualTo(String value) {
            addCriterion("def =", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotEqualTo(String value) {
            addCriterion("def <>", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThan(String value) {
            addCriterion("def >", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThanOrEqualTo(String value) {
            addCriterion("def >=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThan(String value) {
            addCriterion("def <", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThanOrEqualTo(String value) {
            addCriterion("def <=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLike(String value) {
            addCriterion("def like", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotLike(String value) {
            addCriterion("def not like", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefIn(List<String> values) {
            addCriterion("def in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotIn(List<String> values) {
            addCriterion("def not in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefBetween(String value1, String value2) {
            addCriterion("def between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotBetween(String value1, String value2) {
            addCriterion("def not between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("media_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("media_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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