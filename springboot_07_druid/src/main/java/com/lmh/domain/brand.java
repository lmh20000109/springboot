package com.lmh.domain;


import org.springframework.stereotype.Component;

@Component
public class brand {
    private int id;
    private String brandName;
    private String companyName;
    private String orderd;
    private String description;
    private String status;

    public brand(int id, String brandName, String companyName, String order, String description, String status) {
        this.id = id;
        this.brandName = brandName;
        this.companyName = companyName;
        this.orderd = order;
        this.description = description;
        this.status = status;
    }

    public brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOrderd() {
        return orderd;
    }

    public void setOrderd(String orderd) {
        this.orderd = orderd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", order='" + orderd + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
