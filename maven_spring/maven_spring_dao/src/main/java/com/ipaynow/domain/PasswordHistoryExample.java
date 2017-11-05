package com.ipaynow.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PasswordHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PasswordHistoryExample() {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andUpdateModeIsNull() {
            addCriterion("update_mode is null");
            return (Criteria) this;
        }

        public Criteria andUpdateModeIsNotNull() {
            addCriterion("update_mode is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateModeEqualTo(Integer value) {
            addCriterion("update_mode =", value, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeNotEqualTo(Integer value) {
            addCriterion("update_mode <>", value, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeGreaterThan(Integer value) {
            addCriterion("update_mode >", value, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_mode >=", value, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeLessThan(Integer value) {
            addCriterion("update_mode <", value, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeLessThanOrEqualTo(Integer value) {
            addCriterion("update_mode <=", value, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeIn(List<Integer> values) {
            addCriterion("update_mode in", values, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeNotIn(List<Integer> values) {
            addCriterion("update_mode not in", values, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeBetween(Integer value1, Integer value2) {
            addCriterion("update_mode between", value1, value2, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUpdateModeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_mode not between", value1, value2, "updateMode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOldPasswordIsNull() {
            addCriterion("old_password is null");
            return (Criteria) this;
        }

        public Criteria andOldPasswordIsNotNull() {
            addCriterion("old_password is not null");
            return (Criteria) this;
        }

        public Criteria andOldPasswordEqualTo(String value) {
            addCriterion("old_password =", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotEqualTo(String value) {
            addCriterion("old_password <>", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordGreaterThan(String value) {
            addCriterion("old_password >", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("old_password >=", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordLessThan(String value) {
            addCriterion("old_password <", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordLessThanOrEqualTo(String value) {
            addCriterion("old_password <=", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordLike(String value) {
            addCriterion("old_password like", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotLike(String value) {
            addCriterion("old_password not like", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordIn(List<String> values) {
            addCriterion("old_password in", values, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotIn(List<String> values) {
            addCriterion("old_password not in", values, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordBetween(String value1, String value2) {
            addCriterion("old_password between", value1, value2, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotBetween(String value1, String value2) {
            addCriterion("old_password not between", value1, value2, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordIsNull() {
            addCriterion("new_password is null");
            return (Criteria) this;
        }

        public Criteria andNewPasswordIsNotNull() {
            addCriterion("new_password is not null");
            return (Criteria) this;
        }

        public Criteria andNewPasswordEqualTo(String value) {
            addCriterion("new_password =", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotEqualTo(String value) {
            addCriterion("new_password <>", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordGreaterThan(String value) {
            addCriterion("new_password >", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("new_password >=", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordLessThan(String value) {
            addCriterion("new_password <", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordLessThanOrEqualTo(String value) {
            addCriterion("new_password <=", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordLike(String value) {
            addCriterion("new_password like", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotLike(String value) {
            addCriterion("new_password not like", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordIn(List<String> values) {
            addCriterion("new_password in", values, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotIn(List<String> values) {
            addCriterion("new_password not in", values, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordBetween(String value1, String value2) {
            addCriterion("new_password between", value1, value2, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotBetween(String value1, String value2) {
            addCriterion("new_password not between", value1, value2, "newPassword");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusIsNull() {
            addCriterion("update_status is null");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusIsNotNull() {
            addCriterion("update_status is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusEqualTo(Integer value) {
            addCriterion("update_status =", value, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusNotEqualTo(Integer value) {
            addCriterion("update_status <>", value, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusGreaterThan(Integer value) {
            addCriterion("update_status >", value, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_status >=", value, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusLessThan(Integer value) {
            addCriterion("update_status <", value, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("update_status <=", value, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusIn(List<Integer> values) {
            addCriterion("update_status in", values, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusNotIn(List<Integer> values) {
            addCriterion("update_status not in", values, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusBetween(Integer value1, Integer value2) {
            addCriterion("update_status between", value1, value2, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("update_status not between", value1, value2, "updateStatus");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
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