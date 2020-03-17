package com.example.serializationdeserialziation;

import com.google.gson.annotations.SerializedName;

public class Students
{

    @SerializedName("first_name")
    private String mfirstName;

    @SerializedName("age")
    private String mage;

    @SerializedName("mail")
    private String mmail;

    public Students(String firstName, String age, String mail) {
        mfirstName = firstName;
        mage = age;
        mmail = mail;
    }
}
