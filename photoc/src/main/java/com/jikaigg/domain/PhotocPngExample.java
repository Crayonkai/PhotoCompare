package com.jikaigg.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhotocPngExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotocPngExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPpathIsNull() {
            addCriterion("ppath is null");
            return (Criteria) this;
        }

        public Criteria andPpathIsNotNull() {
            addCriterion("ppath is not null");
            return (Criteria) this;
        }

        public Criteria andPpathEqualTo(String value) {
            addCriterion("ppath =", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathNotEqualTo(String value) {
            addCriterion("ppath <>", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathGreaterThan(String value) {
            addCriterion("ppath >", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathGreaterThanOrEqualTo(String value) {
            addCriterion("ppath >=", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathLessThan(String value) {
            addCriterion("ppath <", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathLessThanOrEqualTo(String value) {
            addCriterion("ppath <=", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathLike(String value) {
            addCriterion("ppath like", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathNotLike(String value) {
            addCriterion("ppath not like", value, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathIn(List<String> values) {
            addCriterion("ppath in", values, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathNotIn(List<String> values) {
            addCriterion("ppath not in", values, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathBetween(String value1, String value2) {
            addCriterion("ppath between", value1, value2, "ppath");
            return (Criteria) this;
        }

        public Criteria andPpathNotBetween(String value1, String value2) {
            addCriterion("ppath not between", value1, value2, "ppath");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5IsNull() {
            addCriterion("photo_md5 is null");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5IsNotNull() {
            addCriterion("photo_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5EqualTo(String value) {
            addCriterion("photo_md5 =", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5NotEqualTo(String value) {
            addCriterion("photo_md5 <>", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5GreaterThan(String value) {
            addCriterion("photo_md5 >", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5GreaterThanOrEqualTo(String value) {
            addCriterion("photo_md5 >=", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5LessThan(String value) {
            addCriterion("photo_md5 <", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5LessThanOrEqualTo(String value) {
            addCriterion("photo_md5 <=", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5Like(String value) {
            addCriterion("photo_md5 like", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5NotLike(String value) {
            addCriterion("photo_md5 not like", value, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5In(List<String> values) {
            addCriterion("photo_md5 in", values, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5NotIn(List<String> values) {
            addCriterion("photo_md5 not in", values, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5Between(String value1, String value2) {
            addCriterion("photo_md5 between", value1, value2, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andPhotoMd5NotBetween(String value1, String value2) {
            addCriterion("photo_md5 not between", value1, value2, "photoMd5");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsIsNull() {
            addCriterion("undefind_fields is null");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsIsNotNull() {
            addCriterion("undefind_fields is not null");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsEqualTo(String value) {
            addCriterion("undefind_fields =", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsNotEqualTo(String value) {
            addCriterion("undefind_fields <>", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsGreaterThan(String value) {
            addCriterion("undefind_fields >", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("undefind_fields >=", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsLessThan(String value) {
            addCriterion("undefind_fields <", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsLessThanOrEqualTo(String value) {
            addCriterion("undefind_fields <=", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsLike(String value) {
            addCriterion("undefind_fields like", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsNotLike(String value) {
            addCriterion("undefind_fields not like", value, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsIn(List<String> values) {
            addCriterion("undefind_fields in", values, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsNotIn(List<String> values) {
            addCriterion("undefind_fields not in", values, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsBetween(String value1, String value2) {
            addCriterion("undefind_fields between", value1, value2, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andUndefindFieldsNotBetween(String value1, String value2) {
            addCriterion("undefind_fields not between", value1, value2, "undefindFields");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionIsNull() {
            addCriterion("expected_file_name_extension is null");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionIsNotNull() {
            addCriterion("expected_file_name_extension is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionEqualTo(String value) {
            addCriterion("expected_file_name_extension =", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotEqualTo(String value) {
            addCriterion("expected_file_name_extension <>", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionGreaterThan(String value) {
            addCriterion("expected_file_name_extension >", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("expected_file_name_extension >=", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionLessThan(String value) {
            addCriterion("expected_file_name_extension <", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionLessThanOrEqualTo(String value) {
            addCriterion("expected_file_name_extension <=", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionLike(String value) {
            addCriterion("expected_file_name_extension like", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotLike(String value) {
            addCriterion("expected_file_name_extension not like", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionIn(List<String> values) {
            addCriterion("expected_file_name_extension in", values, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotIn(List<String> values) {
            addCriterion("expected_file_name_extension not in", values, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionBetween(String value1, String value2) {
            addCriterion("expected_file_name_extension between", value1, value2, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotBetween(String value1, String value2) {
            addCriterion("expected_file_name_extension not between", value1, value2, "expectedFileNameExtension");
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