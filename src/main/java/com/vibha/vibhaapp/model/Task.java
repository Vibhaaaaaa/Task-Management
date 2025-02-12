package com.vibha.vibhaapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Task_Title")
    private String title;

    @Column(name = "Description")
    private String description;

    @Column(name = "Status")
    private String status;

    @Column(name = "Create_Date")
    private Date createdAt;

    @Column(name = "Updated_Date")
    private Date updatedAt;

    public void setTitle(String requirementAnalysis) {
    }

    public void setDescription(String analyseTheReq) {
    }

    public void setStatus(String completed) {
    }

    public void setCreatedAt(Date date) {
    }

    public void setUpdatedAt(Date date) {
    }
    public String  getTitle() {

        return "";
    }

    public String getDescription() {

        return "";
    }

    public String getStatus() {
        return "";
    }

    public Date getCreatedAt() {
        return Date.valueOf("");
    }

    public Date getUpdatedAt() {
        return Date.valueOf("");
    }
}
