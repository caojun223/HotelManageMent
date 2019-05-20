package com.czl.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServiceinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceinfoExample() {
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

        public Criteria andServiceidIsNull() {
            addCriterion("ServiceId is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("ServiceId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(Integer value) {
            addCriterion("ServiceId =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(Integer value) {
            addCriterion("ServiceId <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(Integer value) {
            addCriterion("ServiceId >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ServiceId >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(Integer value) {
            addCriterion("ServiceId <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(Integer value) {
            addCriterion("ServiceId <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<Integer> values) {
            addCriterion("ServiceId in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<Integer> values) {
            addCriterion("ServiceId not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(Integer value1, Integer value2) {
            addCriterion("ServiceId between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ServiceId not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNull() {
            addCriterion("Servicename is null");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNotNull() {
            addCriterion("Servicename is not null");
            return (Criteria) this;
        }

        public Criteria andServicenameEqualTo(String value) {
            addCriterion("Servicename =", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotEqualTo(String value) {
            addCriterion("Servicename <>", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThan(String value) {
            addCriterion("Servicename >", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThanOrEqualTo(String value) {
            addCriterion("Servicename >=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThan(String value) {
            addCriterion("Servicename <", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThanOrEqualTo(String value) {
            addCriterion("Servicename <=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLike(String value) {
            addCriterion("Servicename like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotLike(String value) {
            addCriterion("Servicename not like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameIn(List<String> values) {
            addCriterion("Servicename in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotIn(List<String> values) {
            addCriterion("Servicename not in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameBetween(String value1, String value2) {
            addCriterion("Servicename between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotBetween(String value1, String value2) {
            addCriterion("Servicename not between", value1, value2, "servicename");
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