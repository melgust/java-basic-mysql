/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2.model;

import java.util.Date;

/**
 *
 * @author melgust
 */
public class TcExample {

    private long exampleId;
    private String name;
    private Date createdAt;
    private String email;

    public long getExampleId() {
        return exampleId;
    }

    public void setExampleId(long exampleId) {
        this.exampleId = exampleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
