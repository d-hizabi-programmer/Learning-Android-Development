package com.example.javaoops;

import android.util.Log;

import java.util.Locale;

public abstract class Person {
int age;
String first_name,last_name;

public int getAge() {
    return age;
}

public String getFirst_name() {
        return first_name;
}

public String getLast_name() {
        return last_name;
 }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFullName(){
        return first_name+" "+last_name;
    }
}
