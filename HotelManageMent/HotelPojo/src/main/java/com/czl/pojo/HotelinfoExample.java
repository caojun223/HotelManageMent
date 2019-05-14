package com.czl.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelinfoExample() {
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

        public Criteria andHotelidIsNull() {
            addCriterion("HotelId is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("HotelId is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Integer value) {
            addCriterion("HotelId =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Integer value) {
            addCriterion("HotelId <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Integer value) {
            addCriterion("HotelId >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HotelId >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Integer value) {
            addCriterion("HotelId <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Integer value) {
            addCriterion("HotelId <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Integer> values) {
            addCriterion("HotelId in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Integer> values) {
            addCriterion("HotelId not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Integer value1, Integer value2) {
            addCriterion("HotelId between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Integer value1, Integer value2) {
            addCriterion("HotelId not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHoteldescIsNull() {
            addCriterion("HotelDesc is null");
            return (Criteria) this;
        }

        public Criteria andHoteldescIsNotNull() {
            addCriterion("HotelDesc is not null");
            return (Criteria) this;
        }

        public Criteria andHoteldescEqualTo(String value) {
            addCriterion("HotelDesc =", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescNotEqualTo(String value) {
            addCriterion("HotelDesc <>", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescGreaterThan(String value) {
            addCriterion("HotelDesc >", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescGreaterThanOrEqualTo(String value) {
            addCriterion("HotelDesc >=", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescLessThan(String value) {
            addCriterion("HotelDesc <", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescLessThanOrEqualTo(String value) {
            addCriterion("HotelDesc <=", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescLike(String value) {
            addCriterion("HotelDesc like", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescNotLike(String value) {
            addCriterion("HotelDesc not like", value, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescIn(List<String> values) {
            addCriterion("HotelDesc in", values, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescNotIn(List<String> values) {
            addCriterion("HotelDesc not in", values, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescBetween(String value1, String value2) {
            addCriterion("HotelDesc between", value1, value2, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteldescNotBetween(String value1, String value2) {
            addCriterion("HotelDesc not between", value1, value2, "hoteldesc");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIsNull() {
            addCriterion("HotelAddress is null");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIsNotNull() {
            addCriterion("HotelAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHoteladdressEqualTo(String value) {
            addCriterion("HotelAddress =", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotEqualTo(String value) {
            addCriterion("HotelAddress <>", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressGreaterThan(String value) {
            addCriterion("HotelAddress >", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressGreaterThanOrEqualTo(String value) {
            addCriterion("HotelAddress >=", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLessThan(String value) {
            addCriterion("HotelAddress <", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLessThanOrEqualTo(String value) {
            addCriterion("HotelAddress <=", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLike(String value) {
            addCriterion("HotelAddress like", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotLike(String value) {
            addCriterion("HotelAddress not like", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIn(List<String> values) {
            addCriterion("HotelAddress in", values, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotIn(List<String> values) {
            addCriterion("HotelAddress not in", values, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressBetween(String value1, String value2) {
            addCriterion("HotelAddress between", value1, value2, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotBetween(String value1, String value2) {
            addCriterion("HotelAddress not between", value1, value2, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteltelIsNull() {
            addCriterion("HotelTel is null");
            return (Criteria) this;
        }

        public Criteria andHoteltelIsNotNull() {
            addCriterion("HotelTel is not null");
            return (Criteria) this;
        }

        public Criteria andHoteltelEqualTo(String value) {
            addCriterion("HotelTel =", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelNotEqualTo(String value) {
            addCriterion("HotelTel <>", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelGreaterThan(String value) {
            addCriterion("HotelTel >", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelGreaterThanOrEqualTo(String value) {
            addCriterion("HotelTel >=", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelLessThan(String value) {
            addCriterion("HotelTel <", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelLessThanOrEqualTo(String value) {
            addCriterion("HotelTel <=", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelLike(String value) {
            addCriterion("HotelTel like", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelNotLike(String value) {
            addCriterion("HotelTel not like", value, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelIn(List<String> values) {
            addCriterion("HotelTel in", values, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelNotIn(List<String> values) {
            addCriterion("HotelTel not in", values, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelBetween(String value1, String value2) {
            addCriterion("HotelTel between", value1, value2, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHoteltelNotBetween(String value1, String value2) {
            addCriterion("HotelTel not between", value1, value2, "hoteltel");
            return (Criteria) this;
        }

        public Criteria andHotelemailIsNull() {
            addCriterion("HotelEmail is null");
            return (Criteria) this;
        }

        public Criteria andHotelemailIsNotNull() {
            addCriterion("HotelEmail is not null");
            return (Criteria) this;
        }

        public Criteria andHotelemailEqualTo(String value) {
            addCriterion("HotelEmail =", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailNotEqualTo(String value) {
            addCriterion("HotelEmail <>", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailGreaterThan(String value) {
            addCriterion("HotelEmail >", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailGreaterThanOrEqualTo(String value) {
            addCriterion("HotelEmail >=", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailLessThan(String value) {
            addCriterion("HotelEmail <", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailLessThanOrEqualTo(String value) {
            addCriterion("HotelEmail <=", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailLike(String value) {
            addCriterion("HotelEmail like", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailNotLike(String value) {
            addCriterion("HotelEmail not like", value, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailIn(List<String> values) {
            addCriterion("HotelEmail in", values, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailNotIn(List<String> values) {
            addCriterion("HotelEmail not in", values, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailBetween(String value1, String value2) {
            addCriterion("HotelEmail between", value1, value2, "hotelemail");
            return (Criteria) this;
        }

        public Criteria andHotelemailNotBetween(String value1, String value2) {
            addCriterion("HotelEmail not between", value1, value2, "hotelemail");
            return (Criteria) this;
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