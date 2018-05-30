package com.gurcanataman.retrofitdeneme.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gurcanataman on 30.05.2018.
 */

public class ResponseModel {
    @SerializedName("selling")
    @Expose
    private Float selling;
    @SerializedName("update_date")
    @Expose
    private Integer updateDate;
    @SerializedName("currency")
    @Expose
    private Integer currency;
    @SerializedName("buying")
    @Expose
    private Float buying;
    @SerializedName("change_rate")
    @Expose
    private Float changeRate;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("code")
    @Expose
    private String code;

    public Float getSelling() {
        return selling;
    }

    public void setSelling(Float selling) {
        this.selling = selling;
    }

    public Integer getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Float getBuying() {
        return buying;
    }

    public void setBuying(Float buying) {
        this.buying = buying;
    }

    public Float getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Float changeRate) {
        this.changeRate = changeRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
