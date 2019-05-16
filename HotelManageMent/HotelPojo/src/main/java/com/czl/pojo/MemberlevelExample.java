package com.czl.pojo;

import java.util.ArrayList;
import java.util.List;

public class MemberlevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberlevelExample() {
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

        public Criteria andLevelidIsNull() {
            addCriterion("levelID is null");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNotNull() {
            addCriterion("levelID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelidEqualTo(Integer value) {
            addCriterion("levelID =", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotEqualTo(Integer value) {
            addCriterion("levelID <>", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThan(Integer value) {
            addCriterion("levelID >", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelID >=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThan(Integer value) {
            addCriterion("levelID <", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("levelID <=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidIn(List<Integer> values) {
            addCriterion("levelID in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotIn(List<Integer> values) {
            addCriterion("levelID not in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidBetween(Integer value1, Integer value2) {
            addCriterion("levelID between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("levelID not between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelnameIsNull() {
            addCriterion("levelname is null");
            return (Criteria) this;
        }

        public Criteria andLevelnameIsNotNull() {
            addCriterion("levelname is not null");
            return (Criteria) this;
        }

        public Criteria andLevelnameEqualTo(String value) {
            addCriterion("levelname =", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotEqualTo(String value) {
            addCriterion("levelname <>", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameGreaterThan(String value) {
            addCriterion("levelname >", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("levelname >=", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLessThan(String value) {
            addCriterion("levelname <", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLessThanOrEqualTo(String value) {
            addCriterion("levelname <=", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLike(String value) {
            addCriterion("levelname like", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotLike(String value) {
            addCriterion("levelname not like", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameIn(List<String> values) {
            addCriterion("levelname in", values, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotIn(List<String> values) {
            addCriterion("levelname not in", values, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameBetween(String value1, String value2) {
            addCriterion("levelname between", value1, value2, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotBetween(String value1, String value2) {
            addCriterion("levelname not between", value1, value2, "levelname");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountIsNull() {
            addCriterion("leveldiscount is null");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountIsNotNull() {
            addCriterion("leveldiscount is not null");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountEqualTo(Double value) {
            addCriterion("leveldiscount =", value, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountNotEqualTo(Double value) {
            addCriterion("leveldiscount <>", value, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountGreaterThan(Double value) {
            addCriterion("leveldiscount >", value, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("leveldiscount >=", value, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountLessThan(Double value) {
            addCriterion("leveldiscount <", value, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountLessThanOrEqualTo(Double value) {
            addCriterion("leveldiscount <=", value, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountIn(List<Double> values) {
            addCriterion("leveldiscount in", values, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountNotIn(List<Double> values) {
            addCriterion("leveldiscount not in", values, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountBetween(Double value1, Double value2) {
            addCriterion("leveldiscount between", value1, value2, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLeveldiscountNotBetween(Double value1, Double value2) {
            addCriterion("leveldiscount not between", value1, value2, "leveldiscount");
            return (Criteria) this;
        }

        public Criteria andLevelpointsIsNull() {
            addCriterion("levelpoints is null");
            return (Criteria) this;
        }

        public Criteria andLevelpointsIsNotNull() {
            addCriterion("levelpoints is not null");
            return (Criteria) this;
        }

        public Criteria andLevelpointsEqualTo(Integer value) {
            addCriterion("levelpoints =", value, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsNotEqualTo(Integer value) {
            addCriterion("levelpoints <>", value, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsGreaterThan(Integer value) {
            addCriterion("levelpoints >", value, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelpoints >=", value, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsLessThan(Integer value) {
            addCriterion("levelpoints <", value, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsLessThanOrEqualTo(Integer value) {
            addCriterion("levelpoints <=", value, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsIn(List<Integer> values) {
            addCriterion("levelpoints in", values, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsNotIn(List<Integer> values) {
            addCriterion("levelpoints not in", values, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsBetween(Integer value1, Integer value2) {
            addCriterion("levelpoints between", value1, value2, "levelpoints");
            return (Criteria) this;
        }

        public Criteria andLevelpointsNotBetween(Integer value1, Integer value2) {
            addCriterion("levelpoints not between", value1, value2, "levelpoints");
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