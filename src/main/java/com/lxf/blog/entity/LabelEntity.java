package com.lxf.blog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_label")
public class LabelEntity {
    @Id
    private String labelID;
    private String labelName;

    public String getLabelID() {
        return labelID;
    }

    public void setLabelID(String labelID) {
        this.labelID = labelID;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
