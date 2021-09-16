package io.hs.entity;

/**
 * @author clm
 * @Date 2021/8/27 12:42
 */
public class Patient {
    String name;
    int age;
    float height;
    float weight;
    int BMI;
    String phoneNum;
    String depNum;

    public Patient() {
    }

    public Patient(String name, int age, float height, float weight, int BMI, String phoneNum, String depNum) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.BMI = BMI;
        this.phoneNum = phoneNum;
        this.depNum = depNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getBMI() {
        return BMI;
    }

    public void setBMI(int BMI) {
        this.BMI = BMI;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDepNum() {
        return depNum;
    }

    public void setDepNum(String depNum) {
        this.depNum = depNum;
    }
}