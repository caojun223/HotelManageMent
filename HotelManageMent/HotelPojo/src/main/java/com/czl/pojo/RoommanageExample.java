package com.czl.pojo;



import java.io.Serializable;

import java.util.ArrayList;

import java.util.List;



public class RoommanageExample implements Serializable {

    protected String orderByClause;



    protected boolean distinct;



    protected List<Criteria> oredCriteria;



    public RoommanageExample() {

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



        public Criteria andRoomidIsNull() {

            addCriterion("RoomID is null");

            return (Criteria) this;

        }



        public Criteria andRoomidIsNotNull() {

            addCriterion("RoomID is not null");

            return (Criteria) this;

        }



        public Criteria andRoomidEqualTo(Integer value) {

            addCriterion("RoomID =", value, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidNotEqualTo(Integer value) {

            addCriterion("RoomID <>", value, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidGreaterThan(Integer value) {

            addCriterion("RoomID >", value, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {

            addCriterion("RoomID >=", value, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidLessThan(Integer value) {

            addCriterion("RoomID <", value, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidLessThanOrEqualTo(Integer value) {

            addCriterion("RoomID <=", value, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidIn(List<Integer> values) {

            addCriterion("RoomID in", values, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidNotIn(List<Integer> values) {

            addCriterion("RoomID not in", values, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidBetween(Integer value1, Integer value2) {

            addCriterion("RoomID between", value1, value2, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {

            addCriterion("RoomID not between", value1, value2, "roomid");

            return (Criteria) this;

        }



        public Criteria andRoomnumIsNull() {

            addCriterion("RoomNum is null");

            return (Criteria) this;

        }



        public Criteria andRoomnumIsNotNull() {

            addCriterion("RoomNum is not null");

            return (Criteria) this;

        }



        public Criteria andRoomnumEqualTo(String value) {

            addCriterion("RoomNum =", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumNotEqualTo(String value) {

            addCriterion("RoomNum <>", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumGreaterThan(String value) {

            addCriterion("RoomNum >", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumGreaterThanOrEqualTo(String value) {

            addCriterion("RoomNum >=", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumLessThan(String value) {

            addCriterion("RoomNum <", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumLessThanOrEqualTo(String value) {

            addCriterion("RoomNum <=", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumLike(String value) {

            addCriterion("RoomNum like", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumNotLike(String value) {

            addCriterion("RoomNum not like", value, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumIn(List<String> values) {

            addCriterion("RoomNum in", values, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumNotIn(List<String> values) {

            addCriterion("RoomNum not in", values, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumBetween(String value1, String value2) {

            addCriterion("RoomNum between", value1, value2, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomnumNotBetween(String value1, String value2) {

            addCriterion("RoomNum not between", value1, value2, "roomnum");

            return (Criteria) this;

        }



        public Criteria andRoomfloorIsNull() {

            addCriterion("RoomFloor is null");

            return (Criteria) this;

        }



        public Criteria andRoomfloorIsNotNull() {

            addCriterion("RoomFloor is not null");

            return (Criteria) this;

        }



        public Criteria andRoomfloorEqualTo(Integer value) {

            addCriterion("RoomFloor =", value, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorNotEqualTo(Integer value) {

            addCriterion("RoomFloor <>", value, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorGreaterThan(Integer value) {

            addCriterion("RoomFloor >", value, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorGreaterThanOrEqualTo(Integer value) {

            addCriterion("RoomFloor >=", value, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorLessThan(Integer value) {

            addCriterion("RoomFloor <", value, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorLessThanOrEqualTo(Integer value) {

            addCriterion("RoomFloor <=", value, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorIn(List<Integer> values) {

            addCriterion("RoomFloor in", values, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorNotIn(List<Integer> values) {

            addCriterion("RoomFloor not in", values, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorBetween(Integer value1, Integer value2) {

            addCriterion("RoomFloor between", value1, value2, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomfloorNotBetween(Integer value1, Integer value2) {

            addCriterion("RoomFloor not between", value1, value2, "roomfloor");

            return (Criteria) this;

        }



        public Criteria andRoomimgIsNull() {

            addCriterion("RoomImg is null");

            return (Criteria) this;

        }



        public Criteria andRoomimgIsNotNull() {

            addCriterion("RoomImg is not null");

            return (Criteria) this;

        }



        public Criteria andRoomimgEqualTo(String value) {

            addCriterion("RoomImg =", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgNotEqualTo(String value) {

            addCriterion("RoomImg <>", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgGreaterThan(String value) {

            addCriterion("RoomImg >", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgGreaterThanOrEqualTo(String value) {

            addCriterion("RoomImg >=", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgLessThan(String value) {

            addCriterion("RoomImg <", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgLessThanOrEqualTo(String value) {

            addCriterion("RoomImg <=", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgLike(String value) {

            addCriterion("RoomImg like", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgNotLike(String value) {

            addCriterion("RoomImg not like", value, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgIn(List<String> values) {

            addCriterion("RoomImg in", values, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgNotIn(List<String> values) {

            addCriterion("RoomImg not in", values, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgBetween(String value1, String value2) {

            addCriterion("RoomImg between", value1, value2, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomimgNotBetween(String value1, String value2) {

            addCriterion("RoomImg not between", value1, value2, "roomimg");

            return (Criteria) this;

        }



        public Criteria andRoomdescIsNull() {

            addCriterion("RoomDesc is null");

            return (Criteria) this;

        }



        public Criteria andRoomdescIsNotNull() {

            addCriterion("RoomDesc is not null");

            return (Criteria) this;

        }



        public Criteria andRoomdescEqualTo(String value) {

            addCriterion("RoomDesc =", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescNotEqualTo(String value) {

            addCriterion("RoomDesc <>", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescGreaterThan(String value) {

            addCriterion("RoomDesc >", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescGreaterThanOrEqualTo(String value) {

            addCriterion("RoomDesc >=", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescLessThan(String value) {

            addCriterion("RoomDesc <", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescLessThanOrEqualTo(String value) {

            addCriterion("RoomDesc <=", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescLike(String value) {

            addCriterion("RoomDesc like", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescNotLike(String value) {

            addCriterion("RoomDesc not like", value, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescIn(List<String> values) {

            addCriterion("RoomDesc in", values, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescNotIn(List<String> values) {

            addCriterion("RoomDesc not in", values, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescBetween(String value1, String value2) {

            addCriterion("RoomDesc between", value1, value2, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoomdescNotBetween(String value1, String value2) {

            addCriterion("RoomDesc not between", value1, value2, "roomdesc");

            return (Criteria) this;

        }



        public Criteria andRoompriceIsNull() {

            addCriterion("RoomPrice is null");

            return (Criteria) this;

        }



        public Criteria andRoompriceIsNotNull() {

            addCriterion("RoomPrice is not null");

            return (Criteria) this;

        }



        public Criteria andRoompriceEqualTo(Double value) {

            addCriterion("RoomPrice =", value, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceNotEqualTo(Double value) {

            addCriterion("RoomPrice <>", value, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceGreaterThan(Double value) {

            addCriterion("RoomPrice >", value, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceGreaterThanOrEqualTo(Double value) {

            addCriterion("RoomPrice >=", value, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceLessThan(Double value) {

            addCriterion("RoomPrice <", value, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceLessThanOrEqualTo(Double value) {

            addCriterion("RoomPrice <=", value, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceIn(List<Double> values) {

            addCriterion("RoomPrice in", values, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceNotIn(List<Double> values) {

            addCriterion("RoomPrice not in", values, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceBetween(Double value1, Double value2) {

            addCriterion("RoomPrice between", value1, value2, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoompriceNotBetween(Double value1, Double value2) {

            addCriterion("RoomPrice not between", value1, value2, "roomprice");

            return (Criteria) this;

        }



        public Criteria andRoomstateIsNull() {

            addCriterion("RoomState is null");

            return (Criteria) this;

        }



        public Criteria andRoomstateIsNotNull() {

            addCriterion("RoomState is not null");

            return (Criteria) this;

        }



        public Criteria andRoomstateEqualTo(String value) {

            addCriterion("RoomState =", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateNotEqualTo(String value) {

            addCriterion("RoomState <>", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateGreaterThan(String value) {

            addCriterion("RoomState >", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateGreaterThanOrEqualTo(String value) {

            addCriterion("RoomState >=", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateLessThan(String value) {

            addCriterion("RoomState <", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateLessThanOrEqualTo(String value) {

            addCriterion("RoomState <=", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateLike(String value) {

            addCriterion("RoomState like", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateNotLike(String value) {

            addCriterion("RoomState not like", value, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateIn(List<String> values) {

            addCriterion("RoomState in", values, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateNotIn(List<String> values) {

            addCriterion("RoomState not in", values, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateBetween(String value1, String value2) {

            addCriterion("RoomState between", value1, value2, "roomstate");

            return (Criteria) this;

        }



        public Criteria andRoomstateNotBetween(String value1, String value2) {

            addCriterion("RoomState not between", value1, value2, "roomstate");

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



        public Criteria andTypeidEqualTo(String value) {

            addCriterion("TypeId =", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidNotEqualTo(String value) {

            addCriterion("TypeId <>", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidGreaterThan(String value) {

            addCriterion("TypeId >", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidGreaterThanOrEqualTo(String value) {

            addCriterion("TypeId >=", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidLessThan(String value) {

            addCriterion("TypeId <", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidLessThanOrEqualTo(String value) {

            addCriterion("TypeId <=", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidLike(String value) {

            addCriterion("TypeId like", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidNotLike(String value) {

            addCriterion("TypeId not like", value, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidIn(List<String> values) {

            addCriterion("TypeId in", values, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidNotIn(List<String> values) {

            addCriterion("TypeId not in", values, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidBetween(String value1, String value2) {

            addCriterion("TypeId between", value1, value2, "typeid");

            return (Criteria) this;

        }



        public Criteria andTypeidNotBetween(String value1, String value2) {

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