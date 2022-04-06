package com.examly.springapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.Date;

@Entity
public class ResourceModel {
    @Id
    private String resourceId;
    private String resourceName;
    private String resourceLink;
    private String imageUrl;
    private String resourceCategory;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date createdOn;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_user_id")
    private UserModel createdBy;
    private Boolean verified;
    private Boolean active;

    public ResourceModel() {}

    public ResourceModel(String resourceId, String resourceName, String resourceLink, String imageUrl, String resourceCategory, Date createdOn, UserModel createdBy, Boolean verified, Boolean active) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceLink = resourceLink;
        this.imageUrl = imageUrl;
        this.resourceCategory = resourceCategory;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.verified = verified;
        this.active = active;
    }

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    public String getResourceLink() {
        return resourceLink;
    }
    public void setResourceLink(String resourceLink) {
        this.resourceLink = resourceLink;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getResourceCategory() {
        return resourceCategory;
    }
    public void setResourceCategory(String resourceCategory) {
        this.resourceCategory = resourceCategory;
    }
    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public UserModel getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(UserModel createdBy) {
        this.createdBy = createdBy;
    }
    public Boolean isVerified() {
        return verified;
    }
    public Boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
