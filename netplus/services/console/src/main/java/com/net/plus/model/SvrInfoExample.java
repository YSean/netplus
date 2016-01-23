package com.net.plus.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SvrInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SvrInfoExample() {
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

        public Criteria andSvrSeqIsNull() {
            addCriterion("SVR_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSvrSeqIsNotNull() {
            addCriterion("SVR_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSvrSeqEqualTo(String value) {
            addCriterion("SVR_SEQ =", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqNotEqualTo(String value) {
            addCriterion("SVR_SEQ <>", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqGreaterThan(String value) {
            addCriterion("SVR_SEQ >", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_SEQ >=", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqLessThan(String value) {
            addCriterion("SVR_SEQ <", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqLessThanOrEqualTo(String value) {
            addCriterion("SVR_SEQ <=", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqLike(String value) {
            addCriterion("SVR_SEQ like", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqNotLike(String value) {
            addCriterion("SVR_SEQ not like", value, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqIn(List<String> values) {
            addCriterion("SVR_SEQ in", values, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqNotIn(List<String> values) {
            addCriterion("SVR_SEQ not in", values, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqBetween(String value1, String value2) {
            addCriterion("SVR_SEQ between", value1, value2, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andSvrSeqNotBetween(String value1, String value2) {
            addCriterion("SVR_SEQ not between", value1, value2, "svrSeq");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSvrIdIsNull() {
            addCriterion("SVR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSvrIdIsNotNull() {
            addCriterion("SVR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSvrIdEqualTo(String value) {
            addCriterion("SVR_ID =", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotEqualTo(String value) {
            addCriterion("SVR_ID <>", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThan(String value) {
            addCriterion("SVR_ID >", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_ID >=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThan(String value) {
            addCriterion("SVR_ID <", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThanOrEqualTo(String value) {
            addCriterion("SVR_ID <=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLike(String value) {
            addCriterion("SVR_ID like", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotLike(String value) {
            addCriterion("SVR_ID not like", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdIn(List<String> values) {
            addCriterion("SVR_ID in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotIn(List<String> values) {
            addCriterion("SVR_ID not in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdBetween(String value1, String value2) {
            addCriterion("SVR_ID between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotBetween(String value1, String value2) {
            addCriterion("SVR_ID not between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrNameIsNull() {
            addCriterion("svr_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSvrNameIsNotNull() {
            addCriterion("svr_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSvrNameEqualTo(String value) {
            addCriterion("svr_NAME =", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameNotEqualTo(String value) {
            addCriterion("svr_NAME <>", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameGreaterThan(String value) {
            addCriterion("svr_NAME >", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameGreaterThanOrEqualTo(String value) {
            addCriterion("svr_NAME >=", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameLessThan(String value) {
            addCriterion("svr_NAME <", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameLessThanOrEqualTo(String value) {
            addCriterion("svr_NAME <=", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameLike(String value) {
            addCriterion("svr_NAME like", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameNotLike(String value) {
            addCriterion("svr_NAME not like", value, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameIn(List<String> values) {
            addCriterion("svr_NAME in", values, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameNotIn(List<String> values) {
            addCriterion("svr_NAME not in", values, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameBetween(String value1, String value2) {
            addCriterion("svr_NAME between", value1, value2, "svrName");
            return (Criteria) this;
        }

        public Criteria andSvrNameNotBetween(String value1, String value2) {
            addCriterion("svr_NAME not between", value1, value2, "svrName");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("APP_ID like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("APP_ID not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNull() {
            addCriterion("APP_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("APP_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("APP_SECRET =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("APP_SECRET <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("APP_SECRET >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("APP_SECRET >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("APP_SECRET <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("APP_SECRET <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("APP_SECRET like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("APP_SECRET not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("APP_SECRET in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("APP_SECRET not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("APP_SECRET between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("APP_SECRET not between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("ACCESS_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("ACCESS_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("ACCESS_TOKEN =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("ACCESS_TOKEN <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("ACCESS_TOKEN >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_TOKEN >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("ACCESS_TOKEN <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_TOKEN <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("ACCESS_TOKEN like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("ACCESS_TOKEN not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("ACCESS_TOKEN in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("ACCESS_TOKEN not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("ACCESS_TOKEN between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("ACCESS_TOKEN not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andUrlSendIsNull() {
            addCriterion("URL_SEND is null");
            return (Criteria) this;
        }

        public Criteria andUrlSendIsNotNull() {
            addCriterion("URL_SEND is not null");
            return (Criteria) this;
        }

        public Criteria andUrlSendEqualTo(String value) {
            addCriterion("URL_SEND =", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendNotEqualTo(String value) {
            addCriterion("URL_SEND <>", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendGreaterThan(String value) {
            addCriterion("URL_SEND >", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendGreaterThanOrEqualTo(String value) {
            addCriterion("URL_SEND >=", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendLessThan(String value) {
            addCriterion("URL_SEND <", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendLessThanOrEqualTo(String value) {
            addCriterion("URL_SEND <=", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendLike(String value) {
            addCriterion("URL_SEND like", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendNotLike(String value) {
            addCriterion("URL_SEND not like", value, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendIn(List<String> values) {
            addCriterion("URL_SEND in", values, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendNotIn(List<String> values) {
            addCriterion("URL_SEND not in", values, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendBetween(String value1, String value2) {
            addCriterion("URL_SEND between", value1, value2, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlSendNotBetween(String value1, String value2) {
            addCriterion("URL_SEND not between", value1, value2, "urlSend");
            return (Criteria) this;
        }

        public Criteria andUrlRecvIsNull() {
            addCriterion("URL_RECV is null");
            return (Criteria) this;
        }

        public Criteria andUrlRecvIsNotNull() {
            addCriterion("URL_RECV is not null");
            return (Criteria) this;
        }

        public Criteria andUrlRecvEqualTo(String value) {
            addCriterion("URL_RECV =", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvNotEqualTo(String value) {
            addCriterion("URL_RECV <>", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvGreaterThan(String value) {
            addCriterion("URL_RECV >", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvGreaterThanOrEqualTo(String value) {
            addCriterion("URL_RECV >=", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvLessThan(String value) {
            addCriterion("URL_RECV <", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvLessThanOrEqualTo(String value) {
            addCriterion("URL_RECV <=", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvLike(String value) {
            addCriterion("URL_RECV like", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvNotLike(String value) {
            addCriterion("URL_RECV not like", value, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvIn(List<String> values) {
            addCriterion("URL_RECV in", values, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvNotIn(List<String> values) {
            addCriterion("URL_RECV not in", values, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvBetween(String value1, String value2) {
            addCriterion("URL_RECV between", value1, value2, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andUrlRecvNotBetween(String value1, String value2) {
            addCriterion("URL_RECV not between", value1, value2, "urlRecv");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIsNull() {
            addCriterion("SVR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIsNotNull() {
            addCriterion("SVR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSvrTypeEqualTo(String value) {
            addCriterion("SVR_TYPE =", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotEqualTo(String value) {
            addCriterion("SVR_TYPE <>", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeGreaterThan(String value) {
            addCriterion("SVR_TYPE >", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_TYPE >=", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLessThan(String value) {
            addCriterion("SVR_TYPE <", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLessThanOrEqualTo(String value) {
            addCriterion("SVR_TYPE <=", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLike(String value) {
            addCriterion("SVR_TYPE like", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotLike(String value) {
            addCriterion("SVR_TYPE not like", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIn(List<String> values) {
            addCriterion("SVR_TYPE in", values, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotIn(List<String> values) {
            addCriterion("SVR_TYPE not in", values, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeBetween(String value1, String value2) {
            addCriterion("SVR_TYPE between", value1, value2, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotBetween(String value1, String value2) {
            addCriterion("SVR_TYPE not between", value1, value2, "svrType");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyIsNull() {
            addCriterion("ENCODEING_AESKEY is null");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyIsNotNull() {
            addCriterion("ENCODEING_AESKEY is not null");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyEqualTo(String value) {
            addCriterion("ENCODEING_AESKEY =", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyNotEqualTo(String value) {
            addCriterion("ENCODEING_AESKEY <>", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyGreaterThan(String value) {
            addCriterion("ENCODEING_AESKEY >", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyGreaterThanOrEqualTo(String value) {
            addCriterion("ENCODEING_AESKEY >=", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyLessThan(String value) {
            addCriterion("ENCODEING_AESKEY <", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyLessThanOrEqualTo(String value) {
            addCriterion("ENCODEING_AESKEY <=", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyLike(String value) {
            addCriterion("ENCODEING_AESKEY like", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyNotLike(String value) {
            addCriterion("ENCODEING_AESKEY not like", value, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyIn(List<String> values) {
            addCriterion("ENCODEING_AESKEY in", values, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyNotIn(List<String> values) {
            addCriterion("ENCODEING_AESKEY not in", values, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyBetween(String value1, String value2) {
            addCriterion("ENCODEING_AESKEY between", value1, value2, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andEncodeingAeskeyNotBetween(String value1, String value2) {
            addCriterion("ENCODEING_AESKEY not between", value1, value2, "encodeingAeskey");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("CTIME is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("CTIME =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("CTIME <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("CTIME >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CTIME >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("CTIME <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("CTIME <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("CTIME in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("CTIME not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("CTIME between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("CTIME not between", value1, value2, "ctime");
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