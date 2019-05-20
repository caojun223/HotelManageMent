package com.czl.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsinfoExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("NewsId is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("NewsId is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("NewsId =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("NewsId <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("NewsId >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsId >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("NewsId <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("NewsId <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("NewsId in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("NewsId not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("NewsId between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsId not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewtitleIsNull() {
            addCriterion("NewTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewtitleIsNotNull() {
            addCriterion("NewTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewtitleEqualTo(String value) {
            addCriterion("NewTitle =", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotEqualTo(String value) {
            addCriterion("NewTitle <>", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleGreaterThan(String value) {
            addCriterion("NewTitle >", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleGreaterThanOrEqualTo(String value) {
            addCriterion("NewTitle >=", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleLessThan(String value) {
            addCriterion("NewTitle <", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleLessThanOrEqualTo(String value) {
            addCriterion("NewTitle <=", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleLike(String value) {
            addCriterion("NewTitle like", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotLike(String value) {
            addCriterion("NewTitle not like", value, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleIn(List<String> values) {
            addCriterion("NewTitle in", values, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotIn(List<String> values) {
            addCriterion("NewTitle not in", values, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleBetween(String value1, String value2) {
            addCriterion("NewTitle between", value1, value2, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewtitleNotBetween(String value1, String value2) {
            addCriterion("NewTitle not between", value1, value2, "newtitle");
            return (Criteria) this;
        }

        public Criteria andNewcontentIsNull() {
            addCriterion("NewContent is null");
            return (Criteria) this;
        }

        public Criteria andNewcontentIsNotNull() {
            addCriterion("NewContent is not null");
            return (Criteria) this;
        }

        public Criteria andNewcontentEqualTo(String value) {
            addCriterion("NewContent =", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentNotEqualTo(String value) {
            addCriterion("NewContent <>", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentGreaterThan(String value) {
            addCriterion("NewContent >", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentGreaterThanOrEqualTo(String value) {
            addCriterion("NewContent >=", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentLessThan(String value) {
            addCriterion("NewContent <", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentLessThanOrEqualTo(String value) {
            addCriterion("NewContent <=", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentLike(String value) {
            addCriterion("NewContent like", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentNotLike(String value) {
            addCriterion("NewContent not like", value, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentIn(List<String> values) {
            addCriterion("NewContent in", values, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentNotIn(List<String> values) {
            addCriterion("NewContent not in", values, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentBetween(String value1, String value2) {
            addCriterion("NewContent between", value1, value2, "newcontent");
            return (Criteria) this;
        }

        public Criteria andNewcontentNotBetween(String value1, String value2) {
            addCriterion("NewContent not between", value1, value2, "newcontent");
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