package com.czl.pojo;

import java.util.ArrayList;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvaluateidIsNull() {
            addCriterion("evaluateID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIsNotNull() {
            addCriterion("evaluateID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidEqualTo(Integer value) {
            addCriterion("evaluateID =", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotEqualTo(Integer value) {
            addCriterion("evaluateID <>", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThan(Integer value) {
            addCriterion("evaluateID >", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluateID >=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThan(Integer value) {
            addCriterion("evaluateID <", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThanOrEqualTo(Integer value) {
            addCriterion("evaluateID <=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIn(List<Integer> values) {
            addCriterion("evaluateID in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotIn(List<Integer> values) {
            addCriterion("evaluateID not in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidBetween(Integer value1, Integer value2) {
            addCriterion("evaluateID between", value1, value2, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluateID not between", value1, value2, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIsNull() {
            addCriterion("evaluateContent is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIsNotNull() {
            addCriterion("evaluateContent is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentEqualTo(String value) {
            addCriterion("evaluateContent =", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotEqualTo(String value) {
            addCriterion("evaluateContent <>", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentGreaterThan(String value) {
            addCriterion("evaluateContent >", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluateContent >=", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLessThan(String value) {
            addCriterion("evaluateContent <", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLessThanOrEqualTo(String value) {
            addCriterion("evaluateContent <=", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLike(String value) {
            addCriterion("evaluateContent like", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotLike(String value) {
            addCriterion("evaluateContent not like", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIn(List<String> values) {
            addCriterion("evaluateContent in", values, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotIn(List<String> values) {
            addCriterion("evaluateContent not in", values, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentBetween(String value1, String value2) {
            addCriterion("evaluateContent between", value1, value2, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotBetween(String value1, String value2) {
            addCriterion("evaluateContent not between", value1, value2, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNull() {
            addCriterion("replycontent is null");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNotNull() {
            addCriterion("replycontent is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontentEqualTo(String value) {
            addCriterion("replycontent =", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotEqualTo(String value) {
            addCriterion("replycontent <>", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThan(String value) {
            addCriterion("replycontent >", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("replycontent >=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThan(String value) {
            addCriterion("replycontent <", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThanOrEqualTo(String value) {
            addCriterion("replycontent <=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLike(String value) {
            addCriterion("replycontent like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotLike(String value) {
            addCriterion("replycontent not like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIn(List<String> values) {
            addCriterion("replycontent in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotIn(List<String> values) {
            addCriterion("replycontent not in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentBetween(String value1, String value2) {
            addCriterion("replycontent between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotBetween(String value1, String value2) {
            addCriterion("replycontent not between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("orderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("TypeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TypeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("TypeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("TypeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("TypeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TypeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("TypeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TypeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("TypeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("TypeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("TypeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TypeId not between", value1, value2, "typeid");
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