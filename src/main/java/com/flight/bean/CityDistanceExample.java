package com.flight.bean;

import java.util.ArrayList;
import java.util.List;

public class CityDistanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityDistanceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAcityIsNull() {
            addCriterion("acity is null");
            return (Criteria) this;
        }

        public Criteria andAcityIsNotNull() {
            addCriterion("acity is not null");
            return (Criteria) this;
        }

        public Criteria andAcityEqualTo(String value) {
            addCriterion("acity =", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityNotEqualTo(String value) {
            addCriterion("acity <>", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityGreaterThan(String value) {
            addCriterion("acity >", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityGreaterThanOrEqualTo(String value) {
            addCriterion("acity >=", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityLessThan(String value) {
            addCriterion("acity <", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityLessThanOrEqualTo(String value) {
            addCriterion("acity <=", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityLike(String value) {
            addCriterion("acity like", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityNotLike(String value) {
            addCriterion("acity not like", value, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityIn(List<String> values) {
            addCriterion("acity in", values, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityNotIn(List<String> values) {
            addCriterion("acity not in", values, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityBetween(String value1, String value2) {
            addCriterion("acity between", value1, value2, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityNotBetween(String value1, String value2) {
            addCriterion("acity not between", value1, value2, "acity");
            return (Criteria) this;
        }

        public Criteria andAcityCodeIsNull() {
            addCriterion("acity_code is null");
            return (Criteria) this;
        }

        public Criteria andAcityCodeIsNotNull() {
            addCriterion("acity_code is not null");
            return (Criteria) this;
        }

        public Criteria andAcityCodeEqualTo(String value) {
            addCriterion("acity_code =", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeNotEqualTo(String value) {
            addCriterion("acity_code <>", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeGreaterThan(String value) {
            addCriterion("acity_code >", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("acity_code >=", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeLessThan(String value) {
            addCriterion("acity_code <", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeLessThanOrEqualTo(String value) {
            addCriterion("acity_code <=", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeLike(String value) {
            addCriterion("acity_code like", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeNotLike(String value) {
            addCriterion("acity_code not like", value, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeIn(List<String> values) {
            addCriterion("acity_code in", values, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeNotIn(List<String> values) {
            addCriterion("acity_code not in", values, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeBetween(String value1, String value2) {
            addCriterion("acity_code between", value1, value2, "acityCode");
            return (Criteria) this;
        }

        public Criteria andAcityCodeNotBetween(String value1, String value2) {
            addCriterion("acity_code not between", value1, value2, "acityCode");
            return (Criteria) this;
        }

        public Criteria andBcityIsNull() {
            addCriterion("bcity is null");
            return (Criteria) this;
        }

        public Criteria andBcityIsNotNull() {
            addCriterion("bcity is not null");
            return (Criteria) this;
        }

        public Criteria andBcityEqualTo(String value) {
            addCriterion("bcity =", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityNotEqualTo(String value) {
            addCriterion("bcity <>", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityGreaterThan(String value) {
            addCriterion("bcity >", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityGreaterThanOrEqualTo(String value) {
            addCriterion("bcity >=", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityLessThan(String value) {
            addCriterion("bcity <", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityLessThanOrEqualTo(String value) {
            addCriterion("bcity <=", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityLike(String value) {
            addCriterion("bcity like", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityNotLike(String value) {
            addCriterion("bcity not like", value, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityIn(List<String> values) {
            addCriterion("bcity in", values, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityNotIn(List<String> values) {
            addCriterion("bcity not in", values, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityBetween(String value1, String value2) {
            addCriterion("bcity between", value1, value2, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityNotBetween(String value1, String value2) {
            addCriterion("bcity not between", value1, value2, "bcity");
            return (Criteria) this;
        }

        public Criteria andBcityCodeIsNull() {
            addCriterion("bcity_code is null");
            return (Criteria) this;
        }

        public Criteria andBcityCodeIsNotNull() {
            addCriterion("bcity_code is not null");
            return (Criteria) this;
        }

        public Criteria andBcityCodeEqualTo(String value) {
            addCriterion("bcity_code =", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeNotEqualTo(String value) {
            addCriterion("bcity_code <>", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeGreaterThan(String value) {
            addCriterion("bcity_code >", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bcity_code >=", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeLessThan(String value) {
            addCriterion("bcity_code <", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeLessThanOrEqualTo(String value) {
            addCriterion("bcity_code <=", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeLike(String value) {
            addCriterion("bcity_code like", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeNotLike(String value) {
            addCriterion("bcity_code not like", value, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeIn(List<String> values) {
            addCriterion("bcity_code in", values, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeNotIn(List<String> values) {
            addCriterion("bcity_code not in", values, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeBetween(String value1, String value2) {
            addCriterion("bcity_code between", value1, value2, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andBcityCodeNotBetween(String value1, String value2) {
            addCriterion("bcity_code not between", value1, value2, "bcityCode");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Integer value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Integer value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Integer value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Integer value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Integer> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Integer> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Integer value1, Integer value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("distance not between", value1, value2, "distance");
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