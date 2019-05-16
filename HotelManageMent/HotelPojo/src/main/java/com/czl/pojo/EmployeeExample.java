package com.czl.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeeidIsNull() {
            addCriterion("EmployeeId is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("EmployeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(Integer value) {
            addCriterion("EmployeeId =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(Integer value) {
            addCriterion("EmployeeId <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(Integer value) {
            addCriterion("EmployeeId >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmployeeId >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(Integer value) {
            addCriterion("EmployeeId <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("EmployeeId <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<Integer> values) {
            addCriterion("EmployeeId in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<Integer> values) {
            addCriterion("EmployeeId not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeId between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeId not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNull() {
            addCriterion("EmployeeName is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNotNull() {
            addCriterion("EmployeeName is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameEqualTo(String value) {
            addCriterion("EmployeeName =", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotEqualTo(String value) {
            addCriterion("EmployeeName <>", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThan(String value) {
            addCriterion("EmployeeName >", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeName >=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThan(String value) {
            addCriterion("EmployeeName <", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThanOrEqualTo(String value) {
            addCriterion("EmployeeName <=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLike(String value) {
            addCriterion("EmployeeName like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotLike(String value) {
            addCriterion("EmployeeName not like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIn(List<String> values) {
            addCriterion("EmployeeName in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotIn(List<String> values) {
            addCriterion("EmployeeName not in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameBetween(String value1, String value2) {
            addCriterion("EmployeeName between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotBetween(String value1, String value2) {
            addCriterion("EmployeeName not between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeepassIsNull() {
            addCriterion("EmployeePass is null");
            return (Criteria) this;
        }

        public Criteria andEmployeepassIsNotNull() {
            addCriterion("EmployeePass is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeepassEqualTo(String value) {
            addCriterion("EmployeePass =", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassNotEqualTo(String value) {
            addCriterion("EmployeePass <>", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassGreaterThan(String value) {
            addCriterion("EmployeePass >", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeePass >=", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassLessThan(String value) {
            addCriterion("EmployeePass <", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassLessThanOrEqualTo(String value) {
            addCriterion("EmployeePass <=", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassLike(String value) {
            addCriterion("EmployeePass like", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassNotLike(String value) {
            addCriterion("EmployeePass not like", value, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassIn(List<String> values) {
            addCriterion("EmployeePass in", values, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassNotIn(List<String> values) {
            addCriterion("EmployeePass not in", values, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassBetween(String value1, String value2) {
            addCriterion("EmployeePass between", value1, value2, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeepassNotBetween(String value1, String value2) {
            addCriterion("EmployeePass not between", value1, value2, "employeepass");
            return (Criteria) this;
        }

        public Criteria andEmployeesexIsNull() {
            addCriterion("EmployeeSex is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesexIsNotNull() {
            addCriterion("EmployeeSex is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesexEqualTo(String value) {
            addCriterion("EmployeeSex =", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotEqualTo(String value) {
            addCriterion("EmployeeSex <>", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexGreaterThan(String value) {
            addCriterion("EmployeeSex >", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeSex >=", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexLessThan(String value) {
            addCriterion("EmployeeSex <", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexLessThanOrEqualTo(String value) {
            addCriterion("EmployeeSex <=", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexLike(String value) {
            addCriterion("EmployeeSex like", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotLike(String value) {
            addCriterion("EmployeeSex not like", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexIn(List<String> values) {
            addCriterion("EmployeeSex in", values, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotIn(List<String> values) {
            addCriterion("EmployeeSex not in", values, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexBetween(String value1, String value2) {
            addCriterion("EmployeeSex between", value1, value2, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotBetween(String value1, String value2) {
            addCriterion("EmployeeSex not between", value1, value2, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeetelIsNull() {
            addCriterion("EmployeeTel is null");
            return (Criteria) this;
        }

        public Criteria andEmployeetelIsNotNull() {
            addCriterion("EmployeeTel is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeetelEqualTo(String value) {
            addCriterion("EmployeeTel =", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelNotEqualTo(String value) {
            addCriterion("EmployeeTel <>", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelGreaterThan(String value) {
            addCriterion("EmployeeTel >", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeTel >=", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelLessThan(String value) {
            addCriterion("EmployeeTel <", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelLessThanOrEqualTo(String value) {
            addCriterion("EmployeeTel <=", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelLike(String value) {
            addCriterion("EmployeeTel like", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelNotLike(String value) {
            addCriterion("EmployeeTel not like", value, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelIn(List<String> values) {
            addCriterion("EmployeeTel in", values, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelNotIn(List<String> values) {
            addCriterion("EmployeeTel not in", values, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelBetween(String value1, String value2) {
            addCriterion("EmployeeTel between", value1, value2, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeetelNotBetween(String value1, String value2) {
            addCriterion("EmployeeTel not between", value1, value2, "employeetel");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeIsNull() {
            addCriterion("EmployeeCartType is null");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeIsNotNull() {
            addCriterion("EmployeeCartType is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeEqualTo(String value) {
            addCriterion("EmployeeCartType =", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeNotEqualTo(String value) {
            addCriterion("EmployeeCartType <>", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeGreaterThan(String value) {
            addCriterion("EmployeeCartType >", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeCartType >=", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeLessThan(String value) {
            addCriterion("EmployeeCartType <", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeLessThanOrEqualTo(String value) {
            addCriterion("EmployeeCartType <=", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeLike(String value) {
            addCriterion("EmployeeCartType like", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeNotLike(String value) {
            addCriterion("EmployeeCartType not like", value, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeIn(List<String> values) {
            addCriterion("EmployeeCartType in", values, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeNotIn(List<String> values) {
            addCriterion("EmployeeCartType not in", values, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeBetween(String value1, String value2) {
            addCriterion("EmployeeCartType between", value1, value2, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecarttypeNotBetween(String value1, String value2) {
            addCriterion("EmployeeCartType not between", value1, value2, "employeecarttype");
            return (Criteria) this;
        }

        public Criteria andEmployeecartIsNull() {
            addCriterion("EmployeeCart is null");
            return (Criteria) this;
        }

        public Criteria andEmployeecartIsNotNull() {
            addCriterion("EmployeeCart is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeecartEqualTo(String value) {
            addCriterion("EmployeeCart =", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartNotEqualTo(String value) {
            addCriterion("EmployeeCart <>", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartGreaterThan(String value) {
            addCriterion("EmployeeCart >", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeCart >=", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartLessThan(String value) {
            addCriterion("EmployeeCart <", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartLessThanOrEqualTo(String value) {
            addCriterion("EmployeeCart <=", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartLike(String value) {
            addCriterion("EmployeeCart like", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartNotLike(String value) {
            addCriterion("EmployeeCart not like", value, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartIn(List<String> values) {
            addCriterion("EmployeeCart in", values, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartNotIn(List<String> values) {
            addCriterion("EmployeeCart not in", values, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartBetween(String value1, String value2) {
            addCriterion("EmployeeCart between", value1, value2, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeecartNotBetween(String value1, String value2) {
            addCriterion("EmployeeCart not between", value1, value2, "employeecart");
            return (Criteria) this;
        }

        public Criteria andEmployeestateIsNull() {
            addCriterion("EmployeeState is null");
            return (Criteria) this;
        }

        public Criteria andEmployeestateIsNotNull() {
            addCriterion("EmployeeState is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeestateEqualTo(String value) {
            addCriterion("EmployeeState =", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateNotEqualTo(String value) {
            addCriterion("EmployeeState <>", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateGreaterThan(String value) {
            addCriterion("EmployeeState >", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeState >=", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateLessThan(String value) {
            addCriterion("EmployeeState <", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateLessThanOrEqualTo(String value) {
            addCriterion("EmployeeState <=", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateLike(String value) {
            addCriterion("EmployeeState like", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateNotLike(String value) {
            addCriterion("EmployeeState not like", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateIn(List<String> values) {
            addCriterion("EmployeeState in", values, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateNotIn(List<String> values) {
            addCriterion("EmployeeState not in", values, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateBetween(String value1, String value2) {
            addCriterion("EmployeeState between", value1, value2, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateNotBetween(String value1, String value2) {
            addCriterion("EmployeeState not between", value1, value2, "employeestate");
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