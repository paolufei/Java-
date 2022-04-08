package org.fatmansoft.teach.models;
import org.fatmansoft.teach.repository.DailyactivityRepository;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(	name = "student",
        uniqueConstraints = {
        })
public class Student {
    @Id
    private Integer id;

    @NotBlank
    @Size(max = 20)
    private String studentNum;

    @Size(max = 50)
    private String studentName;
    @Size(max = 4)
    private String sex;
    private Integer age;
    private String social;
    private Date birthday;
    private Date schoolTime;
    private String father;
    private String mother;
    private String tele;
    private String dept;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="daily_Id")
    private DailyActivity dailyActivity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getFather() {return father;}

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getMother() {
        return mother;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public void setSchoolTime(Date schoolTime) {
        this.schoolTime = schoolTime;
    }

    public Date getSchoolTime() {
        return schoolTime;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getDept() {
        return dept;
    }

    public String getSocial() {
        return social;
    }

    public void setDailyActivity(DailyActivity dailyActivity) {
        this.dailyActivity = dailyActivity;
    }

    public DailyActivity getDailyActivity() {
        return dailyActivity;
    }
}
