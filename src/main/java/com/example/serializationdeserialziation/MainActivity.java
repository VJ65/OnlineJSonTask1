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




        String json= "{\"first_Name\":\"Wajeeh\",\"age\":22,\"mail\":\"wajeehulhassan82@gmail.com\"}";

        Students students= gson.fromJson(json,Students.class);



    }
}
