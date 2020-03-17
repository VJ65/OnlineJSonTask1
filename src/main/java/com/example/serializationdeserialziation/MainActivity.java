package com.example.serializationdeserialziation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson=new Gson();


        /*Students students=new Students("Muaaz","20","muazbutt64@gmail.com");
        String json= gson.toJson(students);
         */

        String json= "{\"first_Name\":\"Wajeeh\",\"age\":30,\"mail\":\"wajeehulhassan82@gmail.com\"}";

        Students students= gson.fromJson(json,Students.class);



    }
}
