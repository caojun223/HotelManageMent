package com.czl.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionsExample() {
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

        public Criteria andPermissionsidIsNull() {
            addCriterion("PermissionsId is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsidIsNotNull() {
            addCriterion("PermissionsId is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsidEqualTo(Integer value) {
            addCriterion("PermissionsId =", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidNotEqualTo(Integer value) {
            addCriterion("PermissionsId <>", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidGreaterThan(Integer value) {
            addCriterion("PermissionsId >", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PermissionsId >=", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidLessThan(Integer value) {
            addCriterion("PermissionsId <", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidLessThanOrEqualTo(Integer value) {
            addCriterion("PermissionsId <=", value, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidIn(List<Integer> values) {
            addCriterion("PermissionsId in", values, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidNotIn(List<Integer> values) {
            addCriterion("PermissionsId not in", values, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidBetween(Integer value1, Integer value2) {
            addCriterion("PermissionsId between", value1, value2, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsidNotBetween(Integer value1, Integer value2) {
            addCriterion("PermissionsId not between", value1, value2, "permissionsid");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameIsNull() {
            addCriterion("PermissionsName is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameIsNotNull() {
            addCriterion("PermissionsName is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameEqualTo(String value) {
            addCriterion("PermissionsName =", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameNotEqualTo(String value) {
            addCriterion("PermissionsName <>", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameGreaterThan(String value) {
            addCriterion("PermissionsName >", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionsName >=", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameLessThan(String value) {
            addCriterion("PermissionsName <", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameLessThanOrEqualTo(String value) {
            addCriterion("PermissionsName <=", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameLike(String value) {
            addCriterion("PermissionsName like", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameNotLike(String value) {
            addCriterion("PermissionsName not like", value, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameIn(List<String> values) {
            addCriterion("PermissionsName in", values, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameNotIn(List<String> values) {
            addCriterion("PermissionsName not in", values, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameBetween(String value1, String value2) {
            addCriterion("PermissionsName between", value1, value2, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsnameNotBetween(String value1, String value2) {
            addCriterion("PermissionsName not between", value1, value2, "permissionsname");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateIsNull() {
            addCriterion("PermissionsState is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateIsNotNull() {
            addCriterion("PermissionsState is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateEqualTo(String value) {
            addCriterion("PermissionsState =", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateNotEqualTo(String value) {
            addCriterion("PermissionsState <>", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateGreaterThan(String value) {
            addCriterion("PermissionsState >", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionsState >=", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateLessThan(String value) {
            addCriterion("PermissionsState <", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateLessThanOrEqualTo(String value) {
            addCriterion("PermissionsState <=", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateLike(String value) {
            addCriterion("PermissionsState like", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateNotLike(String value) {
            addCriterion("PermissionsState not like", value, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateIn(List<String> values) {
            addCriterion("PermissionsState in", values, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateNotIn(List<String> values) {
            addCriterion("PermissionsState not in", values, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateBetween(String value1, String value2) {
            addCriterion("PermissionsState between", value1, value2, "permissionsstate");
            return (Criteria) this;
        }

        public Criteria andPermissionsstateNotBetween(String value1, String value2) {
            addCriterion("PermissionsState not between", value1, value2, "permissionsstate");
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