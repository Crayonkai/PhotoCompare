package com.jikaigg.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhotocJpegExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotocJpegExample() {
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

        public Criteria andDetectedFileTypeNameIsNull() {
            addCriterion("detected_file_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameIsNotNull() {
            addCriterion("detected_file_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameEqualTo(String value) {
            addCriterion("detected_file_type_name =", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameNotEqualTo(String value) {
            addCriterion("detected_file_type_name <>", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameGreaterThan(String value) {
            addCriterion("detected_file_type_name >", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("detected_file_type_name >=", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameLessThan(String value) {
            addCriterion("detected_file_type_name <", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameLessThanOrEqualTo(String value) {
            addCriterion("detected_file_type_name <=", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameLike(String value) {
            addCriterion("detected_file_type_name like", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameNotLike(String value) {
            addCriterion("detected_file_type_name not like", value, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameIn(List<String> values) {
            addCriterion("detected_file_type_name in", values, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameNotIn(List<String> values) {
            addCriterion("detected_file_type_name not in", values, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameBetween(String value1, String value2) {
            addCriterion("detected_file_type_name between", value1, value2, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeNameNotBetween(String value1, String value2) {
            addCriterion("detected_file_type_name not between", value1, value2, "detectedFileTypeName");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeIsNull() {
            addCriterion("detected_mime_type is null");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeIsNotNull() {
            addCriterion("detected_mime_type is not null");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeEqualTo(String value) {
            addCriterion("detected_mime_type =", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeNotEqualTo(String value) {
            addCriterion("detected_mime_type <>", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeGreaterThan(String value) {
            addCriterion("detected_mime_type >", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("detected_mime_type >=", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeLessThan(String value) {
            addCriterion("detected_mime_type <", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeLessThanOrEqualTo(String value) {
            addCriterion("detected_mime_type <=", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeLike(String value) {
            addCriterion("detected_mime_type like", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeNotLike(String value) {
            addCriterion("detected_mime_type not like", value, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeIn(List<String> values) {
            addCriterion("detected_mime_type in", values, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeNotIn(List<String> values) {
            addCriterion("detected_mime_type not in", values, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeBetween(String value1, String value2) {
            addCriterion("detected_mime_type between", value1, value2, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andDetectedMimeTypeNotBetween(String value1, String value2) {
            addCriterion("detected_mime_type not between", value1, value2, "detectedMimeType");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateIsNull() {
            addCriterion("file_modified_date is null");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateIsNotNull() {
            addCriterion("file_modified_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateEqualTo(Date value) {
            addCriterion("file_modified_date =", value, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateNotEqualTo(Date value) {
            addCriterion("file_modified_date <>", value, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateGreaterThan(Date value) {
            addCriterion("file_modified_date >", value, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_modified_date >=", value, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateLessThan(Date value) {
            addCriterion("file_modified_date <", value, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("file_modified_date <=", value, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateIn(List<Date> values) {
            addCriterion("file_modified_date in", values, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateNotIn(List<Date> values) {
            addCriterion("file_modified_date not in", values, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateBetween(Date value1, Date value2) {
            addCriterion("file_modified_date between", value1, value2, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFileModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("file_modified_date not between", value1, value2, "fileModifiedDate");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameIsNull() {
            addCriterion("detected_file_type_long_name is null");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameIsNotNull() {
            addCriterion("detected_file_type_long_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameEqualTo(String value) {
            addCriterion("detected_file_type_long_name =", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameNotEqualTo(String value) {
            addCriterion("detected_file_type_long_name <>", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameGreaterThan(String value) {
            addCriterion("detected_file_type_long_name >", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameGreaterThanOrEqualTo(String value) {
            addCriterion("detected_file_type_long_name >=", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameLessThan(String value) {
            addCriterion("detected_file_type_long_name <", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameLessThanOrEqualTo(String value) {
            addCriterion("detected_file_type_long_name <=", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameLike(String value) {
            addCriterion("detected_file_type_long_name like", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameNotLike(String value) {
            addCriterion("detected_file_type_long_name not like", value, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameIn(List<String> values) {
            addCriterion("detected_file_type_long_name in", values, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameNotIn(List<String> values) {
            addCriterion("detected_file_type_long_name not in", values, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameBetween(String value1, String value2) {
            addCriterion("detected_file_type_long_name between", value1, value2, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andDetectedFileTypeLongNameNotBetween(String value1, String value2) {
            addCriterion("detected_file_type_long_name not between", value1, value2, "detectedFileTypeLongName");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeIsNull() {
            addCriterion("compression_type is null");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeIsNotNull() {
            addCriterion("compression_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeEqualTo(String value) {
            addCriterion("compression_type =", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotEqualTo(String value) {
            addCriterion("compression_type <>", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeGreaterThan(String value) {
            addCriterion("compression_type >", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("compression_type >=", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeLessThan(String value) {
            addCriterion("compression_type <", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeLessThanOrEqualTo(String value) {
            addCriterion("compression_type <=", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeLike(String value) {
            addCriterion("compression_type like", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotLike(String value) {
            addCriterion("compression_type not like", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeIn(List<String> values) {
            addCriterion("compression_type in", values, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotIn(List<String> values) {
            addCriterion("compression_type not in", values, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeBetween(String value1, String value2) {
            addCriterion("compression_type between", value1, value2, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotBetween(String value1, String value2) {
            addCriterion("compression_type not between", value1, value2, "compressionType");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionIsNull() {
            addCriterion("data_precision is null");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionIsNotNull() {
            addCriterion("data_precision is not null");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionEqualTo(String value) {
            addCriterion("data_precision =", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionNotEqualTo(String value) {
            addCriterion("data_precision <>", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionGreaterThan(String value) {
            addCriterion("data_precision >", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionGreaterThanOrEqualTo(String value) {
            addCriterion("data_precision >=", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionLessThan(String value) {
            addCriterion("data_precision <", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionLessThanOrEqualTo(String value) {
            addCriterion("data_precision <=", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionLike(String value) {
            addCriterion("data_precision like", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionNotLike(String value) {
            addCriterion("data_precision not like", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionIn(List<String> values) {
            addCriterion("data_precision in", values, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionNotIn(List<String> values) {
            addCriterion("data_precision not in", values, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionBetween(String value1, String value2) {
            addCriterion("data_precision between", value1, value2, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionNotBetween(String value1, String value2) {
            addCriterion("data_precision not between", value1, value2, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andImageHeightIsNull() {
            addCriterion("image_height is null");
            return (Criteria) this;
        }

        public Criteria andImageHeightIsNotNull() {
            addCriterion("image_height is not null");
            return (Criteria) this;
        }

        public Criteria andImageHeightEqualTo(Integer value) {
            addCriterion("image_height =", value, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightNotEqualTo(Integer value) {
            addCriterion("image_height <>", value, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightGreaterThan(Integer value) {
            addCriterion("image_height >", value, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_height >=", value, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightLessThan(Integer value) {
            addCriterion("image_height <", value, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightLessThanOrEqualTo(Integer value) {
            addCriterion("image_height <=", value, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightIn(List<Integer> values) {
            addCriterion("image_height in", values, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightNotIn(List<Integer> values) {
            addCriterion("image_height not in", values, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightBetween(Integer value1, Integer value2) {
            addCriterion("image_height between", value1, value2, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("image_height not between", value1, value2, "imageHeight");
            return (Criteria) this;
        }

        public Criteria andImageWidthIsNull() {
            addCriterion("image_width is null");
            return (Criteria) this;
        }

        public Criteria andImageWidthIsNotNull() {
            addCriterion("image_width is not null");
            return (Criteria) this;
        }

        public Criteria andImageWidthEqualTo(Integer value) {
            addCriterion("image_width =", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthNotEqualTo(Integer value) {
            addCriterion("image_width <>", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthGreaterThan(Integer value) {
            addCriterion("image_width >", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_width >=", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthLessThan(Integer value) {
            addCriterion("image_width <", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthLessThanOrEqualTo(Integer value) {
            addCriterion("image_width <=", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthIn(List<Integer> values) {
            addCriterion("image_width in", values, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthNotIn(List<Integer> values) {
            addCriterion("image_width not in", values, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthBetween(Integer value1, Integer value2) {
            addCriterion("image_width between", value1, value2, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("image_width not between", value1, value2, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andXResolutionIsNull() {
            addCriterion("x_resolution is null");
            return (Criteria) this;
        }

        public Criteria andXResolutionIsNotNull() {
            addCriterion("x_resolution is not null");
            return (Criteria) this;
        }

        public Criteria andXResolutionEqualTo(String value) {
            addCriterion("x_resolution =", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionNotEqualTo(String value) {
            addCriterion("x_resolution <>", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionGreaterThan(String value) {
            addCriterion("x_resolution >", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("x_resolution >=", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionLessThan(String value) {
            addCriterion("x_resolution <", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionLessThanOrEqualTo(String value) {
            addCriterion("x_resolution <=", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionLike(String value) {
            addCriterion("x_resolution like", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionNotLike(String value) {
            addCriterion("x_resolution not like", value, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionIn(List<String> values) {
            addCriterion("x_resolution in", values, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionNotIn(List<String> values) {
            addCriterion("x_resolution not in", values, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionBetween(String value1, String value2) {
            addCriterion("x_resolution between", value1, value2, "xResolution");
            return (Criteria) this;
        }

        public Criteria andXResolutionNotBetween(String value1, String value2) {
            addCriterion("x_resolution not between", value1, value2, "xResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionIsNull() {
            addCriterion("y_resolution is null");
            return (Criteria) this;
        }

        public Criteria andYResolutionIsNotNull() {
            addCriterion("y_resolution is not null");
            return (Criteria) this;
        }

        public Criteria andYResolutionEqualTo(String value) {
            addCriterion("y_resolution =", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionNotEqualTo(String value) {
            addCriterion("y_resolution <>", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionGreaterThan(String value) {
            addCriterion("y_resolution >", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("y_resolution >=", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionLessThan(String value) {
            addCriterion("y_resolution <", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionLessThanOrEqualTo(String value) {
            addCriterion("y_resolution <=", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionLike(String value) {
            addCriterion("y_resolution like", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionNotLike(String value) {
            addCriterion("y_resolution not like", value, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionIn(List<String> values) {
            addCriterion("y_resolution in", values, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionNotIn(List<String> values) {
            addCriterion("y_resolution not in", values, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionBetween(String value1, String value2) {
            addCriterion("y_resolution between", value1, value2, "yResolution");
            return (Criteria) this;
        }

        public Criteria andYResolutionNotBetween(String value1, String value2) {
            addCriterion("y_resolution not between", value1, value2, "yResolution");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0IsNull() {
            addCriterion("image_width_ifd0 is null");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0IsNotNull() {
            addCriterion("image_width_ifd0 is not null");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0EqualTo(Integer value) {
            addCriterion("image_width_ifd0 =", value, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0NotEqualTo(Integer value) {
            addCriterion("image_width_ifd0 <>", value, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0GreaterThan(Integer value) {
            addCriterion("image_width_ifd0 >", value, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0GreaterThanOrEqualTo(Integer value) {
            addCriterion("image_width_ifd0 >=", value, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0LessThan(Integer value) {
            addCriterion("image_width_ifd0 <", value, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0LessThanOrEqualTo(Integer value) {
            addCriterion("image_width_ifd0 <=", value, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0In(List<Integer> values) {
            addCriterion("image_width_ifd0 in", values, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0NotIn(List<Integer> values) {
            addCriterion("image_width_ifd0 not in", values, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0Between(Integer value1, Integer value2) {
            addCriterion("image_width_ifd0 between", value1, value2, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageWidthIfd0NotBetween(Integer value1, Integer value2) {
            addCriterion("image_width_ifd0 not between", value1, value2, "imageWidthIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0IsNull() {
            addCriterion("image_height_ifd0 is null");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0IsNotNull() {
            addCriterion("image_height_ifd0 is not null");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0EqualTo(Integer value) {
            addCriterion("image_height_ifd0 =", value, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0NotEqualTo(Integer value) {
            addCriterion("image_height_ifd0 <>", value, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0GreaterThan(Integer value) {
            addCriterion("image_height_ifd0 >", value, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0GreaterThanOrEqualTo(Integer value) {
            addCriterion("image_height_ifd0 >=", value, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0LessThan(Integer value) {
            addCriterion("image_height_ifd0 <", value, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0LessThanOrEqualTo(Integer value) {
            addCriterion("image_height_ifd0 <=", value, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0In(List<Integer> values) {
            addCriterion("image_height_ifd0 in", values, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0NotIn(List<Integer> values) {
            addCriterion("image_height_ifd0 not in", values, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0Between(Integer value1, Integer value2) {
            addCriterion("image_height_ifd0 between", value1, value2, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andImageHeightIfd0NotBetween(Integer value1, Integer value2) {
            addCriterion("image_height_ifd0 not between", value1, value2, "imageHeightIfd0");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningIsNull() {
            addCriterion("ycbcr_positioning is null");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningIsNotNull() {
            addCriterion("ycbcr_positioning is not null");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningEqualTo(String value) {
            addCriterion("ycbcr_positioning =", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningNotEqualTo(String value) {
            addCriterion("ycbcr_positioning <>", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningGreaterThan(String value) {
            addCriterion("ycbcr_positioning >", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningGreaterThanOrEqualTo(String value) {
            addCriterion("ycbcr_positioning >=", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningLessThan(String value) {
            addCriterion("ycbcr_positioning <", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningLessThanOrEqualTo(String value) {
            addCriterion("ycbcr_positioning <=", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningLike(String value) {
            addCriterion("ycbcr_positioning like", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningNotLike(String value) {
            addCriterion("ycbcr_positioning not like", value, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningIn(List<String> values) {
            addCriterion("ycbcr_positioning in", values, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningNotIn(List<String> values) {
            addCriterion("ycbcr_positioning not in", values, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningBetween(String value1, String value2) {
            addCriterion("ycbcr_positioning between", value1, value2, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andYcbcrPositioningNotBetween(String value1, String value2) {
            addCriterion("ycbcr_positioning not between", value1, value2, "ycbcrPositioning");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitIsNull() {
            addCriterion("resolution_unit is null");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitIsNotNull() {
            addCriterion("resolution_unit is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitEqualTo(String value) {
            addCriterion("resolution_unit =", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitNotEqualTo(String value) {
            addCriterion("resolution_unit <>", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitGreaterThan(String value) {
            addCriterion("resolution_unit >", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitGreaterThanOrEqualTo(String value) {
            addCriterion("resolution_unit >=", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitLessThan(String value) {
            addCriterion("resolution_unit <", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitLessThanOrEqualTo(String value) {
            addCriterion("resolution_unit <=", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitLike(String value) {
            addCriterion("resolution_unit like", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitNotLike(String value) {
            addCriterion("resolution_unit not like", value, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitIn(List<String> values) {
            addCriterion("resolution_unit in", values, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitNotIn(List<String> values) {
            addCriterion("resolution_unit not in", values, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitBetween(String value1, String value2) {
            addCriterion("resolution_unit between", value1, value2, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andResolutionUnitNotBetween(String value1, String value2) {
            addCriterion("resolution_unit not between", value1, value2, "resolutionUnit");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNull() {
            addCriterion("orientation is null");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNotNull() {
            addCriterion("orientation is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationEqualTo(String value) {
            addCriterion("orientation =", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotEqualTo(String value) {
            addCriterion("orientation <>", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThan(String value) {
            addCriterion("orientation >", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("orientation >=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThan(String value) {
            addCriterion("orientation <", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThanOrEqualTo(String value) {
            addCriterion("orientation <=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLike(String value) {
            addCriterion("orientation like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotLike(String value) {
            addCriterion("orientation not like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationIn(List<String> values) {
            addCriterion("orientation in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotIn(List<String> values) {
            addCriterion("orientation not in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationBetween(String value1, String value2) {
            addCriterion("orientation between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotBetween(String value1, String value2) {
            addCriterion("orientation not between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andApertureValueIsNull() {
            addCriterion("aperture_value is null");
            return (Criteria) this;
        }

        public Criteria andApertureValueIsNotNull() {
            addCriterion("aperture_value is not null");
            return (Criteria) this;
        }

        public Criteria andApertureValueEqualTo(String value) {
            addCriterion("aperture_value =", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueNotEqualTo(String value) {
            addCriterion("aperture_value <>", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueGreaterThan(String value) {
            addCriterion("aperture_value >", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueGreaterThanOrEqualTo(String value) {
            addCriterion("aperture_value >=", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueLessThan(String value) {
            addCriterion("aperture_value <", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueLessThanOrEqualTo(String value) {
            addCriterion("aperture_value <=", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueLike(String value) {
            addCriterion("aperture_value like", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueNotLike(String value) {
            addCriterion("aperture_value not like", value, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueIn(List<String> values) {
            addCriterion("aperture_value in", values, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueNotIn(List<String> values) {
            addCriterion("aperture_value not in", values, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueBetween(String value1, String value2) {
            addCriterion("aperture_value between", value1, value2, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andApertureValueNotBetween(String value1, String value2) {
            addCriterion("aperture_value not between", value1, value2, "apertureValue");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNull() {
            addCriterion("scene_type is null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNotNull() {
            addCriterion("scene_type is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeEqualTo(String value) {
            addCriterion("scene_type =", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotEqualTo(String value) {
            addCriterion("scene_type <>", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThan(String value) {
            addCriterion("scene_type >", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scene_type >=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThan(String value) {
            addCriterion("scene_type <", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThanOrEqualTo(String value) {
            addCriterion("scene_type <=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLike(String value) {
            addCriterion("scene_type like", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotLike(String value) {
            addCriterion("scene_type not like", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIn(List<String> values) {
            addCriterion("scene_type in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotIn(List<String> values) {
            addCriterion("scene_type not in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeBetween(String value1, String value2) {
            addCriterion("scene_type between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotBetween(String value1, String value2) {
            addCriterion("scene_type not between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andExifVersionIsNull() {
            addCriterion("exif_version is null");
            return (Criteria) this;
        }

        public Criteria andExifVersionIsNotNull() {
            addCriterion("exif_version is not null");
            return (Criteria) this;
        }

        public Criteria andExifVersionEqualTo(String value) {
            addCriterion("exif_version =", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionNotEqualTo(String value) {
            addCriterion("exif_version <>", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionGreaterThan(String value) {
            addCriterion("exif_version >", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionGreaterThanOrEqualTo(String value) {
            addCriterion("exif_version >=", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionLessThan(String value) {
            addCriterion("exif_version <", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionLessThanOrEqualTo(String value) {
            addCriterion("exif_version <=", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionLike(String value) {
            addCriterion("exif_version like", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionNotLike(String value) {
            addCriterion("exif_version not like", value, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionIn(List<String> values) {
            addCriterion("exif_version in", values, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionNotIn(List<String> values) {
            addCriterion("exif_version not in", values, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionBetween(String value1, String value2) {
            addCriterion("exif_version between", value1, value2, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExifVersionNotBetween(String value1, String value2) {
            addCriterion("exif_version not between", value1, value2, "exifVersion");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueIsNull() {
            addCriterion("exposure_bias_value is null");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueIsNotNull() {
            addCriterion("exposure_bias_value is not null");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueEqualTo(String value) {
            addCriterion("exposure_bias_value =", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueNotEqualTo(String value) {
            addCriterion("exposure_bias_value <>", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueGreaterThan(String value) {
            addCriterion("exposure_bias_value >", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueGreaterThanOrEqualTo(String value) {
            addCriterion("exposure_bias_value >=", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueLessThan(String value) {
            addCriterion("exposure_bias_value <", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueLessThanOrEqualTo(String value) {
            addCriterion("exposure_bias_value <=", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueLike(String value) {
            addCriterion("exposure_bias_value like", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueNotLike(String value) {
            addCriterion("exposure_bias_value not like", value, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueIn(List<String> values) {
            addCriterion("exposure_bias_value in", values, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueNotIn(List<String> values) {
            addCriterion("exposure_bias_value not in", values, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueBetween(String value1, String value2) {
            addCriterion("exposure_bias_value between", value1, value2, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureBiasValueNotBetween(String value1, String value2) {
            addCriterion("exposure_bias_value not between", value1, value2, "exposureBiasValue");
            return (Criteria) this;
        }

        public Criteria andExposureProgramIsNull() {
            addCriterion("exposure_program is null");
            return (Criteria) this;
        }

        public Criteria andExposureProgramIsNotNull() {
            addCriterion("exposure_program is not null");
            return (Criteria) this;
        }

        public Criteria andExposureProgramEqualTo(String value) {
            addCriterion("exposure_program =", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramNotEqualTo(String value) {
            addCriterion("exposure_program <>", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramGreaterThan(String value) {
            addCriterion("exposure_program >", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramGreaterThanOrEqualTo(String value) {
            addCriterion("exposure_program >=", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramLessThan(String value) {
            addCriterion("exposure_program <", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramLessThanOrEqualTo(String value) {
            addCriterion("exposure_program <=", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramLike(String value) {
            addCriterion("exposure_program like", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramNotLike(String value) {
            addCriterion("exposure_program not like", value, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramIn(List<String> values) {
            addCriterion("exposure_program in", values, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramNotIn(List<String> values) {
            addCriterion("exposure_program not in", values, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramBetween(String value1, String value2) {
            addCriterion("exposure_program between", value1, value2, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andExposureProgramNotBetween(String value1, String value2) {
            addCriterion("exposure_program not between", value1, value2, "exposureProgram");
            return (Criteria) this;
        }

        public Criteria andColorSpaceIsNull() {
            addCriterion("color_space is null");
            return (Criteria) this;
        }

        public Criteria andColorSpaceIsNotNull() {
            addCriterion("color_space is not null");
            return (Criteria) this;
        }

        public Criteria andColorSpaceEqualTo(String value) {
            addCriterion("color_space =", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceNotEqualTo(String value) {
            addCriterion("color_space <>", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceGreaterThan(String value) {
            addCriterion("color_space >", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("color_space >=", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceLessThan(String value) {
            addCriterion("color_space <", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceLessThanOrEqualTo(String value) {
            addCriterion("color_space <=", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceLike(String value) {
            addCriterion("color_space like", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceNotLike(String value) {
            addCriterion("color_space not like", value, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceIn(List<String> values) {
            addCriterion("color_space in", values, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceNotIn(List<String> values) {
            addCriterion("color_space not in", values, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceBetween(String value1, String value2) {
            addCriterion("color_space between", value1, value2, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andColorSpaceNotBetween(String value1, String value2) {
            addCriterion("color_space not between", value1, value2, "colorSpace");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueIsNull() {
            addCriterion("max_aperture_value is null");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueIsNotNull() {
            addCriterion("max_aperture_value is not null");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueEqualTo(String value) {
            addCriterion("max_aperture_value =", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueNotEqualTo(String value) {
            addCriterion("max_aperture_value <>", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueGreaterThan(String value) {
            addCriterion("max_aperture_value >", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueGreaterThanOrEqualTo(String value) {
            addCriterion("max_aperture_value >=", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueLessThan(String value) {
            addCriterion("max_aperture_value <", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueLessThanOrEqualTo(String value) {
            addCriterion("max_aperture_value <=", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueLike(String value) {
            addCriterion("max_aperture_value like", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueNotLike(String value) {
            addCriterion("max_aperture_value not like", value, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueIn(List<String> values) {
            addCriterion("max_aperture_value in", values, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueNotIn(List<String> values) {
            addCriterion("max_aperture_value not in", values, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueBetween(String value1, String value2) {
            addCriterion("max_aperture_value between", value1, value2, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andMaxApertureValueNotBetween(String value1, String value2) {
            addCriterion("max_aperture_value not between", value1, value2, "maxApertureValue");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightIsNull() {
            addCriterion("exif_image_height is null");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightIsNotNull() {
            addCriterion("exif_image_height is not null");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightEqualTo(Integer value) {
            addCriterion("exif_image_height =", value, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightNotEqualTo(Integer value) {
            addCriterion("exif_image_height <>", value, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightGreaterThan(Integer value) {
            addCriterion("exif_image_height >", value, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("exif_image_height >=", value, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightLessThan(Integer value) {
            addCriterion("exif_image_height <", value, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightLessThanOrEqualTo(Integer value) {
            addCriterion("exif_image_height <=", value, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightIn(List<Integer> values) {
            addCriterion("exif_image_height in", values, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightNotIn(List<Integer> values) {
            addCriterion("exif_image_height not in", values, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightBetween(Integer value1, Integer value2) {
            addCriterion("exif_image_height between", value1, value2, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("exif_image_height not between", value1, value2, "exifImageHeight");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthIsNull() {
            addCriterion("exif_image_width is null");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthIsNotNull() {
            addCriterion("exif_image_width is not null");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthEqualTo(Integer value) {
            addCriterion("exif_image_width =", value, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthNotEqualTo(Integer value) {
            addCriterion("exif_image_width <>", value, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthGreaterThan(Integer value) {
            addCriterion("exif_image_width >", value, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("exif_image_width >=", value, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthLessThan(Integer value) {
            addCriterion("exif_image_width <", value, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthLessThanOrEqualTo(Integer value) {
            addCriterion("exif_image_width <=", value, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthIn(List<Integer> values) {
            addCriterion("exif_image_width in", values, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthNotIn(List<Integer> values) {
            addCriterion("exif_image_width not in", values, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthBetween(Integer value1, Integer value2) {
            addCriterion("exif_image_width between", value1, value2, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andExifImageWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("exif_image_width not between", value1, value2, "exifImageWidth");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueIsNull() {
            addCriterion("brightness_value is null");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueIsNotNull() {
            addCriterion("brightness_value is not null");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueEqualTo(BigDecimal value) {
            addCriterion("brightness_value =", value, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueNotEqualTo(BigDecimal value) {
            addCriterion("brightness_value <>", value, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueGreaterThan(BigDecimal value) {
            addCriterion("brightness_value >", value, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("brightness_value >=", value, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueLessThan(BigDecimal value) {
            addCriterion("brightness_value <", value, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("brightness_value <=", value, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueIn(List<BigDecimal> values) {
            addCriterion("brightness_value in", values, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueNotIn(List<BigDecimal> values) {
            addCriterion("brightness_value not in", values, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brightness_value between", value1, value2, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andBrightnessValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brightness_value not between", value1, value2, "brightnessValue");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionIsNull() {
            addCriterion("flashpix_version is null");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionIsNotNull() {
            addCriterion("flashpix_version is not null");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionEqualTo(String value) {
            addCriterion("flashpix_version =", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionNotEqualTo(String value) {
            addCriterion("flashpix_version <>", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionGreaterThan(String value) {
            addCriterion("flashpix_version >", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionGreaterThanOrEqualTo(String value) {
            addCriterion("flashpix_version >=", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionLessThan(String value) {
            addCriterion("flashpix_version <", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionLessThanOrEqualTo(String value) {
            addCriterion("flashpix_version <=", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionLike(String value) {
            addCriterion("flashpix_version like", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionNotLike(String value) {
            addCriterion("flashpix_version not like", value, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionIn(List<String> values) {
            addCriterion("flashpix_version in", values, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionNotIn(List<String> values) {
            addCriterion("flashpix_version not in", values, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionBetween(String value1, String value2) {
            addCriterion("flashpix_version between", value1, value2, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andFlashpixVersionNotBetween(String value1, String value2) {
            addCriterion("flashpix_version not between", value1, value2, "flashpixVersion");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeIsNull() {
            addCriterion("white_balance_mode is null");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeIsNotNull() {
            addCriterion("white_balance_mode is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeEqualTo(String value) {
            addCriterion("white_balance_mode =", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeNotEqualTo(String value) {
            addCriterion("white_balance_mode <>", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeGreaterThan(String value) {
            addCriterion("white_balance_mode >", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeGreaterThanOrEqualTo(String value) {
            addCriterion("white_balance_mode >=", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeLessThan(String value) {
            addCriterion("white_balance_mode <", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeLessThanOrEqualTo(String value) {
            addCriterion("white_balance_mode <=", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeLike(String value) {
            addCriterion("white_balance_mode like", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeNotLike(String value) {
            addCriterion("white_balance_mode not like", value, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeIn(List<String> values) {
            addCriterion("white_balance_mode in", values, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeNotIn(List<String> values) {
            addCriterion("white_balance_mode not in", values, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeBetween(String value1, String value2) {
            addCriterion("white_balance_mode between", value1, value2, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceModeNotBetween(String value1, String value2) {
            addCriterion("white_balance_mode not between", value1, value2, "whiteBalanceMode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeIsNull() {
            addCriterion("exposuremode is null");
            return (Criteria) this;
        }

        public Criteria andExposuremodeIsNotNull() {
            addCriterion("exposuremode is not null");
            return (Criteria) this;
        }

        public Criteria andExposuremodeEqualTo(String value) {
            addCriterion("exposuremode =", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeNotEqualTo(String value) {
            addCriterion("exposuremode <>", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeGreaterThan(String value) {
            addCriterion("exposuremode >", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeGreaterThanOrEqualTo(String value) {
            addCriterion("exposuremode >=", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeLessThan(String value) {
            addCriterion("exposuremode <", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeLessThanOrEqualTo(String value) {
            addCriterion("exposuremode <=", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeLike(String value) {
            addCriterion("exposuremode like", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeNotLike(String value) {
            addCriterion("exposuremode not like", value, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeIn(List<String> values) {
            addCriterion("exposuremode in", values, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeNotIn(List<String> values) {
            addCriterion("exposuremode not in", values, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeBetween(String value1, String value2) {
            addCriterion("exposuremode between", value1, value2, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuremodeNotBetween(String value1, String value2) {
            addCriterion("exposuremode not between", value1, value2, "exposuremode");
            return (Criteria) this;
        }

        public Criteria andExposuretimeIsNull() {
            addCriterion("exposuretime is null");
            return (Criteria) this;
        }

        public Criteria andExposuretimeIsNotNull() {
            addCriterion("exposuretime is not null");
            return (Criteria) this;
        }

        public Criteria andExposuretimeEqualTo(BigDecimal value) {
            addCriterion("exposuretime =", value, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeNotEqualTo(BigDecimal value) {
            addCriterion("exposuretime <>", value, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeGreaterThan(BigDecimal value) {
            addCriterion("exposuretime >", value, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exposuretime >=", value, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeLessThan(BigDecimal value) {
            addCriterion("exposuretime <", value, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exposuretime <=", value, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeIn(List<BigDecimal> values) {
            addCriterion("exposuretime in", values, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeNotIn(List<BigDecimal> values) {
            addCriterion("exposuretime not in", values, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exposuretime between", value1, value2, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andExposuretimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exposuretime not between", value1, value2, "exposuretime");
            return (Criteria) this;
        }

        public Criteria andFlashIsNull() {
            addCriterion("flash is null");
            return (Criteria) this;
        }

        public Criteria andFlashIsNotNull() {
            addCriterion("flash is not null");
            return (Criteria) this;
        }

        public Criteria andFlashEqualTo(String value) {
            addCriterion("flash =", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotEqualTo(String value) {
            addCriterion("flash <>", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashGreaterThan(String value) {
            addCriterion("flash >", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashGreaterThanOrEqualTo(String value) {
            addCriterion("flash >=", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLessThan(String value) {
            addCriterion("flash <", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLessThanOrEqualTo(String value) {
            addCriterion("flash <=", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLike(String value) {
            addCriterion("flash like", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotLike(String value) {
            addCriterion("flash not like", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashIn(List<String> values) {
            addCriterion("flash in", values, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotIn(List<String> values) {
            addCriterion("flash not in", values, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashBetween(String value1, String value2) {
            addCriterion("flash between", value1, value2, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotBetween(String value1, String value2) {
            addCriterion("flash not between", value1, value2, "flash");
            return (Criteria) this;
        }

        public Criteria andFNumberIsNull() {
            addCriterion("f_number is null");
            return (Criteria) this;
        }

        public Criteria andFNumberIsNotNull() {
            addCriterion("f_number is not null");
            return (Criteria) this;
        }

        public Criteria andFNumberEqualTo(String value) {
            addCriterion("f_number =", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberNotEqualTo(String value) {
            addCriterion("f_number <>", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberGreaterThan(String value) {
            addCriterion("f_number >", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberGreaterThanOrEqualTo(String value) {
            addCriterion("f_number >=", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberLessThan(String value) {
            addCriterion("f_number <", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberLessThanOrEqualTo(String value) {
            addCriterion("f_number <=", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberLike(String value) {
            addCriterion("f_number like", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberNotLike(String value) {
            addCriterion("f_number not like", value, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberIn(List<String> values) {
            addCriterion("f_number in", values, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberNotIn(List<String> values) {
            addCriterion("f_number not in", values, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberBetween(String value1, String value2) {
            addCriterion("f_number between", value1, value2, "fNumber");
            return (Criteria) this;
        }

        public Criteria andFNumberNotBetween(String value1, String value2) {
            addCriterion("f_number not between", value1, value2, "fNumber");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsIsNull() {
            addCriterion("iso_speed_ratings is null");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsIsNotNull() {
            addCriterion("iso_speed_ratings is not null");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsEqualTo(Integer value) {
            addCriterion("iso_speed_ratings =", value, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsNotEqualTo(Integer value) {
            addCriterion("iso_speed_ratings <>", value, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsGreaterThan(Integer value) {
            addCriterion("iso_speed_ratings >", value, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("iso_speed_ratings >=", value, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsLessThan(Integer value) {
            addCriterion("iso_speed_ratings <", value, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsLessThanOrEqualTo(Integer value) {
            addCriterion("iso_speed_ratings <=", value, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsIn(List<Integer> values) {
            addCriterion("iso_speed_ratings in", values, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsNotIn(List<Integer> values) {
            addCriterion("iso_speed_ratings not in", values, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsBetween(Integer value1, Integer value2) {
            addCriterion("iso_speed_ratings between", value1, value2, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andIsoSpeedRatingsNotBetween(Integer value1, Integer value2) {
            addCriterion("iso_speed_ratings not between", value1, value2, "isoSpeedRatings");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationIsNull() {
            addCriterion("components_configuration is null");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationIsNotNull() {
            addCriterion("components_configuration is not null");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationEqualTo(String value) {
            addCriterion("components_configuration =", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationNotEqualTo(String value) {
            addCriterion("components_configuration <>", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationGreaterThan(String value) {
            addCriterion("components_configuration >", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationGreaterThanOrEqualTo(String value) {
            addCriterion("components_configuration >=", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationLessThan(String value) {
            addCriterion("components_configuration <", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationLessThanOrEqualTo(String value) {
            addCriterion("components_configuration <=", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationLike(String value) {
            addCriterion("components_configuration like", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationNotLike(String value) {
            addCriterion("components_configuration not like", value, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationIn(List<String> values) {
            addCriterion("components_configuration in", values, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationNotIn(List<String> values) {
            addCriterion("components_configuration not in", values, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationBetween(String value1, String value2) {
            addCriterion("components_configuration between", value1, value2, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andComponentsConfigurationNotBetween(String value1, String value2) {
            addCriterion("components_configuration not between", value1, value2, "componentsConfiguration");
            return (Criteria) this;
        }

        public Criteria andFocalLengthIsNull() {
            addCriterion("focal_length is null");
            return (Criteria) this;
        }

        public Criteria andFocalLengthIsNotNull() {
            addCriterion("focal_length is not null");
            return (Criteria) this;
        }

        public Criteria andFocalLengthEqualTo(BigDecimal value) {
            addCriterion("focal_length =", value, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthNotEqualTo(BigDecimal value) {
            addCriterion("focal_length <>", value, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthGreaterThan(BigDecimal value) {
            addCriterion("focal_length >", value, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("focal_length >=", value, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthLessThan(BigDecimal value) {
            addCriterion("focal_length <", value, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("focal_length <=", value, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthIn(List<BigDecimal> values) {
            addCriterion("focal_length in", values, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthNotIn(List<BigDecimal> values) {
            addCriterion("focal_length not in", values, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("focal_length between", value1, value2, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("focal_length not between", value1, value2, "focalLength");
            return (Criteria) this;
        }

        public Criteria andFocalLength35IsNull() {
            addCriterion("focal_length_35 is null");
            return (Criteria) this;
        }

        public Criteria andFocalLength35IsNotNull() {
            addCriterion("focal_length_35 is not null");
            return (Criteria) this;
        }

        public Criteria andFocalLength35EqualTo(BigDecimal value) {
            addCriterion("focal_length_35 =", value, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35NotEqualTo(BigDecimal value) {
            addCriterion("focal_length_35 <>", value, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35GreaterThan(BigDecimal value) {
            addCriterion("focal_length_35 >", value, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("focal_length_35 >=", value, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35LessThan(BigDecimal value) {
            addCriterion("focal_length_35 <", value, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35LessThanOrEqualTo(BigDecimal value) {
            addCriterion("focal_length_35 <=", value, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35In(List<BigDecimal> values) {
            addCriterion("focal_length_35 in", values, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35NotIn(List<BigDecimal> values) {
            addCriterion("focal_length_35 not in", values, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("focal_length_35 between", value1, value2, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andFocalLength35NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("focal_length_35 not between", value1, value2, "focalLength35");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueIsNull() {
            addCriterion("shutter_speed_value is null");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueIsNotNull() {
            addCriterion("shutter_speed_value is not null");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueEqualTo(String value) {
            addCriterion("shutter_speed_value =", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueNotEqualTo(String value) {
            addCriterion("shutter_speed_value <>", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueGreaterThan(String value) {
            addCriterion("shutter_speed_value >", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueGreaterThanOrEqualTo(String value) {
            addCriterion("shutter_speed_value >=", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueLessThan(String value) {
            addCriterion("shutter_speed_value <", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueLessThanOrEqualTo(String value) {
            addCriterion("shutter_speed_value <=", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueLike(String value) {
            addCriterion("shutter_speed_value like", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueNotLike(String value) {
            addCriterion("shutter_speed_value not like", value, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueIn(List<String> values) {
            addCriterion("shutter_speed_value in", values, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueNotIn(List<String> values) {
            addCriterion("shutter_speed_value not in", values, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueBetween(String value1, String value2) {
            addCriterion("shutter_speed_value between", value1, value2, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andShutterSpeedValueNotBetween(String value1, String value2) {
            addCriterion("shutter_speed_value not between", value1, value2, "shutterSpeedValue");
            return (Criteria) this;
        }

        public Criteria andMeteringModeIsNull() {
            addCriterion("metering_mode is null");
            return (Criteria) this;
        }

        public Criteria andMeteringModeIsNotNull() {
            addCriterion("metering_mode is not null");
            return (Criteria) this;
        }

        public Criteria andMeteringModeEqualTo(String value) {
            addCriterion("metering_mode =", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeNotEqualTo(String value) {
            addCriterion("metering_mode <>", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeGreaterThan(String value) {
            addCriterion("metering_mode >", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeGreaterThanOrEqualTo(String value) {
            addCriterion("metering_mode >=", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeLessThan(String value) {
            addCriterion("metering_mode <", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeLessThanOrEqualTo(String value) {
            addCriterion("metering_mode <=", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeLike(String value) {
            addCriterion("metering_mode like", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeNotLike(String value) {
            addCriterion("metering_mode not like", value, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeIn(List<String> values) {
            addCriterion("metering_mode in", values, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeNotIn(List<String> values) {
            addCriterion("metering_mode not in", values, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeBetween(String value1, String value2) {
            addCriterion("metering_mode between", value1, value2, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andMeteringModeNotBetween(String value1, String value2) {
            addCriterion("metering_mode not between", value1, value2, "meteringMode");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeIsNull() {
            addCriterion("scene_capture_type is null");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeIsNotNull() {
            addCriterion("scene_capture_type is not null");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeEqualTo(String value) {
            addCriterion("scene_capture_type =", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeNotEqualTo(String value) {
            addCriterion("scene_capture_type <>", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeGreaterThan(String value) {
            addCriterion("scene_capture_type >", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scene_capture_type >=", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeLessThan(String value) {
            addCriterion("scene_capture_type <", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeLessThanOrEqualTo(String value) {
            addCriterion("scene_capture_type <=", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeLike(String value) {
            addCriterion("scene_capture_type like", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeNotLike(String value) {
            addCriterion("scene_capture_type not like", value, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeIn(List<String> values) {
            addCriterion("scene_capture_type in", values, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeNotIn(List<String> values) {
            addCriterion("scene_capture_type not in", values, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeBetween(String value1, String value2) {
            addCriterion("scene_capture_type between", value1, value2, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andSceneCaptureTypeNotBetween(String value1, String value2) {
            addCriterion("scene_capture_type not between", value1, value2, "sceneCaptureType");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceIsNull() {
            addCriterion("white_balance is null");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceIsNotNull() {
            addCriterion("white_balance is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceEqualTo(String value) {
            addCriterion("white_balance =", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceNotEqualTo(String value) {
            addCriterion("white_balance <>", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceGreaterThan(String value) {
            addCriterion("white_balance >", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("white_balance >=", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceLessThan(String value) {
            addCriterion("white_balance <", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceLessThanOrEqualTo(String value) {
            addCriterion("white_balance <=", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceLike(String value) {
            addCriterion("white_balance like", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceNotLike(String value) {
            addCriterion("white_balance not like", value, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceIn(List<String> values) {
            addCriterion("white_balance in", values, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceNotIn(List<String> values) {
            addCriterion("white_balance not in", values, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceBetween(String value1, String value2) {
            addCriterion("white_balance between", value1, value2, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andWhiteBalanceNotBetween(String value1, String value2) {
            addCriterion("white_balance not between", value1, value2, "whiteBalance");
            return (Criteria) this;
        }

        public Criteria andSensingMethodIsNull() {
            addCriterion("sensing_method is null");
            return (Criteria) this;
        }

        public Criteria andSensingMethodIsNotNull() {
            addCriterion("sensing_method is not null");
            return (Criteria) this;
        }

        public Criteria andSensingMethodEqualTo(String value) {
            addCriterion("sensing_method =", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodNotEqualTo(String value) {
            addCriterion("sensing_method <>", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodGreaterThan(String value) {
            addCriterion("sensing_method >", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodGreaterThanOrEqualTo(String value) {
            addCriterion("sensing_method >=", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodLessThan(String value) {
            addCriterion("sensing_method <", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodLessThanOrEqualTo(String value) {
            addCriterion("sensing_method <=", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodLike(String value) {
            addCriterion("sensing_method like", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodNotLike(String value) {
            addCriterion("sensing_method not like", value, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodIn(List<String> values) {
            addCriterion("sensing_method in", values, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodNotIn(List<String> values) {
            addCriterion("sensing_method not in", values, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodBetween(String value1, String value2) {
            addCriterion("sensing_method between", value1, value2, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andSensingMethodNotBetween(String value1, String value2) {
            addCriterion("sensing_method not between", value1, value2, "sensingMethod");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalIsNull() {
            addCriterion("datetime_original is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalIsNotNull() {
            addCriterion("datetime_original is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalEqualTo(Date value) {
            addCriterion("datetime_original =", value, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalNotEqualTo(Date value) {
            addCriterion("datetime_original <>", value, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalGreaterThan(Date value) {
            addCriterion("datetime_original >", value, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalGreaterThanOrEqualTo(Date value) {
            addCriterion("datetime_original >=", value, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalLessThan(Date value) {
            addCriterion("datetime_original <", value, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalLessThanOrEqualTo(Date value) {
            addCriterion("datetime_original <=", value, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalIn(List<Date> values) {
            addCriterion("datetime_original in", values, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalNotIn(List<Date> values) {
            addCriterion("datetime_original not in", values, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalBetween(Date value1, Date value2) {
            addCriterion("datetime_original between", value1, value2, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeOriginalNotBetween(Date value1, Date value2) {
            addCriterion("datetime_original not between", value1, value2, "datetimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalIsNull() {
            addCriterion("subsectime_original is null");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalIsNotNull() {
            addCriterion("subsectime_original is not null");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalEqualTo(Integer value) {
            addCriterion("subsectime_original =", value, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalNotEqualTo(Integer value) {
            addCriterion("subsectime_original <>", value, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalGreaterThan(Integer value) {
            addCriterion("subsectime_original >", value, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalGreaterThanOrEqualTo(Integer value) {
            addCriterion("subsectime_original >=", value, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalLessThan(Integer value) {
            addCriterion("subsectime_original <", value, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalLessThanOrEqualTo(Integer value) {
            addCriterion("subsectime_original <=", value, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalIn(List<Integer> values) {
            addCriterion("subsectime_original in", values, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalNotIn(List<Integer> values) {
            addCriterion("subsectime_original not in", values, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalBetween(Integer value1, Integer value2) {
            addCriterion("subsectime_original between", value1, value2, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andSubsectimeOriginalNotBetween(Integer value1, Integer value2) {
            addCriterion("subsectime_original not between", value1, value2, "subsectimeOriginal");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedIsNull() {
            addCriterion("datetime_digitized is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedIsNotNull() {
            addCriterion("datetime_digitized is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedEqualTo(Date value) {
            addCriterion("datetime_digitized =", value, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedNotEqualTo(Date value) {
            addCriterion("datetime_digitized <>", value, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedGreaterThan(Date value) {
            addCriterion("datetime_digitized >", value, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedGreaterThanOrEqualTo(Date value) {
            addCriterion("datetime_digitized >=", value, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedLessThan(Date value) {
            addCriterion("datetime_digitized <", value, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedLessThanOrEqualTo(Date value) {
            addCriterion("datetime_digitized <=", value, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedIn(List<Date> values) {
            addCriterion("datetime_digitized in", values, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedNotIn(List<Date> values) {
            addCriterion("datetime_digitized not in", values, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedBetween(Date value1, Date value2) {
            addCriterion("datetime_digitized between", value1, value2, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andDatetimeDigitizedNotBetween(Date value1, Date value2) {
            addCriterion("datetime_digitized not between", value1, value2, "datetimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedIsNull() {
            addCriterion("subsectime_digitized is null");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedIsNotNull() {
            addCriterion("subsectime_digitized is not null");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedEqualTo(Integer value) {
            addCriterion("subsectime_digitized =", value, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedNotEqualTo(Integer value) {
            addCriterion("subsectime_digitized <>", value, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedGreaterThan(Integer value) {
            addCriterion("subsectime_digitized >", value, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedGreaterThanOrEqualTo(Integer value) {
            addCriterion("subsectime_digitized >=", value, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedLessThan(Integer value) {
            addCriterion("subsectime_digitized <", value, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedLessThanOrEqualTo(Integer value) {
            addCriterion("subsectime_digitized <=", value, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedIn(List<Integer> values) {
            addCriterion("subsectime_digitized in", values, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedNotIn(List<Integer> values) {
            addCriterion("subsectime_digitized not in", values, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedBetween(Integer value1, Integer value2) {
            addCriterion("subsectime_digitized between", value1, value2, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andSubsectimeDigitizedNotBetween(Integer value1, Integer value2) {
            addCriterion("subsectime_digitized not between", value1, value2, "subsectimeDigitized");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexIsNull() {
            addCriterion("interoperability_index is null");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexIsNotNull() {
            addCriterion("interoperability_index is not null");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexEqualTo(String value) {
            addCriterion("interoperability_index =", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexNotEqualTo(String value) {
            addCriterion("interoperability_index <>", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexGreaterThan(String value) {
            addCriterion("interoperability_index >", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexGreaterThanOrEqualTo(String value) {
            addCriterion("interoperability_index >=", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexLessThan(String value) {
            addCriterion("interoperability_index <", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexLessThanOrEqualTo(String value) {
            addCriterion("interoperability_index <=", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexLike(String value) {
            addCriterion("interoperability_index like", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexNotLike(String value) {
            addCriterion("interoperability_index not like", value, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexIn(List<String> values) {
            addCriterion("interoperability_index in", values, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexNotIn(List<String> values) {
            addCriterion("interoperability_index not in", values, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexBetween(String value1, String value2) {
            addCriterion("interoperability_index between", value1, value2, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andInteroperabilityIndexNotBetween(String value1, String value2) {
            addCriterion("interoperability_index not between", value1, value2, "interoperabilityIndex");
            return (Criteria) this;
        }

        public Criteria andCompressionIsNull() {
            addCriterion("compression is null");
            return (Criteria) this;
        }

        public Criteria andCompressionIsNotNull() {
            addCriterion("compression is not null");
            return (Criteria) this;
        }

        public Criteria andCompressionEqualTo(String value) {
            addCriterion("compression =", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionNotEqualTo(String value) {
            addCriterion("compression <>", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionGreaterThan(String value) {
            addCriterion("compression >", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionGreaterThanOrEqualTo(String value) {
            addCriterion("compression >=", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionLessThan(String value) {
            addCriterion("compression <", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionLessThanOrEqualTo(String value) {
            addCriterion("compression <=", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionLike(String value) {
            addCriterion("compression like", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionNotLike(String value) {
            addCriterion("compression not like", value, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionIn(List<String> values) {
            addCriterion("compression in", values, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionNotIn(List<String> values) {
            addCriterion("compression not in", values, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionBetween(String value1, String value2) {
            addCriterion("compression between", value1, value2, "compression");
            return (Criteria) this;
        }

        public Criteria andCompressionNotBetween(String value1, String value2) {
            addCriterion("compression not between", value1, value2, "compression");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetIsNull() {
            addCriterion("thumbnail_offset is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetIsNotNull() {
            addCriterion("thumbnail_offset is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetEqualTo(String value) {
            addCriterion("thumbnail_offset =", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetNotEqualTo(String value) {
            addCriterion("thumbnail_offset <>", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetGreaterThan(String value) {
            addCriterion("thumbnail_offset >", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_offset >=", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetLessThan(String value) {
            addCriterion("thumbnail_offset <", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_offset <=", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetLike(String value) {
            addCriterion("thumbnail_offset like", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetNotLike(String value) {
            addCriterion("thumbnail_offset not like", value, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetIn(List<String> values) {
            addCriterion("thumbnail_offset in", values, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetNotIn(List<String> values) {
            addCriterion("thumbnail_offset not in", values, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetBetween(String value1, String value2) {
            addCriterion("thumbnail_offset between", value1, value2, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailOffsetNotBetween(String value1, String value2) {
            addCriterion("thumbnail_offset not between", value1, value2, "thumbnailOffset");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthIsNull() {
            addCriterion("thumbnail_length is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthIsNotNull() {
            addCriterion("thumbnail_length is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthEqualTo(String value) {
            addCriterion("thumbnail_length =", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthNotEqualTo(String value) {
            addCriterion("thumbnail_length <>", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthGreaterThan(String value) {
            addCriterion("thumbnail_length >", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_length >=", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthLessThan(String value) {
            addCriterion("thumbnail_length <", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_length <=", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthLike(String value) {
            addCriterion("thumbnail_length like", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthNotLike(String value) {
            addCriterion("thumbnail_length not like", value, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthIn(List<String> values) {
            addCriterion("thumbnail_length in", values, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthNotIn(List<String> values) {
            addCriterion("thumbnail_length not in", values, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthBetween(String value1, String value2) {
            addCriterion("thumbnail_length between", value1, value2, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andThumbnailLengthNotBetween(String value1, String value2) {
            addCriterion("thumbnail_length not between", value1, value2, "thumbnailLength");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesIsNull() {
            addCriterion("number_of_tables is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesIsNotNull() {
            addCriterion("number_of_tables is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesEqualTo(String value) {
            addCriterion("number_of_tables =", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesNotEqualTo(String value) {
            addCriterion("number_of_tables <>", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesGreaterThan(String value) {
            addCriterion("number_of_tables >", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesGreaterThanOrEqualTo(String value) {
            addCriterion("number_of_tables >=", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesLessThan(String value) {
            addCriterion("number_of_tables <", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesLessThanOrEqualTo(String value) {
            addCriterion("number_of_tables <=", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesLike(String value) {
            addCriterion("number_of_tables like", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesNotLike(String value) {
            addCriterion("number_of_tables not like", value, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesIn(List<String> values) {
            addCriterion("number_of_tables in", values, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesNotIn(List<String> values) {
            addCriterion("number_of_tables not in", values, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesBetween(String value1, String value2) {
            addCriterion("number_of_tables between", value1, value2, "numberOfTables");
            return (Criteria) this;
        }

        public Criteria andNumberOfTablesNotBetween(String value1, String value2) {
            addCriterion("number_of_tables not between", value1, value2, "numberOfTables");
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